public class Skateboard extends Vehicle {
    private boolean needsPolish;
    private int scratches;
    public Skateboard(String name, Double speed) {
        super(name, speed);
    }

    public void addScratches() {
        scratches = 0;
        needsPolish = false;
    }
}   
    