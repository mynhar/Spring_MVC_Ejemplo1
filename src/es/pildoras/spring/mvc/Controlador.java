package es.pildoras.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * 
 * @author Harold M Bonilla L
 *
 */
@Controller
public class Controlador {
	
	@RequestMapping
	public String nuestraPagina() {
		return "paginaEjemplo";
		
	}
}
