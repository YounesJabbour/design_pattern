import adapter.Adapter;
import adapter.Standard;
import adapter.StandardImpl;
import adapter.StandardImpl2;

public class ClientApplication {
    public static void main(String[] args) {
        Standard standard = new StandardImpl();
        standard.operation();
        standard = new StandardImpl2();
        standard.operation();
        standard = new Adapter();
        standard.operation();
    }
}
