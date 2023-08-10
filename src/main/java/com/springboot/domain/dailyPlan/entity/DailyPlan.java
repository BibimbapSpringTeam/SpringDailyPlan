package com.springboot.domain.dailyPlan.entity;

import com.springboot.domain.member.entity.Member;
import com.springboot.domain.toDo.entity.ToDo;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class DailyPlan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "MEMBER_ID")
    private Member member;

    @OneToMany(mappedBy = "dailyPlan")
    List<ToDo> toDos = new ArrayList<>();

    //MONTH는 h2 예약어
    @Column(nullable = false)
    private String yearMonth;

    @Column(nullable = false)
    private String date;

    @Builder
    public DailyPlan(String date, Member member) {
        this.yearMonth = date.substring(0,6);
        this.date = date;
        this.member = member;
    }
}
