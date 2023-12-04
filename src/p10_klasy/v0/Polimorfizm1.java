package p10_klasy.v0;

public class Polimorfizm1 {

    public static void main(String[] args) {
   	 Osoba osoba = new Osoba("Ala", "Kowalska", 30);
   	 System.out.println(osoba);
   	 
   	 Student student = new Student("Adam", "Abacki", 21, 1, "geologia");
   	 System.out.println(student);
   	 
   	 // Metoda przedstaw się działa w inny sposób dla osoby, w inny dla studenta
   	 osoba.przedstawSie();
   	 student.przedstawSie();
   	 System.out.println();
   	 
   	 Osoba ktos;
   	 // Do zmiennej typu Osoba można wpisać obiekt klasy Osoba:
   	 ktos = osoba;
   	 // Teraz metoda przedstawSie działa w wersji podstawowej:
   	 ktos.przedstawSie();
   	 
   	 // Do zmiennej typu Osoba można jednak wpisać także obiekt klasy Student
   	 ktos = student;
   	 // Teraz metoda przedstawSie zadziała w wersji z klasy Student
   	 ktos.przedstawSie();
   	 
   	 // ! To faktyczna klasa obiektu decyduje o tym, czy wykona się metoda z nadklasy, czy z podklasy ! //
   	 
   	 // Zauważmy, że ze zmiennej ktos nie da się odczytać pól kierunek i rok, czy ocen
   	 // System.out.println(ktos.kierunek);
   	 // Bo "nie każda Osoba ma te dane"
   	 
   	 // Ale obiekt można zrzutować do zmiennej typu Student.
   	 // Jeśli wiemy, że w zmiennej ktos na pewno jest Student, to można tak:
   	 Student s1 = (Student)ktos;
   	 System.out.println(s1.kierunek);
   	 
   	 System.out.println( ((Student)ktos).rok );
   	 
   	 // Ale jeśli w zmiennej nie studenta, tylko zwykła osoba, to będzie wyjątek ClassCastException
//   	 Student s2 = (Student)osoba;
//   	 System.out.println(s2.kierunek);
   	 
   	 String napis = "Jestę studentę";
   	 // To się w ogóle nie skompiluje:
   	 // Student s3 = (Student)napis;
   	 // Jest sposób, aby to obejsc. Poniższe się kompiluje, ale powoduje wyjątek:
		// Student s4 = (Student)(Object)napis;

		// Metoda getClass zwraca aktualną informację o tym, jakiej kalsy jest obiekt.
		System.out.println(ktos.getClass());

		// Aby sprawdzić, czy rzutowanie będzie możliwe, używamy instanceof:
		if(ktos instanceof Student) {
			// rzutowanie jest bezpieczne
			System.out.println( ((Student)ktos).rok );
		}

		// Od Javy 17 (?) jest dostępne instancof, które od razu wpisuje wynik do zmiennej:
		if(ktos instanceof Student s5) {
			s5.dodajOcene(4);
			s5.dodajOcene(5);
			System.out.println(s5.sredniaOcen());
		}

		// Przypisanie do zmiennej i rzutowanie nie tworzą nowych obiektów, tylko cały czas odnosimy się do tego samego obiektu.

		student.kierunek = "zoologia";
		student.dodajOcene(5);
		System.out.println();

		ktos.przedstawSie();
		System.out.println(student.oceny);
		System.out.println(student.sredniaOcen());
		System.out.println(((Student)ktos).sredniaOcen());
	}

}
