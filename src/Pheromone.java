

public class Pheromone {

    private int x;
    private int y;
    private double strength;
    private PheromoneType type;
    private FoodSource source;

    public Pheromone(int x, int y, double strength, PheromoneType type, FoodSource source) {
        this.x = x;
        this.y = y;
        this.strength = strength;
        this.type = type;
        this.source = source;
    }

    public PheromoneType getType() {
        return type;
    }

    public FoodSource getSource() {
        return source;
    }

    public void decay() {

        if (type == PheromoneType.FOOD) {
            strength *= 0.998;
        }
        else {
            strength *= 0.990;
        }
    }

    public boolean isWeak() {
        return strength < 0.1;
    }

    public int getX() { return x; }
    public int getY() { return y; }
    public double getStrength() { return strength; }
}
