package com.pm.historyjki.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum TagType {

    @JsonProperty("TAG_TYPE.SCIENCE_FICTION")
    SCIENCE_FICTION,

    @JsonProperty("TAG_TYPE.MYSTERY")
    MYSTERY,

    @JsonProperty("TAG_TYPE.FANTASY")
    FANTASY,

    @JsonProperty("TAG_TYPE.DRAMA")
    DRAMA,

    @JsonProperty("TAG_TYPE.MYTHOLOGY")
    MYTHOLOGY,

    @JsonProperty("TAG_TYPE.ROMANCE")
    ROMANCE,

    @JsonProperty("TAG_TYPE.ADVENTURE")
    ADVENTURE,

    @JsonProperty("TAG_TYPE.HORROR")
    HORROR
}
