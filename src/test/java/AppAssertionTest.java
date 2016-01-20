
// import org.fluentlenium.adapter.FluentTest;
// import org.fluentlenium.adapter.FluentTest;
// import org.junit.ClassRule;
// import org.junit.Test;
// import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.htmlunit.HtmlUnitDriver;
// import static org.fluentlenium.core.filter.FilterConstructor.*;
//
// import static org.assertj.core.api.Assertions.assertThat;
// import static org.fluentlenium.assertj.FluentLeniumAssertions.assertThat;
//
// public class AppAssertionTest extends FluentTest {
//   public WebDriver webDriver = new HtmlUnitDriver();
//
//   @Override
//   public WebDriver getDefaultDriver() {
//     return webDriver;
//   }
//
//     @ClassRule
//     public static ServerRule server = new ServerRule();
//
//     @Test
//     public void rootTest() {
//       goTo("http://localhost:4567/");
//       assertThat(pageSource()).contains("Definitions");
//     }
//
//     @Test
//     public void defintionIsCreatedTest() {
//       goTo("http://localhost:4567/");
//       fill("#description").with("A tasty snack");
//       submit(".btn");
//       assertThat(pageSource()).contains("add new");
//     }
//
//     @Test
//     public void defintionIsSavedTest() {
//     goTo("http://localhost:4567/");
//     fill("#description").with("A tasty snack");
//     submit(".btn");
//     click("a", withText("add new"));
//     assertThat(pageSource()).contains("A tasty snack");
//   }
//
//    //
//   //  @Test
//   //  public void puzzleLeavesConsonantsTest() {
//   //    goTo("http://localhost:4567/");
//   //    fill("#word").with("trfh tgg");
//   //    submit(".btn");
//   //    assertThat(pageSource()).contains("TRFH TGG");
//   //  }
//  }
 }
