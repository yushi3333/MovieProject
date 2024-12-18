package dev.yushi.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;


    public List<Movie> allMovies(){
        List<Movie> movies = movieRepository.findAll();
        System.out.println("Movies fetched: " + movies);
        return movies;

    }

    public Optional<Movie> singleMovie(String imdbid){
        Optional<Movie> movie = movieRepository.findMovieByImdbId(imdbid);
        movie.ifPresent(m -> System.out.println("Fetched Movie Details: " + m));
        return movie;
    }
}
