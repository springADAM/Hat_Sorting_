package myPack;

import javax.swing.JOptionPane;

public class MClass {

    public static void main(String[] args){

        JOptionPane.showMessageDialog(null,"---------------- Welcome to Hogwarts ----------------");
        Baguette bg = new Baguette("Wood",JOptionPane.showInputDialog("Who had your magic stick before you ?"));
        Sorcier noob = new Sorcier(JOptionPane.showInputDialog("Votre nom : "),JOptionPane.showInputDialog("Votre prenom"),bg);

        JOptionPane.showMessageDialog(null,"we will choose your house depending on your morals and ethics");
        JOptionPane.showMessageDialog(null,"Wear the Hat and good luck finding the house that fits you ");

        noob.getMorals();



        noob.house_Is(new Serpentard().calculate(noob),new Gryffondor().calculate(noob),new Poufsouffle().calculate(noob),new Serdaigle().calculate(noob));


    }

}
