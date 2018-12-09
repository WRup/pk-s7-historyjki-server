package com.pm.historyjki.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.pm.historyjki.model.Story;
import com.pm.historyjki.repository.StoryRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StoryService implements IStoryService {

    private final StoryRepository storyRepository;

    @Override
    public List<Story> getAllStories(){
        return storyRepository.findAll();
    }

    @Override
    public Optional<Story> getStory(String id){
        return storyRepository.findById(id);
    }

    @Override
    public Story addStory(Story story){
        return storyRepository.save(story);
    }
}
