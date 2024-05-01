class Account{
    public String name;
    protected String email;
    private String password;
    public void setPassword(String password){
        this.password = password;
    }
}
public class access_modifiers {
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.name = "Siddhant";
        a1.setPassword("12345678");
        a1.email = "siddhant@gmail.com";
    }
}
