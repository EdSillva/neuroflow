package neurortech.api.neuroflow.repositories;

import neurortech.api.neuroflow.entities.Certification; 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CertificationRepository extends JpaRepository<Certification, Long> {
}
    
