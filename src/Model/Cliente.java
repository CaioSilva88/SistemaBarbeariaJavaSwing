/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;



public class Cliente extends Pessoa{
    
   
   protected String endereco;
   protected String cep;

    public Cliente(int id, String nome, char sexo, String dataNasc,String telefone,String email,String rg, String endereco, String cep){
        super(id, nome, sexo, dataNasc, telefone, email, rg);
        this.endereco = endereco;
        this.cep = cep;
    }//construtor 1

    public Cliente(int id, String nome, String endereco, String cep ) {
        super(id, nome);
        this.endereco = endereco;
        this.cep = cep;
    }//construtor 2
    
    
    
    

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

 
@Override
public String toString(){
    return getNome();
}
   

    
    
    
    
    
    
}// fim
