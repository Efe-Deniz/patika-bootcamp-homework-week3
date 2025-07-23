package patika_week_3;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Movie_Collection_Filterin_Test {

    public static void main(String[] args) {
        Movie_Collection_Filtering film1 = new Movie_Collection_Filtering("Esaretin Bedeli",1994,"Drama",9.3);
        Movie_Collection_Filtering film2 = new Movie_Collection_Filtering("Baba",1972,"Drama",9.2);
        Movie_Collection_Filtering film3 = new Movie_Collection_Filtering("Kara Şövalye",2008,"Action",9.0);
        Movie_Collection_Filtering film4 = new Movie_Collection_Filtering("Öfkeli Adam",1957,"Crime",9.0);
        Movie_Collection_Filtering film5 = new Movie_Collection_Filtering("Schindler'in Listesi",1993,"Biography",8.9);

        ArrayList<Movie_Collection_Filtering> filmList = new ArrayList<>();
        filmList.add(film1);
        filmList.add(film2);
        filmList.add(film3);
        filmList.add(film4);
        filmList.add(film5);

        //ımdb puanına göre sıralama
        System.out.println("IMDB Puanına Göre Sıralama");
        Collections.sort(filmList, new Comparator<Movie_Collection_Filtering>() {
            @Override
            public int compare(Movie_Collection_Filtering f1, Movie_Collection_Filtering f2) {
                // IMDb puanına göre büyükten küçüğe
                return Double.compare(f2.getImdbScore(), f1.getImdbScore());
            }
        });

        for(Movie_Collection_Filtering film : filmList){
            System.out.println(film.getFilmName() + " - " + film.getImdbScore());
        }
        // film yılına göre sıralama
        System.out.println("Yayın Yılına Göre Sıralama");
        Collections.sort(filmList, new Comparator<Movie_Collection_Filtering>() {
            @Override
            public int compare(Movie_Collection_Filtering o1, Movie_Collection_Filtering o2) {
                return Integer.compare(o1.getPublicationYear(), o2.getPublicationYear());
            }
        });

        for(Movie_Collection_Filtering film:filmList){
            System.out.println(film.getFilmName() + " - " + film.getPublicationYear());
        }
        System.out.println("Filtreleme: Drama Türü");
        filterByGenre(filmList, "Drama");


    }
    /*
    Film Filtreleme
    Bir metod yazın ve şu işlemi yapın:

    Belirli bir film türünü parametre olarak alarak o türe ait filmleri filtreleyin.

       Filtrelenmiş filmleri ekrana yazdırın.
     */
    public static void filterByGenre(List<Movie_Collection_Filtering> list, String genre) {
        for (Movie_Collection_Filtering film : list) {
            if (film.getType().equalsIgnoreCase(genre)) {
                System.out.println(film.getFilmName() + " - " + film.getType());
            }
        }
    }


}
