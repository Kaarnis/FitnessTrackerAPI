package com.karnisdev.fitnesstrackerapi.repository;

import com.karnisdev.fitnesstrackerapi.entity.ActivityEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActivityRepository extends JpaRepository<ActivityEntity, Long> {
}