package hphuc1.vn.laptopshop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

class HelloWorldController {
    @GetMapping("/")
    public String helloWorld() {
        return "Hello World update 6";
    }

    @GetMapping("/user")
    public String Userpage() {
        return "This is User page";
    }

    @GetMapping("/admin")
    public String Adminpage() {
        return "This is admin page";
    }
}