public class InsufficientBalanceException extends RuntimeException {
    private String mess;

    public InsufficientBalanceException(String mess) {
        super();
        this.mess = mess;
        System.out.println(mess);
    }
}
