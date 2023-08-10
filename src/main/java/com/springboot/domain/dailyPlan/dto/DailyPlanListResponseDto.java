package com.springboot.domain.dailyPlan.dto;

import com.springboot.domain.dailyPlan.entity.DailyPlan;
import lombok.Builder;
import lombok.Getter;

@Getter
public class DailyPlanListResponseDto {

    private Long id;
    private String name;
    private String yearMonth;
    private String date;

    @Builder
    public DailyPlanListResponseDto(DailyPlan entity) {
        this.id = entity.getId();
        this.name = entity.getMember().getName();
        this.yearMonth = entity.getYearMonth();
        this.date = entity.getDate();
    }
}