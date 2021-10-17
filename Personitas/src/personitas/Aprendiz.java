/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package personitas;

/**
 *
 * @author david
 */
public interface Aprendiz
{
  //Los métodos que va a usar la clase alumno
  public void Saludar();//Pude saludar tanto al docente como a una autoridad
  public void Preguntar();//Le pregunta al docente
  public void Responder();//Le responde al docente
  public void Participar();//Participa con el docente
  public void Escuchar();//Escucha al docente
  public void Despedirse();//Se despide del docente
  public void Agradecer();
  public void Ventanilla();
  public void ResponderV();
  //Por lo que vamos a tener que usar la interfaz de docente y autoridad
  //para poder llamarlas dentro del método de alumno y estas a su ves pueden llamar
  //a un método de alumno
}
