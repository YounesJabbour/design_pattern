public class BuilderApplication {
    public static void main(String[] args) {

        BankAccount bankAccount = Director.accountBuilder()
                .accountNumber("1234")
                .name("John Doe")
                .email("test@gmail.com")
                .balance(1000)
                .build();
    }
}
