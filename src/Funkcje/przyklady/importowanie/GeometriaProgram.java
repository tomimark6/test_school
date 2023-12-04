package Funkcje.przyklady.importowanie;

import Funkcje.przyklady.Geometria;
import Funkcje.przyklady.JednostkiMiary;

import java.util.Scanner;

public class GeometriaProgram {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		petla:
		while(true) {
			System.out.println("\nWybierz figurę lub operację:");
			System.out.println("  K  - kwadrat");
			System.out.println("  O  - koło");
			System.out.println("  P  - prostokąt");
			System.out.println("  T  - trójkąt");
			System.out.println("  KM - przelicz kilometry na mile");
			System.out.println("  MK - przelicz mile na kilometry");
			System.out.println("  CF - przelicz °C na °F");
			System.out.println("  FC - przelicz °F na °C");
			System.out.println("  Q  - zakończ");
			String wybor = scanner.next().toUpperCase();

			switch(wybor) {
				case "Q" -> {
					break petla;
				}
				case "K" -> {
					System.out.print("Podaj długość boku kwadratu: ");
					double a = scanner.nextDouble();
					double pole = Geometria.poleKwadratu(a);
					double obwod = Geometria.obwodKwadratu(a);
					System.out.printf("Dla kwadratu o boku %.3f pole wynosi %.3f, a obwód %.3f\n", a, pole, obwod);
				}
				case "O" -> {
					System.out.print("Podaj promień koła: ");
					double r = scanner.nextDouble();
					double pole = Geometria.poleKola(r);
					double obwod = Geometria.obwodKola(r);
					System.out.printf("Dla koła o promieniu %.3f pole wynosi %.3f, a obwód %.3f\n", r, pole, obwod);
				}
				case "P" -> {
					System.out.print("Podaj dwie długości boków prostokąta: ");
					double a = scanner.nextDouble();
					double b = scanner.nextDouble();
					double pole = Geometria.poleProstokata(a, b);
					double obwod = Geometria.obwodProstokata(a, b);
					System.out.printf("Dla prostokąta o bokach %.3f i %.3f pole wynosi %.3f, a obwód %.3f\n", a, b, pole, obwod);
				}
                case "T" -> {
                    System.out.print("Podaj trzy długości boków trójkąta: ");
                    double a = scanner.nextDouble();
                    double b = scanner.nextDouble();
                    double c = scanner.nextDouble();
                    double pole = Geometria.poleTrojkata(a, b, c);
                    double obwod = Geometria.obwodTrojkata(a, b, c);
                    System.out.printf("Dla prostokąta o bokach %.3f %.3f %.3f pole wynosi %.3f, a obwód %.3f\n", a, b, c, pole, obwod);
                }
                case "KM" -> {
                    System.out.print("Podaj odległość w kilometrach: ");
                    double km = scanner.nextDouble();
                    double wynik = JednostkiMiary.km_na_mile(km);
                    System.out.printf("%.3f km = %.3f mil\n", km, wynik);
                }
                case "MK" -> {
                        System.out.print("Podaj odległość w milach: ");
                        double mile = scanner.nextDouble();
                        double wynik = JednostkiMiary.mile_na_km(mile);
                        System.out.printf("%.3f mil = %.3f km\n", mile, wynik);
                }
                case "FC" -> {
                        System.out.print("Podaj temperaturę w Fahrenheitach: ");
                        double f = scanner.nextDouble();
                        double wynik = JednostkiMiary.f_na_c(f);
                        System.out.printf("%.3f °F = %.3f °C\n", f, wynik);
                }
                case "CF" -> {
                        System.out.print("Podaj temperaturę w Celsjuszach: ");
                        double c = scanner.nextDouble();
                        double wynik = JednostkiMiary.c_na_f(c);
                        System.out.printf("%.3f °C = %.3f °F\n", c, wynik);
                }
                default -> {
    					System.out.println("Nieznane polecenie " + wybor);
				}
			}
		}
		System.out.println("Dzięki, miłego dnia!");
	}

}
