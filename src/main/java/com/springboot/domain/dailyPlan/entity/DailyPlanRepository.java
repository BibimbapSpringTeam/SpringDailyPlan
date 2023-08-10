package com.springboot.domain.dailyPlan.entity;

import com.springboot.domain.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DailyPlanRepository extends JpaRepository<DailyPlan, Long> {

}