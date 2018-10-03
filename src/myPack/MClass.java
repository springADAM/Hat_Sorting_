package myPack;

import javax.swing.JOptionPane;

public class MClass {

    public static void main(String[] args){

        JOptionPane.showMessageDialog(null,"---------------- Welcome to Hogwarts ----------------","Made By Bendabiza Adam",JOptionPane.INFORMATION_MESSAGE);
        Baguette bg = new Baguette("Wood",JOptionPane.showInputDialog(null,"Who had your magic stick before you ?","Made By Bendabiza Adam",JOptionPane.INFORMATION_MESSAGE));
        Sorcier noob = new Sorcier(JOptionPane.showInputDialog(null,"Votre nom : ","Made By Bendabiza Adam",JOptionPane.INFORMATION_MESSAGE),JOptionPane.showInputDialog(null,"Votre prenom","Made By Bendabiza Adam",JOptionPane.INFORMATION_MESSAGE),bg);

        JOptionPane.showMessageDialog(null,"we will choose your house depending on your morals and ethics");
        JOptionPane.showMessageDialog(null,"Wear the Hat and good luck finding the house that fits you ");

        noob.getMorals();



        noob.house_Is(new Serpentard().calculate(noob),new Gryffondor().calculate(noob),new Poufsouffle().calculate(noob),new Serdaigle().calculate(noob));


    }

}
