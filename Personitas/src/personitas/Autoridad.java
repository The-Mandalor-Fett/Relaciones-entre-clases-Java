/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personitas;

/**
 *
 * @author david
 */
public class Autoridad extends Persona implements Contribuyente
{
  private String area;
  private String cargo;
  private int ident;
  public Autoridad(String nombre,int edad, String sexo, String correo,String area,String cargo, int ident)
  {
    super(nombre,edad,sexo,correo);
    this.area = area;
    this.cargo = cargo;
    this.ident = ident;
  }
  @Override
  public void showData()
  {
    System.out.println("La personita es una autoridad");
    super.showData();//imprime los datos de la super clase
    System.out.println("Area: "+ this.area);//Datos de la clase alumno
    System.out.println("Cargo: "+ this.cargo);
    System.out.println("ID: "+ this.ident);
  }
  @Override
  protected void hablar()
  {
    System.out.println("La autoridad dice: Miren los nuevos lineamiento para regresar");
  }

    @Override
    public void Saludar()
    {

    }

    @Override
    public void Instruye(Alumno alumno)
    {

    }

    @Override
    public void Despedida()
    {

    }

    @Override
    public void Interactua()
    {

    }

    @Override
    public void Contestar(Alumno alumno)
    {

    }

    @Override
    public void Agradecer(Alumno alumno)
    {

    }

    @Override
    public void Trabajar()
    {

    }

}
