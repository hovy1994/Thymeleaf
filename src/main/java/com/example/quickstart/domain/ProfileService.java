package com.example.quickstart.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfileService {

    @Autowired
    ProfileRepository repository;

    public void saveProfile(Profile profile) {
        repository.save(profile);
    }

}
