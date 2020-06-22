package dev.tobachi.sample.presentation;

import dev.tobachi.sample.application.UserService;
import dev.tobachi.sample.domain.User;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/api/v1")
public class UserRestController {

    private final UserService userService;

    @GetMapping(value = "/get/users")
    public List<User> getUsers() {
        return userService.all();
    }

    @PostMapping(value = "/create/user")
    public void createUser(@RequestBody User user) {
        userService.create(user);
    }

}
