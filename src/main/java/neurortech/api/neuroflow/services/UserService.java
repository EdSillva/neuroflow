package neurortech.api.neuroflow.services;

import neurortech.api.neuroflow.entities.User;
import neurortech.api.neuroflow.repositories.UserRepository;

import java.util.List;

public class UserService {

    private final UserRepository userRepository;
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }
}
