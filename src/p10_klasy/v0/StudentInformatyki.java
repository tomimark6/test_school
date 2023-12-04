package p10_klasy.v0;

public class StudentInformatyki extends Student {
    // Czasami podklasa nie ma nowych pól ani metod,
    // a jest wprowadzana po to, aby ustalić pewne szczegóły
    // Jest to podklasa / podzbiór w sensie matematycznym (logicznym).
    
    public StudentInformatyki(String imie, String nazwisko, int wiek, int rok) {
   	 // ustalamy, że kierunkiem studiów jest "informatyka" i nie może być inaczej
   	 super(imie, nazwisko, wiek, rok, "informatyka");
    }
}
