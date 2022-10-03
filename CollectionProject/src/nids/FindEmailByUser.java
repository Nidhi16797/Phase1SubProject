package nids;

import java.util.ArrayList;
import java.util.Scanner;

public class FindEmailByUser {

	public static void main(String[] args) {

		//create the array of employee emaillist

		ArrayList<String> emaillist = new ArrayList<String>();

		emaillist.add("abc@gmail.com");
		emaillist.add("lina@gmail.com");
		emaillist.add("tia@gmail.com");
		emaillist.add("abex@gmx.com");
		emaillist.add("alina@gmx.com");
		emaillist.add("jioni@gmx.com");
		emaillist.add("texa@gmx.com");
		emaillist.add("ayoni@gmx.com");

		System.out.println("Enter the email you want to search:");
		Scanner scanner = new Scanner(System.in);
		String searchEmail = scanner.next();
		
		for (String email : emaillist){
			if (email.contains(searchEmail)){
				System.out.println("Email ID " + email + " found");
				break;
			}else {
				System.out.println("Email ID " + searchEmail + "not found");
				break;
			}
		}

	}

}
