package com.example.tuan5.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "experience")
@Getter
@Setter
public class Experience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "exp_id")
    private long id;
    private LocalDate toDate;
    private LocalDate fromDate;
    @ManyToOne
    @JoinColumn(name = "candidate_id")
    private Candidate candidate;

    private String companyName;
    private String role;
    private String workDescription;



}
