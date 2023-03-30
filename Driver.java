import java.util.Scanner ;
class Driver 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("***** WELCOME *****");

		System.out.print("Enter Bank Name : ");
		String bankName = sc.nextLine();
		System.out.print("Enter branch name : ");
		String branchName = sc.next();
		Scanner cs = new Scanner(System.in);
		System.out.print("Enter the address : ");
		String add = cs.nextLine();

		Bank b = new Bank(bankName, branchName,add);
		System.out.println();
		System.out.println("Bank Details Added Successfully");
		System.out.println();
		System.out.println("Select from Below Option");
		
		for (; ; ) 
		{
			System.out.println("1. Create Account");
			System.out.println("2. Remove Account");
			System.out.println("3. Deposit Cash");
			System.out.println("4. Withdraw Cash");
			System.out.println("5. Check Account Balance");
			System.out.println("6. Exit");
			System.out.println();
			System.out.print("Enter an option : ");
			int option = sc.nextInt();
			System.out.println();
			switch(option)
			{
				case 1:b.createAccount();break;
				case 2:b.removeAccount();break;
				case 3:b.deposit();break;
				case 4:b.withdraw();break;
				case 5:b.bal();break;
				case 6:System.exit(0);
			}
		}
	}
}