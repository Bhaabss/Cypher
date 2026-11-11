public class PheromoneFollowing
        implements MovementStrategy {

    @Override
    public void move(Ant ant) {
        Pheromone strongest = SimulationPanel.getStrongestNearby(ant.getX(), ant.getY(), PheromoneType.FOOD);
        if (strongest != null 
            && (Math.abs(strongest.getX() - ant.getX()) > 5 
            || Math.abs(strongest.getY() - ant.getY()) > 5)){
                int dx = Integer.compare(strongest.getX(), ant.getX());
                int dy = Integer.compare(strongest.getY(), ant.getY());
                ant.move(dx, dy);
                return;
            }

        int dx = (int)(Math.random() * 3) - 1;
        int dy = (int)(Math.random() * 3) - 1;
        ant.move(dx, dy);
    }
}