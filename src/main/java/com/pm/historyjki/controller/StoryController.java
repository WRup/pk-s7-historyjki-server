package com.pm.historyjki.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pm.historyjki.model.Story;
import com.pm.historyjki.service.IStoryService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("story")
@RequiredArgsConstructor
public class StoryController {

    private final IStoryService storyService;

    @GetMapping
    public List<Story> getAllStories(){
        return storyService.getAllStories();
    }

    @GetMapping("/{id}")
    public Story getStory(@PathVariable String id){
        return storyService.getStory(id).orElseThrow(NotFoundException::new);
    }

    @PostMapping
    public Story addStory(@RequestBody Story story){
        return storyService.addStory(story);
    }

    @PutMapping
    public Story updateStory(@RequestBody Story story) {
        return storyService.updateStory(story);
    }
}
