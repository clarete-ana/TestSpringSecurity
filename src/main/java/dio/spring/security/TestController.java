package dio.spring.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
    public class TestController {

        @GetMapping("/users")
        public String users() {
            return "Área de usuários";
        }

        @GetMapping("/managers")
        public String managers() {
            return "Área de gerentes";
        }
    }


