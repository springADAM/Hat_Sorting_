package myPack;


public class Poufsouffle {

    private final String caracteristiques[] = {"Loyauté","Patience","Gentillesse","Sincérité","Tolérance","Persévérance","Amour de la nature","Modestie","Justice","Fair-play","Travail acharné"};
    private int chances=0;

    public int calculate(Sorcier noob) {
        for(String car : caracteristiques) {
            if(noob.getCaracteristiques().contains(car)){
                chances++;
            }
        }
        return (chances * 100)/11;
    }

}
