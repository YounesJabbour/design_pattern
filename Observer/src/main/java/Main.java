public class Main {

    public static void main(String[] args) {

    // Observers
    Camera camera = new Camera();
    Couloir couloir = new Couloir();
    Garden garden = new Garden();

    Player p = new Player();

    // subscribe observers
    p.addObserver(camera);
    p.addObserver(couloir);
    p.addObserver(garden);

    // Player's score changes
    p.setScore(10);
    p.setScore(20);
    p.setScore(30);
    }
}
