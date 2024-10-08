package be.bf.bf2024jenkinsmaven.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class HomeController {

    @RequestMapping(path = {"", "/"})
    public String homeAction(Map<String, Object> model) {
        model.put("name", "Kenobi");
        model.put("Demo", "Demo");
        return "home/index";
    }
}
