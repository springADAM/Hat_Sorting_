package myPack;


public class Gryffondor {

        private final String[] caracteristiques = {"Intelligence","Sagesse","Érudition","Réflexion","Curiosité","Originalité","Créativité"};
        private int chances=0;

        public int calculate(Sorcier noob) {
                for(String car : caracteristiques) {
                        if(noob.getCaracteristiques().contains(car)){
                                chances++;
                        }
                }
                return (chances * 100)/7;
        }

}
