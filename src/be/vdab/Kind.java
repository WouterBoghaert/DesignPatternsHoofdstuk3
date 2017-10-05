package be.vdab;
public class Kind {
    private int leeftijd;
    private String naam;
    
    public Kind(String naam, int leeftijd){
        setNaam(naam);
        setLeeftijd(leeftijd);
    }
    
    private void setNaam(String naam){
        if (naam != null && !naam.trim().isEmpty()){
            this.naam = naam;
        }
        else {
            throw new IllegalArgumentException("naam moet ingevuld zijn");
        }
    }
    
    private void setLeeftijd(int leeftijd){
        if (leeftijd >=0 && leeftijd <= 18){
            this.leeftijd = leeftijd;
        }
        else {
            throw new IllegalArgumentException("dit is geen correcte leeftijd voor een kind");
        }
    }
    
    public String getNaam(){
        return naam;
    }
    
    public int getLeeftijd(){
        return leeftijd;
    }
}
