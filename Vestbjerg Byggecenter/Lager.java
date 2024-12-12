
/**
 * Vestbjerg Byggecenter Lager
 * 
 * @Studiegruppe 6, Johannes Wulff Andersen, Rune Løve Mark Hansen,
 * Mike Nygaard Melin Davidsen, Long Duy Nguyen, Mathias Kassow
 * @10/12/2024
 */
public class Lager {
    private String produktLokation;
    private int hyldeKapacitet;
    
    public Lager(String newProduktionLokation, int newLagerKapacitet){
        this.produktLokation = newProduktionLokation;
        this.hyldeKapacitet = newLagerKapacitet;
    }
// set og get for produkt lokationen
public void setProduktLokation(String newProduktLokation){
    this.produktLokation = newProduktLokation;
}

public String getProduktLokation(){
    return produktLokation;
}


//set og get for lagerkapacitet
public void setLagerKapacitet(int newLagerKapacitet){
    this.hyldeKapacitet = newLagerKapacitet;
}

public int getLagerKapacitet(){
    return hyldeKapacitet;
}

}
    
