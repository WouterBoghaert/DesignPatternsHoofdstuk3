package be.vdab;
public class KerstmanMain {
    public static void main(String[] args) {
        Kind[] kinderen = new Kind[]{new Kind("jan", 3),
        new Kind("piet",7), new Kind("elke",13)};
        
        for (Kind kind: kinderen){
            Speelgoed speelgoed = SpeelgoedFactory.INSTANCE.beslisCadeau(kind);
            System.out.println(kind.getNaam() + " " +  speelgoed);
        }
    }
}
