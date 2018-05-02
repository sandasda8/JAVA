public class TutorialVideo extends Video{

    public TutorialVideo(String filmTitle, String forHowLongRentable) {
        super(filmTitle, forHowLongRentable, 0);
    }
    @Override
    public boolean renting(int howOld, int rentTime) throws WrongRentalException {
        if (!isRented()){
            if (rentTime == 1 && getForHowLongRentable().equals("oneday")){
                setRented(true);
                return true;
            } else if (rentTime == 2 && getForHowLongRentable().equals("twodays")){
                setRented(true);
                return true;
            } else if (rentTime == 3 && getForHowLongRentable().equals("unlimited")){
                setRented(true);
                return true;
            } else {
                throw new WrongRentalException("error");
            }

        }
        return false;
    }
    @Override
    public String toString() {
        return "Tutorial videos: " + super.toString();
    }
}
