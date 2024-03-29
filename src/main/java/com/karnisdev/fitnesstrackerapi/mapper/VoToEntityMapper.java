package com.karnisdev.fitnesstrackerapi.mapper;

import com.karnisdev.fitnesstrackerapi.dto.ActivityDto;
import com.karnisdev.fitnesstrackerapi.entity.Activity;
import org.springframework.stereotype.Component;

@Component
public class VoToEntityMapper {

    public Activity voToEntity(ActivityDto vo) {
        return Activity.builder()
                .activityId(vo.getActivityId())
                .activityName(vo.getActivityName())
                .activityDescription(vo.getActivityDescription())
                .activityDate(vo.getActivityDate())
                .activityType(vo.getActivityType())
                .activityTime(vo.getActivityTime())
                .activityDuration(vo.getActivityDuration())
                .build();
    }
}

