package zadania.dom.dom;

public class PetlaFor1 {
    public static void main(String[] args) {

        int liczba = 0;


        for (liczba = 0; liczba <= 100; liczba++) {


            System.out.println(liczba + "\t" + (liczba * liczba) + "\t" + (liczba * liczba * liczba));

            if( liczba % 3 == 0){
                System.out.println();

            }

       }


        }
    }







