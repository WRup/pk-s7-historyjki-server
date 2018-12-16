package com.pm.historyjki.model;

import java.util.Arrays;
import java.util.List;

public class Configuration {

    public List<TagType> getTags() {
        return Arrays.asList(TagType.values());
    }
}
