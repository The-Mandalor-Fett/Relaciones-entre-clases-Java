/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personitas;

/**
 *
 * @author david
 */
 //Esta clase es hida de Persona y debe implementar
 //Aprendiz según lo mostrado en la imagen
public class Alumno extends Persona implements Aprendiz
{
  //De la clase padre hereda algunas cosas como nombre, etc.
  //Pero esta calse va a tener sus propios atributos
  private int matricula;
  private String carrera;
  private String grupo;
  public Alumno(String nombre,int edad,String sexo,String correo, int matricula,String carrera,String grupo)
  {//constructor
    super(nombre,edad,sexo,correo);//De la super clase tenemos
    this.matricula = matricula;
    this.carrera = carrera;
    this.grupo = grupo;
  }
  //Tenemosque implementar los métodos abstractos de la clase padre
}
