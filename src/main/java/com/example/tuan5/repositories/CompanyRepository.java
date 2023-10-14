package com.example.tuan5.repositories;

import com.example.tuan5.models.Address;
import com.example.tuan5.models.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {
    // Các phương thức CRUD sẽ tự động được tạo ra
//    public List<Candidate> findAll();
}