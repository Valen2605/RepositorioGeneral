package com.hbt.semillero.servicios;

import org.testng.Assert;
import org.testng.annotations.Test;


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
	@Test
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
	 @Test
	  public void pruebaInversionCadena(){
		  
		  String resultadoEsperado= "anitnelav";
		  
		  String resultado= invertirCadena("valentina");
		  
		  Assert.assertEquals(resultado,resultadoEsperado);
	  }
	 
	 /*
	  * Método que valida que método no recibe parámetros
	  */
	 @Test
	 public void pruebaRecibeParametros(){
		 
		 String resultadoEsperado="";
		 
		 String resultado= invertirCadena("valentina");
		 
		 Assert.assertEquals(resultado,resultadoEsperado);
		 
	 }
	 
	 /*
	  * Método que valida si la cadena retornada no es la esperada
	  */
	  
	 @Test
	  public void pruebaSonIguales(){
		  
		     String resultadoEsperado="agustin";
			 
			 String resultado= invertirCadena("valentina");
			 
			 Assert.assertNotEquals(resultado, resultadoEsperado);
		  
	  }
	 
	 /*
	  * Método que valida que la cantidad de letras sea la misma
	  */
	 @Test
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
	 @Test
	   public void pruebaSonLetras() {
		 
         String resultadoEsperado="123456";
         
		 String resultado= invertirCadena("soy valentina");
		 
		 Assert.assertEquals(resultado,resultadoEsperado);		 
	 }
	 
	 	
	//TODO
    /**
     * Pendiente hacer un método que use el método ToString de la entidad COMIC
     */

}
