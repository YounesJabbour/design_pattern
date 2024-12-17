import model.Customer;

public class Application {
    public static void main(String[] args) {
        Customer c1 = Customer.getInstance();
        Customer c2 = Customer.getInstance();
        
//       We can't create a new instance of Customer class because constructor is a private
//        Customer c3  = new Customer();

        // c1 == c2 because they're the same instance, so they have the same reference.
    }
}
