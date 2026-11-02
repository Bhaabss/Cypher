// Simple factory for creating different types of ants.
public class AntFactory {

    public static ScoutAnt createScout(int x, int y, int speed, Colony colony) {
        return new ScoutAnt(x, y, speed, colony);
    }

    public static ForagerAnt createForager(int x, int y, int speed, Colony colony) {
        return new ForagerAnt(x, y, speed, colony);
    }

    public static QueenAnt createQueen(int x, int y, int speed, Colony colony) {
        return new QueenAnt(x, y, speed, colony);
    }
}