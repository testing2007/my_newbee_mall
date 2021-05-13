package com.zander.web01.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThymeleafController {
//    @GetMapping("/hello1")
//    public String hello(HttpServletRequest request, @RequestParam(value="description", required = false, defaultValue = "springboot-thymeleaf") String description) {
//        request.setAttribute("description", description);
//        return "thymeleaf.html";
//    }

    @RequestMapping("/test")
    public String test(Model model) {
        String hello = "Hello Thymeleaf";
        model.addAttribute("description", hello);
        return "thymeleaf.html";
    }
}
