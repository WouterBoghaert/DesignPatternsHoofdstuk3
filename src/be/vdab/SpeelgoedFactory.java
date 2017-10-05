package be.vdab;
public enum SpeelgoedFactory {
    INSTANCE;
    public Speelgoed beslisCadeau(Kind kind){
        int leeftijd = kind.getLeeftijd();
        
        if (leeftijd <= 5){
            return new Pop(10);
        }
        else {
            if (leeftijd <= 12){
                return new Gezelschapsspel(20);
            }
            else {
                return new Boekenbon(25);
            }
        }
    }
}
