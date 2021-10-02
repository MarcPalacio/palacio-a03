/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Marc Palacio
 */

package baseline;

public class PaymentCalculator {
    private double balance;
    private double APR;
    private double monthPay;

    public PaymentCalculator(double balance, double APR, double monthPay){
        // Constructor of the PaymentCalculator object when called in another class
        // This will set the balance, APR, and monthly payment to be used in another function
    }

    public int calculateMonthsUntilPaidOff(){
        // This will calculate with amount of months it will take to pay off the credit card
        // Formula: n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)
        // n is the number of months.
        // i is the daily rate (APR divided by 365)
        // b is the balance
        // p is the monthly payment.
        // Break up the problem within the method
        // -(1/30) will be a constant
        // 1 + b/p * (1 - (1 + i)^30) will be calculated and set to eq1
        // then the output would return -(1/30) * log(eq1) / log(1 + i)
        return 0;
    }
}
