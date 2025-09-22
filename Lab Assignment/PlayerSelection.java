import java.util.Scanner;

public class PlayerSelection {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        String name;
        int age;
        double height;
        double weight;
        int jerseyNumber;

        System.out.println("Enter the player's name:");
        name= scanner.nextLine();

        System.out.println("Enter the players age:");
        age=scanner.nextInt();

        System.out.println("Enter the players height in meters:");
        height= scanner.nextDouble();

        System.out.println("Enter the players weight in pounds:");
        weight=scanner.nextDouble();

        System.out.println("Enter the player's jersey number:");
        jerseyNumber= scanner.nextInt();
         double pound = 0.45359237;
        double meter = 100;

        weight = weight * pound;
        height = height * meter;

        System.out.println("Player's name- " + name);
        System.out.println("Age- " + age);
        System.out.println("Height- " + height + " centimeters");
        System.out.println("Weight- " + weight + " kilograms");
        System.out.println("Jersey number- " + jerseyNumber);


        
        if (age > 17 && age < 36 && weight < 90) {
            System.out.println("Eligibility- Eligible");
        } else {
            System.out.println("Eligibility- Not Eligible");
        }

        
        boolean rising_star = age < 20;
        boolean prime_player = age >= 20 && age <= 30;
        boolean veteran = age>30;
        if (rising_star) {
            System.out.println("Rising Star");
        } else if (prime_player) {
            System.out.println("Prime Player");
        } else if (veteran) {
            System.out.println("Veteran");
        }

        
        String position = switch (jerseyNumber) {
            case 1 -> "Goalkeeper";
            case 2, 5 -> "Defender";
            case 6,8 -> "Midfielder";
            case 7, 11 -> "Winger";
            case 9 -> "Striker";
            case 10 -> "Playmaker";
            default -> "Player not known";
            


        };
        System.out.println("Position- " + position);

        
        if (prime_player) {
            if (weight < 80) {
                System.out.println("Line up decision- Selected");
            } else {
                System.out.println("Line up decision- Not Selected");
            }
        }

        

        String eligible = (age > 17 && age < 36 && weight < 90) ? "Play" : "Rest";
        System.out.println("Final Decision- " + eligible);
        
        


        scanner.close();
    

    }
}

    

