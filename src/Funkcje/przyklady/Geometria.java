package Funkcje.przyklady;

public class Geometria {
	
	public static double poleKwadratu(double a) {
		return a*a;
	}
	
	public static double obwodKwadratu(double a) {
		return 4*a;
	}

	public static double poleProstokata(double a, double b) {
		return a*b;
	}
	
	public static double obwodProstokata(double a, double b) {
		return 2*a + 2*b;
	}
	
	public static double poleKola(double r) {
		return Math.PI * r*r;
	}
	
	public static double obwodKola(double r) {
		return Math.PI * 2*r;
	}
	
	public static double poleTrojkata(double a, double b, double c) {
		double p = obwodTrojkata(a, b, c) / 2;
		return Math.sqrt(p*(p-a)*(p-b)*(p-c));
	}
	
	public static double obwodTrojkata(double a, double b, double c) {
		return a + b + c;
	}
}
