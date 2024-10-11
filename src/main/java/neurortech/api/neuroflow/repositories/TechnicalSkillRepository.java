package neurortech.api.neuroflow.repositories;

import neurortech.api.neuroflow.entities.TechnicalSkill; 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TechnicalSkillRepository extends JpaRepository<TechnicalSkill, Long> {
    
}
