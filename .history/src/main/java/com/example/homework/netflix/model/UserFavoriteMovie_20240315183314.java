package com.example.homework.netflix.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@Builder
@ToString
@EqualsAndHashCode
// POJO(Plain Old Java Object)
public class UserFavoriteMovie {
    private int userId;
    private int movieId;
}
