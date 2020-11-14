/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Helper.LoginHelper;
import Model.DAO.UsuarioDAO;
import Model.Usuario;
import View.Login;
import View.MenuPrincipal;

public class LoginController {
    
    private final Login view;
    private LoginHelper helper;

    
    
    public void entrarNoSistema(){
        
        // pegar o usuario da view
        // pesquisar usuario no bd 
        // se usuario == usuario BD, redireciona para o menu
        // se não, mostrar um mensagem ao usuario
        
       Usuario usuario =  helper.obterModelo();
       
       UsuarioDAO usuarioDAO = new UsuarioDAO();
       Usuario usuarioAutenticado = usuarioDAO.selectPorNomeESenha(usuario);
       
       if(usuarioAutenticado!= null){
           MenuPrincipal menu = new MenuPrincipal();
           menu.setVisible(true); // abre view menu
           this.view.dispose(); // fecha view login
           //navegar para menu principal
           
       }else{
           // exibe mensagem 
           view.exiberMensagem("Usuario ou senha inválidos");
       }
        
        
    }// fim entrar no sistema
    
    
    public LoginController(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }
    
    
    public void fizTarefa(){
        
        System.out.println("Busquei algo do BD"); 
        
        this.view.exiberMensagem("Executei o fiz tarefa");
        
    }
    
    
    
}// fim
