package src;
import java.util.Scanner;
public class vista {
    Scanner sc = new Scanner(System.in);
    public void menu() {
        System.out.print("Bienvenido al traductor de ingles y frances");
        System.out.print("1.iniciar");
        System.out.print("2. salir");
    }
    public String archiv() {
        System.out.print("Por favro ingrese el nombre del archivo con el sufijo .txt");
        String p = sc.nextLine();
        return p;
    }
}
