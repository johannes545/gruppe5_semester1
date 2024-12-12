
/**
 * Write a description of MedarbejderController here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MedarbejderController {
    private MedarbejderContainer medarbejderContainer;
    
    public MedarbejderController(){
        this.medarbejderContainer = MedarbejderContainer.getInstance();
    }
    
    public void addMedarbejder(Medarbejder medarbejder){
        medarbejderContainer.addMedarbejder(medarbejder);
    }
    
    public void removeMedarbejder(String id){
        medarbejderContainer.removeMedarbejder(id);
    }
    
    public Medarbejder findMedarbejder(String id){
        return medarbejderContainer.findMedarbejder(id);
    }
    
    public void showAllMedarbejder(){
        for(Medarbejder m : medarbejderContainer.getMedarbejder()){
            System.out.println("ID: " + m.getId() + ", navn: " + m.getNavn() +
            ", rolle:" + m.getRolle());
        }
    }
    
    public void createTestData(){
        medarbejderContainer.createTestData();
    }
}
