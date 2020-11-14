package agh.cs.lab1;


public class World {

    public static void main(String[] args) {
        String[] args2 = new String[]{"f","b", "f", "l"};
        MoveDirection[] directions = new OptionsParser().parse(args2);
        RectangularMap map = new RectangularMap(8, 5);
        Vector2d[] positions = { new Vector2d(2,2), new Vector2d(3,4) };
        Animal animal1 = new Animal(MapDirection.EAST, new Vector2d(2,3), map);
        Animal animal2 = new Animal();
        map.place(animal1);
        map.place(animal2);
        System.out.println(map);
        IEngine engine = new SimulationEngine(directions, map, positions);
        engine.run();
        System.out.println(map);
    }
}
