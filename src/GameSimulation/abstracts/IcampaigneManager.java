package GameSimulation.abstracts;

import GameSimulation.entities.Campaigne;
import GameSimulation.entities.Game;

public interface IcampaigneManager {
    void dailyDiscount(Game game, Campaigne campaigne);
    void buyOneGetOne(Game game,Campaigne campaigne);



}
