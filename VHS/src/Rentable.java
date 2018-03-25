public interface Rentable {

    boolean renting(int something, int anotherSomething) throws WrongRentalException;
    boolean bringBack();
}
