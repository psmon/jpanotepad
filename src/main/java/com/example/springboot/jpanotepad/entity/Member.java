package com.example.springboot.jpanotepad.entity;

import javax.persistence.*;

@Entity
public class Member {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "MEMBER_ID")
    private Long id;

    private String username;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
