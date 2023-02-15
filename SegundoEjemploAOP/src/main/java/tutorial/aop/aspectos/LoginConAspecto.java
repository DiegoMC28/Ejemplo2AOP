/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial.aop.aspectos;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


/**
 *
 * @author DIEGO
 */
@Aspect
@Component
@Order(2)
public class LoginConAspecto {
    
    //Pointcut Expression
    //Son patrones qu podemos utilizar en las anotaciones que utilizamos en la aop
    //para afinar donde se aplica el aspecto
    
    //El aspecto se va a ejecutar siempre antes del metodo, este donde este este metodo
    //si tenemos el mismo metodo en varias clases el aspecto se ejecutara de forma transversal 
    //para cada uno de ellos cuando estos se ejecuten
    
   /* @Before("execution(public void insertaCliente())") //Si pongo mal el nombre el metodo el aspecto no se ejecuta
    public void antesInsertarCliente(){
        
        System.out.println("El usuario esta logeado");
        System.out.println("El perfil para insertar clientes es correcto");
        
    }*/
    
    /*@Before("execution(public void tutorial.aop.dao.ClienteVIPDAO.insertaCliente())") //Solo se ejecutara el aspecto para el cliente VIP
    public void antesInsertarCliente(){
        
        System.out.println("El usuario esta logeado");
        System.out.println("El perfil para insertar clientes es correcto");
        
    }*/
    
    /*@Before("execution(public void insertaCliente*())") //Se ejecuta sobre todos los metodos que empiecen por insertaCliente
    public void antesInsertarCliente(){
        
        System.out.println("El usuario esta logeado");
        System.out.println("El perfil para insertar clientes es correcto");
        
    }*/
    
    /*@Before("execution(public * insertaCliente*())") //Se ejecutara tambien indepedientemente de lo que retorne el metodo
    public void antesInsertarCliente(){
        
        System.out.println("El usuario esta logeado");
        System.out.println("El perfil para insertar clientes es correcto");
        
    }*/
    
    
    //Parametros
    //Para un parametro
    /*@Before("execution(public * insertaCliente*(tutorial.aop.Cliente))") //Le tenemos que indicar la ruta a la clase del parametro que vamos a pasar
    public void antesInsertarCliente(){
        
        System.out.println("El usuario esta logeado");
        System.out.println("El perfil para insertar clientes es correcto");
        
    }*/
    
    /*@Before("execution(public * insertaCliente*(tutorial.aop.Cliente, ..))") //Poner dos puntos para recibir varios parametros
    public void antesInsertarCliente(){
        
        System.out.println("El usuario esta logeado");
        System.out.println("El perfil para insertar clientes es correcto");
        
    }*/
    
    /*@Before("execution(public * insertaCliente*(..))") //Ahora recibira cualquier parametro o ninguno
    public void antesInsertarCliente(){
        
        System.out.println("El usuario esta logeado");
        System.out.println("El perfil para insertar clientes es correcto");
        
    }*/
    
    //Reutilizacion de Pointcut Expressions
    
    /*@Pointcut("execution(public * insertaCliente*(..))")
    private void paraClientes(){}
    
    @Before("paraClientes()") 
    public void antesInsertarCliente(){
        
        System.out.println("El usuario esta logeado");
        System.out.println("El perfil para insertar clientes es correcto");
        
    }
    
    @Before("paraClientes()")
    public void requisitosCliente(){
        
        System.out.println("El cliente cumple los requisitos");
        
    }
    
    @Before("paraClientes()")
   public void requisitosTabla(){
       
        System.out.println("Hay menos de 3000 registros.Puede insertar el cliente en la tabla");
        
    }*/
   
   //Ordenacion de aspectos
   //Para ordenar su ejecucion se utiliza la anotacion @Order
   //pero solo funciona en clases y no en metodos por eso ahora separamos
   //nuestros tres metodos en tres clases diferentes
    
    @Pointcut("execution(public * insertaCliente*(..))")
    public void paraClientes(){}
    
    @Before("paraClientes()") 
    public void antesInsertarCliente(){
        
        System.out.println("El usuario esta logeado");
        System.out.println("El perfil para insertar clientes es correcto");
        
    }
    
   
    
}
