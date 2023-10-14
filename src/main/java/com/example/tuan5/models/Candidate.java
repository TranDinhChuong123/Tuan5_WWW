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
    private String fullname;
    private LocalDate dob;
    private String phone;

    private String email;

    public Candidate(String fullname, LocalDate dob, String phone, String email) {
        this.fullname = fullname;
        this.dob = dob;
        this.phone = phone;
        this.email = email;
    }

    @OneToOne
    @JoinColumn(name = "address")
    private Address address ;



    //    private String email;

}
