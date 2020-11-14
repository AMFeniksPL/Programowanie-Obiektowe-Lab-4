package agh.cs.lab1;
import junit.framework.TestCase;
import org.junit.Test;

public class AnimalTest extends TestCase {

    public void testTestToString() {
    }

    @Test
    public void testOrientation() {

        Animal stefan = new Animal();
        stefan.move(MoveDirection.RIGHT, stefan.getMap());
        assertEquals(stefan.getOrientation(),MapDirection.EAST);
        stefan.move(MoveDirection.RIGHT, stefan.getMap());
        assertEquals(stefan.getOrientation(),MapDirection.SOUTH);
        stefan.move(MoveDirection.RIGHT, stefan.getMap());
        assertEquals(stefan.getOrientation(),MapDirection.WEST);
        stefan.move(MoveDirection.RIGHT, stefan.getMap());
        assertEquals(stefan.getOrientation(),MapDirection.NORTH);
    }
    @Test
    public void testMovement() {
        Animal stefan = new Animal();
        assertEquals(stefan.getPosition(), new Vector2d(2,2));
        stefan.move(MoveDirection.FORWARD, stefan.getMap());
        assertEquals(stefan.getPosition(), new Vector2d(2,3));
        stefan.move(MoveDirection.RIGHT, stefan.getMap());
        assertEquals(stefan.getPosition(), new Vector2d(2,3));
        assertEquals(stefan.getOrientation(), MapDirection.EAST);
        stefan.move(MoveDirection.FORWARD, stefan.getMap());
        assertEquals(stefan.getPosition(), new Vector2d(3,3));
        stefan.move(MoveDirection.FORWARD, stefan.getMap());
        assertEquals(stefan.getPosition(), new Vector2d(4,3));

    }
    @Test
    public void testEdgeOfMap(){
        Animal stefan = new Animal();
        assertEquals(stefan.getPosition(), new Vector2d(2,2));
        stefan.move(MoveDirection.FORWARD, stefan.getMap());
        assertEquals(stefan.getPosition(), new Vector2d(2,3));
        stefan.move(MoveDirection.RIGHT, stefan.getMap());
        assertEquals(stefan.getPosition(), new Vector2d(2,3));
        assertEquals(stefan.getOrientation(), MapDirection.EAST);
        stefan.move(MoveDirection.FORWARD, stefan.getMap());
        assertEquals(stefan.getPosition(), new Vector2d(3,3));
        stefan.move(MoveDirection.FORWARD, stefan.getMap());
        assertEquals(stefan.getPosition(), new Vector2d(4,3));
        stefan.move(MoveDirection.FORWARD, stefan.getMap());
        assertEquals(stefan.getPosition(), new Vector2d(0,3));
        stefan.move(MoveDirection.FORWARD, stefan.getMap());
        assertEquals(stefan.getPosition(), new Vector2d(1,3));
        stefan.move(MoveDirection.LEFT, stefan.getMap());
        stefan.move(MoveDirection.LEFT, stefan.getMap());
        stefan.move(MoveDirection.FORWARD, stefan.getMap());
        assertEquals(stefan.getPosition(), new Vector2d(0,3));
        stefan.move(MoveDirection.FORWARD, stefan.getMap());
        assertEquals(stefan.getPosition(), new Vector2d(4,3));
    }




}