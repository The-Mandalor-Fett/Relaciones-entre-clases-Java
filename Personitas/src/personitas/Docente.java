/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personitas;

/**
 *
 * @author david
 */
public class Docente extends Persona implements Contribuyente
{
  //colocamos sus propias variables
  private String area
  private String cargo
  private int ident
  public Docente(String nombre,int edad, String sexo, String correo,String area,String cargo, int ident)
  {
    super(nombre,edad,sexo);
    this.area = area;
    this.cargo = cargo;
    this.ident = ident;
  }
  @Override
  public void showData()
  {
    System.out.println("La personita es un docente");
    super.showData();//imprime los datos de la super clase
    System.out.println("Area: "+ this.Area);//Datos de la clase alumno
    System.out.println("ID: "+ this.IDen);
  }
  @Override
  protected void hablar()
  {
    System.out.println("El profesor dice: Jovenes contesten que es para hoy");  
  }

}
