package com.msalumnos.exception;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.msalumnos.request.ApiErrors;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler{

	@Override
	protected ResponseEntity<Object> handleHttpRequestMethodNotSupported(HttpRequestMethodNotSupportedException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		String mensaje=ex.getMessage();
		List<String> detalles=new ArrayList<String>();
		detalles.add("Verbo HTTP no soportado, Verifique el uso del verbo correcto");
		ApiErrors errors= new ApiErrors(mensaje,detalles, status,LocalDateTime.now());
		
		return ResponseEntity.status(status).body(errors);
	}

	@Override
	protected ResponseEntity<Object> handleHttpMediaTypeNotSupported(HttpMediaTypeNotSupportedException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		String mensaje=ex.getMessage();
		List<String> detalles=new ArrayList<String>();
		detalles.add("MediaType no adminitido, Verifique");
		ApiErrors errors= new ApiErrors(mensaje,detalles, status,LocalDateTime.now());
		
		return ResponseEntity.status(status).body(errors);
	}


	@Override
	protected ResponseEntity<Object> handleHttpMessageNotReadable(HttpMessageNotReadableException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		String mensaje=ex.getMessage();
		List<String> detalles=new ArrayList<String>();
		detalles.add("Falta agrgar o enviar informacion en el body");
		ApiErrors errors= new ApiErrors(mensaje,detalles, status,LocalDateTime.now());
		
		return ResponseEntity.status(status).body(errors);
	}
	
	//Vamos a crear un metodo que maneje esta clase y que controle la excepcion personalizada
	//de NoSePuedeEditarException
	@ExceptionHandler(NoSePuedeEditarException.class)
	public ResponseEntity<Object> handleNoSePuedeEditarException(NoSePuedeEditarException ex){
		String mensaje=ex.getMessage();
		List<String> detalles=new ArrayList<String>();
		detalles.add("No se puede editar un alumno inactivo. Verifique el status del alumno");
		ApiErrors errors= new ApiErrors(mensaje,detalles, HttpStatus.BAD_REQUEST,LocalDateTime.now());
		
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errors);
				
	}
	
}
