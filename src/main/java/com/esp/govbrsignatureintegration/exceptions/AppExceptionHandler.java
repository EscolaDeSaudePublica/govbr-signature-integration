package com.esp.govbrsignatureintegration.exceptions;

import com.esp.govbrsignatureintegration.resources.SignPdfResource;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

@Slf4j
@ControllerAdvice
public class AppExceptionHandler extends ResponseEntityExceptionHandler {

    private static final Logger logger = LoggerFactory.getLogger(AppExceptionHandler.class);

    @ExceptionHandler(WebClientResponseException.class)
    public ResponseEntity handleWebClientResponseException(WebClientResponseException exception) {
        logger.info("AppExceptionHandler | {}", exception.getMessage());

        Map<String, Object> responseEntityBody  = new HashMap<>();

        responseEntityBody.put("message", "Erro no processamento com o gov.br");
        responseEntityBody.put("status", HttpStatus.UNAUTHORIZED);

        return new ResponseEntity(responseEntityBody, HttpStatus.UNAUTHORIZED);
    }

    @ExceptionHandler(GeneralSecurityException.class)
    public ResponseEntity handleGeneralSecurityException(GeneralSecurityException exception) {
        logger.info("AppExceptionHandler | {}", exception.getMessage());

        Map<String, Object> responseEntityBody  = new HashMap<>();

        responseEntityBody.put("message", "Erro no processamento da assinatura digital.");
        responseEntityBody.put("status", HttpStatus.BAD_REQUEST);

        return new ResponseEntity(responseEntityBody, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(IOException.class)
    public ResponseEntity handleIOException(IOException exception) {
        logger.info("AppExceptionHandler | {}", exception.getMessage());

        Map<String, Object> responseEntityBody  = new HashMap<>();

        responseEntityBody.put("message", "Erro no processamento dos dados.");
        responseEntityBody.put("status", HttpStatus.BAD_REQUEST);

        return new ResponseEntity(responseEntityBody, HttpStatus.BAD_REQUEST);
    }
}
