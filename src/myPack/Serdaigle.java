package myPack;


public class Serdaigle {

    private final String[] caracteristiques = {"Courage","Hardiesse","Force","Bravoure","Détermination"};
    private int chances=0;

    public int calculate(Sorcier noob) {
        for(String car : caracteristiques) {
            if(noob.getCaracteristiques().contains(car)){
                chances++;
            }
        }
        return (chances * 100)/5;
    }
}
