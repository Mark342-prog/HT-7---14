package src;
import java.io.File;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        DataManager dm = new DataManager();
        Scanner sc = new Scanner(System.in);
        Node n = new Node(null); 
        vista v = new vista();
        double sl = 0;
        while (sl != 2) {
            v.menu();
            double sls = 0;
            try {
                sls = sc.nextDouble();
            } catch (Exception e) {
                System.out.print("eso no es un número valido o si quiera es un número ?");
            }
            if (sls == 1) {
                String arch = v.archiv();
                dm.getDataFile(arch);

            }
        }
    }
}
