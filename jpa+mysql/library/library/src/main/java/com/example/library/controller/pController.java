package com.example.library.controller;

import com.example.library.publisher;
import com.example.library.repository.pRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class pController {

    @Autowired
    pRepository repo;

    @GetMapping("/publisher")
    public List<publisher> publishers(){

      List<publisher> p=  repo.findAll();
        return p;
    }
}
