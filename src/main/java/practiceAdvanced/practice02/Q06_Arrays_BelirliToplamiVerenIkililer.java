package practiceAdvanced.practice02;

public class Q06_Arrays_BelirliToplamiVerenIkililer {
    /*
     Toplamları, verilen bir sayıya eşit olan  Array element çiflerini yazdıran bir method oluşturunuz.
     {4,6,5,-10,8,5,20} ===> 10
     4 + 6 = 10
     5 + 5 = 10
    -10 + 20 = 10
     */
    public static void main(String[] args) {
        int arr[] = {4, 6, 5, -10, 8, 5, 20};

        ikilileriBul(arr, 10);

    }
    public static void ikilileriBul(int[] a, int b){

        for(int i=0; i<a.length; i++){
            for(int j=i+1; j<a.length; j++){
                if(a[i]+a[j]==b){

                    System.out.println(a[i] + "+" + a[j] + "=" + b);
                }
            }
        }
    }
}
