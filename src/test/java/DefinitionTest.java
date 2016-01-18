import org.junit.*;
import static org.junit.Assert.*;

public class DefinitionTest {

  @Test
  public void Defintion_instantiatesCorrectly_true() {
      Definition myDefinition = new Definition("A tasty snack");
      assertEquals(true, myDefinition instanceof Definition);
  }

}
