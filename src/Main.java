public class Main {
    public static void main(String[] args) {
        MyBank KirovWorldBank = new MyBank("KirovWBank");//Обявляем элемент класса
        MyBank Tinkoff = new MyBank("Тинькофф");//Обявляем элемент класса
        User user1 = new User("Киров", "Максим", 1, 6784, "KirovWBank");
        User user2 = new User("Матвеева", "Елена", 2, 3123, "Тинькофф");
        User user3 = new User("Кинов", "Алекс", 3, 5646, "KirovWBank");
        KirovWorldBank.top_up_balance(user2);
        KirovWorldBank.find_out_the_balance(user2);
        KirovWorldBank.top_up_balance(user3);
        KirovWorldBank.withdraw_money(user2);
        KirovWorldBank.transfer_money(user2, user3);

    }
}
