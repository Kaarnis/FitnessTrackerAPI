package com.karnisdev.fitnesstrackerapi.controller;

import com.karnisdev.fitnesstrackerapi.dto.ActivityDto;
import com.karnisdev.fitnesstrackerapi.service.ActivityService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:3000")
public class ActivityController {

    ActivityService activityService;

    @GetMapping("/{userId}/activities")
    public List<ActivityDto> getActivitiesByUser(@PathVariable Integer userId) {
        return activityService.getActivitiesByUser(userId);
    }

    @GetMapping(path = "/{userId}/activities/{activityId}")
    public ResponseEntity<ActivityDto> getActivityByUser(@PathVariable Integer userId, @PathVariable int activityId) {
        Optional<ActivityDto> activityDTO = activityService.getActivityByUser(userId, activityId);
        return activityDTO.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping("/activities/add")
    public ResponseEntity<ActivityDto> addActivity(@RequestBody @Valid ActivityDto activityDto) {
        activityService.addActivity(activityDto);
        return ResponseEntity.created(URI.create("/activities")).build();
    }

    @DeleteMapping("/activities/delete/{activityId}")
    public ResponseEntity<ActivityDto> deleteActivity(@PathVariable Integer activityId) {
        activityService.deleteActivity(activityId);
        return ResponseEntity.ok().build();
    }
}
