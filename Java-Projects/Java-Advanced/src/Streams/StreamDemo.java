package Streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
    public static void show(){
        List<Movie> movies = List.of(
                new Movie("a",10,Genre.THRILLER),
                new Movie("b",15,Genre.ACTION),
                new Movie("c",20,Genre.THRILLER)
        );

        //Imperative programming
        countMoviesLikesMoreThan10(movies);

        //Declarative programming
        var count2 = movies.stream()
                .filter(movie -> movie.getLikes()>10)
                .count();

        int[] numbers = new int[]{1,2,3,4,5};
        Arrays.stream(numbers)
                .forEach(number -> System.out.println(number));

        Stream.of(1,2,3,4);

        ////         MAPING

        movies.stream()
                .map(movie -> movie.getTitle())
                .forEach(name -> System.out.println(name));

        //Filter

        movies.stream()
                .filter(m -> m.getLikes() > 10);

        //Slicing elements
        movies.stream()
                .limit(2)
                .forEach(m -> System.out.println(m.getTitle())); // getting only the first two elements

        // 1000 movies
        // 10 movies per page
        // 3rd page
        // skip(20) = skip( (page-1) * pageSize)
        // limit(10) = limit(pageSize)

        movies.stream()
                .skip(2)
                .forEach(m -> System.out.println(m.getTitle())); // skipping only the first two elements

        movies.stream()
                .takeWhile(m -> m.getLikes() < 30)
                .forEach(m -> System.out.println(m.getTitle()));
        movies.stream()
                .dropWhile(m -> m.getLikes() < 30)
                .forEach(m -> System.out.println(m.getTitle()));

        //Sorting

        movies.stream()
                .sorted(Comparator.comparing(m -> m.getTitle()))
                .forEach(m -> System.out.println(m));

        // Getting unique data
        movies.stream()
                .map(m -> m.getLikes()>10)
                .distinct()
                .forEach(m-> System.out.println(m));

        // Peeking Elements

        System.out.println("____________________");

         movies.stream()
                .filter(m -> m.getLikes()>10)
                .peek(m -> System.out.println("filter:" + m.getTitle()))
                .map(m -> m.getTitle())
                .peek(m -> System.out.println( "mapped:" + m))
                .forEach(m -> System.out.println(m));

        //Reducers Operations
        var moviesCollect = movies.stream()
                .filter(m -> m.getLikes()>10)
                .collect(Collectors.toList());

        var result = movies.stream()
                .filter(m -> m.getLikes()>10)
                .collect(Collectors.toMap(m->m.getTitle(),m -> m.getLikes()));

        var result2 =  movies.stream()
                .collect(Collectors.groupingBy(Movie::getGenre, Collectors.toSet())); // to group by method



    }

    public static List<Movie> countMoviesLikesMoreThan10 (List<Movie> movies){
        int count = 0;
        List<Movie> results= new ArrayList<>();
        for(var movie :movies){
            if (movie.getLikes()>10){
                count++;
                results.add(movie);
            }
        }
        System.out.println("Number of movies :" + 3);
        return results;
    }
}
