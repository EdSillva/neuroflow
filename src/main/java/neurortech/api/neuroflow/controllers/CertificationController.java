package neurortech.api.neuroflow.controllers;

import neurortech.api.neuroflow.entities.Certification;
import neurortech.api.neuroflow.services.CertificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/certifications")
public class CertificationController {

    @Autowired
    private CertificationService certificationService;

    @GetMapping
    public List<Certification> getAllCertifications() {
        return certificationService.getAllCertifications();
    }

    @GetMapping("/{id}")
    public Certification getCertificationById(@PathVariable Long id) {
        return certificationService.getCertificationById(id);
    }

    @PostMapping
    public Certification createCertification(@RequestBody Certification certification) {
        return certificationService.createCertification(certification);
    }

    @PutMapping("/{id}")
    public Certification updateCertification(@PathVariable Long id, @RequestBody Certification updatedCertification) {
        return certificationService.updateCertification(id, updatedCertification);
    }

    @DeleteMapping("/{id}")
    public void deleteCertification(@PathVariable Long id) {
        certificationService.deleteCertification(id);
    }
}


