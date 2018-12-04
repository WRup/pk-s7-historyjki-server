package com.pm.historyjki.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pm.historyjki.document.HelloDocument;
import com.pm.historyjki.repository.HelloRepository;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("hello")
@RequiredArgsConstructor
public class HelloWorld {

    private final HelloRepository helloRepository;

    @GetMapping
    public String getHello() {
        helloRepository.save(new HelloDocument());
        return "hello-world";
    }
}
