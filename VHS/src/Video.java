public class Video implements Rentable {

    private String filmTitle;
    private boolean rented;
    private String forHowLongRentable;
    private int ageLimit; //0, 12, 16 vagy 18 lehet

    public Video(String filmTitle, String forHowLongRentable, int ageLimit) {
        this.filmTitle = filmTitle;
        this.rented = false;
        if (forHowLongRentable.equals("oneday") || forHowLongRentable.equals("twodays") || forHowLongRentable.equals("unlimited")){
            this.forHowLongRentable = forHowLongRentable;
        }
        if (ageLimit <= 12 || ageLimit == 16 || ageLimit == 18){
            this.ageLimit = ageLimit;
        }
    }
    @Override
    public boolean renting(int howOld, int rentTime) throws WrongRentalException{
        if (howOld < ageLimit && !rented ){
            if (rentTime == 1 && forHowLongRentable.equals("oneday")){
                rented = true;
                return true;
            } else if (rentTime == 2 && forHowLongRentable.equals("twodays")){
                rented = true;
                return true;
            } else if (rentTime == 3 && forHowLongRentable.equals("unlimited")){
                rented = true;
                return true;
            } else {
                throw new WrongRentalException("error");
            }

        }
        return false;
    }

    public String getFilmTitle() {
        return filmTitle;
    }

    public void setFilmTitle(String filmTitle) {
        this.filmTitle = filmTitle;
    }

    public boolean isRented() {
        return rented;
    }

    public void setRented(boolean rented) {
        this.rented = rented;
    }

    public String getForHowLongRentable() {
        return forHowLongRentable;
    }

    public void setForHowLongRentable(String forHowLongRentable) {
        this.forHowLongRentable = forHowLongRentable;
    }

    public int getAgeLimit() {
        return ageLimit;
    }

    public void setAgeLimit(int ageLimit) {
        this.ageLimit = ageLimit;
    }

    @Override
    public boolean bringBack() {
        return false;
    }

    @Override
    public String toString() {
        return "Video{" +
                "filmTitle='" + filmTitle + '\'' +
                ", rented=" + rented +
                ", forHowLongRentable='" + forHowLongRentable + '\'' +
                ", ageLimit=" + ageLimit +
                '}';
    }
}
