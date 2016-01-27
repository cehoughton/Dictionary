
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

    @Test
    public void defintionFormIsDisplayed() {
      Word word = new Word("dog");
      goTo("http://localhost:4567/words/" + word.getId());
      assertThat(pageSource()).contains("dog");
    }

    @Test
    public void defintionIsIsAddedToWord() {
    Word word = new Word("cat");
    goTo("http://localhost:4567/words/" + word.getId());
    fill("#inputDef").with("animal");
    submit(".btn");
    assertThat(pageSource()).contains("animal");
    }
  }
