package neurortech.api.neuroflow.services;

import neurortech.api.neuroflow.entities.TechnicalSkill;
import neurortech.api.neuroflow.repositories.TechnicalSkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TechnicalSkillService {

    @Autowired
    private TechnicalSkillRepository technicalSkillRepository;

    public List<TechnicalSkill> getAllTechnicalSkills() {
        return technicalSkillRepository.findAll();
    }

    public TechnicalSkill getTechnicalSkillById(Long id) {
        return technicalSkillRepository.findById(id).orElse(null);
    }

    public TechnicalSkill createTechnicalSkill(TechnicalSkill technicalSkill) {
        return technicalSkillRepository.save(technicalSkill);
    }

    public TechnicalSkill updateTechnicalSkill(Long id, TechnicalSkill updatedTechnicalSkill) {
        return technicalSkillRepository.findById(id)
            .map(technicalSkill -> {
                technicalSkill.setName(updatedTechnicalSkill.getName());
                technicalSkill.setDescription(updatedTechnicalSkill.getDescription());
                return technicalSkillRepository.save(technicalSkill);
            })
            .orElse(null);
    }

    public void deleteTechnicalSkill(Long id) {
        technicalSkillRepository.deleteById(id);
    }
}
