public class LinkedIn extends User
{
    //inheritance: inherits the properties and definitions of User class
    public LinkedIn(String name, int age, String gender)
    {
        super(name, age, gender);
    }

    //polymorphism: taking selfDescribe() method from User and creating another form of it!
    @Override
    public String selfDescribe() {
        //here a statement is added to the suffix of the ancestor class
        return super.selfDescribe() + "Focused on improving my skills. Looking forward to connect with everyone!";
    }

    // Here, we didn't implement the genderDescribe interface because LinkedIn bios are irrelevant
    // of anyone's gender.
}
