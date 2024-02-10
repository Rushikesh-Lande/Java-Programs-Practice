
class BankAcc
{
	 long accountNo= 23460393456444L;
	 String name ="Rushikesh Nagorao Lande";
	 long mobileNo = 8459022351L;
	 int branchCode = 5001;
	 String city = "Nagpur";
	 String state = "Maharashtra";
         String emailId = "rushilande999@gmail.com";


	public static void main(String[] args) 
	{
		BankAcc b = new BankAcc();
		System.out.println("Account Number :"+b.accountNo);
		System.out.println("AccountHolderName :"+b.name);
		System.out.println("MobileNumber :"+b.mobileNo);
		System.out.println("BranchCode :"+b.branchCode);
		System.out.println("City :"+b.city);
		System.out.println("State :"+b.state);
                System.out.println("Email :"+b.emailId);
	}
}