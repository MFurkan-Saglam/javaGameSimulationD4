package GameSimulation.concretes;

import GameSimulation.abstracts.IGameMnager;
import GameSimulation.core.Controls;
import GameSimulation.entities.Game;

public class gameManager extends Controls implements IGameMnager  {


    @Override
    public void addGame(Game game) {
        System.out.println(game.getGameName()+" "+"adlı oyun eklenmiştir.");
    }
}
