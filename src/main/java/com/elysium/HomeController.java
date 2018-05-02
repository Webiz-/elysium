package com.elysium;

import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class HomeController {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return
            "Hello" + "<br >";
    }
}