package com.niit.java23;

import java.util.Scanner;

public class BT2 {
    public static void main(String[] args) {
        String account, pin;
        Account authAccount = null;
        Account[] accounts = new Account[3];
        accounts[0] = new Account("001", "Nguyen Thanh Luan", "123456", 1000000.f);
        accounts[1] = new Account("002", "Nguyen Thi Hoa", "123456", 1000000.f);
        accounts[2] = new Account("003", "Nguyen Thanh Nam", "123456", 3000000.f);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui long nhap so tk va ma pin");
        System.out.print("So tai khoan: ");
        account = scanner.nextLine();
        System.out.print("Ma pin: ");
        scanner = new Scanner(System.in);
        pin = scanner.nextLine();

        for (Account accountItem : accounts
        ) {
            if (accountItem.getAccountNumber().equals(account) && accountItem.getPin().equals(pin)) {
                authAccount = accountItem;
                break;
            }
        }

        if (authAccount != null) {
            //xử lý
        } else {
            System.out.println("Tai khoan hoac mã pin khong dung");
        }

    }
}
