interface genderDescribe
{
    String platformGenDescribe(String gender);
}

public class User
{
    //properties
    private final String name;
    private final int age;
    private final String gender;

    public User(String name, int age, String gender)
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // method to return gender from user
    public String getGender () {
        return gender;
    }

    // primary method for forming the bio
    public String selfDescribe()
    {
        return "Hello my name is " + name + ". I am " + findAgeGroup();
    }

    // method to allocate appropriate statement according to the age group
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

        return "a retired senior citizen of the society. Grateful to share my life experiences and flaws. ";

        }
}
