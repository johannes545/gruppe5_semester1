import java.util.ArrayList;
/**
 * Write a description of MedarbejderContainer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MedarbejderContainer {
    
    private ArrayList<Medarbejder> medarbejder;
    private static MedarbejderContainer instance;
    
    public MedarbejderContainer(){
        medarbejder = new ArrayList<>();
    }
    
    public static MedarbejderContainer getInstance(){
        if(instance == null){
            instance = new MedarbejderContainer();
        }
        return instance;
    }
    
    public void addMedarbejder(Medarbejder newMedarbejder){
        medarbejder.add(newMedarbejder);
    }
    
    public void removeMedarbejder(String id){
        for(int i = 0; i<medarbejder.size();i++){
            if(medarbejder.get(i).getId().equals(id)){
                medarbejder.remove(i);
                break;
            }
        }
    }
    
    public Medarbejder findMedarbejder(String Sku){
        for(Medarbejder m : medarbejder){
            if(m.getId().equals(Sku)){
                return m;
            }
        }
        return null;
    }
    
    public void createTestData(){
        medarbejder.add(new Medarbejder("Johannes",27,"Ditlev bergs vej",9000,
        "0054","consultant"));
        medarbejder.add(new Medarbejder("Mathias",21,"Larsens WaterFront",9000,
        "0055","head consultant"));
        medarbejder.add(new Medarbejder("Rune",24,"ikke oplyst",9000,
        "0056","consultant"));
        medarbejder.add(new Medarbejder("Mike",24,"Danmarks gade",9000,
        "0056","consultant"));
        medarbejder.add(new Medarbejder("Long",21,"skalborg",9200,
        "0057","consultant"));
    }
    
    public ArrayList<Medarbejder> getMedarbejder(){
        return medarbejder;
    }
}
