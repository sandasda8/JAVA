package Films;

public class ActionFilm extends Film{
    String actionHeroName;
    boolean isMale;
    int howManyDeaths;

    public ActionFilm(String title, String nameOfDirecor, int made, String actionHeroName, boolean isMale, int howManyDeaths) {
        super(title, nameOfDirecor, made);
        this.actionHeroName = actionHeroName;
        this.isMale = isMale;
        this.howManyDeaths = howManyDeaths;
    }

    public String getActionHeroName() {
        return actionHeroName;
    }

    public void setActionHeroName(String actionHeroName) {
        this.actionHeroName = actionHeroName;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public int getHowManyDeaths() {
        return howManyDeaths;
    }

    public void setHowManyDeaths(int howManyDeaths) {
        this.howManyDeaths = howManyDeaths;
    }

    @Override
    public String toString() {
        return super.toString() +  " ActionFilm{" +
                "actionHeroName='" + actionHeroName + '\'' +
                ", isMale=" + isMale +
                ", howManyDeaths=" + howManyDeaths +
                '}';
    }
}
