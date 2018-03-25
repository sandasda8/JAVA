public class Video implements Rentable {

    private String filmTitle;
    private boolean rented;
    private String forHowLongRentable; //„egynapos”, „kétnapos”, „korlátlan”
    private int ageLimit; //0, 12, 16 vagy 18 lehet

    public Video(String filmTitle, String forHowLongRentable, int ageLimit) {
        this.filmTitle = filmTitle;
        this.rented = true;
        this.forHowLongRentable = forHowLongRentable;
        this.ageLimit = ageLimit;
    }
    @Override
    public boolean renting(int howOld, int rentTime) throws WrongRentalException{
        if (howOld < ageLimit && !rented ){

        }
        return false;
    }

    @Override
    public boolean bringBack() {
        return false;
    }
}
