package com.example.tuan5.services;

import com.example.tuan5.models.Address;
import com.example.tuan5.models.Company;
import com.example.tuan5.repositories.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {
    private final CompanyRepository companyRepository;

    @Autowired
    public CompanyService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    public List<Company> findAll() {
        return companyRepository.findAll();
    }

    public void saveCompany(Company company) {
        companyRepository.save(company);
    }

}
