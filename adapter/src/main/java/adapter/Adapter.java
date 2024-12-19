package adapter;

public class Adapter extends Adaptee implements Standard {
    @Override
    public void operation() {
        System.out.println("Adapter operation.");
        operation2();
    }
}
