package practiceAdvanced.practice06;

public class Q03_Array_Simetric {
    //Bir Array'in simetrik olup olmadığını kontrol eden bir method yazınız.

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 4, 3, 2, 1};

        System.out.println("simetrik mi?: "+simterik(arr));
    }

    public static boolean simterik(int[] arr) {

        boolean sonuc = true;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                sonuc = false;
                break;
            }
        }
        return sonuc;
    }

}


