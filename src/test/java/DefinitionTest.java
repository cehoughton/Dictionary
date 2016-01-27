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

  // @Test
  // public void isCompleted_isFalseAfterInstantiaon_false() {
  // Definition myDefinition = new Definition("A tasty snack");
  //   assertEquals(false, myDefinition.isCompleted());
  // }


  @Test
  public void all_returnsAllInstancesOfDefinition_true() {
    Definition firstDefinition = new Definition("A tasty snack");
    Definition secondDefinition = new Definition("Mexican food");
    assertTrue(Definition.all().contains(firstDefinition));
    assertTrue(Definition.all().contains(secondDefinition));
  }

  @Test
  public void newId_DefinitionInstantiateWithAnID_true() {
    Definition myDefinition = new Definition("A tasty snack");
    assertEquals(Definition.all().size(), myDefinition.getId());
  }

  @Test
  public void find_returnsDefinitionWithSameId_secondDefinition() {
    Definition firstDefinition = new Definition("A tasty snack");
    Definition secondDefinition = new Definition("Mexican food");
    assertEquals(Definition.find(secondDefinition.getId()), secondDefinition);
  }

  @Test
  public void find_returnsNullWhenNoDefinitionFound_null() {
    assertTrue(Definition.find(999) == null);
  }

  @Test
  public void clear_emptiesAllDefinitionsFromArrayList() {
    Definition myDefinition = new Definition("A tasty snack");
    Definition.clear();
    assertEquals(Definition.all().size(), 0);
  }
}
