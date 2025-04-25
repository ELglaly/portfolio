package com.protifolio.portfolio.controller;

import com.protifolio.portfolio.model.Profile;
import com.protifolio.portfolio.service.IProfileService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller()
@RequestMapping("/profile")
public class MainController  {

    private final IProfileService profileService;

    public MainController(IProfileService profileService) {
        this.profileService = profileService;
    }


    @GetMapping
    public String viewProfile(Model model) {
        Profile currentProfile = profileService.getProfile();
        model.addAttribute("profile", currentProfile);
        return "profile/index2";
    }

}
