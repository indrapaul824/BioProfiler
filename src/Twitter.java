public class Twitter extends User implements genderDescribe 
{
    //inheritance: inherits the properties and definitions of pet class
    public Twitter(String name, int age, String gender)
    {
        super(name, age, gender);
    }

    //polymorphism
    @Override
    public String selfDescribe() {
        //immediate ancestor
        return super.selfDescribe() + "Coffee and Music are my lifeline!";
    }
    
    public String platformGenDescribe(String gender) {
    	
    	if(gender.equals ("male")) {
    		return "Wants to put more efforts in developement of society";
    	}
    	 
    	else {
    		return "Want to show Women can do better in the Society .";
    	}
    }
}
