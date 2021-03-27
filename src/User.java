public class User
{
    //properties
    private String name = "";
    private int age = 0;
    private String gender = "";

    public User(String name, int age, String gender)
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    /*
    private int ageMultiplier = 1;

    //used inheritance to specialize in pet class for the descendant cat and dog
    public User(String name, int age, String gender, int ageMultiplier)
    {
        this.name = name;
        this.age = age;
        this.ageMultiplier = ageMultiplier;
    }
     */

    public String selfDescribe()
    {
        return "Hello my name is " + name + ". I am " + findAgeGroup();
    }
    public String findAgeGroup()
    {
        if (age < 13)
        {
            return "a kid with the brightest future ahead. ";
        }

        else if (age >= 13 && age < 20)
        {
            return "a teenager who loves learning new things. ";
        }

        else if (age >= 20 && age < 50)
        {
            return "a working adult of the society. ";
        }

        return "a retired senior citizen of the society. ";
    }
}
