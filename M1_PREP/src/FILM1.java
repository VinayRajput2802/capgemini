import java.util.ArrayList;
import java.util.List;

public class FILM1 {
    public static void main(String[] args) {
        FilmLibrary fl = new FilmLibrary();
        film f1 = new film("KGF","Sunil",2016);
        film f2 = new film("Bahubali","SSR",2012);
        film f3 = new film("KGF2","Sunil",2022);
        fl.addFilm(f1);
        fl.addFilm(f2);
        fl.addFilm(f3);
        System.out.println(fl.getFilms("Sunil"));
        System.out.println(fl.getFilms());

        fl.removeFilm(f1);

        System.out.println(fl.getTotalCount());
    }
}

class film implements Ifilm {
    private String title;
    private String director;
    private int year;

    public film(){}
    public film(String title,String director,int year){
        setTitle(title);
        setDirector(director);
        setYear(year);
    }
    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String getDirector() {
        return this.director;
    }

    @Override
    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public int getYear() {
        return this.year;
    }
}

interface Ifilm{
    void setTitle(String title);
    String getTitle();
    void setDirector(String director);
    String getDirector();
    void setYear(int year);
    int getYear();

}

class FilmLibrary{
    List<film> library = new ArrayList<>();
    int size = 0;
    public void addFilm(film f){
        size++;
        library.add(f);
    }
    public void removeFilm(film f){
        for(int i=0;i<library.size();i++){
            film curr_f = library.get(i);
            if (curr_f.equals(f)){
                library.remove(f);
                size--;
                break;
            }
        }
    }
    public List<film> getFilms(String query){
        List<film> res = new ArrayList<>();
        for (int i=0;i<library.size();i++){
            film curr_f = library.get(i);
            if (curr_f.getTitle().equals(query) || curr_f.getDirector().equals(query)){
                res.add(curr_f);
            }
        }
        return res;
    }
    public List<film> getFilms(){
        return library;
    }
    public int getTotalCount(){
        return size;
    }
}

