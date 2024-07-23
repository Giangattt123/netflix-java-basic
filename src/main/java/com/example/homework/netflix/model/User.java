package com.example.homework.netflix.model;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@Builder
@Getter
@Setter
public class User {
    private int id;
    private String email;
    private String password;
}
