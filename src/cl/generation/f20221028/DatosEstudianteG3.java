package cl.generation.f20221028;

import java.util.ArrayList;
import java.util.Scanner;

public class DatosEstudianteG3 {

	public static void main(String[] args) {
		//llamar menu
				menu();
				//opciones y contador de errores
				int opciones = 0;
				int contadorErrores = 3;
				
				//arreglo de estudiantes
				ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
				
				//inicio scanner
				  Scanner scanner = new Scanner(System.in);
				  
				//ingresar opciones erróneas
				do
				{
					System.out.println("Seleccione una opción");
					opciones = scanner.nextInt();
					
					//si la opcion es dos, salir del do-while
					if(opciones == 2)
					{
						System.out.println("Usted ha salido del programa");
						break;
					}
					
					if(contadorErrores == 1 && opciones > 2)
					{
						System.out.println("Agotó la cantidad de intentos");
						break;
					}
					else if(opciones < 1 || opciones > 2)
					{
						contadorErrores--;
						System.out.println("Te quedan " + contadorErrores + " intentos");
					}
				}
				while(opciones < 1 || opciones > 2);
				
				//salir del menú
				if(opciones == 2 || contadorErrores < 1)
				{
					System.out.println("Adiós");
				}
				
				//ingreso de opciones
				else
			    {
			      do
			      {
			    	
			        switch(opciones)
			      {
			        case 1:
			        	//instancia al objeto estudiante
						Estudiante estudiante = new Estudiante();
						
						System.out.println("Ingrese nombre");
						String nombre = scanner.next(); //lee toda la línea
						System.out.println("Ingrese apellido");
						String apellido = scanner.next();
						System.out.println("Ingrese edad");
						Integer edad = scanner.nextInt();
						System.out.println("Ingrese correo");
						String correo = scanner.next();
						System.out.println("Ingrese rut");
						String rut = scanner.next();
						System.out.println("Ingrese curso");
						String curso = scanner.next();
						System.out.println("Ingrese telefono");
						Integer telefono = scanner.nextInt();
						
						estudiante.setNombre(nombre);
						estudiante.setApellido(apellido);
						estudiante.setEdad(edad);
						estudiante.setCorreo(correo);
						estudiante.setRut(rut);
						estudiante.setCurso(curso);
						estudiante.setTelefono(telefono);
						estudiantes.add(estudiante);
						
			          break;
			        default:
						System.out.println("Opción no válida");
			          
			      }
			        System.out.println("Seleccione una opción");
			        System.out.println("(1) Ingresar estudiante  (2) Salir y mostrar estudiantes ingresados");
						opciones = scanner.nextInt();
			      }
			      while(opciones == 1);  for(Estudiante estudiante : estudiantes)
			      {
			    	  System.out.println("Nombre: "+estudiante.getNombre());
			    	  System.out.println("Apellido: "+estudiante.getApellido());
			    	  System.out.println("Rut: "+estudiante.getRut());
			    	  System.out.println("Edad: "+estudiante.getEdad());
			    	  System.out.println("Correo: "+estudiante.getCorreo());
			    	  System.out.println("Telefono: "+estudiante.getTelefono());
			    	  System.out.println();
			      }
			      
			      //obtener un estudiante específico
			      estudiantes.get(0);
			      
			      
			    }


				//cierre scanner
				scanner.close();
				
			
				
			}
			
			
			
			public static void menu () //llamar metodo desde el main
			{
			  System.out.println("***** MENÚ *****");
			  System.out.println("1.-Agregar estudiante"); //todos los datos
			  System.out.println("2.-Salir");
			}


	}


