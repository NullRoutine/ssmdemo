package com.example.nullroutine.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class User implements Serializable {
    private Integer id;
    private String name;
    private String password;
    private Date date;
}
