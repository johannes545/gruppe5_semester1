
/**
 * Vestbjerg Byggecenter Produkt
 * 
 * @Studiegruppe 6, Johannes Wulff Andersen, Rune Løve Mark Hansen,
 * Mike Nygaard Melin Davidsen, Long Duy Nguyen, Mathias Kassow
 * @10/12/2024
 */
public class Produkt {

    private String produktId;
    private String produktNavn;
    private String fabrikant;
    private String model;
    private String beskrivelse;
    private String kategori;
    private int salgspris;
    private int indkøbspris;
    private int vejledendeSalgspris;
    private int antal;
    private int supplierId;
    private String sku;
    
    public Produkt(String newProduktId, String newProduktNavn,
    String newFabrikant,String newModel, String newBeskrivelse,
    String newKategori, int newSalgspris, int newIndkøbspris,
    int newVejledendeSalgspris, int newAntal, int newSupplierId,
    String newSku){
        
        this.produktId = newProduktId;
        this.produktNavn = newProduktNavn;
        this.fabrikant = newFabrikant;
        this.model = newModel;
        this.beskrivelse = newBeskrivelse;
        this.kategori = newKategori;
        this.salgspris = newSalgspris;
        this.indkøbspris = newIndkøbspris;
        this.vejledendeSalgspris = newVejledendeSalgspris;
        this.antal = newAntal;
        this.supplierId = newSupplierId;
        this.sku = newSku;
        
    }
//set og get for produktId
public void setProduktId(String newProduktId){
    this.produktId = newProduktId;
}

public String getProduktId(){
    return produktId;
}

//set og get for produktNavn
public void setProduktNavn(String newProduktNavn){
    this.produktNavn = newProduktNavn;
}

public String getProduktNavn(){
    return produktNavn;
}


//set og get for fabrikant
public void setFabrikant(String newFabrikant){
    this.fabrikant = newFabrikant;
}

public String getFabrikant(){
    return fabrikant;
}


//set og get for model
public void setModel(String newModel){
    this.model = newModel;
}

public String getModel(){
    return model;
}


//set og get for beskrivelse
public void setBeskrivelse(String newBeskrivelse){
    this.beskrivelse = newBeskrivelse;
}

public String getBeskrivelse(){
    return beskrivelse;
}


//set og get for kategori
public void setKategori(String newKategori){
    this.kategori = newKategori;
}

public String getKategori(){
    return kategori;
}


//set og get for salgspris
public void setSalgspris(int newSalgspris){
    this.salgspris = newSalgspris;
}

public int getSalgspris(){
    return salgspris;
}


//set og get for indkøbspris
public void setIndkøbspris(int newIndkøbspris){
    this.indkøbspris = newIndkøbspris;
}

public int getIndkøbspris(){
    return indkøbspris;
}


//set og get for vejledende salgspris
public void setVejledendeSalgspris(int newVejledendeSalgspris){
    this.vejledendeSalgspris = newVejledendeSalgspris;
}

public int getVejledendeSalgspris(){
    return vejledendeSalgspris;
}


//set og get for antal
public void setAntal(int newAntal){
    this.antal = newAntal;
}

public int getAntal(){
    return antal;
}


//set og get for supplierID
public void setSupplierId(int newSupplierId){
    this.supplierId = newSupplierId;
}

public int getSupplierId(){
    return supplierId;
}


//set og get for SKU
public void setSku(String newSku){
    this.sku = newSku;
}

public String getSku(){
    return sku;
}
}
