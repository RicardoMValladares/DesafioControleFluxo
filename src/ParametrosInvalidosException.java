public class ParametrosInvalidosException extends Exception {

    String message;

    public ParametrosInvalidosException(String msg) {
        this.message = msg;
    }

}
