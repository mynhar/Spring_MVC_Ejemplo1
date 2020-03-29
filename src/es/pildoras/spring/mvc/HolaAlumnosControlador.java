package es.pildoras.spring.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sun.net.httpserver.HttpServer;

@Controller
public class HolaAlumnosControlador {
	
	@RequestMapping("/muestraFormulario") // Peticion de URL. Pide al servidor el formulario...
	public String muestraFormulario() {// proporciona el formulario
		
		return "HolaAlumnosFormulario";
	}
	
	@RequestMapping("/procesarFormulario")
	public String procesarFormulario() {
		return "HolaAlumnosSpring";
		
	}
	
	
	@RequestMapping("/procesarFormulario2")
	public String otroProcesoFormulario(HttpServletRequest request, Model modelo) {
		
		// Leer la informacion del cuadro de texto...JSP
		String nombre = request.getParameter("nombreAlumno");// nombre del cuadro de texto, en el formulario.
		
		nombre+=" es el mejor alumno";
		
		String mensajeFinal="Quien es el mejor alumno? "+nombre;
		
		// agregando info al modelo.		
		modelo.addAttribute("mensajeClaro", mensajeFinal);// Nombre Identificativo. 
		
		return "HolaAlumnosSpring";
		
	}
	
	@RequestMapping("/procesarFormulario3")
	public String otroProcesoFormulario(@RequestParam("nombreAlumno") String nombre, Model modelo) {
		
		// Leer la informacion del cuadro de texto...JSP
		// nombre del cuadro de texto, en el formulario.
		
		nombre+=" esta usando @RequestParam";
		
		String mensajeFinal="Quien es el mejor alumno? "+nombre;
		
		// agregando info al modelo.		
		modelo.addAttribute("mensajeClaro", mensajeFinal);// Nombre Identificativo. 
		
		return "HolaAlumnosSpring";
		
	}
}
