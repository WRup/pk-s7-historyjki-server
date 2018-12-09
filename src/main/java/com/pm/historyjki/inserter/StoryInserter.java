package com.pm.historyjki.inserter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.bson.types.ObjectId;

import com.pm.historyjki.model.Story;
import com.pm.historyjki.model.StoryContent;
import com.pm.historyjki.service.IStoryService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class StoryInserter {

    private final IStoryService storyService;

    public List<Story> insertIntoDatabase() {
        List<Story> insertedStories = new ArrayList<>();


        Story story = new Story();
        story.setId(new ObjectId().toString());
        story.setAuthorName("ja");
        story.setDislikeNumber(1);
        story.setLikeNumber(2);
        story.setTags(Arrays.asList("sf", "horror"));
        story.setTitle("Jak poznałem zombie");
        story.setAuthorName("ja");
        {
            StoryContent content = new StoryContent();
            content.setId(new ObjectId().toString());
            content.setParent(story.getId());
            content.setContent("to było tak...");
            content.setContinuations(Arrays.asList("wyszedłem...", "znalazłem...", "poszedłem..."));
            story.setContent(content);
        }
        storyService.addStory(story);
        insertedStories.add(story);
        return insertedStories;
    }
}
