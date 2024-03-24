package com.karnisdev.fitnesstrackerapi.service;

import com.karnisdev.fitnesstrackerapi.dto.Activity;
import com.karnisdev.fitnesstrackerapi.mapper.EntityToVoMapper;
import com.karnisdev.fitnesstrackerapi.repository.ActivityRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@AllArgsConstructor
public class ActivityService {

    EntityToVoMapper entityToVoMapper;
    ActivityRepository activityRepository;

    public List<Activity> getAllActivities() {
        return activityRepository.findAll().stream()
                .map(entityToVoMapper::ActivityEntityToVo)
                .toList();
    }
}
