package com.pm.historyjki.model;

import lombok.Data;

import java.util.List;

@Data
public class StoryContent {
    private String id;
    private String content;
    private List<String> continuations;
    private String parent;
}
