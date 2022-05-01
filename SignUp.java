import java.util.Scanner;

public class SignUp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to JavaGram! Let's sign you up.");
        

        //Task 1 - Using Scanner, ask the user questions

        //Ask for their first name.
        System.out.println("What is your first name?");
        String firstName = scan.nextLine();

        //Ask for their last name.
        System.out.println("What is your last name?");
        String lastName = scan.nextLine();

        //Ask: how old are you?
        System.out.println("How old are you?");
        int age = scan.nextInt();

        //Ask them to make a username.
        scan.nextLine();
        System.out.println("Create a username.");
        String userName = scan.nextLine();

        //Ask what city they live in.
        System.out.println("In which city do you live?");
        String cityName = scan.nextLine();

        //Ask what country that's from.
        System.out.println("In which country do you live?");
        String countryName = scan.nextLine();

        //Task 2 - Print their information. 

        System.out.println("Thank you for joining JavaGram!");

        //Print their information like so:

        // Your information:
        System.out.println("\nHere is the information you entered:");
        //        First Name: Rayan
        System.out.println("\tFirst name: " + firstName);
        //        Last Name: 
        System.out.println("\tLast name: " + lastName);
        //        Age: 27
        System.out.println("\tYour age: " + age);
        //        Username: monotonic_relu
        System.out.println("\tYour username: " + userName);
        //        City: Ottawa
        System.out.println("\tYour city: " + cityName);
        //        Country: Canada
        System.out.println("\tYour country: " + countryName);


        //close scanner. It's good practice :D ! 
        scan.close();
    }
}