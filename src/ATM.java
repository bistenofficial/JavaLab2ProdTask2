public interface ATM {
    void find_out_the_balance(User user);

    void top_up_balance(User user);

    void withdraw_money(User user);

    void transfer_money(User user, User user1);

}
