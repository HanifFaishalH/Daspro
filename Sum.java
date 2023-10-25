public class Sum {
    public static void main(String[] args) {
        int Angka[] = {1,2,3,4,5};
        int total = 0;

        for (int i = 0; i < Angka.length; i++) {
            total+=Angka[i];
        }
        System.out.println("Total semua elemen dalam array " + total);
    }
}
