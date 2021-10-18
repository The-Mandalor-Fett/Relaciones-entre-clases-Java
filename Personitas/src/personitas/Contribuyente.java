/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package personitas;

/**
 *
 * @author david
 */
public interface Contribuyente
{
  public void Saludar ();//slauda ya sea a una autoridad o alumno
  public void Instruye(Aprendiz aprendiz);//Enseña a un alumno
  public void Despedida();//Se despide ya sea de una autoridad o alumno
  public void Interactua();//Interactua con algo
  public void Contestar(Aprendiz aprendiz);//Contesta una pregunta a un alumno ventanilla contesta algo
  public void Agradecer();//Agradece la atención
  public void Trabajar();//La autoridad y profesor trabajan de forma distinta
  public void Ventanilla(Aprendiz aprendiz);
}
