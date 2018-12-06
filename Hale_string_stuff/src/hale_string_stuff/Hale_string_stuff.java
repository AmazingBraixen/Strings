package hale_string_stuff;
import java.util.Scanner;
public class Hale_string_stuff {
public static void main(String[] args) {
        System.out.println("Enter your: School, Age, Mobile Number, Social Security Number, and Name");
//checks to see what the user types
        Scanner sc = new Scanner(System.in);
//school name info
        String School = sc.nextLine();
        School = School.toLowerCase();
//tells user if they didn't enter school to input school name
       if(School == null || School.isEmpty()){
           System.out.println("Restart");
       }
       else{
           System.out.println();
       }
//users age info
        String Age = sc.nextLine();
//tells user if they didn't enter age to input age
       if(Age == null || Age.isEmpty()){
           System.out.println("Restart");
       }
       else{
           System.out.println();
       }
//users mobile Number
        String MobileNo = sc.nextLine();
//tells user if they didn't enter Mobile Number to input mobile number
       if(MobileNo == null || MobileNo.isEmpty()){
           System.out.println("Restart");
       }
       else{
           System.out.println();
       }
//users Social security Number
        String SocialSecurityNo = sc.nextLine();
//tells user if they didn't enter Social Security Number to input Social Security Number
        if(SocialSecurityNo == null || SocialSecurityNo.isEmpty()){
           System.out.println("Restart");
       }
       else{
           System.out.println();
       }
//users name
        String Name = sc.nextLine();

//tells user if they didn't enter name to input name
        if(Name == null || Name.isEmpty()){
           System.out.println("Restart");
       }
       else{
           System.out.println();
       }
//After done typing the required information it will print the info into to correct location
        System.out.println("School " + School);
        System.out.println("Age " + Age);
        System.out.println("Mobile Number " + MobileNo);
        System.out.println("Social Security Number " + SocialSecurityNo);
        System.out.println("Name " + Name);
    }

}
