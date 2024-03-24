package com.karnisdev.fitnesstrackerapi.controller;

import com.karnisdev.fitnesstrackerapi.dto.Activity;
import com.karnisdev.fitnesstrackerapi.service.ActivityService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class ActivityController {

    ActivityService activityService;

    @GetMapping("/activities")
    public List<Activity> getAllActivities() {
        return activityService.getAllActivities();
    }
}
