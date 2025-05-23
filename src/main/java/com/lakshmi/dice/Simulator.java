package com.lakshmi.dice;

import java.util.Random;
import java.util.Scanner;
public class Simulator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How many dice would you like to roll?");
		int numOfDice = sc.nextInt();
		System.out.println("About to roll "+numOfDice+" dice.");
//		Random rand = new Random();
//		int rollNumber = rand.nextInt(6)+1;
//		System.out.println(display(rollNumber));
		
	}
	
	static String display(int value) {
		switch(value) {
		case 1: return "---------\n|       |\n|    o  |\n|       |\n---------";
		case 2: return "---------\n| o     |\n|       |\n|     o |\n---------";
		case 3: return "---------\n| o     |\n|   o   |\n|     o |\n---------";
		case 4: return "---------\n| o   o |\n|       |\n| o   o |\n---------";
		case 5: return "---------\n| o   o |\n|    o  |\n| o   o |\n---------";
		case 6: return "---------\n| o   o |\n| o   o |\n| o   o |\n---------";
		default:
			return "no matched dice";
		}
	}
}
