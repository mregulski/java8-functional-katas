package katas;


import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import model.Bookmark;
import model.Movie;
import util.DataUtil;

import java.util.List;
import java.util.Map;

/*
    Goal: Combine videos and bookmarks by index (StreamUtils.zip) (https://github.com/poetix/protonpack)
    DataSource: DataUtil.getMovies()
    Output: List of ImmutableMap.of("videoId", "5", "bookmarkId", "3")
*/
public class Kata8 {
    public static List<Map> execute() {
        List<Movie> movies = DataUtil.getMovies();
        List<Bookmark> bookMarks = DataUtil.getBookMarks();
        // Streams.zip(): [1,2,3], [321,456,789] -> [{video: 1, bookmark: 321}, {video: 2, bookmark: 456}, { video: 3, bookmark: 789}]
        return ImmutableList.of(ImmutableMap.of("videoId", 5, "bookmarkId", 3));
    }
}
