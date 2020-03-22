package ro.acs.csie.cts.g1084.tema2;

public class User implements Watchable{
    public String username;
    private String password;
    public int moviesWatchedNo;

    public User(String username, String password, int moviesWatchedNo) {
        super();
        this.username = username;
        this.password = password;
        this.moviesWatchedNo = moviesWatchedNo;
    }

    @Override
    public void addWatchedMovies(int moviesNumber) {
        this.moviesWatchedNo += moviesNumber;
    }
}
