package com.amala.demo.api;

import com.amala.demo.Service.InstitutionRepository;
import com.amala.demo.Service.InstitutionService;
import com.amala.demo.domain.Institution;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/institution")
public class InstitutionController {
    
    @Autowired
    private InstitutionService service; 

    //add another institution
    @PostMapping("/addInstitution")
    public Institution addInstitution(@RequestBody Institution institution){
        return service.saveInstitution(institution);
    }

    //add all institutions
    @PostMapping("/addInstitutions")

    public List<Institution> addInstitutions(@RequestBody List<Institution> institutions){
        return service.saveInstitutions(institutions);
    }
    
    //get all institutions
    @GetMapping("/institutions")
    public List<Institution> findAllInstitutions(){
        return service.getInstitutions();
    }
    
    //get institution by legal Name
    @GetMapping("/institution/{name}")
    public Institution findInstitutionByName(@PathVariable String LegalName){
        return service.getInstitutionsByLegalName(LegalName);
    }
    
    //remove an institution
    @DeleteMapping("/delete/{name}")
    public  String deleteInstitution(String legalName){
        return service.deleteInstitution(legalName);
    }
    
    //update institutions details
    @PutMapping("/update")
    public Institution updateInstitution(@RequestBody Institution institution){
        return service.updateInstitution(institution);
    }


}
