/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial.aop.aspectos;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 *
 * @author DIEGO
 */
@Aspect
@Component
@Order(3)
public class OrdenacionAspecto2 {
    
   //Tenemos que especificar la ruta completa
   @Before("tutorial.aop.aspectos.LoginConAspecto.paraClientes()")
   public void requisitosTabla(){
       
        System.out.println("Hay menos de 3000 registros.Puede insertar el cliente en la tabla");
        
    }
}
