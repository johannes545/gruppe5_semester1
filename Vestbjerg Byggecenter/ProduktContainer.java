import java.util.ArrayList;
/**
 * Write a description of ProduktContainer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ProduktContainer {
    // en ArrayList der indeholder vores Produkt objekter
    private ArrayList<Produkt> produkter;
    // for at lave vores container til en singleton. så der kun er 1 Container
    private static ProduktContainer instance;
    
    // privat konstruktor for at forhindre oprettelse af flere instanser
    public ProduktContainer(){
        produkter = new ArrayList<>();
    }
    
    // public metode til at GET den eneste instans vi har
    public static ProduktContainer getInstance(){
        if (instance == null){
            instance = new ProduktContainer();
        }
        return instance;
    }
    
    // metode til at tilføje produkter til arraylist
    public void addProdukt(Produkt newProdukt){
        produkter.add(newProdukt);
    }
    
    // metode til at fjerne produkt fra arraylist
    public void removeProdukt(String Sku){
        for(int i = 0; i<produkter.size();i++){
            if(produkter.get(i).getSku().equals(Sku)){
                produkter.remove(i);
                break;
            }
        }
            
    }
    
    public Produkt findProdukt(String Sku){
        for(Produkt produkt : produkter){
            if(produkt.getSku().equals(Sku)){
                return produkt;
            }
        }
        return null;
    }
    
    public void createTestData(){
        produkter.add(new Produkt("001","Boremaskine","Makita","mak5",
        "makita handdrill","Power tools",2800,2100,2900,20,1,"mak5Z_00-001"));
    }
    
    public ArrayList<Produkt> getProdukter(){
        return produkter;
    }
    
}
