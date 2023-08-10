package com.springboot.domain.dailyPlan.controller;

import com.springboot.domain.dailyPlan.dto.DailyPlanListResponseDto;
import com.springboot.domain.dailyPlan.dto.DailyPlanResponseDto;
import com.springboot.domain.dailyPlan.service.DailyPlanService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class DailyPlanController {

    private final DailyPlanService dailyPlanService;

    @PostMapping("/dailyplan/{member_id}/{date}")
    public Long post(@PathVariable Long member_id, String date) {
        return dailyPlanService.post(member_id, date);
    }

    @GetMapping("/dailyplan/{dailyPlanId}")
    public DailyPlanResponseDto get(@PathVariable Long dailyPlanId) {
        return dailyPlanService.get(dailyPlanId);
    }

    @DeleteMapping("/dailyplan/{dailyPlanId}")
    public Long delete(@PathVariable Long dailyPlanId) {
        dailyPlanService.delete(dailyPlanId);
        return dailyPlanId;
    }

    @GetMapping("/dailyplan/{memberId}/{yearMonth}")
    public List<DailyPlanListResponseDto> getList(@PathVariable Long memberId, @PathVariable String yearMonth) {
        return dailyPlanService.getList(memberId, yearMonth);
    }
}
