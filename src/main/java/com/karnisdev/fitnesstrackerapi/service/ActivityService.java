package com.karnisdev.fitnesstrackerapi.service;

import com.karnisdev.fitnesstrackerapi.dto.Activity;
import com.karnisdev.fitnesstrackerapi.entity.ActivityEntity;
import com.karnisdev.fitnesstrackerapi.mapper.EntityToVoMapper;
import com.karnisdev.fitnesstrackerapi.mapper.VoToEntityMapper;
import com.karnisdev.fitnesstrackerapi.repository.ActivityRepository;
import lombok.AllArgsConstructor;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ActivityService {

    VoToEntityMapper voToEntityMapper;
    EntityToVoMapper entityToVoMapper;
    ActivityRepository activityRepository;

    public List<Activity> getAllActivities() {
        return activityRepository.findAll().stream()
                .map(entityToVoMapper::ActivityEntityToVo)
                .toList();
    }

    public Activity addActivity(Activity activity) {
        ActivityEntity entity = voToEntityMapper.voToEntity(activity);

        // Check if the activity already exists with the same name and start time
        boolean exists = activityRepository.existsByActivityAndStartTime(
                entity.getActivity(), entity.getStartTime());

        if (exists) {
            throw new DataIntegrityViolationException("Activity already exists with the same name and start time");
        }

        ActivityEntity savedEntity = activityRepository.save(entity);
        return entityToVoMapper.ActivityEntityToVo(savedEntity);
    }

    public Activity getActivityById(Long id) {
        return activityRepository.findById(id)
                .map(entityToVoMapper::ActivityEntityToVo)
                .orElseThrow(() -> new IllegalArgumentException("Activity with id " + id + " not found"));
    }

    public void deleteActivity(Long id) {
        activityRepository.deleteById(id);
    }
}