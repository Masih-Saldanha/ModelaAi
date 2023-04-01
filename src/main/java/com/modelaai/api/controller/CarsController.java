package com.modelaai.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.modelaai.api.dto.CarsDTO;
import com.modelaai.api.model.Car;
import com.modelaai.api.repository.CarsRepository;

@RestController
@RequestMapping
public class CarsController {
    @Autowired
    private CarsRepository repository;

    @GetMapping
    public List<Car> listAll() {
        return repository.findAll();
    }

    @PostMapping
    public void create(@RequestBody CarsDTO req) {
        repository.save(new Car(req));
        System.out.println(req);
    }
}
