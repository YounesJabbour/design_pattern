public class Couloir implements Observer {
    @Override
    public void update(int state) {
        System.out.println("Couloir: " + state);
    }
}
