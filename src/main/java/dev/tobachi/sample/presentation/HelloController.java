package dev.tobachi.sample.presentation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class HelloController {

    @GetMapping
    public String hello() {
        return "Hello, your world.";
    }

}
