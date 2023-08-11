import java.util.ArrayList;
import java.util.List;

public class MainToy {

        public static void main(String[] args) {

            ToysPro toy1 = new ToysPro(0, "кукла Барби", 13.8);
            ToysPro toy2 = new ToysPro(1, "Падающая башня", 49.2);
            ToysPro toy3 = new ToysPro(2, "настольная игра Дубль", 79.1);
            ToysPro toy4 = new ToysPro(3, "Слайм", 67.3);
            ToysPro toy5 = new ToysPro(4, "Спортивная машинка", 58.2);

            List<ToysPro> toys = new ArrayList<ToysPro>();
            toys.add(toy5);
            toys.add(toy4);
            toys.add(toy3);
            toys.add(toy2);
            toys.add(toy1);

            ShopToyPro toyShop = new ShopToyPro(toys);
            toyShop.toyRaffle();
            toyShop.toyRaffle();
            toyShop.toyRaffle();
            toyShop.toyRaffle();
            toyShop.toyRaffle();
        }
    }

