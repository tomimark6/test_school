package Funkcje.przyklady;

public class JednostkiMiary {
	private static final double PRZELICZNIK_KM_MILE = 1.609344;

	// https://pl.wikipedia.org/wiki/Mila_mi%C4%99dzynarodowa
	public static double mile_na_km(double mile) {
		return mile * PRZELICZNIK_KM_MILE;
	}

	public static double km_na_mile(double km) {
		return km / PRZELICZNIK_KM_MILE;
	}
	
	// Stopnie Celsjusza na Fahrenheita i odwrotnie
	// https://pl.wikipedia.org/wiki/Skala_Fahrenheita

	public static double c_na_f(double c) {
		// To jest źle, bo dzielenie 9/5 daje wynik 1
		// return 32 + 9/5 * c;
		
		// Poprawne zapisy:
		// return c * 9 / 5 + 32;
		// return 32.0 + 9.0 / 5.0 * c;
		// return 32 + 9. / 5. * c;
		return 32 + 1.8 * c;
	}

	public static double f_na_c(double f) {
		// Niepoprawne, bo 5/9 daje wynik 0
		// return 5/9 * (f - 32);
		
		// Poprawne zapisy:
		// return 5./9. * (f - 32.);
		return (f - 32) / 1.8;
	}

	public static void main(String[] args) {
		// Tutaj w main wpiszemy tylko przykładowe wywołania funkcji,
		// aby sprawdzić, czy one dobrze działają.
		// To nie jest "praktyczny program" dla użytkownika.

		System.out.println("100 mil = " + mile_na_km(100) + " km");
		System.out.println("300 mil = " + mile_na_km(300) + " km");
		System.out.println("100 km = " + km_na_mile(100) + " mil");
		System.out.println("160 km = " + km_na_mile(160) + " mil");
		System.out.printf("%.1f km = %.1f mil\n", 160.0, km_na_mile(160));
		System.out.println();

		System.out.println("  0 C = " + c_na_f(0) + " F");
		System.out.println(" 37 C = " + c_na_f(37) + " F");
		System.out.println("100 C = " + c_na_f(100) + " F");
		System.out.println();

		System.out.println("  0 F = " + f_na_c(0) + " C");
		System.out.println(" 50 F = " + f_na_c(50) + " C");
		System.out.println("100 F = " + f_na_c(100) + " C");
	}

}
