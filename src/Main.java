import GameSimulation.entities.*;
import GameSimulation.concretes.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        NewMember newMember=new NewMember("12345678910","furkan","sağlam",2000);
        NewMember newMember1=new NewMember("10987654321","engin","demiroğ",1999);
        NewMember newMember2=new NewMember("0000000000","yusuf","salkım",2010);


        NewMemberManager newMemberManager=new NewMemberManager();
        newMemberManager.signUp(newMember1);
        newMemberManager.update(newMember1,"Engin","demirog");
        newMemberManager.delete(newMember);



        Game game=new Game("gta5",500);
        gameManager gameManager=new gameManager();
        gameManager.addGame(game);


        saleManager saleManager=new saleManager();
        saleManager.sale(newMember2);



        Campaigne campaigne=new Campaigne(20);
        campaigneManager campaigneManager=new campaigneManager();
        campaigneManager.dailyDiscount(game,campaigne);











    }
}
