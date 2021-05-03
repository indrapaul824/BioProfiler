public class LinkedIn extends User implements genderDescribe
{
    //inheritance: inherits the properties and definitions of User class
    public LinkedIn(String name, int age, String gender)
    {
        super(name, age, gender);
    }

    //polymorphism
    @Override
    public String selfDescribe() {
        //immediate ancestor
        return super.selfDescribe() + "Looking forward to connect with everyone!";
    }    
    
    
    
    
    
 public String platformGenDescribe(String gender) {
    	
    	if(gender.equals ("male")) {
    		return "Just trying to be better than tomorrow.";
    	}
    	
    	else {
    		return "I hope the fathers and mothers of girls will look at them and say yes women can .";
    	}
    }
}
