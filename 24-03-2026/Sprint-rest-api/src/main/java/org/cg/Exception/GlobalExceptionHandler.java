package org.cg.Exception;

import jakarta.servlet.http.HttpServletRequest;
import org.cg.dto.ErrorDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ResponseBody
    @ExceptionHandler(UserNotFound.class)
    @ResponseStatus(value= HttpStatus.UNAUTHORIZED)
    public ErrorDTO handle1(UserNotFound e, HttpServletRequest hs){
        return new ErrorDTO(e.getMessage(), LocalDate.now(),hs.getRequestURI());
    }

}
