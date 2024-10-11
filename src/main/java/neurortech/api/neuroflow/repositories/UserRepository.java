package neurortech.api.neuroflow.repositories;

import neurortech.api.neuroflow.entities.User; 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
    

