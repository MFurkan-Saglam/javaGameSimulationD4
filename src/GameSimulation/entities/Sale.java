package GameSimulation.entities;

public class Sale {
    String gameName;
    int gamePrice;


    public Sale()
    {

    }
    public Sale(String gameName, int gamePrice)
    {
        this.gameName=gameName;
        this.gamePrice=gamePrice;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public int getGamePrice() {
        return gamePrice;
    }

    public void setGamePrice(int gamePrice) {
        this.gamePrice = gamePrice;
    }
}
