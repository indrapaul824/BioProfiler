public class LinkedIn extends User
{ //inheritance: inherits the properties and definitions of pet class
    public LinkedIn(String name, int age, String gender)
    {
        super(name, age, gender);
    }

    //polymorphism
    @Override
    public String selfDescribe() {
        return "Fun Dog looking to make friends! " + super.selfDescribe(); //immediate ansestor
    }
}
