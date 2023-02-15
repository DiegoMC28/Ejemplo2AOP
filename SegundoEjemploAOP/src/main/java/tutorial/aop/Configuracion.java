/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 *
 * @author DIEGO
 */

//Esta clase no lelva codigo simplemente lleva tres anotaciones 
//para decirle qe utilizamos programacion orientada a aspectos y donde debe de ir a buscar los aspectos

@Configuration // Indica que esto es un archivo de configuracion
@EnableAspectJAutoProxy // Habilita en nuestro proyecto la funcionabilidad de la AOP
@ComponentScan("tutorial.aop") // Le dice donde tiene que buscar los apectos en este caso el paquete aop
public class Configuracion {
    
    
    
    
}
