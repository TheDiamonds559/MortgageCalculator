import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double mortgage;
        double principle;
        double annualRate;
        double years;
        double payments = 0;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Principle (£1,000.00 - £1,000,000.00):");
            String check = scan.next();
            for (int i = 0; i < check.length(); i++){
                if (check.charAt(i) == 'a' || check.charAt(i) == 'b' || check.charAt(i) == 'c' || check.charAt(i) == 'd' || check.charAt(i) == 'e' || check.charAt(i) == 'f' || check.charAt(i) == 'g' || check.charAt(i) == 'h' || check.charAt(i) == 'i' || check.charAt(i) == 'j' || check.charAt(i) == 'k' || check.charAt(i) == 'l' || check.charAt(i) == 'm' || check.charAt(i) == 'n' || check.charAt(i) == 'o' || check.charAt(i) == 'p' || check.charAt(i) == 'q' || check.charAt(i) == 'r' || check.charAt(i) == 's' || check.charAt(i) == 't' || check.charAt(i) == 'u' || check.charAt(i) == 'v' || check.charAt(i) == 'w' || check.charAt(i) == 'x' || check.charAt(i) == 'y' || check.charAt(i) == 'z')
                    check = "0";
            }
            principle = Double.parseDouble(check);
            if (!(principle >= 1_000.00 && principle <= 1_000_000.00))
                System.out.println("Enter a value between 1,000 and 1,000,000");
        } while (!(principle >= 1_000.00 && principle <= 1_000_000.00));

        do {
            System.out.println("Annual interest rate:");
            String check = scan.next();
            for (int i = 0; i < check.length(); i++){
                if (check.charAt(i) == 'a' || check.charAt(i) == 'b' || check.charAt(i) == 'c' || check.charAt(i) == 'd' || check.charAt(i) == 'e' || check.charAt(i) == 'f' || check.charAt(i) == 'g' || check.charAt(i) == 'h' || check.charAt(i) == 'i' || check.charAt(i) == 'j' || check.charAt(i) == 'k' || check.charAt(i) == 'l' || check.charAt(i) == 'm' || check.charAt(i) == 'n' || check.charAt(i) == 'o' || check.charAt(i) == 'p' || check.charAt(i) == 'q' || check.charAt(i) == 'r' || check.charAt(i) == 's' || check.charAt(i) == 't' || check.charAt(i) == 'u' || check.charAt(i) == 'v' || check.charAt(i) == 'w' || check.charAt(i) == 'x' || check.charAt(i) == 'y' || check.charAt(i) == 'z')
                    check = "0";
            }
            annualRate = Double.parseDouble(check);
            if(!(annualRate > 0 && annualRate <= 30))
                System.out.println("Enter a value greater than 0 and less than or equal to 30");
        } while (!(annualRate > 0 && annualRate <= 30));

        do {
            System.out.println("Period(years):");
            String check = scan.next();
            for (int i = 0; i < check.length(); i++){
                if (check.charAt(i) == 'a' || check.charAt(i) == 'b' || check.charAt(i) == 'c' || check.charAt(i) == 'd' || check.charAt(i) == 'e' || check.charAt(i) == 'f' || check.charAt(i) == 'g' || check.charAt(i) == 'h' || check.charAt(i) == 'i' || check.charAt(i) == 'j' || check.charAt(i) == 'k' || check.charAt(i) == 'l' || check.charAt(i) == 'm' || check.charAt(i) == 'n' || check.charAt(i) == 'o' || check.charAt(i) == 'p' || check.charAt(i) == 'q' || check.charAt(i) == 'r' || check.charAt(i) == 's' || check.charAt(i) == 't' || check.charAt(i) == 'u' || check.charAt(i) == 'v' || check.charAt(i) == 'w' || check.charAt(i) == 'x' || check.charAt(i) == 'y' || check.charAt(i) == 'z')
                    check = "0";
            }
            years = Double.parseDouble(check);
            if (!(years > 1 && years <= 30))
                System.out.println("Enter a value between 1 and 30");
            else
                payments = years * 12; // period of years * months in a  year
        } while (!(years > 1 && years <= 30));

        double rate = (annualRate/100)/12; // annual rate/percent/months in a year
        mortgage = principle * (rate * (Math.pow(1+rate, payments))/(Math.pow(1+rate, payments) - 1));
        NumberFormat format = NumberFormat.getCurrencyInstance();
        String currency = format.format(mortgage);
        System.out.println("Mortgage: " + currency);
    }
}