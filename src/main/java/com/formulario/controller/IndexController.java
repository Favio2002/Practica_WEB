package com.formulario.controller;

import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import org.springframework.web.servlet.ModelAndView;

import com.formulario.model.Persona;

@SuppressWarnings("unused")
@Controller
//@RequestMapping("/form")
//@RequestMapping("/index")
public class IndexController {
	
	//NOMBRE DE LA PAGINA EN DONDE SE MOSTRARA LOS DATOS
	//public static final String VALORES_VIEW = "index";

	/* @GetMapping("/pasovalor") 
	    public String valoresString(Model model){
	        model.addAttribute("nombre", "Juan Perez");
	        return "index";
	    }
	 */
	 /* @GetMapping("/pasovalormav")
	    public ModelAndView valoresMaV(){
	        ModelAndView mav = new ModelAndView(VALORES_VIEW);
	        mav.addObject("nombre", "Juan");
	        return mav;
	    }
	    */
	
	
	
	
	// CLASES Y PARAMETROS
	
	//NOMBRE DE LA PAGINA EN DONDE SE MOSTRARA LOS DATOS
	/*public static final String TEMPLATE = "index2";
	
    @GetMapping("/datocomplex")
    public String datosComplejos(Model model){
        model.addAttribute("persona", new Persona("Juan", 25));
        return TEMPLATE;
    }
	*/
	
   /* @GetMapping("/datocomplexmav")
    public ModelAndView datosComplejosMav(){
        ModelAndView mav = new ModelAndView(TEMPLATE);
        mav.addObject("persona", new Persona("Maria", 30));
        return mav;
    }
    */
	
	
	
    
    //LISTAS
	/*public static final String TEMPLATE = "lista";
	
	@GetMapping("/lista")
    public String Personas(Model model) {
        model.addAttribute("personas", getPersonas());
        return TEMPLATE;
    }

    private List<Persona> getPersonas() {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Juan", 33));
        personas.add(new Persona("Maria", 23));
        personas.add(new Persona("Diego", 32));
        personas.add(new Persona("Diego", 32));

        return personas;
    }
    */
	
	//GET
	
	 //private static final String TEMPLATE_VIEW = "get";

     /*@GetMapping("/request")
     public ModelAndView getRequest(@RequestParam(name="nombre", required=false) String nombreReq){
         ModelAndView mav = new ModelAndView(TEMPLATE_VIEW);
         mav.addObject("dato_nombre", nombreReq);
         return mav;
     }
    
     //PathVariable
     
     @GetMapping("/request/{nombre}")
     public ModelAndView getRequest2(@PathVariable(name="nombre") String nombreReq ){
         ModelAndView mav = new ModelAndView(TEMPLATE_VIEW);
         mav.addObject("dato_nombre", nombreReq);
         return mav;
     }
     */
    
    //METODO POST-CON FORMULARIO PARA OBTENER DATOS Y MOSTRARLOS EN LA PAGINA
	 public static final String FORM_VIEW = "formulario";
	    public static final String RESULT_VIEW = "vista_form";

	    
	    @GetMapping(value = "/form")
	    //@RequestMapping("/form")
	    public String showForm(Model model){
	        model.addAttribute("persona", new Persona());
	        return FORM_VIEW;
	    }

	    @PostMapping(value ="/form")
	    public ModelAndView addPersona(@ModelAttribute("persona") Persona personaForm){
	        ModelAndView mav = new ModelAndView(RESULT_VIEW);
	        mav.addObject("persona", personaForm);
	        return mav;
	    }
	
}
