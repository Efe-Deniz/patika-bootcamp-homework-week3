package patika_week_3;

public class Movie_Collection_Filtering {

    private String filmName;
    private int publicationYear;
    private String type;
    private double imdbScore;

    public Movie_Collection_Filtering(String filmName, int publicationYear, String type, double imdbScore) {
        this.filmName = filmName;
        this.publicationYear = publicationYear;
        this.type = type;
        this.imdbScore = imdbScore;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getImdbScore() {
        return imdbScore;
    }

    public void setImdbScore(double imdbScore) {
        this.imdbScore = imdbScore;
    }
}
