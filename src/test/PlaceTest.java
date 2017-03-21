import org.junit.*;
import static org.junit.Assert.*;

public class PlaceTest {

  @Test
  public void Place_instantiatesCorrectly_true() {
    Place myPlace = new Place("Seattle");
    assertEquals(true, myPlace.getDescription());
  }

  @Test
  public void Place_instantiatesWithDescription_String() {
    Place myPlace = new Place("Seattle");
    assertEquals("Seattle", myPlace.getDescription())
  }
}
