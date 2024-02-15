import java.util.Scanner;

public class VendingMachine {

    public static void main(String args[]) {
        Scanner scan = new Scanner( System.in );

        //Welcome message
        System.out.println("Welcome to Vending Machine!");
        System.out.println("Please select from the following snacks:");

        //fbfncnfgxcj jcn
        System.out.println("Twix\nSnickers\nLays\nCheez-IT\nCheetos\nM&Ms");
        String cmd = scan.nextLine();

         switch (cmd.toLowerCase()) {
            case "twix":
                System.out.println("");
                    break;
            case "snickers":
                System.out.println("");
                    break;
            case "lays":
                System.out.println("");
                    break;
            case "cheez-it":
                System.out.println("");
                    break;
            case "cheeto":
                System.out.println("");
                    break;
            case "m&ms":
                System.out.println("");
                    break;
            default:
            System.out.println("Not an option.");
                break;
        }
    }
}

