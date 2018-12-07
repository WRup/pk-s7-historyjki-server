package com.pm.historyjki.controller;

import com.pm.historyjki.model.Story;
import com.pm.historyjki.repository.StoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("story")
@RequiredArgsConstructor
public class StoryController {

    private final StoryRepository storyRepository;

    @GetMapping("")
    public List<Story> getAllStories(){
        return storyRepository.findAll();
    }

    @GetMapping("/{id}")
    public Story getStory(@PathVariable String id){
        return storyRepository.findById(id).orElse(new Story());
    }

    @PostMapping("")
    public Story addStory(@RequestBody Story story){
        return storyRepository.save(story);
    }
}
