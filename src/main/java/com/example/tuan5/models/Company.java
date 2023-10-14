package com.example.tuan5.models;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "company")
@Getter
@Setter
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "com_id")
    private long id;
    private String name;
    private String about;
    @OneToOne
    @JoinColumn(name = "address")
    private Address address;
    private String phone;
    private String webURL;
    private String email;


}
