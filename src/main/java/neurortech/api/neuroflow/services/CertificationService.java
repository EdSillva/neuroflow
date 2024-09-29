package neurortech.api.neuroflow.services;

import neurortech.api.neuroflow.entities.Certification;
import neurortech.api.neuroflow.repositories.CertificationRepository;

import java.util.List;

public class CertificationService {

    private final CertificationRepository certificationRepository;

    public CertificationService(CertificationRepository certificationRepository) {
        this.certificationRepository = certificationRepository;
    }

    public List<Certification> getAllCertifications() {
        return certificationRepository.findAll();
    }

    public Certification getCertificationById(Long id) {
        return certificationRepository.findById(id).orElse(null);
    }

    public Certification createCertification(Certification certification) {
        return certificationRepository.save(certification);
    }
}
