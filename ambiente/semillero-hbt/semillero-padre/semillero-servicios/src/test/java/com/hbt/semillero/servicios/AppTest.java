package com.hbt.semillero.servicios;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.hbt.semillero.dto.ComicDTO;
import com.hbt.semillero.entidades.EstadoEnum;
import com.hbt.semillero.entidades.TematicaEnum;
import com.hbt.semillero.pojo.GestionarComicPOJO;


/**
 * Test unitario del semillero HBT
 * 
 * @author Valentina
 *
 */
public class AppTest {

	/**
	 * Metodo que permite validar si dada la suma de dos numero el resultado es el
	 * correcto
	 */
	@Test(enabled=false)
	public void primeraPU() {
		Long resultadoEsperado = 2159L;
		Long sumando1 = 1500L;
		Long sumando2 = 659L;
		Long resultado = sumando1 + sumando2;
		Assert.assertEquals(resultado, resultadoEsperado);
		resultadoEsperado=200L;
		Assert.assertNotEquals(resultadoEsperado, resultado);
	}

	/**
	 * 
	 * Metodo encargado de dada una cadena invertir su posicion y retornarla al
	 * revés
	 * 
	 * @param cadena
	 * @return
	 */
	private String invertirCadena(String cadena) {
		String cadenaInvertida = "";
		for (int x = cadena.length() - 1; x >= 0; x--) {
			cadenaInvertida = cadenaInvertida + cadena.charAt(x);
		}
		return cadenaInvertida;
	}
	
	/*
	 * Método que valida si cadena se ha retornado alrevés correctamente
	 */
	@Test(enabled=false)
	  public void pruebaInversionCadena(){
		  
		  String resultadoEsperado= "anitnelav";
		  
		  String resultado= invertirCadena("valentina");
		  
		  Assert.assertEquals(resultado,resultadoEsperado);
	  }
	 
	 /*
	  * Método que valida que método no recibe parámetros
	  */
	@Test(enabled=false)
	 public void pruebaRecibeParametros(){
		 
		 String resultadoEsperado="";
		 
		 String resultado= invertirCadena("valentina");
		 
		 Assert.assertEquals(resultado,resultadoEsperado);
		 
	 }
	 
	 /*
	  * Método que valida si la cadena retornada no es la esperada
	  */
	  
	@Test(enabled=false)
	  public void pruebaSonIguales(){
		  
		     String resultadoEsperado="agustin";
			 
			 String resultado= invertirCadena("valentina");
			 
			 Assert.assertNotEquals(resultado, resultadoEsperado);
		  
	  }
	 
	 /*
	  * Método que valida que la cantidad de letras sea la misma
	  */
	@Test(enabled=false)
	 public void pruebaCantidadLetras() {
		 
		 String resultadoEsperado="valentina";
		 
		 int cantidadEsperada= resultadoEsperado.length();
		 
		 String resultado= invertirCadena("valentina");
		 
		 int cantidadReal= resultado.length();
		 
		 Assert.assertEquals(cantidadEsperada,cantidadReal);
		 
	 }
	 
	 /*
	  * Método que valida que si se hayan ingresado letras
	  */
	@Test(enabled=false)
	   public void pruebaSonLetras() {
		 
         String resultadoEsperado="123456";
         
		 String resultado= invertirCadena("soy valentina");
		 
		 Assert.assertEquals(resultado,resultadoEsperado);		 
	 }
	 
	 	
	
    /**
     * Método que instancia Enum de la clase EstadoEnum
     */
	@Test(enabled=false)
	 public void pruebaInstancia(){
		 
		 EstadoEnum estado= EstadoEnum.ACTIVO;
		 
		 Assert.assertEquals(estado, EstadoEnum.ACTIVO);
	 }
	 
	 /**
	  * Método que devuelve un String con el nombre de la constante
	  */
	@Test(enabled=false)
	 public void pruebadevuelveConstante(){
		 
		 EstadoEnum estado= EstadoEnum.ACTIVO;
		 
		 String resultado= estado.name();
		 
		 Assert.assertEquals(resultado, EstadoEnum.ACTIVO);
		 
	 }
     
	 /**
	  * Método que devuelve un entero con la posición del enum 
	  */	 
	@Test(enabled=false)
	 public void pruebadevuelveEntero(){
		 
		 EstadoEnum estado= EstadoEnum.ACTIVO;
		 
		 int posicion= estado.ordinal();
		 
		 Assert.assertEquals(posicion, EstadoEnum.ACTIVO);
	 }
	 
	 /**
	  * Método que compara el enum con el parámetro 
	  */
	@Test(enabled=false)
	 public void pruebacomparaEnum(){
		 
		 EstadoEnum estado= EstadoEnum.ACTIVO;
		 
		 int resultado= estado.compareTo(estado);
		 
		 Assert.assertEquals(resultado, EstadoEnum.ACTIVO);
	 }
	 
	 /**
	  * Método que devuelve un array con todos los enum
	  */
	@Test(enabled=false)	 
	 public void pruebadevuelveArray(){
		 
		 EstadoEnum estado= EstadoEnum.ACTIVO;
		 		 
		 Assert.assertEquals(estado.values(),EstadoEnum.values());
		 
	 }
	 
	// TODO
		/**
		 * Pediente hacer un método que use el método ToString de la entidad COMIC
		 */
	 
}
