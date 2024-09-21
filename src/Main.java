package Explorer;

public class Main {
	 public static void main(String[] args) {
	        BankAccount acct1 = new BankAccount("lia",0,0);
	        System.out.println(acct1.str());
	        
	        BankAccount acct2 = new BankAccount("lia",1000,-1000);
	        BankAccount acct3 = new BankAccount("Bob",1000,-1000);
	        System.out.println(acct2.transfer(acct3,500));
	        System.out.println(acct2.getBalance());
	        System.out.println(acct3.getBalance());
	        boolean x=acct2.transfer(acct3,1600);
	        System.out.println(x);
	        if(x==false) {
	        	System.out.println("sorry you dont have enough");
	        }
	        
	        Rectangle rr = new Rectangle(10,5);
	        rr.draw();
	        System.out.println(rr.calcArea() );
	        System.out.println(rr.calcPerimeter());
	        
	        
	        
	    }

}
