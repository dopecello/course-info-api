package com.pluralsight.courseinfo.cli.service;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.time.Duration;
import java.time.LocalTime;

@JsonIgnoreProperties(ignoreUnknown = true)
public record PluralSightCourse(String Id, String title, String duration, String contentUrl, boolean isRetired) {
    // duration 00:05:37

    public long durationInMinutes() {
        return Duration.between(
                LocalTime.MIN,
                LocalTime.parse(duration())
        ).toMinutes();
    }
}
