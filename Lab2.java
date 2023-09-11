import java.util.ArrayList;

public class Lab2 {
    public static void main(String[] args) {
        BankApplication kaspi=new BankApplication();
        BankApplication halyk=new BankApplication();
        BankApplication tinkoff=new BankApplication();
        kaspi.addAccount(new Account("Almas",1000));
        kaspi.addAccount(new Account("Alma",2000));
        kaspi.addAccount(new Account("Dos",300));
        kaspi.addAccount(new Account("bek",4000));
        halyk.addAccount(new Account("dastan",5000));
        halyk.addAccount(new Account("fara",1100));
        halyk.addAccount(new Account("nur",1200));
        tinkoff.addAccount(new Account("gani",1500));
        tinkoff.addAccount(new Account("gul",77));
        tinkoff.addAccount(new Account("naz",200000));
        ArrayList<BankApplication> allBanks=new ArrayList<>();
        allBanks.add(kaspi);
        allBanks.add(halyk);
        allBanks.add(tinkoff);

        for (int i = 0; i < 3; i++) {
            allBanks.get(i).getBankData();
        }

        }


}
class Account{
    int id;
    String name;
    String surname;
    double balance;

    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", balance=" + balance +
                '}';
    }

}
class BankApplication{
    String name;
    ArrayList<Account> accounts;

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }
    void addAccount( Account a){
        accounts.add(a);
    }
    void removeAccount(int i){
        accounts.remove(i);
    }
    Account getMaxAccount(){
        double max=0;
        for(int i=0;i<accounts.toArray().length;i++){
            if(max<accounts.get(i).balance){
                max=accounts.get(i).balance;
            }
        }
        return accounts.get((int)max);
    }
    double getAverageBalance(){
        double num=0;
        for(int i=0;i<accounts.toArray().length;i++){
           num+= accounts.get(i).balance;
        }
        return num/accounts.toArray().length;
    }
    double getTotalBalance(){
        double num=0;
        for(int i=0;i<accounts.toArray().length;i++){
            num+= accounts.get(i).balance;
        }
        return num;
    }
    int totalAccounts(){
       return accounts.size();
    }
    String getBankData(){
        return "Bank name " +name+
                " total accounts "+totalAccounts()+" summa balansa "+getTotalBalance()+" average balance "+getAverageBalance();

    }

}