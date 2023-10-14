package com.example.tuan5.repositories;

import com.example.tuan5.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}