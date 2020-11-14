import agh.cs.lab1.MoveDirection;
import agh.cs.lab1.OptionsParser;
import junit.framework.TestCase;
import static org.junit.Assert.*;
import org.junit.Test;

public class OptionsParserTest extends TestCase {

    @Test
    public void testParser()    {
        System.out.println(OptionsParser.parse(new String[]{"f", "f"})[1]);
        System.out.println(new MoveDirection[]{MoveDirection.FORWARD, MoveDirection.FORWARD}[1]);

        assertArrayEquals(OptionsParser.parse(new String[]{"f", "f"}),new MoveDirection[]{MoveDirection.FORWARD, MoveDirection.FORWARD});
    }
}