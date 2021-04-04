interface genderDescribe
{
    String platformGenDescribe(String gender);
}

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

    public String getGender () {
        return gender;
    }

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
            return "a teenager who is learning a whole lot of new things. ";
        }

        else if (age >= 20 && age < 30)
        {
            return "a cheerful youth exploring the ways of the world. ";
        }
        
        else if (age >= 30 && age < 60)
        {
        	return "a responsible citizen of the society who wants to do something Big and Appreciative! ";
        }

        return "a retired senior citizen of the society who is grateful to be sharing his life experiences and flaws. ";

        }
}
