package com.twu.provider;


import com.twu.model.item.Name;
import com.twu.model.item.PublicationYear;
import com.twu.model.movie.DirectorName;
import com.twu.model.movie.Movie;

import java.util.ArrayList;

public class MovieList {
    private ArrayList<Movie> movieList = new ArrayList<>();


    public ArrayList<Movie> createMovieList(){
        Movie movie1 = new Movie(new Name("Mad Max"), new PublicationYear(2004), new DirectorName("George Miller"), 5);
        Movie movie2 = new Movie(new Name("Inside Out"), new PublicationYear(2001), new DirectorName("Ronnie del Carmen"), 7);
        Movie movie3 = new Movie(new Name("Selma"), new PublicationYear(1998), new DirectorName("Pete Docter"), 5);
        Movie movie4 = new Movie(new Name("Spotlight"), new PublicationYear(2002), new DirectorName("Tom McCarthy"), 5);
        Movie movie5 = new Movie(new Name("Brooklyn"), new PublicationYear(2009), new DirectorName("John Crowley"), 5);

        movieList.add(movie1);
        movieList.add(movie2);
        movieList.add(movie3);
        movieList.add(movie4);
        movieList.add(movie5);

        return movieList;


    }




}
