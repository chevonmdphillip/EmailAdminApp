/*
 * Copyright (c) 2023. Chevon Phillip
 */

package email;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String alternateEmail;
    private int mailboxCapacity;

    // Constructor to receive the first name and last name
    public Email() {
        this.firstName = setFirstName();
        this.lastName = setLastName();

        // Call a method asking for the department - return the department
        this.department = setDepartment();

        // Call a method that returns a random password
        this.password = randomPassword();

        // Combine elements to generate email
        String email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + ".company.com";
    }

    // Ask for the first name
    private String setFirstName() {
        System.out.print("Enter first name: ");
        Scanner TextIO = new Scanner(System.in);
        return TextIO.nextLine();
    }

    // Ask for the last name
    private String setLastName() {
        System.out.print("Enter last name: ");
        Scanner TextIO = new Scanner(System.in);
        return TextIO.nextLine();
    }

    // Ask for the department
    private String setDepartment() {
        System.out.print("DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
        Scanner TextIO = new Scanner(System.in);
        return switch (TextIO.nextInt()) {
            case 1 -> "sales";
            case 2 -> "dev";
            case 3 -> "acct";
            default -> "";
        };
    }

    // Generate a random password
   private String randomPassword() {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()";
        char[] password = new char[25];

        for (int i = 0; i < 25; i++) {
            int random = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(random);
        }

        return new String(password);
    }

    // Set the mailbox capacity

    // Set the alternate email

    // Change the password


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public void setMailboxCapacity(int mailboxCapacity) {
        this.mailboxCapacity = mailboxCapacity;
    }


    public void showInfo() {
        System.out.println("DISPLAY NAME: " + firstName + " " + lastName);
        System.out.println("COMPANY EMAIL: " + firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + ".company.com");
        System.out.println("PASSWORD: " + password);
    }
}
