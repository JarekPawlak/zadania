
    public class ZadanieWyswietlLiczby{
        public static void main(String[] args) {
            int max=14;
            wyswietlCoDruga(max);

        }

        private static void wyswietlCoDruga(int max) {
            for (int i = 0; i <=max; i+=2) {
                System.out.print(i +",");

            }
        }
    }
