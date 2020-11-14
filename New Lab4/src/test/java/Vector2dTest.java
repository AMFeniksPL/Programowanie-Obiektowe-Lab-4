import agh.cs.lab1.Vector2d;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;


public class Vector2dTest {

    @Test
    public void testToString() {
        assertEquals(new Vector2d(2,5).toString(), "(2, 5)");
    }

    @Test
    public void precedes() {
        assertEquals(new Vector2d(2,5).precedes(new Vector2d(2,5)), true);
        assertEquals(new Vector2d(2,5).precedes(new Vector2d(3,6)), true);
        assertEquals(new Vector2d(2,5).precedes(new Vector2d(2,1)), false);
        assertEquals(new Vector2d(2,5).precedes(new Vector2d(1,7)), false);
        assertEquals(new Vector2d(2,5).precedes(new Vector2d(1,1)), false);
    }

    @Test
    public void follows() {
        assertEquals(new Vector2d(2,5).follows(new Vector2d(2,5)), true);
        assertEquals(new Vector2d(2,5).follows(new Vector2d(1,1)), true);
        assertEquals(new Vector2d(2,5).follows(new Vector2d(2,1)), true);
        assertEquals(new Vector2d(2,5).follows(new Vector2d(1,7)), false);
        assertEquals(new Vector2d(2,5).follows(new Vector2d(1,1)), true);
        assertEquals(new Vector2d(2,5).follows(new Vector2d(7,1)), false);
    }

    @Test
    public void upperRight() {
        assertEquals(new Vector2d(2,5).upperRight(new Vector2d(4,1)), new Vector2d(4,5));
        assertEquals(new Vector2d(2,5).upperRight(new Vector2d(1,3)), new Vector2d(2,5));
        assertEquals(new Vector2d(2,5).upperRight(new Vector2d(4,7)), new Vector2d(4,7));
    }

    @Test
    public void lowerLeftTest() {
        assertEquals(new Vector2d(2,5).lowerLeft(new Vector2d(4,1)), new Vector2d(2,1));
        assertEquals(new Vector2d(2,5).lowerLeft(new Vector2d(1,3)), new Vector2d(1,3));
        assertEquals(new Vector2d(2,5).lowerLeft(new Vector2d(4,7)), new Vector2d(2,5));
    }

    @Test
    public void addTest() {
        assertEquals(new Vector2d(2,5).add(new Vector2d(4,1)), new Vector2d(6,6));
        assertEquals(new Vector2d(2,5).add(new Vector2d(0,0)), new Vector2d(2,5));
    }

    @Test
    public void oppositeTest() {
        assertEquals(new Vector2d(2,5).opposite(), new Vector2d(-2,-5));
    }

    @Test
    public void subtract() {
        assertEquals(new Vector2d(2,5).subtract(new Vector2d(4,1)), new Vector2d(-2,4));
        assertEquals(new Vector2d(2,5).subtract(new Vector2d(0,0)), new Vector2d(2,5));
    }

    @Test
    public void testEquals() {
        assertEquals(new Vector2d(2,5).equals(new Vector2d(2,5)), true);
        assertEquals(new Vector2d(2,5).equals(new Vector2d(0,0)), false);
    }
}