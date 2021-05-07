package GameSimulation.concretes;

import GameSimulation.abstracts.IcampaigneManager;
import GameSimulation.core.Controls;
import GameSimulation.entities.Campaigne;
import GameSimulation.entities.Game;


public class campaigneManager extends Controls implements IcampaigneManager {
    @Override
    public void dailyDiscount(Game game, Campaigne campaigne) {
        int fiyat=game.getPrice();
        int indirim=campaigne.getDiscount();
        int fiyat2=fiyat-((fiyat*indirim)/100);
        System.out.println("Oyun"+" "+game.getPrice()+" "+"Tl'den"+" "+fiyat2+" "+"Tl'ye inmiştir.");
    }

    @Override
    public void buyOneGetOne(Game game,Campaigne campaigne) {

    }
}
