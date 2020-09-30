package com.amala.demo.Service;

import com.amala.demo.domain.Institution;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstitutionService {

    @Autowired
    private InstitutionRepository institutionRepository;

    public Institution saveInstitution(Institution institution){
        return institutionRepository.save(institution);
    }

    public List<Institution> saveInstitutions(List<Institution> institutions){
        return institutionRepository.saveAll(institutions);
    }

    public List<Institution> getInstitutions(){
        return institutionRepository.findAll();
    }
    public Institution getInstitutionsByLegalName(String lname){
        return institutionRepository.findByLegalName(lname);
    }
    public String deleteInstitution(String legalname){
        institutionRepository.deleteByLegalName(legalname);
        return "Institution Deleted "+legalname;
    }

    public Institution updateInstitution(Institution institution){
        Institution existingInstitution = institutionRepository.findByLegalName(institution.getLname());
        existingInstitution.setLname(institution.getLname());
        existingInstitution.setBname(institution.getBname());
        existingInstitution.setOffice(institution.getOffice());
        existingInstitution.setRegNo(institution.getRegNo());
        existingInstitution.setTelNo(institution.getTelNo());
        existingInstitution.setPoBox(institution.getPoBox());
        existingInstitution.setArea(institution.getArea());
        existingInstitution.setDistrict(institution.getDistrict());
        existingInstitution.setEmail(institution.getEmail());
        existingInstitution.setWebsite(institution.getWebsite());
        existingInstitution.setPostCode_5(institution.getPostCode_5());
        existingInstitution.setPostCode_6(institution.getPostCode_6());

        return institutionRepository.save(existingInstitution);
    }



}
