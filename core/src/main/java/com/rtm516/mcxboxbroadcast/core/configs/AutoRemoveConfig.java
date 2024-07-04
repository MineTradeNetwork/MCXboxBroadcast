package com.rtm516.mcxboxbroadcast.core.configs;

import com.fasterxml.jackson.annotation.JsonProperty;

public record AutoRemoveConfig(
        @JsonProperty("enabled") boolean enabled,
        @JsonProperty("inactive-days") int inactiveDays
) {

}

