package myPack;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
public class Sorcier {
    private String nom,prenom;
    private ArrayList<String> caracteristiques = new ArrayList<String>();
    private String House = null;
    private Baguette bg;
ImageIcon ico;
    public Sorcier(String nom , String prenom , Baguette bg){
        this.nom = nom;
        this.prenom= prenom;
        this.bg=bg;
    }

    public void getMorals(){

        if(JOptionPane.showConfirmDialog(null,"Courage")==0 ) caracteristiques.add("Courage");
        if(JOptionPane.showConfirmDialog(null,"Hardiesse")==0) caracteristiques.add("Hardiesse");
        if(JOptionPane.showConfirmDialog(null,"Force")==0)caracteristiques.add("Force");
        if(JOptionPane.showConfirmDialog(null,"Bravoure")==0)caracteristiques.add("Bravoure");
        if(JOptionPane.showConfirmDialog(null,"Détermination")==0)caracteristiques.add("Détermination");
        if(JOptionPane.showConfirmDialog(null,"Dirigeants")==0)caracteristiques.add("Dirigeants");
        if(JOptionPane.showConfirmDialog(null,"Fierté")==0)caracteristiques.add("Fierté");
        if(JOptionPane.showConfirmDialog(null,"Ambition")==0)caracteristiques.add("Ambition");
        if(JOptionPane.showConfirmDialog(null,"Ruse")==0)caracteristiques.add("Ruse");
        if(JOptionPane.showConfirmDialog(null,"Dédain des règles")==0)caracteristiques.add("Dédain des règles");
        if(JOptionPane.showConfirmDialog(null,"Grandeur")==0)caracteristiques.add("Grandeur");
        if(JOptionPane.showConfirmDialog(null,"Noblesse")==0)caracteristiques.add("Noblesse");
        if(JOptionPane.showConfirmDialog(null,"Provocation")==0)caracteristiques.add("Provocation");
        if(JOptionPane.showConfirmDialog(null,"Intelligence")==0)caracteristiques.add("Intelligence");
        if(JOptionPane.showConfirmDialog(null,"Sagesse")==0)caracteristiques.add("Sagesse");
        if(JOptionPane.showConfirmDialog(null,"Érudition")==0)caracteristiques.add("Érudition");
        if(JOptionPane.showConfirmDialog(null,"Réflexion")==0)caracteristiques.add("Réflexion");
        if(JOptionPane.showConfirmDialog(null,"Curiosité")==0)caracteristiques.add("Curiosité");
        if(JOptionPane.showConfirmDialog(null,"Originalité")==0)caracteristiques.add("Originalité");
        if(JOptionPane.showConfirmDialog(null,"Créativité")==0)caracteristiques.add("Créativité");
        if(JOptionPane.showConfirmDialog(null,"Loyauté")==0)caracteristiques.add("Loyauté");
        if(JOptionPane.showConfirmDialog(null,"Patience")==0)caracteristiques.add("Patience");
        if(JOptionPane.showConfirmDialog(null,"Gentillesse")==0)caracteristiques.add("Gentillesse");
        if(JOptionPane.showConfirmDialog(null,"Sincérité")==0)caracteristiques.add("Sincérité");
        if(JOptionPane.showConfirmDialog(null,"Tolérance")==0)caracteristiques.add("Tolérance");
        if(JOptionPane.showConfirmDialog(null,"Persévérance")==0)caracteristiques.add("Persévérance");
        if(JOptionPane.showConfirmDialog(null,"Amour de la nature")==0)caracteristiques.add("Amour de la nature");
        if(JOptionPane.showConfirmDialog(null,"Modestie")==0)caracteristiques.add("Modestie");
        if(JOptionPane.showConfirmDialog(null,"Justice")==0)caracteristiques.add("Justice");
        if(JOptionPane.showConfirmDialog(null,"Fair-play")==0)caracteristiques.add("Fair-play");
        if(JOptionPane.showConfirmDialog(null,"Travail acharné")==0)caracteristiques.add("Travail acharné");

    }

    public void house_Is(int Serp,int Gryf,int Pouf,int Serd){
        int tab[]={Serp,Gryf,Pouf,Serd};

        int max = 0;
        int compteurdesmax=0;
        for(int i =0;i<4;i++){
            if(max< tab[i]){
                max= tab[i];
            compteurdesmax++;
            System.out.println(max + " "+compteurdesmax);
            }
        }


        if(compteurdesmax==1){
            if(max==Serp){
                ico = new ImageIcon("Slytherin.png");
                JOptionPane.showMessageDialog(null,getNom()+" "+getPrenom()+" Your house is Serpentard","House",JOptionPane.INFORMATION_MESSAGE,ico);
             House = "Serpentard";
            }if(max==Gryf){
                ico = new ImageIcon("Gryffondor.png");
                JOptionPane.showMessageDialog(null,getNom()+" "+getPrenom()+" Your house is Gryffondor","House",JOptionPane.INFORMATION_MESSAGE,ico);
                House = "Gryffondor";
            }
            if(max==Serd){
                ico = new ImageIcon("RavenClaw.png");
                JOptionPane.showMessageDialog(null,getNom()+" "+getPrenom()+" Your house is Serdaigle","House",JOptionPane.INFORMATION_MESSAGE,ico);
                House="Serdaigle";
            }
            if(max==Pouf){
                ico = new ImageIcon("Hufflepuf.png");
                JOptionPane.showMessageDialog(null,getNom()+" "+getPrenom()+" Your house is Poufsouffle","House",JOptionPane.INFORMATION_MESSAGE,ico);
                House= "Poufsouffle";
            }
        }else{
                JOptionPane.showMessageDialog(null,"Since You got chances to get to other houses ..\n you'll get to choose your house by Yourself ..\n Choose from The Following : ");
                ArrayList<String> Options = new ArrayList<String>();
                if(max==Serp){
                    Options.add("Serpentard");
                }if(max==Gryf){
                    Options.add("Gryffondor");
                }if(max==Serd){
                    Options.add("Serdaigle");
                }if(max==Pouf){
                    Options.add("Poufsouffle");
                }
                JOptionPane.showMessageDialog(null,Options);
                House = JOptionPane.showInputDialog("Enter the house you want : ");
                if(House=="Serpentard"){ico = new ImageIcon(" Slytehrin.png");
            JOptionPane.showMessageDialog(null,getNom()+" "+getPrenom()+"Your house is Serpentard","House",JOptionPane.INFORMATION_MESSAGE,ico);}
                if(House=="Gryffondor"){ico = new ImageIcon(" Gryffondor.png");
            JOptionPane.showMessageDialog(null,getNom()+" "+getPrenom()+"Your house is Gryffondor","House",JOptionPane.INFORMATION_MESSAGE,ico);}
                if(House == "Poufsouffle"){ico = new ImageIcon(" Hufflepuff.png");
            JOptionPane.showMessageDialog(null,getNom()+" "+getPrenom()+" Your house is Poufsouffle","House",JOptionPane.INFORMATION_MESSAGE,ico);}
                if(House == "Serdaigle"){ico = new ImageIcon("RavenClaw.png");
            JOptionPane.showMessageDialog(null,getNom()+" "+getPrenom()+" Your house is Serdaigle","House",JOptionPane.INFORMATION_MESSAGE,ico);}

        }
     }







    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public ArrayList<String> getCaracteristiques() {
        return caracteristiques;
    }

    public void setCaracteristiques(ArrayList<String> caracteristiques) {
        this.caracteristiques = caracteristiques;
    }

    public String getHouse() {
        return House;
    }

    public void setHouse(String house) {
        House = house;
    }

    public Baguette getBg() {
        return bg;
    }

    public void setBg(Baguette bg) {
        this.bg = bg;
    }



}
