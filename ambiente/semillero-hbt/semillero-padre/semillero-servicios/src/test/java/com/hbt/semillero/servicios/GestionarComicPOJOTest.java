package com.hbt.semillero.servicios;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.hbt.semillero.dto.ComicDTO;
import com.hbt.semillero.entidades.EstadoEnum;
import com.hbt.semillero.entidades.TematicaEnum;
import com.hbt.semillero.pojo.GestionarComicPOJO;

public class GestionarComicPOJOTest {
	
	/**
	  * Método que valida que la lista se pueda llenar
	  */
	@Test(enabled = false)
	public void crearComicDTOTest() {
		GestionarComicPOJO gestionarComicPOJO = new GestionarComicPOJO();
		gestionarComicPOJO.crearComicDTO();
		Assert.assertNotNull(gestionarComicPOJO.getListaComics());
		Assert.assertTrue(gestionarComicPOJO.getListaComics().size() != 0);//Es recomendable hacer validación con isEmpty
		Assert.assertTrue(!gestionarComicPOJO.getListaComics().isEmpty());
	}
   
	/**
	 * Metodo que valida que se invoque tres veces al método crearComic con los campos modificados
	 * para llenar la lista de comics
	 */
	@Test (enabled = false)
	public void crearComicDTOTest1() {
		
		GestionarComicPOJO gestionarComicPOJO = new GestionarComicPOJO();

		ComicDTO comicDTO = gestionarComicPOJO.crearComicDTO("101", "Captain America Corps 1-5 USA", "Panini Comics", TematicaEnum.FANTASTICO,
				"BIBLIOTECA MARVEL", 128, new BigDecimal(5000), "Phillippe Briones, Roger Stern", Boolean.FALSE, 
				 LocalDate.now(), EstadoEnum.ACTIVO, 5L);
		

		gestionarComicPOJO.agregarComicDTOLista(comicDTO);

		Assert.assertNotNull(gestionarComicPOJO.getListaComics());
		Assert.assertTrue(gestionarComicPOJO.getListaComics().size() != 0);
		Assert.assertTrue(!gestionarComicPOJO.getListaComics().isEmpty());
		

		comicDTO = new ComicDTO(); /* Se utiliza de esta manera para poder limpiar los datos que queremos 
		                              y no envíe un dato anterior en caso de que enviemos uno vacío. */

		comicDTO.setId("100");
		comicDTO.setNombre("Dragon ball Yamcha");
		comicDTO.setEditorial("Planeta Cómic");
		comicDTO.setTematica(TematicaEnum.AVENTURAS);
		comicDTO.setColeccion("Manga Shonen");
		comicDTO.setNumeroPaginas(100);
		comicDTO.setPrecio(new BigDecimal(2100));
		comicDTO.setAutores("Dragon Garow Lee");
		comicDTO.setColor(Boolean.TRUE);
		comicDTO.setFechaVenta(LocalDate.now());
		comicDTO.setEstado(EstadoEnum.ACTIVO);
		comicDTO.setCantidad(20L);

		gestionarComicPOJO.agregarComicDTOLista(comicDTO);

		Assert.assertTrue(gestionarComicPOJO.getListaComics().size() > 1);

		comicDTO = new ComicDTO();

		comicDTO.setId("100");
		comicDTO.setNombre("Dragon ball Yamcha");
		comicDTO.setEditorial("Planeta Cómic");
		comicDTO.setTematica(TematicaEnum.AVENTURAS);
		comicDTO.setColeccion("Manga Shonen");
		comicDTO.setNumeroPaginas(100);
		comicDTO.setPrecio(new BigDecimal(2100));
		comicDTO.setAutores("Dragon Garow Lee");
		comicDTO.setColor(Boolean.TRUE);
		comicDTO.setFechaVenta(LocalDate.now());
		comicDTO.setEstado(EstadoEnum.ACTIVO);
		comicDTO.setCantidad(20L);

		gestionarComicPOJO.agregarComicDTOLista(comicDTO);

		Assert.assertTrue(gestionarComicPOJO.getListaComics().size() == 3);
	}
	
	/**
	 * Método que valida que se modifica Comic
	 */
	  @Test
	  public void modificarComicDTOTest() {	
		  
		  GestionarComicPOJO gestionarComicPOJO = new GestionarComicPOJO();
		  
	  		Assert.assertTrue(gestionarComicPOJO.getListaComics().size() == 3);
	  		
		  		String nombreNuevo = "Captain America Corps 1-5 Colombia";
		  		
                
		  		gestionarComicPOJO.modificarComicDTO("2",nombreNuevo);
		  		
		  		ComicDTO comicModificado = gestionarComicPOJO.getListaComics().get(1);
	  		Assert.assertEquals(comicModificado.getNombre(), nombreNuevo);
		    
		  
	    }
	  
	  /**
		 * Método que valida que se elimina Comic
		 */
		  @Test
		  public void eliminarComicDTOTest() {
			  
			  GestionarComicPOJO gestionarComicPOJO = new GestionarComicPOJO();		  
   	  		   
  	  		  gestionarComicPOJO.eliminarComicDTO("100");
		  
		  		Assert.assertTrue(gestionarComicPOJO.getListaComics().size() == 2);	
			  
			  
		    }
	  
	  
	  
	  }
	

