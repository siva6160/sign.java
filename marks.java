package siva4;

import java.util.Scanner;

public class satya {

	public static void main(String[] args) {
		int marks;
		Scanner sc=new Scanner(System.in);
		marks=sc.nextInt();
		if(marks>100){
			System.out.println("check what you entered");
		}
		if (marks>=91 && marks<=100){
			System.out.println(" congrats you scored A grade");
		}
		else if(marks>=81 && marks<=90){
			System.out.println(" yyou scord B grade");
		}
		else if (marks >=71 && marks<=80){
			System.out.println(" you Scored c grade");

		}
		else if(marks>=61 && marks<=70){
			System.out.println(" you scored D  grade");
		}
		else if(marks>=35 && marks<=60){
			System.out.println("conguralations you are passed");
		}
		else if (marks<35){
			System.out.println("you are not pass ,bettre luck for next time");
		}
	}

}
