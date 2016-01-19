import org.junit.*;
import static org.junit.Assert.*;

public class DefinitionTest {

  @Rule
  public ClearRule clearRule = new ClearRule();

  @Test
  public void defintion_instantiatesCorrectly_true() {
      Definition myDefinition = new Definition("A tasty snack");
      assertEquals(true, myDefinition instanceof Definition);
  }

  @Test
  public void definition_instantiatesWithDescription_true() {
      Definition myDefinition = new Definition("A tasty snack");
      assertEquals("A tasty snack", myDefinition.getInputDef());
  }

}
