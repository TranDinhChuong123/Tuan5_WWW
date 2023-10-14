package com.example.tuan5.models;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@JsonSerialize
@JsonDeserialize
@Table(name = "candidate")
@Getter
@Setter
public class Candidate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "can_id")
    private long id;
    private String phone;
    private LocalDate dob;

    private String email;
    private String fullname;
    @OneToOne
    @JoinColumn(name = "address")
    private Address address ;


//    private String email;

}
