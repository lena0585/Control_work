import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
public class ShopToyPro {
        private List<ToysPro> toys;

        public ShopToyPro(List<ToysPro> toys) {
            this.toys = toys;
        }

        public ToysPro getToy() {
            SelectionToy random = new SelectionToy();
            ToysPro toy = random.selectionByRate(toys);
            return toy;
        }

        public void toyRaffle() {
            ToysPro toy = getToy();
            String text = toy.toString();
            try(FileWriter writer = new FileWriter("Toys.txt", true))
            {
                writer.write(text);
                writer.append('\n');
                writer.flush();
            }
            catch (IOException ex) {

                System.out.println(ex.getMessage());
            }
            toys.remove(toy);
        }
    }

