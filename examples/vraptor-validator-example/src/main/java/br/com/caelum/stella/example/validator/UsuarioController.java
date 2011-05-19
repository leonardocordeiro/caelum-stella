package br.com.caelum.stella.example.validator;

import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;
import br.com.caelum.vraptor.view.Results;

/**
 * @author Mario Amaral
 */
@Resource
public class UsuarioController {
	
	private Validator validator;
	

	public UsuarioController(Validator validator) {
		super();
		this.validator = validator;
	}

	public void formulario(){
	}
	
    public void cadastra(Usuario usuario) {
        
    	validator.validate(usuario);
    	
    	validator.onErrorUsePageOf(UsuarioController.class).formulario();
    	
    	//adiciona o usuario
    	
    }
    
    public void ok(){
    	
    }
    
}