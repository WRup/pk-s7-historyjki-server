package com.pm.historyjki.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pm.historyjki.model.Configuration;

@RestController
@RequestMapping("/config")
public class ConfigController {

    @GetMapping
    public Configuration getConfig() {
        return new Configuration();
    }
}
