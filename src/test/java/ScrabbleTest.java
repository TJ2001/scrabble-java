import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class ScrabbleTest {

  @Test
  public void calculateScore_returnsScoreForSingleLetter_1() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 1;
    assertEquals(expected, testScrabble.calculateScore("a"));
  }
  @Test
  public void calculateScore_returnsScoreForTwoLetters_2() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 2;
    assertEquals(expected, testScrabble.calculateScore("ae"));
  }
  @Test
  public void calculateScore_returnsScoreForThreeLetters_3() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 3;
    assertEquals(expected, testScrabble.calculateScore("aei"));
  }
  @Test
  public void calculateScore_returnsScoreForTwoLettersDiffValue_4() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 3;
    assertEquals(expected, testScrabble.calculateScore("ad"));
  }
}
