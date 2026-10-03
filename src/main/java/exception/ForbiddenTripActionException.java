package exception;

public class ForbiddenTripActionException extends RuntimeException{
    public ForbiddenTripActionException(String message){
        super(message);
    }
}
