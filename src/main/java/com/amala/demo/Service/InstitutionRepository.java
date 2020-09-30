package com.amala.demo.Service;

import com.amala.demo.domain.Institution;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstitutionRepository extends JpaRepository<Institution, Long> {
    Institution findByLegalName(String lname);

    void deleteByLegalName(String legalname);
}
