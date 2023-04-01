package com.modelaai.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.modelaai.api.DTO.CarsDTO;

@RestController
@RequestMapping
public class CarsController {
    @PostMapping
    void Create(@RequestBody CarsDTO req) {
        System.out.println(req);
    }
}
