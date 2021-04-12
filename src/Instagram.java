public class Instagram extends User implements genderDescribe
{
    //inheritance: inherits the properties and definitions of pet class
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

 
 public String platformGenDescribe(String gender) {
    	
    	if(gender == "male") {
    		return "Your Followers are not always your fans";
    	}
    	
    	else {
    		return "Having a lot of fun with respect.";
    	}
    }
}
