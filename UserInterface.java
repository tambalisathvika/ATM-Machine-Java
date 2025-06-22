package atm;

import java.util.Scanner;

public class UserInterface {
	private static int status;
	public static void main(String[] args) {
		AtmOperationImp imp1 = new AtmOperationImp();
		Scanner scan = new Scanner(System.in);
		int atmnumber = 123456;
		int atmpin = 123;
		System.out.println("WELCOME TO ATM MACHINE");
		System.out.println("enter the ATM NUMBER:");
		int atmnum = scan.nextInt();
		System.out.println("enter the ATM PIN:");
		int atmpin2 = scan.nextInt();
		if(atmnumber == atmnum && atmpin == atmpin2) {
			while(true) {
				System.out.println("1.viewAvailable\n 2.withdrawAmount\n 3.depositeAmount\n  4.viewministatement\n  5.exit");
				System.out.println("enter the choice:");
				int ch = scan.nextInt();
				if(ch==1) {
					imp1.viewBalance();
				}
				else if(ch==2) {
					System.out.println("enter the amount to withdraw:");
					double withdrawAmount = scan.nextDouble();
					imp1.withdrawAmount(withdrawAmount);
				}
				else if(ch==3) {
					System.out.println("enter the amount to deposite:");
					double depositeAmount = scan.nextDouble();
					imp1.depositAmount(depositeAmount);
				}
				else if(ch==4){
					imp1.viewMiniStatement();
				}
				else if(ch==5) {
					System.out.println("collect your ATM card\n thankyou:");
					System.exit(status);
				}
			}
		}
		else {
			System.out.println("Incorrect ATMPIN or ATMNUMBER");
		}
	}

}
