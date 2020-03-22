package ro.acs.csie.cts.g1084.tema2;

public class TestGit {

    public static final String TITLU_LICENTA = "Solutie informatica pentru managementul filmelor folosind tehnologii web";

    public static void main(String[] args) {
        System.out.println("Hello Git ! Denumirea proiectului de licență este " + TITLU_LICENTA);

        User user = new User("andreitelehoi", "password", 3);
        System.out.println("Number of movies watched initially: " + user.moviesWatchedNo);
        int newWatchedMoviesNo = 5;
        user.addWatchedMovies(newWatchedMoviesNo);
        System.out.println("Number of movies watched after method execution: " + user.moviesWatchedNo);
    }
}
