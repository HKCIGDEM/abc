package daily_videos.day18_garbageCollection;

public class BankAccount {

   public String accountHolder;
   public long accountNumber;// long dedik cunki sayi tam sayi araligindan cikabilir veya buyuk olabilir!!!
   public double balance;// ondalikli olabilecegi icin double oldu


    public void setInfo(String accountHolder, long accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }


    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance= $" + balance +
                '}';
    }


    public void checkBalance(){
        System.out.println("Your available balance is: $" + balance);
    }

    public void deposit(double amount){

        if (amount <1){//yatirilan rakam negatif bir sayiysa veya sifirsa buradaki buggi czmek icin bunu kullandi
            System.out.println("Insufficient amount: $" + amount);
            return;// boyle bir sayi girildiginde diger islemlere gecmeden cikis veriyor.

        }

        System.out.println("Depositing $" + amount+ " to " + accountHolder);
        balance += amount;
    }

    public void withdraw(double amount){

        if (amount > balance){ //cekmek istedigim rakam bakiyeden fazlaysa tabi ki mumkun olmayacak
            System.out.println("Insufficient withdraw amount: $" + amount);
            return;
        }

        System.out.println("Withdrawing $" + amount+ " from " + accountHolder);
        balance -= amount;
    }

}
/*2. Create a custom class named BankAccount:
			Attributes:
				1. accountHolder
				2. accountNumber
				3. balance

			Actions:
				1. setInfo(): sets the accountHolder and accountNumber attributes
		            	2. toString(): displays the full account info
		                3. checkBalance():displays the available balance
		                4. deposit(amount): increases the balance by the specified amount
		        	5. withdraw(amount): decreases the balance by the specified amount

 */