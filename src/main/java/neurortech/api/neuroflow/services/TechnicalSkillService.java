package neurortech.api.neuroflow.services;

import neurortech.api.neuroflow.entities.TechnicalSkill;
import neurortech.api.neuroflow.repositories.TechnicalSkillRepository;

import java.util.List;

public class TechnicalSkillService {

    private final TechnicalSkillRepository technicalSkillRepository;
    public TechnicalSkillService(TechnicalSkillRepository technicalSkillRepository) {
        this.technicalSkillRepository = technicalSkillRepository;
    }

    public List<TechnicalSkill> getAllTechnicalSkills() {
        return technicalSkillRepository.findAll();
    }

    public TechnicalSkill getTechnicalSkillById(Long id) {
        return technicalSkillRepository.findById(id).orElse(null);
    }

    public TechnicalSkill createTechnicalSkill(TechnicalSkill technicalSkill) {
        return technicalSkillRepository.save(technicalSkill);
    }
}
