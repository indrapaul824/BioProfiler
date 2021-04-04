public class Twitter extends User
{
    //inheritance: inherits the properties and definitions of pet class
    public Twitter(String name, int age, String gender)
    {
        super(name, age, gender);
    }

    //polymorphism
    @Override
    public String selfDescribe() {
        //immediate ancestor
        return super.selfDescribe() + "Coffee and Music are my lifeline!";
    }
}