package br.com.protazio;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ContatosControle {
	
	private static final ArrayList<Contato> LISTA_CONTATOS = new ArrayList<>();
	
	static {
		LISTA_CONTATOS.add(new Contato("1", "Maria", "+55 71 0000 000"));
		LISTA_CONTATOS.add(new Contato("2", "João", "+55 71 0000 000"));
		LISTA_CONTATOS.add(new Contato("3", "Mady", "+55 71 0000 000"));
		LISTA_CONTATOS.add(new Contato("4", "Bernardo", "+55 71 0000 000"));
		LISTA_CONTATOS.add(new Contato("5", "Franklin", "+55 71 0000 000"));
	}
		
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/contatos")
	public ModelAndView listar() {
		ModelAndView modelAndView = new ModelAndView("Listar");
		
		modelAndView.addObject("contatos" , LISTA_CONTATOS );
		
		return modelAndView;
	}
	
}
