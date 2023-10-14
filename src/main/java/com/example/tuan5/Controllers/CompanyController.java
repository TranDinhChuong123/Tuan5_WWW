package com.example.tuan5.Controllers;

import com.example.tuan5.models.Address;
import com.example.tuan5.models.Company;
import com.example.tuan5.services.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class CompanyController {
    private final CompanyService companyService;

    @Autowired
    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping("/2")
    public String getListCompany(Model model) {
        List<Company> companies = companyService.findAll();
        model.addAttribute("companies", companies);
        return "welcome";
    }
    @GetMapping("/FormRecruitment")
    public String anotherPage() {
        return "FormRecruitment"; // Trả về tên template hoặc trang mà bạn muốn hiển thị
    }

//    @GetMapping
//    public ResponseEntity<?> getCandidates() {
//
//        List<Candidate> candidates= candidateRepositoty.findAll();
//        System.out.println(candidates);
//        return ResponseEntity.ok(candidates);
//
//    }
//    @GetMapping
//    public List<Candidate> getCandidates() {
//        return candidateRepositoty.findAll();
//    }
//    @GetMapping("/{id}")
//    public ResponseEntity<Candidate> getCandidateById(@PathVariable Long id) {
//        Optional<Candidate> candidate = candidateRepositoty.findById(id);
//        System.out.println(candidate.toString());
//
//        if (candidate.isPresent()) {
//            return ResponseEntity.ok(candidate.get());
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }
}
