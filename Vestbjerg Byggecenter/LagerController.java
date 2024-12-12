
/**
 * Write a description of LagerController here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LagerController {
    private LagerContainer lagerContainer;
    
    public LagerController(){
        this.lagerContainer = LagerContainer.getInstance();
    }
    
    public void addProduktLokation(Lager produktLokation){
        lagerContainer.addProduktLokation(produktLokation);
    }
    
    public void removeProduktLokation(String produktLokation){
        lagerContainer.removeProduktLokation(produktLokation);
    }
    
    public Lager findProduktLokation(String hyldenummer){
        return lagerContainer.findProduktLokation(hyldenummer);
    }
    
    public void showAllProduktLokationer(){
        for(Lager pl: lagerContainer.getLager()){
            System.out.println("hylde Nummer: " + pl.getProduktLokation() +
            "hylde kapacitet: " + pl.getLagerKapacitet());
        }
    }
}
