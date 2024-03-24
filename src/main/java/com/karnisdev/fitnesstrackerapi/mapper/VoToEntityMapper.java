package com.karnisdev.fitnesstrackerapi.mapper;

import com.karnisdev.fitnesstrackerapi.dto.Activity;
import com.karnisdev.fitnesstrackerapi.entity.ActivityEntity;
import org.springframework.stereotype.Component;

@Component
public class VoToEntityMapper {

    public ActivityEntity voToEntity(Activity vo) {
        return ActivityEntity.builder()
                .id(vo.id())
                .activity(vo.activity())
                .startTime(vo.startTime())
                .endTime(vo.endTime())
                .build();
    }
}
