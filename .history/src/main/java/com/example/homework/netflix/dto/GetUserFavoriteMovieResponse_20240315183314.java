package com.example.homework.netflix.dto;
import java.util.List;
import com.example.homework.netflix.model.Movie;

import lombok.Builder;
@Builder
public class GetUserFavoriteMovieResponse {
    List<Movie> favoriteMovies;
}
