/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial.aop.dao;

import org.springframework.stereotype.Component;
import tutorial.aop.Cliente;

/**
 *
 * @author DIEGO
 */
@Component
public class ClienteDAO {
    
    //Pointcut Expressions
    /* public void insertaCliente(){
        
        System.out.println("Se inserto el cliente correctamente");
        
    }*/
    
    /*public String insertaCliente(){
        
        System.out.println("Se inserto el cliente correctamente");
        
        return "Cliente insertado correctamente";
        
    }*/
    
    //Parametros
    public void insertaCliente(Cliente cliente, String tipo){
        
        System.out.println("Se inserto el cliente correctamente");
        
    }
    
}
