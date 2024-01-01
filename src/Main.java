import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double pricePerGroup = 550.00;
        double pricePerGroupAbove35 = 500.00;
        double totalPricePerGroup;

        int numOfPeoplePerGroup;

        System.out.println("Enter the number of people in a group ");
        numOfPeoplePerGroup = input.nextInt();

        if(numOfPeoplePerGroup <35){
            totalPricePerGroup = numOfPeoplePerGroup*pricePerGroup;
        } else {
            totalPricePerGroup =numOfPeoplePerGroup*pricePerGroupAbove35;
        }
        System.out.println("The total amount of " +numOfPeoplePerGroup +" people is R"+totalPricePerGroup);
    }
}