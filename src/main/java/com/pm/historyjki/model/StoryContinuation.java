package com.pm.historyjki.model;

import java.util.List;

import lombok.Data;

@Data
public class StoryContinuation {

    private String starter;

    private String content;

    private List<StoryContinuation> continuations;
}
