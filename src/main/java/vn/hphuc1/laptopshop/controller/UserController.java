package vn.hphuc1.laptopshop.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class UserController {
    @RequestMapping("")

    public String helloPage() {
        return "Hello from UserController";
    }
}
