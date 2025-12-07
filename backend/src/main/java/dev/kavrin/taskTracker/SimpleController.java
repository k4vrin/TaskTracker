package dev.kavrin.taskTracker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

    @GetMapping("/api/test")
    public String hello() {
        return "Hello, Task Tracker!";
    }
}
