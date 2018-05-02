package Films;
import java.util.Random;

public class Film {

    protected String title;
    protected String nameOfDirecor;
    protected int made;

    public Film(String title, String nameOfDirecor, int made) {
        this.title = title;
        this.nameOfDirecor = nameOfDirecor;
        this.made = made;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNameOfDirecor() {
        return nameOfDirecor;
    }

    public void setNameOfDirecor(String nameOfDirecor) {
        this.nameOfDirecor = nameOfDirecor;
    }

    public int getMade() {
        return made;
    }

    public void setMade(int made) {
        this.made = made;
    }
    public boolean nominateForOscar(int dateNominated) {
        Random randomiser = new Random();

        if (dateNominated == made || dateNominated == (made + 1)) {
            boolean wonOscar = randomiser.nextBoolean();
            if (wonOscar) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Film{" +
                "title='" + title + '\'' +
                ", nameOfDirecor='" + nameOfDirecor + '\'' +
                ", made=" + made +
                '}';
    }
}
