package com.example.quickstart.controller;

import com.example.quickstart.domain.Profile;
import com.example.quickstart.domain.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProfileController {

    @Autowired
    private ProfileService profileService;

    @GetMapping("/profile")
    public String getProfilePage() {

        return "profile_write";
    }

    @PostMapping("/profile")
    public String saveProfileInfo(Profile profile) {

        System.out.println("username: " + profile.getUsername());
        System.out.println("sex: " + profile.getSex());
        System.out.println("homepage: " + profile.getHomepage());

        profileService.saveProfile(profile);
        return "redirect:/";
    }

}
