package GameSimulation.entities;

public class NewMember {
    private String identityNumber;
    private String firstName;
    private String lastName;
    private int yearOfBirth;

    public NewMember()
    {

    }
    public NewMember(String  identityNumber, String firstName, String lastName, int yearOfBirth)
    {
        this.identityNumber=identityNumber;
        this.firstName=firstName;
        this.lastName=lastName;
        this.yearOfBirth=yearOfBirth;
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return yearOfBirth;
    }

    public void setAge(int age) {
        this.yearOfBirth = yearOfBirth;
    }
}
