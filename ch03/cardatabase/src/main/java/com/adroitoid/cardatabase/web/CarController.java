package com.adroitoid.cardatabase.web;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController
{
    @RequestMapping("/cars")
    public Iterable<Car> getCars()
    {
        ///
    }
}