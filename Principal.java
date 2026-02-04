import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        
        LocalDateTime ahora = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println("Fecha y hora actual: " + ahora.format(formato));

        public static Usuario[] crearArrayUsuarios(int numero) {
	        Scanner sc = new Scanner(System.in);
	        Usuario[] usuarios = new Usuario[numero];
	        for (int i = 0; i < numero; i++) {
	            System.out.println("Introduce los datos del usuario " + (i + 1));
	            System.out.print("Nombre: ");
	            String nombre = sc.nextLine();
	            System.out.print("Apellidos: ");
	            String apellidos = sc.nextLine();
	            System.out.print("Email: ");
	            String email = sc.nextLine();
	            usuarios[i] = new Usuario(nombre, apellidos, email);
	            System.out.println();
	        }
	        return usuarios;
	    }
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        System.out.print("¿Cuántos usuarios quieres introducir?: ");
	        int numero = sc.nextInt();
	        sc.nextLine(); 
	        Usuario[] arrayUsuarios = crearArrayUsuarios(numero);
	        System.out.println("=== LISTA DE USUARIOS ===");
	        for (Usuario u : arrayUsuarios) {
	            System.out.println(u);
	        }
	    }

        
    }
}
