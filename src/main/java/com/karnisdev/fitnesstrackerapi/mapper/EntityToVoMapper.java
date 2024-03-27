package com.karnisdev.fitnesstrackerapi.mapper;

import com.karnisdev.fitnesstrackerapi.dto.Activity;
import com.karnisdev.fitnesstrackerapi.entity.ActivityEntity;
import org.springframework.stereotype.Component;

@Component
public class EntityToVoMapper {

    public Activity ActivityEntityToVo(ActivityEntity entity) {
        return Activity.builder()
                .id(entity.getId())
                .activity(entity.getActivity())
                .startTime(entity.getStartTime())
                .endTime(entity.getEndTime())
                .build();

    }
}
