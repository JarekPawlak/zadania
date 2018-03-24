// Utwórz metode w której wuyswietlisz co druga liczbe z przedziału 0 do 14
// 0,2,4,6,8,10,12,14
 public class zadanie6WyswietlCoDrugaZPrzedzialu {
    public static void main(String[] args) {
   int skok = 2;
   int koniec =14;
   podajCoDuga(skok,koniec);
    }

    private static void podajCoDuga(int skok,int koniec) {

        for (int i = 0; i <= koniec ; i+=skok) {
            System.out.print(i+";");
        }
    }

}
