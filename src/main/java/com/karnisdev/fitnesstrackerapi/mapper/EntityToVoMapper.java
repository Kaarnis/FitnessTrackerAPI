package com.karnisdev.fitnesstrackerapi.mapper;

import com.karnisdev.fitnesstrackerapi.dto.ActivityDto;
import com.karnisdev.fitnesstrackerapi.entity.Activity;
import org.springframework.stereotype.Component;

@Component
public class EntityToVoMapper {

    public ActivityDto ActivityEntityToVo(Activity entity) {
        return ActivityDto.builder()
                .activityId(entity.getActivityId())
                .activityName(entity.getActivityName())
                .activityDescription(entity.getActivityDescription())
                .activityDate(entity.getActivityDate())
                .activityType(entity.getActivityType())
                .activityTime(entity.getActivityTime())
                .activityDuration(entity.getActivityDuration())
                .userId(entity.getUser().getUserId())
                .build();

    }
}
