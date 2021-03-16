package com.example.quickstart.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class ProfileServiceTest {

    @Autowired
    private ProfileService profileService;


    @Test
    public void 프로필_정보를_저장할_수_있다() {
        Profile profile = new Profile("name", "woman", "homepage");

        profileService.saveProfile(profile);
    }

}
