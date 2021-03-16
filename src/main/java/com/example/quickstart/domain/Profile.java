package com.example.quickstart.domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Getter
public class Profile {

    @Id
    private String username;

    @Column
    private String sex;

    @Column
    private String homepage;

    @Builder
    public Profile(String username, String sex, String homepage) {
        this.username = username;
        this.sex = sex;
        this.homepage = homepage;
    }
}
