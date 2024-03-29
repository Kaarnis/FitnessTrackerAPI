package com.karnisdev.fitnesstrackerapi.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Builder
@Setter
@Getter
public class ActivityDto {
        Integer activityId;
        String activityName;
        String activityDescription;
        String activityDate;
        String activityType;
        String activityTime;
        String activityDuration;
        Integer userId;
}
