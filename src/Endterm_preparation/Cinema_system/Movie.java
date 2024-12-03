package Endterm_preparation.Cinema_system;

public class Movie implements Comparable<Movie>,Cloneable{
    private String title;
    private String genre;
    private int duration;
    private double rating;

    public Movie(String title, String genre, int duration, double rating) {
        this.title = title;
        this.genre = genre;
        this.duration = duration;
        this.rating = rating;
    }
    public String getTitle() {
        return title;

    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;

    }
    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    public double getRating() {
        return rating;
    }
    public void setRating(double rating) {
        this.rating = rating;
    }

    public String toString() {
        return "Title: " + title + ", Genre: " + genre + ", Duration: " + duration + ", Rating: " + rating;
    }

    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        if(duration != movie.duration) return false;
        return genre.equals(movie.genre);
    }
    public int compareTo(Movie o) {
        return this.duration - o.duration;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    

}
