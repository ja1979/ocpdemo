package ec.sevolutivo.ocpdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OcpdemoController {

    @GetMapping("/hello/{name}")
    public String sayHello(@PathVariable String name) {
        return "v3.3: Hi " + name;
    }

}
