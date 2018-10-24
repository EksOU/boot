package life.eks.demo.security;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Eks OU
 */
@Controller
public class IndexController {

    @RequestMapping("/home")
    public String home() {
        return "home.html";
    }

    @RequestMapping("/")
    public String index() {
        return "index.html";
    }


    @RequestMapping("/login")
    public String login() {
        return "login.html";
    }

    @RequestMapping("/api/api")
    @ResponseBody
    public String adminApi() {
        return "admin hello spring security";
    }

}
