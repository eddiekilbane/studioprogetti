package logica;

import java.util.Random;

public class RandomQuote {
  String quoteStrings[] = {"ni", "lake", "chair"};

  public String getRandomQuoteName() {
    Random r = new Random();
    int i = r.nextInt(quoteStrings.length);
    return quoteStrings[i]; 
  }
}
