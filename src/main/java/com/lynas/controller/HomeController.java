package com.lynas.controller;

import com.lynas.service.AppUserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    private final AppUserService appUserService;

    public HomeController(AppUserService appUserService) {
        this.appUserService = appUserService;
    }

    @GetMapping("/")
    public String  index() {
        return "Hello world";
    }

    @GetMapping("/appUser/{id}")
    public String  appUser(@PathVariable long id) {
        return appUserService.findById(id).toString();
    }
}
