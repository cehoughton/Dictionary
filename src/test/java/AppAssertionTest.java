import org.fluentlenium.adapter.FluentTest;
import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.assertj.core.api.Assertions.assertThat;
import static org.fluentlenium.assertj.FluentLeniumAssertions.assertThat;

public class AppAssertionTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();
  public WebDriver getDefaultDriver() {
    return webDriver;
  }

   @ClassRule
   public static ServerRule server = new ServerRule();

   @Test
   public void rootTest() {
     goTo("http://localhost:4567");
     assertThat(pageSource()).contains("newpuzzle");
   }



   @Test
   public void puzzleCreatedTest() {
     goTo("http://localhost:4567/");
     fill("#word").with("wowo");
     submit(".btn");
     assertThat(pageSource()).contains("W-W-");
   }

   @Test
   public void puzzleLeavesConsonantsTest() {
     goTo("http://localhost:4567/");
     fill("#word").with("trfh tgg");
     submit(".btn");
     assertThat(pageSource()).contains("TRFH TGG");
   }
 }
