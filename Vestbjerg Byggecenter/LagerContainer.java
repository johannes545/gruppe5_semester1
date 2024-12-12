import java.util.ArrayList;
/**
 * Write a description of LagerContainer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LagerContainer {
    public ArrayList<Lager> lager;
    private static LagerContainer instance;
    
public LagerContainer(){
    lager = new ArrayList<>();
}

public static LagerContainer getInstance(){
    if(instance == null){
        instance = new LagerContainer();
    }
    return instance;
}

public void addProduktLokation(Lager newProduktLokation){
    lager.add(newProduktLokation);
}

public void removeProduktLokation(String produktLokation){
    for(int i = 0; i<lager.size();i++){
            if(lager.get(i).getProduktLokation().equals(produktLokation)){
                lager.remove(i);
                break;
            }
        }
}

public Lager findProduktLokation(String produktLokation){
    for(Lager pl : lager){
        if(pl.getProduktLokation() == produktLokation){
            return pl;
        }
    } return null;
}
public void createTestData(){
    lager.add(new Lager("hylde 1",5000));
    lager.add(new Lager("hylde 2", 100));
    lager.add(new Lager("hylde 5",1));
}

public ArrayList<Lager> getLager(){
        return lager;
    }
}
