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
  //Tenemosque implementar los métodos abstractos de la clase padre y sus métodos no abstractos
  @Override
  public void showData()
  {
    System.out.println("La personita en cuestion es un alumno");
    super.showData();//desde la clase hija mandamos a imprimir de la clase padre
    System.out.println("Matrícula: "+this.matricula);
    System.out.println("Carrera: "+this.carrera);
    System.out.println("Grupo: "+this.grupo);

  }
  @Override
  public void hablar()//método abstracto
  {
    System.out.println("El alumno dice: Ya vamonos no?");
  }

    @Override
    public void Saludar(Contribuyente contribuyente)
    {
      System.out.println("El alumno saluda");
      contribuyente.Saludar();
    }

    @Override
    public void Preguntar(Docente docente)
    {
      System.out.println("El alumno pregunta algo");
      docente.Contestar(this);//llamamos desde aqui a responder
      //Parémetro que permite apuntar a un método en particular
    }

    @Override
    public void Responder(Docente docente)
    {
      System.out.println("El alumno responde la pregunta del profesor");
      docente.Agradecer();
    }

    @Override
    public void Participar(Docente docente)
    {
      System.out.println("El alumno responde");
      docente.Agradecer();
    }

    @Override
    public void Escuchar()
    {
      System.out.println("El alumno escucha la clase y toma notas");
    }

    @Override
    public void Despedirse(Contribuyente contribuyente)
    {
      System.out.println("El alumno se despide");
      contribuyente.Despedida();
    }

    @Override
    public void Ventanilla(Autoridad autoridad)
    {
      System.out.println("El alumno pregunta algo a ventanilla");
      autoridad.Ventanilla(this);
    }

    @Override
    public void Agradecer(Contribuyente Contribuyente) {
        System.out.println("El alumno agradece");
    }
    public void Caminar()
    {
      System.out.println("El alumno camina a la escuela");
    }




}
