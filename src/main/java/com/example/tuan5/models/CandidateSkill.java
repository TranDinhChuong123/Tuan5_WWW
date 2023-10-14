package com.example.tuan5.models;


import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "candidate_skill")
@Getter
@Setter
public class CandidateSkill {
    @Id
    @ManyToOne
    @JoinColumn(name = "skill_id")
    private Skill skill;
    @Id
    @ManyToOne
    @JoinColumn(name = "can_id")
    private Candidate candidate;

    private SkillLevel skillLevel;
    private String moreInfo;

}