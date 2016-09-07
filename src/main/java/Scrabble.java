import java.util.Arrays;
import java.util.List;

public class Scrabble {
  public Integer calculateScore(String word){
    Character[] onePoint = { 'a', 'e', 'i', 'o', 'u', 'l', 'n', 'r', 's', 't' };
    Character[] twoPoint = { 'd', 'g'};
    char [] letters = word.toCharArray();
    int result = 0;

    for (char letter : letters) {
      if(Arrays.asList(onePoint).contains(letter)){
        result ++;
      }
      if(Arrays.asList(twoPoint).contains(letter)){
        result += 2;
      }
    }
    return result;
  }
}
