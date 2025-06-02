package org.example.springmvc.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalControllerExceptionHandler {

    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<ErrorBody> handleUserNotFound(Exception e) {
        return new ResponseEntity<>(new ErrorBody("User_not_found",
                "User with current id cant be found."),
                HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorBody> handleGlobalError(Exception e) {
        e.printStackTrace();
        return new ResponseEntity<>(new ErrorBody("global_server_error",
                "Unknown server error"),
                HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @AllArgsConstructor
    @Getter
    static class ErrorBody {
        String errorName;
        String errorBody;
    }
}
