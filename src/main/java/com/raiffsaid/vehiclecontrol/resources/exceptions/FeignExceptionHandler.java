package com.raiffsaid.vehiclecontrol.resources.exceptions;

import feign.FeignException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.Instant;

@ControllerAdvice
public class FeignExceptionHandler {

    @ExceptionHandler(FeignException.NotFound.class)
    public ResponseEntity<StandardError> handleFeignException(FeignException e) {
        StandardError err = new StandardError();
        err.setTimestamp(Instant.now());
        err.setStatus(HttpStatus.BAD_REQUEST.value());
        err.setError("Bad request");
        err.setMessage("Parâmetro incorreto");
        err.setPath(e.request().url());

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(err);
    }

}
