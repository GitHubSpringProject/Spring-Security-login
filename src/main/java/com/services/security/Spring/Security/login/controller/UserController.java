package com.services.security.Spring.Security.login.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    public String homePage = "<h2>This is HomePage </h2>   <br/> <a href = \"/user\">User Portal</a>" + "  " + "<a href = \"/admin\">Admin Portal</a>";

    @GetMapping("/")
    public String getHomePage() {
        return homePage;
    }

    @GetMapping("/admin")
    public String getAdmin() {
        return "Welcome Admin !! <br/>  <a href=\"/logout\">Click to logout as ADMIN </a>";
    }

    @GetMapping("/user")
    public String getUser() {
        return "Welcome User !! <br/>  <a href=\"/logout\">Click to logout as USER </a>";
    }
}
