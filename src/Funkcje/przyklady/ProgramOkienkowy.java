package Funkcje.przyklady;

import javax.swing.*;
import java.util.Random;

public class ProgramOkienkowy {

	public static void main(String[] args) {
		Random random = new Random();
		
		String[] figury = {"kwadrat", "koło", "prostokąt", "trójkąt"};
		int poczatkowyWybor = random.nextInt(figury.length);
		
		String figura = (String)JOptionPane.showInputDialog(
				null,
				"Wybierz rodzaj figury",
				"Wybór",
				JOptionPane.QUESTION_MESSAGE,
				null,
				figury,
				figury[poczatkowyWybor]);

		if(figura == null) {
			return;
		}
		switch(figura) {
			case "kwadrat" -> {
				double a = Double.parseDouble(JOptionPane.showInputDialog("Podaj długość boku:"));
				double pole = Geometria.poleKwadratu(a);
				double obwod = Geometria.obwodKwadratu(a);
				JOptionPane.showMessageDialog(null, "Pole: " + pole + "\nObwód: " + obwod);
			}
			case "koło" -> {
				double r = Double.parseDouble(JOptionPane.showInputDialog("Podaj promień koła:"));
				double pole = Geometria.poleKola(r);
				double obwod = Geometria.obwodKola(r);
				JOptionPane.showMessageDialog(null, "Pole: " + pole + "\nObwód: " + obwod);
			}
			case "prostokąt" -> {
				double a = Double.parseDouble(JOptionPane.showInputDialog("Podaj długość 1. boku:"));
				double b = Double.parseDouble(JOptionPane.showInputDialog("Podaj długość 2. boku:"));
				double pole = Geometria.poleProstokata(a, b);
				double obwod = Geometria.obwodProstokata(a, b);
				JOptionPane.showMessageDialog(null, "Pole: " + pole + "\nObwód: " + obwod);
			}
			case "trójkąt" -> {
				double a = Double.parseDouble(JOptionPane.showInputDialog("Podaj długość 1. boku:"));
				double b = Double.parseDouble(JOptionPane.showInputDialog("Podaj długość 2. boku:"));
				double c = Double.parseDouble(JOptionPane.showInputDialog("Podaj długość 3. boku:"));
				double pole = Geometria.poleTrojkata(a, b, c);
				double obwod = Geometria.obwodTrojkata(a, b, c);
				JOptionPane.showMessageDialog(null, "Pole: " + pole + "\nObwód: " + obwod);
			}
		}
	}

}
