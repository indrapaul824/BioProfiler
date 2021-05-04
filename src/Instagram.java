public class Instagram extends User implements genderDescribe
{
    //inheritance: inherits the properties and definitions of User class
    public Instagram(String name, int age, String gender)
    {
        super(name, age, gender);
    }

    //polymorphism: taking selfDescribe() method from User and creating another form of it!
    @Override
    public String selfDescribe() {
        //here a statement is added to the suffix of the ancestor class
        return super.selfDescribe() + platformGenDescribe (super.getGender ()) + "My life is better than my daydreams!";
    }

    // implementing platformGenDescribe according to gender and platform
    public String platformGenDescribe(String gender) {

        if(gender.equals ("Male")) {
            return "Mr. Perfect describes me best. ";
        }

        else if(gender.equals ("Female")) {
            return "Beauty and simplicity defines me. ";
        }

        else
            return "";
        }
}
