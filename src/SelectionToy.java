import java.util.List;
public class SelectionToy {
    public ToysPro selectionByRate(List<ToysPro> toys) {
            double rateC = 0.0;
            for (ToysPro toy : toys)
                rateC += toy.getRate();
            double i = Math.random() * rateC;
            double countR = 0.0;
            for (ToysPro toy : toys) {
                countR += toy.getRate();
                if (countR >= i)
                    return toy;
            }
            throw new RuntimeException();
        }
    }

