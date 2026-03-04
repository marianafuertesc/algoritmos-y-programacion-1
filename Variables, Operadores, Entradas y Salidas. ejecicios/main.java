//declarar perfile de una persona
//nombre = string, edad = int, estatura = double, estudiante = boolean

 public class main{
   public static void main (string[] args {
    scanner sc = new scanner(system.in);
	
// declaracion variables

  string nombre;
  int edad;
  double estatura;
  boolean estudiante;
  
 // pedir datos al user
 
 system.out.print("ingrese su nombre: ");
 nombre = sc.nextLine();
 
 system.out.print("ingrese su edad: ");
 edad = sc.nextInt();
 
 system.out.print("ingrese su estatura(m): ");
 estatura = sc.nextDouble();
 
 system.out.print("es estudiante? (true/false): ");
 esEstudiante = sc.nextBoolean();
 
 //mostrar informacion
  
  system.out.println("nombre: " + nombre);
  system.out.println(nombre "tiene" + edad "años");
  system.out.println("mide: " + estatura " m");
  system.out.println("¿Es estudiante?: " + esEstudiante);
  
  } sc.close();
    }

  