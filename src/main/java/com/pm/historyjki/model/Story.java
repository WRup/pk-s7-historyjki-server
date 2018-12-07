package com.pm.historyjki.model;

import lombok.Data;

import java.util.List;

@Data
public class Story {

    private String id;
    private String authorName;
    private String title;
    private List<String> tags;
    private Integer likeNumber;
    private Integer dislikeNumber;
    private StoryContent content;

}
