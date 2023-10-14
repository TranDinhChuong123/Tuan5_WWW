package com.example.tuan5.repositories;

import com.example.tuan5.models.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CandidateRepositoty extends JpaRepository<Candidate, Long> {
    // Các phương thức CRUD sẽ tự động được tạo ra
//    public List<Candidate> findAll();
}

