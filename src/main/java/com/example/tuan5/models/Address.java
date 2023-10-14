package com.example.tuan5.models;

import com.neovisionaries.i18n.CountryCode;
import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "address")
@Getter
@Setter
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "add_id")
    private long id;
    private String city;
    private CountryCode country;
    private String zipCode;
    private String Street;
    private String number;
    private String email;
//    @OneToOne
//    @JoinColumn(name = "candidate_id")
//    private Candidate candidate;
}
