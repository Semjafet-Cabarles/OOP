import java.util.Scanner;
public class RunBloodData{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input1,input2;
        String data;
        BloodData bd = new BloodData();
        
        System.out.print("Enter blood type of patient:");
        input1 = sc.nextLine();
       
        System.out.print("Enter the Rhesus factor (+ or -):");
        input2 = sc.nextLine();
       
        data = input1 + input2;
        
        if(data.isEmpty()){
            bd.setBloodType("O");
            bd.setRhFactor("+");
            System.out.println(bd.getBloodType()+ bd.getRhFactor() +" is added to the Blood Bank");
        }
        else if(data.equals("A+")||data.equals("A-")|| data.equals("B+")||data.equals("B-")||data.equals("AB+")||data.equals("AB-")||data.equals("O+")||data.equals("O-")){
           bd.setBloodType(input1);
            bd.setRhFactor(input2);
           System.out.println(bd.getBloodType() +bd.getRhFactor()+ " is added to the Blood Bank.");
        }
        else{
            System.out.println("Invalid input!");
        }
        sc.close();
    }
}