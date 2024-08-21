package inheritanceExamples;
import java.util.Scanner;
/*---------------------- Base Class ------------------------*/
class Account
{
	/*---- Member variables -----*/
	String acHolderName;
	String branchName;
	int acno;
	Scanner sc;
	/*----------------------------------------------------------*/
	Account()
	{
		sc = new Scanner(System.in);
	}
	/*---- Method for Input account details ------*/
	public void inputAcDetails()
	{
		System.out.println("------- Enter Account Detail ---------");
		System.out.print("A/c No. : ");
		acno=sc.nextInt();
		System.out.print("A/c Holder Name :");
		acHolderName = sc.nextLine();
		sc.next();
		System.out.print("Branch Name : ");
		branchName = sc.nextLine();
		sc.next();
		System.out.println("----------------------------------------------------");
	}
	/*----- Method for displaying account details --------*/
	public void displayAcDetails()
	{
		System.out.println("------ Account Details ------");
		System.out.println("A/c No. : "+acno);
		System.out.println("A/c Holder Name : "+acHolderName);
		System.out.println("Branch Name : "+branchName);
	}
}
/*----------------------------------------------------------------------------------*/
/*---------- Derived Class : Savings Account and Base class :Account*/
class SavingsAccount extends Account
{
	/*---- Member variable ----*/
	float balance;
	/*------ Method to initialize balance ------*/
	public void initializebalance()
	{
		/*---- Calling inputAcDetails() method of base class ----*/
		super.inputAcDetails();
		sc.next();
		System.out.print("Enter Initial balance : ");
		balance = super.sc.nextFloat();
		System.out.println("-----------------------------------------------------");
	}
	/*----------------------------------------------------------------------------*/
	/*----- Method Acinfo()*/
	public void acInfo()
	{
		/*--- Calling base class method to display acdetails -----*/
		super.displayAcDetails();
		System.out.println("Available Balance : Rs "+balance);
	}
	/*-------------------------------------------------------------------------*/
	/*---- Method to withdraw Amount  -------*/
	public void withdraw()
	{
		/*---- Amount to withdraw ------*/
		System.out.println("----------- Amount  Withdraw Operation");
		System.out.print("Enter the amount : ");
		float amount = super.sc.nextFloat();
		/*----- Check the condition that after withdrawing amount remaining balance must have greater than 1000---*/
		if(balance - amount > 1000)
		{
			balance = balance - amount;
			System.out.println("Amount Successfully Withdrawn");
			System.out.println("Available balance : "+balance);
		}
		else
		{
			System.err.println("Insufficient Balance");
			System.err.println("Withdrawal not Possible");
		}
	}
	/*----- Method to  Deposit Amount ---------*/
	public void deposit()
	{
		/*---- Amount to Deposit ------*/
		System.out.println("----------- Amount  Deposit Operation");
		System.out.print("Enter the amount : ");
		float amount = super.sc.nextFloat();
		balance = balance + amount;
		System.out.println("Successfully deposited");
		System.out.println("Available balance : "+balance);
	}
}
/*----------------------------------------------------------------------------------*/
public class BankAccountManagement {

	public static void main(String[] args) 
	{
		SavingsAccount sva=new SavingsAccount();
		/*----- To initalize balance ----*/
		sva.initializebalance();
		/*---- to deposit amount -----*/
		sva.deposit();
		/*----- Display account information -------*/
		sva.acInfo();
		/*----- to withdraw amount------*/
		sva.withdraw();

	}

}
