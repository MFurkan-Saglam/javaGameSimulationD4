package GameSimulation.abstracts;

import GameSimulation.entities.NewMember;

public interface INewMemberManager {
    void signUp(NewMember newMember);
    void update(NewMember newMember,String currentName,String currentLastName);
    void delete(NewMember newMember);

}
