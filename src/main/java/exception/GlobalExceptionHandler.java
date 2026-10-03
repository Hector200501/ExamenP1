package exception;

import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    //Para 401 Unauthorized
    @ExceptionHandler(InvalidCredentialsException.class)
    public ResponseEntity<String> handleUnauthorized(RuntimeException ex){
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(ex.getMessage());
    }

    //Para 403 Forbidden
    @ExceptionHandler(ForbiddenTripActionException.class)
    public ResponseEntity<String> handleForbidden(RuntimeException ex){
        return ResponseEntity.status(HttpStatus.FORBIDDEN).body(ex.getMessage());
    }

    //Para 404 NotFound
    @ExceptionHandler(TripOverlapException.class)
    public ResponseEntity<String> handleNotFound(RuntimeException ex){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
    }


    //Para 409 Conflict
    @ExceptionHandler({UserAlreadyExistsException.class,
            TripFullException.class,AlreadyRequestedException.class, TripOverlapException.class})
    public ResponseEntity<String> handleConflict (RuntimeException ex){
        return ResponseEntity.status(HttpStatus.CONFLICT).body(ex.getMessage());
    }
}
