import java.util.Scanner;

public class VendingMachine {

    public static void main(String args[]) {
        //Variable declaration
        String cmd;                 //User input snack selection
        double price = 0;           //price
        int bills = 0;              //bills inserted  

        Scanner scan = new Scanner( System.in );

        //Welcome message
        System.out.println("Welcome to Vending Machine!");
        System.out.println("Please select from the following snacks:");

        //Snack selection
        System.out.println("Twix\nSnickers\nLays\nCheez-IT\nCheetos\nM&Ms\n");
        cmd = scan.nextLine();

         switch (cmd.toLowerCase()) {
            case "twix":
                price = 1.50;
                    break;
            case "snickers":
                price = 1.75;
                    break;
            case "lays":
                price = 2.25;
                    break;
            case "cheez-it":
                price = 2.25;
                    break;
            case "cheeto":
                price = 2;
                    break;
            case "m&ms":
                price = 1.25;
                    break;
            default:
            System.out.println("Not an option.");
                break;
        }

        //Reformat cmd(snack selection) String for output
        cmd = cmd.substring(0, 1).toUpperCase() + cmd.substring(1, cmd.length());

        System.out.println("You have selected " + cmd);
        System.out.printf("Your total is $%.2f. Please insert $1 bills: \n\n", price);

        while(price > bills){
            int insertedBill = scan.nextInt();

            if(insertedBill != 1)
                System.out.println("please input only $1 bills");
            else {
                bills += insertedBill;
                System.out.printf("Total inserted: $%d. Remaining: $%.2f\n", bills, price - bills);
            }
        }

    }

}