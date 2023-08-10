package com.springboot.domain.dailyPlan.dto;

import com.springboot.domain.dailyPlan.entity.DailyPlan;
import lombok.Builder;
import lombok.Getter;


@Getter
public class DailyPlanResponseDto {

    private Long id;
    private String name;
    private String date;

    @Builder
    public DailyPlanResponseDto(DailyPlan entity) {
        this.id = entity.getId();
        this.name = entity.getMember().getName();
        this.date = entity.getDate();
    }
}
