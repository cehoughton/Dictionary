
import org.fluentlenium.adapter.FluentTest;
import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import static org.fluentlenium.core.filter.FilterConstructor.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.fluentlenium.assertj.FluentLeniumAssertions.assertThat;

public class AppAssertionTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();

  @Override
  public WebDriver getDefaultDriver() {
    return webDriver;
  }

    @ClassRule
    public static ServerRule server = new ServerRule();

    @Test
    public void rootTest() {
      goTo("http://localhost:4567/");
      assertThat(pageSource()).contains("Build your Dictionary!");
    }

    @Test
    public void wordIsCreatedTest() {
    goTo("http://localhost:4567");

    fill("#inputWord").with("Taco");
    submit("btn");
    assertThat(pageSource()).contains("Taco");
}

// @Test
//   public void categoryIsDisplayedTest() {
//   Word newWord = new Word("Taco");
//   newWord.save();
//   String wordPath = String.format("http://localhost:4567/%d", newWord.getId());
//   goTo(wordPath);
//   assertThat(pageSource()).contains("Taco");



    @Test
    public void defintionIsCreatedTest() {
      goTo("http://localhost:4567/words/:id");
      fill("#inputDef").with("A tasty snack");
      submit(".btn");
      assertThat(pageSource()).contains("A tasty snack");
    }

    @Test
    public void defintionIsSavedTest() {
    goTo("http://localhost:4567/definitions/:id");
    fill("#inputDef").with("A tasty snack");
    submit(".btn");
    // click("a", withText("add new"));
    assertThat(pageSource()).contains("A tasty snack");
  }
}
   //
  //  @Test
  //  public void puzzleLeavesConsonantsTest() {
  //    goTo("http://localhost:4567/");
  //    fill("#word").with("trfh tgg");
  //    submit(".btn");
  //    assertThat(pageSource()).contains("TRFH TGG");
  //  }
