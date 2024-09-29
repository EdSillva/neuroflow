package neurortech.api.neuroflow.controllers;

import neurortech.api.neuroflow.entities.TechnicalSkill;
import neurortech.api.neuroflow.services.TechnicalSkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/technical-skills")
public class TechnicalSkillController {

    @Autowired
    private TechnicalSkillService technicalSkillService;

    @GetMapping
    public List<TechnicalSkill> getAllTechnicalSkills() {
        return technicalSkillService.getAllTechnicalSkills();
    }

    @GetMapping("/{id}")
    public TechnicalSkill getTechnicalSkillById(@PathVariable Long id) {
        return technicalSkillService.getTechnicalSkillById(id);
    }

    @PostMapping
    public TechnicalSkill createTechnicalSkill(@RequestBody TechnicalSkill technicalSkill) {
        return technicalSkillService.createTechnicalSkill(technicalSkill);
    }
}
