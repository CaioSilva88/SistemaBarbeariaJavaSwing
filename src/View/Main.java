/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Agendamento;
import Model.Cliente;
import Model.Servico;
import Model.Usuario;

/**
 *
 * @author Leandro
 */
public class Main {

    public static void main(String[] args){

        String nome = "Caio";
        System.out.println(nome);
        
        Servico servico = new Servico(1,"Barba",30);
        
        System.out.println(servico.getDescricao());

        Cliente cliente = new Cliente(1,"Caio,","aaaaa, 90","08870-380");
        System.out.println(cliente.getNome());
        
        Usuario usuario = new Usuario(1,"Caio,","a12345");
        System.out.println(usuario.getNome());
        Agendamento agendamento = new Agendamento(1,cliente,servico,30,"09/05/2020 09:15");
        System.out.println(agendamento.getCliente().getNome());
       

}// main static
    
    
    
    
}
