
/**
 * Vestbjerg Byggecenter Medarbejder
 * 
 * @Studiegruppe 6, Johannes Wulff Andersen, Rune Løve Mark Hansen,
 * Mike Nygaard Melin Davidsen, Long Duy Nguyen, Mathias Kassow
 * @10/12/2024
 */
public class Medarbejder {

    private String navn;
    private int alder;
    private String addresse;
    private int postnummer;
    private String id;
    private String rolle;

    
    public Medarbejder(String newName, int newAlder, String newAddresse,
    int newPostnummer, String newId, String newRolle){
        this.navn = newName;
        this.alder = newAlder;
        this.addresse = newAddresse;
        this.postnummer = newPostnummer;
        this.id = newId;
        this.rolle = newRolle;
    }
//set og get for navn
public void setNavn(String newNavn){
    this.navn = newNavn;
}

public String getNavn(){
    return navn;
}


//set og get for alder
public void setAlder(int newAlder){
    this.alder = newAlder;
}

public int getAlder(){
    return alder;
}


//set og get for addresse
public void setAddresse(String newAddresse){
    this.addresse = newAddresse;
}

public String getAddresse(){
    return addresse;
}


//set og get for postnummer
public void setPostnummer(int newPostnummer){
    this.postnummer = newPostnummer;
}

public int getPostnummer(){
    return postnummer;
}


//set og get for id
public void setId(String newId){
    this.id = newId;
}

public String getId(){
    return id;
}


//set og get for rolle
public void setRolle(String newRolle){
    this.rolle = newRolle;
}

public String getRolle(){
    return rolle;
}
}
