package com.karnisdev.fitnesstrackerapi.service;

import com.karnisdev.fitnesstrackerapi.dto.ActivityDto;
import com.karnisdev.fitnesstrackerapi.entity.Activity;
import com.karnisdev.fitnesstrackerapi.entity.User;
import com.karnisdev.fitnesstrackerapi.mapper.EntityToVoMapper;
import com.karnisdev.fitnesstrackerapi.mapper.VoToEntityMapper;
import com.karnisdev.fitnesstrackerapi.repository.ActivityRepository;
import com.karnisdev.fitnesstrackerapi.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ActivityService {

    VoToEntityMapper voToEntityMapper;
    EntityToVoMapper entityToVoMapper;
    ActivityRepository activityRepository;
    UserRepository userRepository;

    public List<ActivityDto> getActivitiesByUser(Integer userId) {
        List<Activity> activities = activityRepository.findByUserUserId(userId);
        return activities.stream()
                .map(entityToVoMapper::ActivityEntityToVo)
                .collect(Collectors.toList());
    }

    public Optional<ActivityDto> getActivityByUser(Integer userId, int activityId) {
        Activity activity = activityRepository.findByUserUserIdAndActivityId(userId, activityId);
        return (activity != null) ? Optional.of(entityToVoMapper.ActivityEntityToVo(activity)) : Optional.empty();
    }

    public void addActivity(ActivityDto activityDto) {
        // Find the user by userId
        User user = userRepository.findById(activityDto.getUserId())
                .orElseThrow(() -> new NoSuchElementException("User not found with ID: " + activityDto.getUserId()));

        // Create a new activity
        Activity activity = Activity.builder()
                .activityName(activityDto.getActivityName())
                .activityDescription(activityDto.getActivityDescription())
                .activityType(activityDto.getActivityType())
                .activityDate(activityDto.getActivityDate())
                .activityTime(activityDto.getActivityTime())
                .activityDuration(activityDto.getActivityDuration())
                .user(user)
                .build();

        // Save the activity to the database
        activityRepository.save(activity);
    }

    public void deleteActivity(Integer id) {
        activityRepository.deleteById(id);
    }
}