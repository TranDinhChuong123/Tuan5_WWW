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

    private String zipCode;
    private String Street;
    private String city;
    private String number;
    private CountryCode country;


    public Address(String street, String city, String zipCode, String number, CountryCode country) {
        Street = street;
        this.city = city;
        this.zipCode = zipCode;
        this.number = number;
        this.country = country;
    }
//    @OneToOne
//    @JoinColumn(name = "candidate_id")
//    private Candidate candidate;
}
