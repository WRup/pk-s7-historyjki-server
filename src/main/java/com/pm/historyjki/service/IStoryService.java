package com.pm.historyjki.service;

import java.util.List;
import java.util.Optional;

import com.pm.historyjki.model.Story;

public interface IStoryService {
    Optional<Story> getStory(String id);

    Story addStory(Story story);

    List<Story> getAllStories();
}
