package hello;

import hello.dto.Ninja;
import hello.dto.Pirate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/PirateEndpoint")
    public Pirate getPirate() {
        return new Pirate();
    }

    @RequestMapping("/NinjaEndpoint")
    public Ninja getNinjae() {
        return new Ninja();
    }

}
