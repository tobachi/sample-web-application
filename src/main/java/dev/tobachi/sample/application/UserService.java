package dev.tobachi.sample.application;

import dev.tobachi.sample.domain.model.User;
import dev.tobachi.sample.domain.repository.UsersRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {

    private final UsersRepository usersRepository;

    public List<User> all() {
        return usersRepository.findAll();
    }

    public void create(User user) {
        usersRepository.save(user);
    }

}
