package neurortech.api.neuroflow.services;

import neurortech.api.neuroflow.entities.Certification;
import neurortech.api.neuroflow.repositories.CertificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CertificationService {

    @Autowired
    private CertificationRepository certificationRepository;

    public List<Certification> getAllCertifications() {
        return certificationRepository.findAll();
    }


    public Certification getCertificationById(Long id) {
        return certificationRepository.findById(id).orElse(null);
    }


    public Certification createCertification(Certification certification) {
        return certificationRepository.save(certification);
    }

    public Certification updateCertification(Long id, Certification updatedCertification) {
        return certificationRepository.findById(id)
            .map(certification -> {
                certification.setName(updatedCertification.getName());
                certification.setDescription(updatedCertification.getDescription());
                return certificationRepository.save(certification);
            })
            .orElse(null);
    }

    public void deleteCertification(Long id) {
        certificationRepository.deleteById(id);
    }
}

