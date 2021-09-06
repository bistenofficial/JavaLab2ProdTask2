public class User {
    private String Surname;
    private String Name;
    private int Id;
    private int Pin;
    private Account account;

    public User(String SurName, String name, int ID, int PIN, String NameB)
    {
        this.Surname = SurName;
        this.Name = name;
        this.Id = ID;
        this.Pin = PIN;
        this.account = new Account("Тинькофблек", 0, NameB, this);
    }

    public Account getAccount()
    {
        return account;
    }

    public String getSurname() {
        return Surname;
    }

    public String getName() {
        return Name;
    }

    public int getPin() {
        return Pin;
    }
}

