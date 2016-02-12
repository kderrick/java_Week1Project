import org.junit.*;
import static org.junit.Assert.*;

import java.util.ArrayList;

public class WordPuzzleTest {
  @Test
  public void vowelRemover_RemoveAllAsFromString_lowercase() {
    WordPuzzle testWordPuzzle = new WordPuzzle();
    String letterARemoved = "h-t";
    assertEquals(letterARemoved, testWordPuzzle.vowelRemover("hat"));
  }
  @Test
  public void vowelRemover_RemoveAllEsFromString_lowercase() {
    WordPuzzle testWordPuzzle = new WordPuzzle();
    String letterERemoved = "h--l";
    assertEquals(letterERemoved, testWordPuzzle.vowelRemover("heel"));
  }
  @Test
  public void vowelRemover_RemoveAllIsFromString_lowercase() {
    WordPuzzle testWordPuzzle = new WordPuzzle();
    String letterIRemoved = "h-ll";
    assertEquals(letterIRemoved, testWordPuzzle.vowelRemover("hill"));
  }
  @Test
  public void vowelRemover_RemoveAllOsFromString_lowercase() {
    WordPuzzle testWordPuzzle = new WordPuzzle();
    String letterORemoved = "h-t";
    assertEquals(letterORemoved, testWordPuzzle.vowelRemover("hot"));
  }
  @Test
  public void vowelRemover_RemoveAllUsFromString_lowercase() {
    WordPuzzle testWordPuzzle = new WordPuzzle();
    String letterURemoved = "h-t";
    assertEquals(letterURemoved, testWordPuzzle.vowelRemover("hut"));
  }
  @Test
  public void vowelRemover_RemoveAllVowelsIncludingUpperCase() {
    WordPuzzle testWordPuzzle = new WordPuzzle();
    String upperAndLowerCaseVowelsRemoved = "Wh-t -s Y--r N-m-?";
    assertEquals(upperAndLowerCaseVowelsRemoved, testWordPuzzle.vowelRemover("WhAt is YoUr NamE?"));
  }
}
