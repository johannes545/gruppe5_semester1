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
            
            switch(valg){
                case 1:
                    produktMenu();
                    break;
                case 2:
                    medarbejderMenu();
                    break;
                case 3:
                    lagerMenu();
                    break;
                case 4:
                    System.out.println("Afslutter programmet...");
                    break;
                default:
                    System.out.println("Ugyldigt valg, prøv igen.");
            }
        } while (valg != 4);
    }
    
    public static void produktMenu(){
        int valg;
        do{
            System.out.println("\nProdukt Menu:");
            System.out.println("1. Tilføj produkt");
            System.out.println("2. Fjern produkt");
            System.out.println("3. Find produkt");
            System.out.println("4. Vis alle produkter");
            System.out.println("5. Gå tilbage til hovedmenu");
            System.out.println("Vælg en funktion via tallene 1 til 5");
            valg = scanner.nextInt();
            scanner.nextLine(); // for at fjerne newline tegn.
            
            switch(valg){
                case 1:
                    System.out.println("indtast produktID på produktet: ");
                    String produktId = scanner.nextLine();
                    System.out.println("indtast produkt navnet for produktet");
                    String produktNavn = scanner.nextLine();
                    System.out.println("indtast fabrikanten for produktet");
                    String fabrikant = scanner.nextLine();
                    System.out.println("indtast modellen på produktet");
                    String model = scanner.nextLine();
                    System.out.println("indtast SKU for produktet: ");
                    String sku = scanner.nextLine();
                    System.out.println("indtast en beskrivelse for produktet");
                    String beskrivelse = scanner.nextLine();
                    System.out.println("indtast en kategori for produktet");
                    String kategori = scanner.nextLine();
                    System.out.println("indtast en salgpris for produktet");
                    int salgspris = scanner.nextInt();
                    System.out.println("indtast en indkøbspris for produktet");
                    int indkøbspris = scanner.nextInt();
                    System.out.println("indtast en vejledende salgs pris for produktet");
                    int vejledendeSalgspris = scanner.nextInt();
                    System.out.println("indtast det antal af produktet i har modtaget");
                    int antal = scanner.nextInt();
                    System.out.println("indtast supplier id'et for produktet");
                    int supplierId = scanner.nextInt();
                    Produkt produkt = new Produkt(produktId,produktNavn,fabrikant,
                    model,beskrivelse,kategori,salgspris,indkøbspris,
                    vejledendeSalgspris,antal,supplierId,sku);
                    produktController.addProdukt(produkt);
                    System.out.println("Produkt tilføjet!");
                    break;
                
                case 2:
                    System.out.println("vi har kun implementeret tilføj menuen. vælg den");
                    break;
                case 3: 
                    System.out.println("vi har kun implementeret tilføj menuen. vælg den");
                    break;
                case 4:
                    System.out.println("vi har kun implementeret tilføj menuen. vælg den");
                    break;
                case 5:
                    System.out.println("vi har kun implementeret tilføj menuen. vælg den");
                    break;
                default:
                    System.out.println("vi har kun implementeret tilføj menuen. vælg den");
                    
            }
        } while(valg != 5);
    }
    
    public static void medarbejderMenu(){
        System.out.println("vi har ikke implementeret dette");
    }
    
    public static void lagerMenu(){
        System.out.println("vi har ikke implementeret dette");
    }
}
