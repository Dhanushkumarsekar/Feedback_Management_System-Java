package com.feedback.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

import com.feedback.model.Feedback;
import com.feedback.repository.FeedbackRepository;

@RestController
@CrossOrigin
public class FeedbackController {

    @Autowired
    FeedbackRepository repo;

   
    @PostMapping("/feedback")
    public Feedback add(@RequestBody Feedback f) {
        return repo.save(f);
    }

    @GetMapping("/all-feedback")
    public List<Feedback> getAll() {
        return repo.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id) {
        repo.deleteById(id);
    }

    @GetMapping("/feedback/{id}")
    public Feedback getById(@PathVariable int id) {
        return repo.findById(id).orElse(null);
    }

    @PutMapping("/update/{id}")
    public Feedback update(@PathVariable int id, @RequestBody Feedback f) {

        Feedback old = repo.findById(id).orElse(null);

        if(old != null){
            old.setName(f.getName());
            old.setEmail(f.getEmail());
            old.setRating(f.getRating());
            old.setComments(f.getComments());

            return repo.save(old);
        }

        return null;
    }

    @GetMapping("/chart")
    public List<Integer> chart() {

        List<Feedback> list = repo.findAll();
        int[] count = new int[5];

        for(Feedback f : list){
            if(f.getRating() >=1 && f.getRating() <=5){
                count[f.getRating()-1]++;
            }
        }

        return Arrays.asList(count[0],count[1],count[2],count[3],count[4]);
    }
}