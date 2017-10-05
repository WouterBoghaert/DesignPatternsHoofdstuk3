package be.vdab;
public abstract class Speelgoed {
    private double prijs;
    
    public Speelgoed(double prijs){
        if (prijs > 0){
            this.prijs = prijs;
        }
        else {
            throw new IllegalArgumentException("prijs moet groter dan nul zijn");
        }
    }    
}
