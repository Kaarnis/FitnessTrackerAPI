package com.karnisdev.fitnesstrackerapi.dto;

import lombok.Builder;

import java.time.LocalDateTime;

@Builder
public record Activity(Long id, String activity, LocalDateTime startTime, LocalDateTime endTime) {
}
