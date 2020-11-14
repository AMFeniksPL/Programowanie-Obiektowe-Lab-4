package agh.cs.lab1;

public class Animal {

    private MapDirection orientation;
    private Vector2d position;
    private IWorldMap map;

    public Animal(){
        this.orientation = MapDirection.NORTH;
        this.position = new Vector2d(2,2);
        this.map = new RectangularMap(5,5);
    }

    public Animal(MapDirection orientation, Vector2d position, IWorldMap map) {
        this.orientation = orientation;
        this.position = position;
        this.map = map;
    }

    public IWorldMap getMap() {
        return map;
    }

    public MapDirection getOrientation() {
        return orientation;
    }

    public Vector2d getPosition() {
        return position;
    }

    public String toString(){
        String result;
        switch(orientation) {
            case WEST:
                result = "<";
                break;
            case EAST:
                result = ">";
                break;
            case NORTH:
                result = "^";
                break;
            case SOUTH:
                result = "v";
                break;
            default:
                result = "X";
        }
        return result;
    }

    public void move(MoveDirection direction, IWorldMap map){
        switch(direction) {
            case LEFT:
                this.orientation = this.orientation.previous();
                break;
            case RIGHT:
                this.orientation = this.orientation.next();
                break;
            case FORWARD:
                this.position = this.position.add(orientation.toUnitVector());
                break;
            case BACKWARD:
                this.position = this.position.subtract(orientation.toUnitVector());
                break;

        }
        if(map.canMoveTo(new Vector2d((this.position.x + 5) % 5, (this.position.y + 5) % 5)))
            this.position = new Vector2d((this.position.x + 5) % 5, (this.position.y + 5) % 5);
    }
}
