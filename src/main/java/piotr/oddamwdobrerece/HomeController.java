package piotr.oddamwdobrerece;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import piotr.oddamwdobrerece.user.User;
import piotr.oddamwdobrerece.user.UserService;

@Controller
@RequiredArgsConstructor
public class HomeController {

    private final UserService userService;

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/create-user")
    @ResponseBody
    public String createUser() {
        User user = new User();
        user.setName("admin");
        user.setPassword("admin");
        userService.saveUser(user);
        return "admin";
    }
}
