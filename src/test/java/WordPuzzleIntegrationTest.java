import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class WordPuzzleIntegrationTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();
  public WebDriver getDefaultDriver() {
      return webDriver;
  }

  @ClassRule
    public static ServerRule server = new ServerRule();

  @Test
    public void rootTest() {
      goTo("http://localhost:4567/");
      assertThat(pageSource()).contains("Word Puzzle");

  @Test
    public void vowelRemover() {
      goTo("http://localhost:4567/");
      fill("#inputString").with("I think I have created a puzzle?!");
      submit("#submitBtn");
      assertThat(pageSource()).contains("- th-nk - h-v- cr--t-d - p-zzl-?!");
    }
  }
}
