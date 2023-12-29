import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your buying price per share");
        double buyingPrice = s.nextDouble();
        int day =1;
        double closingPrice =0.1;
        while(true){
            System.out.println("Enter the closing price for day " +day+ " any negative value to leave");
            closingPrice = s.nextDouble();

            if (closingPrice < 0.0) break;
            
            double earnings = closingPrice - buyingPrice;
            if(earnings > 0.0){
                System.out.println("after " +day+ " you earned " +earnings+ " per share");
            }
            else if(earnings < 0.0){
                System.out.println("after " +day+ " you lost " + (-earnings)+ " per share");
            }
            else {
                System.out.println("after "+day+ "you have earned nothing");
            }
            day+=1;
        } s.close();
    }
}