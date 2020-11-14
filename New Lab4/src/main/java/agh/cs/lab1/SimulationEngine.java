package agh.cs.lab1;

public class SimulationEngine implements IEngine{

    private MoveDirection[] directions;
    private RectangularMap map;
    private Vector2d[] positions;

    public SimulationEngine(MoveDirection[] directions, RectangularMap map, Vector2d[] positions) {
        this.directions = directions;
        this.map = map;
        this.positions = positions;
    }

    @Override
    public void run() {
        for (int i = 0; i < directions.length; i++){
            map.animals.get(i % map.animals.size()).move(directions[i], map);
        }
    }
}
