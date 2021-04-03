public class Instagram extends User
{ //inheritance: inherits the properties and definitions of pet class
    public Instagram(String name, int age, String gender)
    {
        super(name, age, gender);
    }

    //polymorphism in java: an object can have many forms
    //taking selfDescribe() method from pet and creating another form of it!
    @Override
    public String selfDescribe() {
        //here fun cat ready to party is added to the suffix of the ancestor class
        return super.selfDescribe() + "Super funny and ready to party! ";
    }
}