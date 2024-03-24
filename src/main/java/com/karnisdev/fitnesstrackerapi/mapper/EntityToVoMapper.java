package com.karnisdev.fitnesstrackerapi.mapper;

import com.karnisdev.fitnesstrackerapi.dto.Activity;
import com.karnisdev.fitnesstrackerapi.entity.ActivityEntity;
import org.springframework.stereotype.Component;

@Component
public class EntityToVoMapper {

    public Activity ActivityEntityToVo(ActivityEntity entity) {
        return new Activity(entity.getActivity(), entity.getStartTime(), entity.getEndTime());
    }
}
