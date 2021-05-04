public class Twitter extends User implements genderDescribe 
{
    //inheritance: inherits the properties and definitions of User class
    public Twitter(String name, int age, String gender)
    {
        super(name, age, gender);
    }

    //polymorphism: taking selfDescribe() method from User and creating another form of it!
    @Override
    public String selfDescribe() {
        //here a statement is added to the suffix of the ancestor class
        return super.selfDescribe() + platformGenDescribe (super.getGender ()) + "Coffee and Music are my lifeline!";
    }

    // implementing platformGenDescribe according to gender and platform
    public String platformGenDescribe(String gender) {
    	
    	if(gender.equals ("Male")) {
    		return "Not your usual guy, love to innovate and inspire. ";
    	}
    	 
    	else if(gender.equals ("Female")) {
    		return "Here to inspire that every woman out there can do it if they try. ";
    	}

        else
            return "";
    }
}
