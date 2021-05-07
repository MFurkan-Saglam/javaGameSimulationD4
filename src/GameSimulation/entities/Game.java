package GameSimulation.entities;

public class Game {
    private String gameName;
    private int id;
    private int price;


    public Game()
    {

    }
    public Game(String gameName,int price)
    {

        this.gameName=gameName;
        this.price=price;
    }


    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
