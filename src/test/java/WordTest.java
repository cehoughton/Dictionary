import java.util.ArrayList;

import org.junit.*;
import static org.junit.Assert.*;

public class WordTest {

@Test
 public void getWord_returnsWord_true() {
  Word testWord = new Word("Taco");
  assertEquals("Taco", testWord.getWord());
  }


@Test
 public void getId_returnsWordId() {
  Word testWord = new Word("Taco");
  assertTrue(Word.all().size() == testWord.getId());
  }

@Test
 public void getDefinitions_initiallyReturnsempptyArrayList() {
  Word testWord = new Word("Taco");
  assertTrue(testWord.getDefinitions() instanceof ArrayList);
  }

@Test
 public void all_returnsAllInstancesOfWord_true() {
  Word firstWord = new Word("Taco");
  Word secondWord = new Word("Dog");
  assertTrue(Word.all().contains(firstWord));
  assertTrue(Word.all().contains(secondWord));
  }

@Test
 public void clear_removesAllWordInstancesFromMemory() {
  Word testWord = new Word("Taco");
  Word.clear();
  assertEquals(Word.all().size(), 0);
  }

@Test
 public void find_returnsWordWithSameId() {
  Word testWord = new Word("Taco");
  assertEquals(Word.find(testWord.getId()), testWord);
  }

@Test
 public void addDefinition_addsDefinitionToList() {
  Word testWord = new Word("Taco");
  Definition testDef = new Definition("A tasty snack");
  testWord.addDefinition(testDef);
  assertTrue(testWord.getDefinitions().contains(testDef));
  }
}
