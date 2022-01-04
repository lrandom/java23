package com.niit.java23;

public class ATM {
    public float amount = 1000000;//1 tr

    public void withdraw(float withdrawAmount) throws OverAmountException {
        if (withdrawAmount > amount) {
            //ném ra exception
            throw new OverAmountException();
        }
        amount -= withdrawAmount;
    }

    public static void main(String[] args) {
        ATM atm = new ATM();
        try {
            atm.withdraw(10000000);
        } catch (OverAmountException e) {
            System.out.println("Không đủ tiền rồi");
        }
    }
}
