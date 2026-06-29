package complexTask4;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class MovieService {
    Map<Movie, List<Rating<? extends Number>>> map;
    public final static double MAX_VALUE = 10.0;
    public final static double MIN_VALUE = 1.0;

    public MovieService() {
        map = new ConcurrentHashMap<>();
    }

    public void addGrade(Movie movie, Rating<? extends Number> rating) {
        if (movie == null || rating == null) {
            throw new IllegalArgumentException("Movie or Rating should be not null");
        }
        if (rating.getGrade().doubleValue() > MAX_VALUE || rating.getGrade().doubleValue() < MIN_VALUE) {
            throw new IllegalArgumentException("Rating must be between "+ MIN_VALUE + " AND " + MAX_VALUE);
        }
        List<Rating<? extends Number>> ratings = map.get(movie);
        if (ratings == null) {
            ratings = new ArrayList<>();
            map.put(movie, ratings);
        }
        ratings.add(rating);
    }

    public Map<Movie, Double> getAvgGradeByAllMovies() {
        return map.entrySet().stream().collect(Collectors.toMap(
                Map.Entry::getKey,
                entry -> {
                    double avg = entry.getValue().stream().mapToDouble(rating -> rating.getGrade().doubleValue()).average().orElse(0.0);
                    return Math.round(avg * 10.0) / 10.0;
                }
        ));
    }

    public Map<Movie, Double> sorting(Map<Movie, Double> map) {
        return map.entrySet().stream().sorted(Map.Entry.<Movie, Double>comparingByValue().reversed()).collect(Collectors.toMap(
                entry -> entry.getKey(),
                entry -> entry.getValue(),
                (e1, e2) -> e1,
                LinkedHashMap::new
        ));
    }

    public Map<Movie, List<Rating<? extends Number>>> getMap() {
        return Map.copyOf(map);
    }



}
