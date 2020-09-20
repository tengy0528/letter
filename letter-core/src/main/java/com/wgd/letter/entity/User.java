package com.wgd.letter.entity;

import lombok.Data;

import java.util.Date;

@Data
public class User {

    private Integer id;

    private String name;

    private String password;

    private String birthday;

    private Integer age;

    private String phone;

    private String email;

    private Date createdAt;

    private Date updatedAt;
}
