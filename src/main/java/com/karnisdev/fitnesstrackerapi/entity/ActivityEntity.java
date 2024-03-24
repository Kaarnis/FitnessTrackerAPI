package com.karnisdev.fitnesstrackerapi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ActivityEntity {

    @Id
    private Long id;
    private String activity;
    private LocalDateTime startTime;
    private LocalDateTime endTime;

}
