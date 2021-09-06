import java.util.Scanner;
public class MyBank implements ATM{
    public String name_bank;
    public MyBank(String Name){ this.name_bank = Name;}

    Scanner scan = new Scanner(System.in);

    public boolean Check_Pin(User user)
    {
        System.out.println("Введите PIN:");//Проверка на правильность PIN
        int PIN = scan.nextInt();
        if(user.getPin() == PIN) {
            System.out.println("Операция выполняется");
            return true;}
        else {
            System.out.println("Введен неверный PIN");
            return false;
        }
    }
    public void find_out_the_balance(User user)//Функция проверки баланса
    {
        if(Check_Pin(user))
            System.out.println("Баланс составляет: " + user.getAccount().getBalance());
    }
    public void top_up_balance(User user)//Функция пополенения счета
    {
        if(Check_Pin(user))
        {
            System.out.println("Введите сумму пополнения счета:");
            int Cash = scan.nextInt();
            if(Cash < 0) System.out.println("Введено неверное число");
            else
            {
                user.getAccount().setBalance(user.getAccount().getBalance() + Cash);
                System.out.println("Операция выполнена");
                find_out_the_balance(user);
            }
        }
    }
    public void withdraw_money(User user){
        if(Check_Pin(user))
        {
            System.out.println("Введите сумму, которую хотите снять со счета:");
            int Cash = scan.nextInt();
            if(Cash < 0) System.out.println("Введено неверное число");
            else {
                if (!user.getAccount().getName_Bank().equals(this.name_bank)) Cash *= 1.02;
                if (user.getAccount().getBalance() < Cash) System.out.println("Недостаточно средств");
                else {
                    user.getAccount().setBalance(user.getAccount().getBalance() - Cash);
                    System.out.println("Операция выполнена");
                    find_out_the_balance(user);
                }
            }
        }
    }
    public void transfer_money(User user, User user1){
        if(Check_Pin(user))
        {
            System.out.println("Введите сумму, которую хотите перевести со счета:");
            int Cash = scan.nextInt();
            if(Cash < 0) System.out.println("Введено неверное число");
            else {
                if (!user.getAccount().getName_Bank().equals(user1.getAccount().getName_Bank())) Cash *= 1.02;
                if (user.getAccount().getBalance() < Cash) System.out.println("Недостаточно средств");
                else {
                    user.getAccount().setBalance(user.getAccount().getBalance() - Cash);
                    user1.getAccount().setBalance(user1.getAccount().getBalance() + Cash);
                    System.out.println("Операция выполнена");
                    find_out_the_balance(user);
                    System.out.println("Баланс другого пользователя:");
                    find_out_the_balance(user1);
                }
            }
        }
    }


}
