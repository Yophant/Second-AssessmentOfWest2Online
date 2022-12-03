public class AnimalNotFountException extends RuntimeException {
    private String mess;

    public AnimalNotFountException(String mess) {
        super();
        this.mess = mess;
        System.out.println(mess);
    }
}
