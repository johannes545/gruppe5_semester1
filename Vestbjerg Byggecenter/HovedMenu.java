import java.util.Scanner;
/**
 * Write a description of HovedMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HovedMenu {
    private static Scanner scanner = new Scanner(System.in);
    private static ProduktController produktController = new ProduktController();
    private static MedarbejderController medarbejderController = new MedarbejderController();
    private static LagerController lagerController = new LagerController();
    
    
    public static void main(String[] args){
        int valg;
        do{
            System.out.println("Hovedmenu");
            System.out.println("1. Produkt Menu");
            System.out.println("2. Medarbejder Menu");
            System.out.println("3. Lager Menu");
            System.out.println("4. Afslut");
            System.out.println("vælg en option: ");
            valg = scanner.nextInt();
            scanner.nextLine(); // for at fjerne newline tegn
        }
    }
}
