public class BloodData {

private static String bloodtype;
private static String rhFactor;

public BloodData() {
 bloodtype = "O";
 rhFactor = "+";
 }
 public BloodData(String bt, String rh) {
 this.bloodtype = bt;
 this.rhFactor = rh;
 }

public void display() {
	System.out.println(bt+rh+"is added to the blood bank.");

	}


}