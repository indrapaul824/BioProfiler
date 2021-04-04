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
            return "A kid with the brightest future ahead. ";
        }

        else if (age >= 13 && age < 20)
        {
            return "A teenager who loves learning new things. ";
        }

        else if (age >= 20 && age < 35)
        {
            return "A responsible youth of the society who wants to do something Big and appreciative !";
        }
        
        else if (age >= 20 && age < 35)
        {
        	return "This is your new birth after completing 18 years of your life , do something that resonates .";
        }
        
        
        else if ( age > 55)
        {
        	return "A retired senior citizen of the society always look forward to share my life experience and flaws .  ";
        }

        return "Females always have to work hard to prove themselves, but they never quit !";
    }
}
