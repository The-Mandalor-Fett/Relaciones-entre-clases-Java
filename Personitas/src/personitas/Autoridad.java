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
      System.out.println("La autoridad saluda");
    }

    @Override
    public void Despedida()
    {
      System.out.println("La autoridad se despide");
    }

    @Override
    public void Interactua()
    {
      System.out.println("La autoridad interactua con sus archivos");
    }

    @Override
    public void Agradecer()
    {
      System.out.println("La autoridad agradece");
    }

    @Override
    public void Trabajar()
    {
      System.out.println("El docente trabaja");
    }
    @Override
    public void Ventanilla(Aprendiz aprendiz)
    {
      System.out.println("Ventanilla le contesta amablemente :)");
      System.out.println("Chingas tu madre, chingas a toda tu pvta madre de ti");
      aprendiz.Agradecer(this);
    }

    @Override
    public void Instruye(Aprendiz aprendiz) {

    }

    @Override
    public void Contestar(Aprendiz aprendiz) {

    }

}
