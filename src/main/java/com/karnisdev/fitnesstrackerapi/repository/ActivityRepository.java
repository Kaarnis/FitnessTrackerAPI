package com.karnisdev.fitnesstrackerapi.repository;

import com.karnisdev.fitnesstrackerapi.entity.ActivityEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;

public interface ActivityRepository extends JpaRepository<ActivityEntity, Long> {
    boolean existsByActivityAndStartTime(String activity, LocalDateTime startTime);
}