package com.pm.historyjki.model;

import java.util.Arrays;
import java.util.List;

import lombok.Data;

@Data
public class Configuration {

    private List<TagType> tags = Arrays.asList(TagType.values());
}
