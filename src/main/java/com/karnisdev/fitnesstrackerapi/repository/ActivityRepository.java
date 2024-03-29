package com.karnisdev.fitnesstrackerapi.repository;

import com.karnisdev.fitnesstrackerapi.entity.Activity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ActivityRepository extends JpaRepository<Activity, Integer> {
    List<Activity> findByUserUserId(Integer userId);

    Activity findByUserUserIdAndActivityId(Integer userId, Integer ActivityId);

}
