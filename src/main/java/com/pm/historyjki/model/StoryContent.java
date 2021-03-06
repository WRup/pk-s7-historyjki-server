package com.pm.historyjki.model;

import lombok.Data;

import java.util.List;

@Data
public class StoryContent {

    private String content;

    private List<StoryContinuation> continuations;
}
