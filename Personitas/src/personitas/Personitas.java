/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package personitas;

/**
 *
 * @author david
 */
public class Personitas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
      System.out.println("Bienvenido al progama de personitas");
      System.out.println("Este programa mostrará algunas personitas");
      System.out.println("En un momento crearemos las personitas a mostraran");
      Persona David= new Alumno("David",22,"Hombre", "alumno@alumno.ipn.mx",2020302067,"IA","3BV1");
      Persona Macario= new Docente("Macario",30, "Hombre", "Docenteguinda@ipn.mx","Básicas","Docente",2378823);
      Persona Ventanilla= new Autoridad("Dalia",29, "Mujer", "Administrativoguinda@ipn.mx","Gestión","Administrativo",2378233);
      Persona Decano= new Autoridad("Ignacio",74, "Hombre", "Autoridadguinda@ipn.mx","Dirección","Decano",230989);
      System.out.println("--------------------------------------------------");
      Decano.showData();
      ((Autoridad)(Decano)).Caminar();
      //Así se un método que no es heredaro, o sea propio de la clase
      Decano.hablar();
      System.out.println("--------------------------------------------------");
      Macario.showData();
      ((Docente)(Macario)).Caminar();
      ((Autoridad)(Decano)).Saludar();
      ((Docente)(Macario)).Saludar();
      System.out.println("--------------------------------------------------");
      David.showData();
      ((Alumno)(David)).Caminar();
      ((Alumno)(David)).Saludar((Autoridad)(Decano));//Saludamos al decano
      ((Alumno)(David)).Saludar((Docente)(Macario));//Saludamos al profesor
      David.hablar();
      System.out.println("--------------------------------------------------");
      ((Docente)(Macario)).Interactua();
      ((Docente)(Macario)).Instruye((Alumno)(David));
      ((Docente)(Macario)).Preguntar((Alumno)(David));
      ((Alumno)(David)).Preguntar((Docente)(Macario));
      System.out.println("--------------------------------------------------");
      System.out.println("La clase acaba");
      ((Alumno)(David)).Despedirse((Docente)(Macario));
      System.out.println("--------------------------------------------------");
      Ventanilla.showData();
      ((Alumno)(David)).Caminar();
      ((Alumno)(David)).Saludar((Autoridad)(Ventanilla));
      ((Alumno)(David)).Ventanilla((Autoridad)(Ventanilla));
      ((Alumno)(David)).Despedirse((Autoridad)(Ventanilla));
      System.out.println("--------------------------------------------------");
      System.out.println("Termina el día");
      ((Alumno)(David)).Despedirse((Autoridad)(Decano));
      ((Alumno)(David)).Despedirse((Docente)(Macario));
    }

}
