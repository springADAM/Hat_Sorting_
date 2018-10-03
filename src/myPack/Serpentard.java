package myPack;

public class Serpentard {

    private final String caracteristiques[] = {"Dirigeants","Fierté","Ambition","Ruse","Dédain des règles","Grandeur","Noblesse","Provocation"};
    private int chances=0;

    public int calculate(Sorcier noob) {
        for(String car : caracteristiques) {
            if(noob.getCaracteristiques().contains(car)){
                chances++;
            }
        }
        return (chances * 100)/8;
    }
}
