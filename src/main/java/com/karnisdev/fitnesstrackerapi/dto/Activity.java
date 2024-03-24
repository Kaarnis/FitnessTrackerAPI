package com.karnisdev.fitnesstrackerapi.dto;

import java.time.LocalDateTime;

public record Activity(Long id, String activity, LocalDateTime startTime, LocalDateTime endTime) {
}
