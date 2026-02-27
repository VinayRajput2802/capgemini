public class Game {
    private String game_name;
    private String author_name;
    private float price;


    public String getGame_name() {
        return game_name;
    }

    public void setGame_name(String game_name) {
        this.game_name = game_name;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Game(String game_name, String author_name, float price) {
        setGame_name(game_name);
        setAuthor_name(author_name);
        setPrice(price);
    }

    @Override
    public String toString() {
        return this.getGame_name();
    }
}
