package dio.spring.security.service;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
    public class TestController {

        @GetMapping("/")
        public String home(){
            return "Bem-vindo!";
        }

        @GetMapping("/users")
        @PreAuthorize("hasAnyRole('MANAGERS','USERS')")
        public String users() {
            return "Área de usuários";
        }

        @GetMapping("/managers")
        @PreAuthorize("hasRole('MANAGERS')")
        public String managers() {
            return "Área de gerentes";
        }
    }


