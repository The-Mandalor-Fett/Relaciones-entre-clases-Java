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
  public void Saludar(Contribuyente contribuyente);//Pude saludar tanto al docente como a una autoridad
  public void Preguntar(Docente docente);//Le pregunta al docente
  public void Responder(Docente docente);//Le responde al docente
  public void Participar(Docente docente);//Participa con el docente
  public void Escuchar();//Escucha al docente
  public void Despedirse(Contribuyente contribuyente);//Se despide de la autoridad o docente
  public void Agradecer(Contribuyente Contribuyente);//Agradece la respuesta
  public void Ventanilla(Autoridad autoridad);//Pregunta a ventanilla
  //Por lo que vamos a tener que usar la interfaz de docente y autoridad
  //para poder llamarlas dentro del método de alumno y estas a su ves pueden llamar
  //a un método de alumno
}
