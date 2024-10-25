public class Camera implements Observer{
    @Override
    public void update(int state) {
        System.out.println("Camera: " + state);
    }
}
