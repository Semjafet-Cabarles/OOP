class BloodData{
    private String bloodType;
    private String rhFactor;

  
public void setBloodType(String bloodType){
	this.bloodType = bloodType;
}

public void setRhFactor(String rhFactor){
	this.rhFactor = rhFactor;
}
 
public String getBloodType(){
	return this.bloodType;
}

public String getRhFactor(){
	return this.rhFactor;
}
 public void display(){
 	System.out.println(bloodType+rhFactor+" is added to the blood bank.");
 }
}