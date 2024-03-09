package com.RavingBoothApp.RavingBoothApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping("/test")
    public String Welcome(){
        return "hello";
    }
}
