package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

    String name;
	String email_address;
    String educational_achievements;
    String experiences;
    String skills;

        System.out.println("Enter your name: ");
        name=scan.nextLine();
        System.out.println("Enter your email_address: ");
        email_address=scan.nextLine();
        System.out.println("Enter your educational_achievements: ");
        educational_achievements=scan.nextLine();
        System.out.println("Enter your experiences: ");
        experiences=scan.nextLine();
        System.out.println("Enter your skills: ");
        skills=scan.nextLine();



        System.out.println("================ ");
        System.out.println(name);
        System.out.println(email_address);
        System.out.println("                 ");
        System.out.println(educational_achievements);
        System.out.println(experiences);
        System.out.println("                 ");
        System.out.println(skills);
    }
}
