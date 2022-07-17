package Tasks;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNumOfTicket = 100000, lastNumOfTicket = 999999;
        int ticket;
        System.out.println("Enter the ticket number:");
        ticket = sc.nextInt();
        while(ticket<firstNumOfTicket || ticket>lastNumOfTicket) {
            System.out.println("""
                    WARNING!!!
                    The ticket number must be 6 digits!
                    Please, enter the correct ticket number.
                    For example: 123456
                    """);
            ticket = sc.nextInt();
        }
        sc.close();
        int secondPart = ticket % 1000;
        int firstPart = (ticket - secondPart) / 1000;
        int firstPartSum = 0;
        int secondPartSum = 0;
        for(int i = 0; i < 3; i++){
            firstPartSum += firstPart % 10;
            firstPart = firstPart / 10;
        }
        for(int i = 0; i < 3; i++){
            secondPartSum += secondPart % 10;
            secondPart = secondPart / 10;
        }
        if (firstPartSum == secondPartSum) {
            System.out.println("Congratulations! Your ticket is lucky!");
        } else {
            System.out.println("Ha-ha! Loser!");
        }
    }
}
