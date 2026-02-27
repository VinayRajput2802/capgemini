import java.util.*;
public class GameServices {
    static ArrayList<Game> games = new ArrayList<>();
    public GameServices(){
        games.add(new Game("SnowBird","Danny",300));
        games.add(new Game("FreshFood","Ram",450));
        games.add(new Game("Batsman","Kate",400));
        games.add(new Game("Pokiman","Steeve",600));
        games.add(new Game("YammyTommy","Narayan",350));
    }
    public void viewAllGames(){
        for(Game game:games){
            System.out.println(game.getGame_name()+"  "+game.getAuthor_name()+"  "+game.getPrice());
        }
    }
    public String AuthorSearch(String author_name){
        for (Game game:games){
            if (game.getAuthor_name().equals(author_name)) {
                return game.getGame_name();
            }
        }
        return "NOT FOUND";
    }
}
