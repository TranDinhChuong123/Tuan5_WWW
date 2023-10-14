package com.example.tuan5.models;


import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "jobSkill")
@Getter
@Setter
public class JobSkill {
    @Id
    @ManyToOne
    @JoinColumn(name = "job_id")
    private Job job;
    @Id
    @ManyToOne
    @JoinColumn(name = "skill_id")
    private Skill skill;
    private String moreInfo;
    private SkillLevel skillLevel;




}