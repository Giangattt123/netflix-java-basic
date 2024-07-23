package com.example.homework.netflix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.homework.netflix.dto.FavoriteMovieRequest;
import com.example.homework.netflix.dto.GetUserFavoriteMovieResponse;
import com.example.homework.netflix.dto.LoginRequest;
import com.example.homework.netflix.dto.RegistrationRequest;
import com.example.homework.netflix.exception.MovieNotFoundException;
import com.example.homework.netflix.model.User;
import com.example.homework.netflix.repository.AppRepository;
import com.example.homework.netflix.service.UserService;

@SpringBootApplication
public class NetflixApplication {
	public static void main(String[] args) throws MovieNotFoundException {
		ApplicationContext context = SpringApplication.run(NetflixApplication.class, args);
		String email = "giangpd077@gmail.com";
		String password = "password";
		// get created bean
		UserService userService = context.getBean(UserService.class);
		System.out.println(userService);
		AppRepository appRepository = context.getBean(AppRepository.class);
		System.out.println(appRepository);
		// use bean to call functions
		// init db
		appRepository.addMovie(1, "Spider man");
		appRepository.addMovie(2, "Superman");
		appRepository.addMovie(3, "Wonder woman");
		// call service
		userService
				.createUser(RegistrationRequest.builder().email(email).password(password).build());
		User user = userService.findUser(LoginRequest.builder().email(email).password(password).build());
		userService.favoriteMovie(user, FavoriteMovieRequest.builder().movieId(1).build());
		userService.favoriteMovie(user, FavoriteMovieRequest.builder().movieId(2).build());
		GetUserFavoriteMovieResponse favoriteResponse = userService.getUserFavoriteMovies(user);
		System.out.println("favoriteResponse=" + favoriteResponse);
	}

}
