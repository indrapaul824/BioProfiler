public class LinkedIn extends User
{
    //inheritance: inherits the properties and definitions of User class
    public LinkedIn(String name, int age, String gender)
    {
        super(name, age, gender);
    }

    //polymorphism
    @Override
    public String selfDescribe() {
        //immediate ancestor
        return super.selfDescribe() + "Looking forward to connect with everyone!";
    }
}
