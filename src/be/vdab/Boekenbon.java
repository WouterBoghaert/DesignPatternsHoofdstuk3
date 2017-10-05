package be.vdab;
public class Boekenbon extends Speelgoed {
    public Boekenbon(double prijs){
        super(prijs);
    }
    
    @Override
    public String toString(){
        return "boekenbon";
    }
}
