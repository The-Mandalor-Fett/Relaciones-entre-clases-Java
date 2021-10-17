/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personitas;

/**
 *
 * @author david
 */
public abstract class Persona//abstracto, no sabemos realmente que es, osea
//no sabemos quien es la persona
{
  //Una persona tiene su nombre, edad, sexo, y posiblemente
  //un Correo
  protected String nombre;
  protected int edad;
  protected String sexo;
  protected String correo;
  public Persona()//constructor
  {
    this.nombre = nombre;
    this.edad = edad;
    this.sexo = sexo;
    this.correo = correo;
  }
  public void showData()//método mostrar datos(no abstracto)
  {
    System.out.println("Datos de la personita");
    
  }

}
