package com.karnisdev.fitnesstrackerapi.dto;

import java.time.LocalDateTime;

public record Activity(String activity, LocalDateTime startTime, LocalDateTime endTime) {
}
