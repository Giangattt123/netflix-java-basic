package com.example.homework.netflix.service;

import com.example.homework.netflix.dto.RegistrationResponse;
import com.example.homework.netflix.exception.MovieNotFoundException;
import com.example.homework.netflix.dto.FavoriteMovieRequest;
import com.example.homework.netflix.dto.GetUserFavoriteMovieResponse;
import com.example.homework.netflix.dto.LoginRequest;
import com.example.homework.netflix.dto.RegistrationRequest;
import com.example.homework.netflix.model.User;
public interface UserService {
    RegistrationResponse createUser(RegistrationRequest registrationRequest);
    User findUser(LoginRequest loginRequest);
    void favoriteMovie(User user , FavoriteMovieRequest favoriteMovieRequest) throws MovieNotFoundException;
    GetUserFavoriteMovieResponse getUserFavoriteMovies(User user);
} 