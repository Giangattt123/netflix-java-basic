package com.example.homework.netflix.repository;
import java.util.List;

import com.example.homework.netflix.model.Movie;
import com.example.homework.netflix.model.User;
public interface AppRepository {
    User createNewUser(String email , String password);
    User findUserByUserEmail(String email);
    Movie addMovie(int id , String title);
    Movie findMovieByMovieId(int movieId);
    void saveFavoriteMovie(int userId , int movieId);
    List<Integer> getUserFavoritesMovieIds(int userId);
}
