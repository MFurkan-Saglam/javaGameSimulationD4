package GameSimulation.concretes;

import GameSimulation.abstracts.IsaleManager;
import GameSimulation.core.Controls;
import GameSimulation.entities.NewMember;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class saleManager extends Controls implements IsaleManager{
    @Override
    public void sale(NewMember newMember) {
        checkAge(newMember);
        checkIdentityNumber(newMember);
    }
}
