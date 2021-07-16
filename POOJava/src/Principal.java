import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Creando objeto de la cuenta bancaria
		Cuentabancaria cuenta_personal = new Cuentabancaria("Claudia Flores", 1415.16f); 
		Cuentabancaria cuenta_secundaria = new Cuentabancaria ("Claudia Flores", 1239.76f);
		//cuenta_secundaria.setSaldo (-1239.76f);
		//System.out.println(cuenta_secundaria.getSaldo());
		//Cuentabancaria cuenta_secundaria = new Cuentabancaria();
		
		/*Menú cuenta bancaria
		 * 1. Retiro
		 * 2. Deposito
		 * 3. Imprimir saldo
		 * 4. Estado de cuenta
		 * 5. Agregar beneficiario
		 * 6. Salir
		 */
		
	/*
		int opcion = 0;
		
		do {
		
		Scanner leer = new Scanner(System.in);
		System.out.println("Menú cuenta bancaria");
		System.out.println("Ingresa la opción deseada");
		System.out.println("1. Retiro");
		System.out.println("2. Deposito");
		System.out.println("3. Imprimir saldo");
		System.out.println("4. Estado de cuenta");
		System.out.println("5. Agregar beneficiario");
		System.out.println("6. Salir");
		
		opcion = leer.nextInt();
		
		switch(opcion) {
		    case 1:
              System.out.println("Ingrese la cantidad que desea retirar");
              float monto = leer.nextFloat();
              cuenta_personal.retiros(monto);
              break;
		    case 2:
	           System.out.println("Ingrese la cantidad que desea depositar");
	           float deposito = leer.nextFloat();
	           cuenta_personal.depositos(deposito);
	           System.out.println("************************");
	           break;
	        case 3:   
	           System.out.println("El monto de su saldo actual es: " +
	           cuenta_personal.consultarSaldo());
	           System.out.println("************************");
	           break;
	        case 4:
	        	System.out.println("EL beneficiario de la cuenta es: " +
	            cuenta_personal.beneficiario);
	        	break;
	         case 5:
	        	 System.out.println ("Ingrese el nombre del beneficiario");
	        	 String nombre = leer.next();
	        	 cuenta_personal.beneficiario = nombre;
	        	 break;
	           }
		
		} while(opcion !=6 );
		
		*/
		
		
		
		
		
		/*
		 
		 //Primer ejemplo 8 de Julio 2021
		
		//clase principal (padre)
		Cuentabancaria cuenta_personal = new Cuentabancaria();
		//rellenando atributos que tiene por dentro la clase
		cuenta_personal.beneficiario = "Claudia Flores";
		System.out.println("Bienvenido(a) " + cuenta_personal.beneficiario);
		System.out.println ("Ingresa monto a depósitar: ");
		Scanner leer = new Scanner(System.in);
		float deposito = leer.nextFloat();
		
		System.out.println("Ingresa monto de retiro: ");
		float retiro = leer.nextFloat();
		
		cuenta_personal.depositos(deposito);
		cuenta_personal.retiros(retiro);
		
		
		System.out.println("Tu saldo actual es: " + cuenta_personal.consultarSaldo());
		System.out.println("La operación ha sido exitosa");
		System.out.println(cuenta_personal.beneficiario);
		
		
		//clase secundaria (hijo)
		Cuentabancaria cuenta_papa = new Cuentabancaria();
		cuenta_papa.beneficiario = "Arturo";
		System.out.println(cuenta_papa.beneficiario);
		*/

	}
 
}
