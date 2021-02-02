package movies;
import util.Input;

import java.sql.SQLOutput;
import java.util.Arrays;
import movies.Movie;
public class MoviesApplication {
    public static void main(String[] args){
        Input input = new Input();
        System.out.println("What would you like to do?\n\n0 - exit\n1 - view all movies\n2 - view movies in the animated category\n3 - view movies in the drama category\n4 - view movies in the horror category\n5 - view movies in the scifi category\n6 - view movies in the musical category\n\nEnter your choice: ");
        int choice = input.getInt();
        Movie[] films = MoviesArray.findAll();
        printMovie(choice,films);
    }
    public static void printMovie(int input, Movie[]films){
        switch(input){
            case 0:
                System.out.println("You chose no movies, goodbye!");
                break;
            case 1:
                for(Movie film: films){
                    System.out.println(film.getName());
                }
                break;
            case 2:
                for(Movie film: films){
                    if(film.getCategory().equals("animated")){
                        System.out.println(film.getName());
                    }
                }
                break;
            case 3:
                for(Movie film: films){
                    if(film.getCategory().equals("drama")){
                        System.out.println(film.getName());
                    }
                }
                break;
            case 4:
                for(Movie film: films){
                    if(film.getCategory().equals("horror")){
                        System.out.println(film.getName());
                    }
                }
                break;
            case 5:
                for(Movie film: films){
                    if(film.getCategory().equals("scifi")){
                        System.out.println(film.getName());
                    }
                }
                break;
            case 6:
                for(Movie film: films){
                    if(film.getCategory().equals("musical")){
                        System.out.println(film.getName());
                    }
                }
                break;
        }

    }


//    public static String findMovies(int input){
//        switch(input){
//            case 0:
//                System.out.println("You chose no movies, goodbye.");
//            break;
//
//            case 1:
//                for(Movie film: movies)
//        }
//    }
}
