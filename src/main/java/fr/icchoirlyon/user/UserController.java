package fr.icchoirlyon.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

@RestController
@RequestMapping("/api")
public class UserController {
    @Inject
    private UserService userService;

    @PostMapping("/users/sign-up")
    public void signUp(@RequestBody User user) {
        userService.saveUser(user);
    }
}
