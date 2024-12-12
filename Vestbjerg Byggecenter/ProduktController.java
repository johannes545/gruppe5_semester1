
/**
 * Write a description of ProduktController here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ProduktController {
    private ProduktContainer produktContainer;
    
    public ProduktController(){
        this.produktContainer = ProduktContainer.getInstance();
    }
    //tilføj et produkt
    
    public void addProdukt(Produkt produkt){
        produktContainer.addProdukt(produkt);
    }
    
    public void removeProdukt(String Sku){
        produktContainer.removeProdukt(Sku);
    }
    
    public Produkt findProdukt(String Sku){
        return produktContainer.findProdukt(Sku);
    }
    
    public void showAllProdukts(){
        for(Produkt p : produktContainer.getProdukter()){
         System.out.println("SKU: " + p.getSku() + ", Navn:" + p.getProduktNavn());
    }
    
}

    public void createTestData(){
        produktContainer.createTestData();
    }
}
