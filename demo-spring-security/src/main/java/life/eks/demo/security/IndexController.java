package life.eks.demo.security;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Eks OU
 */
@RestController
public class IndexController {

    @RequestMapping("/")
    public String index() {
        return "hello spring security";
    }
}
