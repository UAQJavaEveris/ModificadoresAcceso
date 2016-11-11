/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empleado;

/**
 *
 * @author gaby
 */
public class EmpleadoApp {
     public static void main(String[] args) {
        
        Empleado empleado1=new Empleado ("Fernando", "Ureña", 23, 800);
        
        //Devolvera false, ya que 23 no es mayor que 40
        System.out.println(empleado1.plus(30));

        //Podemos acceder al atributo edad
        empleado1.edad+=20;

        //Devolvera true, ya que ahora la edad es igual a 43, haciendo que aumente el salario 30 € mas
        System.out.println(empleado1.plus(30));

        //Nos saltara un error, ya que el metodo es privado
        //empleado1.compruebaNombre();

        //Creamos un nuevo objeto con el nombre vacio
        Empleado empleado2=new Empleado ("", "Lopez", 50, 1800);

        //Devolvera false, ya que aunque la edad supere los 40 con el metodo privado definido, no nos permitira realizarlo
        System.out.println(empleado2.plus(60));
        
        //Nos saltara un error, ya que nombre no es accesible, es un atributo privado
        //empleado2.nombre="Fernando";
    }
}
