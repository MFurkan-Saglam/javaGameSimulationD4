package GameSimulation.core;

import GameSimulation.entities.NewMember;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Controls  {
    public void checkAge(NewMember newMember)
    {
        LocalDate tarih=LocalDate.now();
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("yyyy");
        String tarih1=dateTimeFormatter.format(tarih);
        int tarih3=Integer.parseInt(tarih1);
        if((tarih3)-newMember.getAge()<=17)
        {
            System.out.println("Üzgünüz oyunu satın alabilmeniz için ebevyn onayı gerekmektedir.");
        }

    }
    public void checkIdentityNumber(NewMember newMember)
    {
        if(newMember.getIdentityNumber().length()!=11)
        {
            System.out.println("Tc kimlik numarasını hatalı girdiniz.");
        }
    }
}
