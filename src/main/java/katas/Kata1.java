package katas;


import model.Movie;
import util.DataUtil;

import java.util.List;

/*
    Goal: use map() to project an array of videos into an array of {id, title}-pairs
    DataSource: DataUtil.getMovies()
    Output: [ { id: 5, title: "Bad Boys" } ]
*/
public class Kata1 {
    public static List<MovieTitle> execute() {
        List<Movie> movies = DataUtil.getMovies();

        throw new UnsupportedOperationException("You're not done with Kata1 yet :)");
    }

    public interface MovieTitle {
        int id();
        String title();
    }
}
