public class Garden  implements Observer{

    @Override
    public void update(int state) {
        System.out.println("Garden: " + state);
    }
}
