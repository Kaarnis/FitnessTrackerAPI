package com.karnisdev.fitnesstrackerapi.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Activity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer activityId;

    private String activityName;
    private String activityDescription;
    private String activityType;
    private String activityDate;
    private String activityTime;
    private String activityDuration;

    @ManyToOne
    @JoinColumn(name = "user_id")  // This should match the column name in the Activity table
    private User user;
}
