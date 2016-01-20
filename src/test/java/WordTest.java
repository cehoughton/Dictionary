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
public void getDef_initiallyReturnsempptyArrayList() {
  Word testWord = new Word("Taco");
  assertTrue(testWord.getDef() instanceof ArrayList);
}


}
