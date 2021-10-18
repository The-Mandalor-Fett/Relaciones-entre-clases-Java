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
  private String area;
  private String cargo;
  private int ident;
  public Docente(String nombre,int edad, String sexo, String correo,String area,String cargo, int ident)
  {
    super(nombre,edad,sexo,correo);
    this.area = area;
    this.cargo = cargo;
    this.ident = ident;
  }
  @Override
  public void showData()
  {
    System.out.println("La personita es un docente");
    super.showData();//imprime los datos de la super clase
    System.out.println("Area: "+ this.area);//Datos de la clase alumno
    System.out.println("Cargo: "+ this.cargo);
    System.out.println("ID: "+ this.ident);
  }
  @Override
  protected void hablar()
  {
    System.out.println("El profesor dice: Jovenes contesten que es para hoy");
  }

    @Override
    public void Saludar()
    {
      System.out.println("El docente saluda");
    }

    @Override
    public void Instruye(Aprendiz aprendiz)
    {
      System.out.println("El docente comienza a enseñar al alumno");
      aprendiz.Escuchar();
    }

    @Override
    public void Despedida()
    {
      System.out.println("El docente se despide");
    }

    @Override
    public void Interactua()
    {
      System.out.println("El docente interactua con su computadora");
    }

    @Override
    public void Contestar(Aprendiz aprendiz)
    {
      System.out.println("El docente contesta la pregunta del alumno");
      aprendiz.Agradece();
    }

    @Override
    public void Agradecer()
    {
      System.out.println("Docente agradece");

    }

    @Override
    public void Trabajar()
    {
      System.out.println("El profesor califica trabajos");
    }
    public void Preguntar(Aprendiz aprendiz)
    {
      System.out.println("El profesor pregunta algo relacionado con el tema");
      aprendiz.Participar(this);
    }

}
