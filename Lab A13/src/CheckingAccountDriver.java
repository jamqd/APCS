/**
 * 
 * @author John Dang
 * Period 3
 * 
 * Driver for CheckingAccount class
 */
public class CheckingAccountDriver {
	/**
	 * Main method for testing
	 * @param args
	 */
	public static void main(String[] args){
		try{
			CheckingAccount acc1 = new CheckingAccount(-500, 100);
		}catch(IllegalArgumentException a){
			System.out.println(a.getMessage());
			try{
				CheckingAccount acc2 = new CheckingAccount(500, 300);
				acc2.deposit(-300);
			}catch(IllegalArgumentException b){
				System.out.println(b.getMessage());
				try{
					CheckingAccount acc3 = new CheckingAccount(500,2);
					acc3.withdraw(600);
				}catch(Exception c){
					System.out.println(c.getMessage());
				}
			}
		}
	}
}
