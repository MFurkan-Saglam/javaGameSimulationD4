package GameSimulation.concretes;

import GameSimulation.abstracts.INewMemberManager;
import GameSimulation.core.Controls;
import GameSimulation.entities.NewMember;

public class NewMemberManager extends Controls implements INewMemberManager {
    @Override
    public void signUp(NewMember newMember) {
        System.out.println(newMember.getIdentityNumber()+" "+"Tc nolu ve"+" "+newMember.getFirstName()+" "+"isimli kullanıcın hesabı oluşturuldu");
    }

    @Override
    public void update(NewMember newMember,String currentName,String currentLastName) {
        System.out.println("Kullanıcının ismi ve soyismi"+" "+currentName+" "+currentLastName.toUpperCase()+" "+"şeklinde değiştirildi.");

    }

    @Override
    public void delete(NewMember newMember) {
        System.out.println(newMember.getIdentityNumber()+" "+"Tc no'ya sahip kullanıcının hesabı silindi.");

    }
}
