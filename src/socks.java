import java.util.HashSet;
import java.util.Scanner;

public class socks {

    public static void main(String[] args){

    Scanner scan = new Scanner(System.in);

    System.out.print("How many socks do you have? ");
    int size = scan.nextInt();
    System.out.println("");
    int[] ar = new int[size];

    for (int x = 0; x < size; x++){
        System.out.print("Enter sock " + (x+1) + ": ");
        ar[x] = scan.nextInt();
        System.out.println("");
    }

    System.out.print(sockMerchant(size, ar));

    }

    static int sockMerchant(int n, int[] ar){
        int pairs = 0;

        HashSet<Integer> colorset = new HashSet<Integer>();



        for(int y = 0; y < ar.length; y++){
            if(!colorset.contains(ar[y])){
                colorset.add(ar[y]);
            }else if(colorset.contains(ar[y])){
                pairs++;
                colorset.remove(ar[y]);
            }
        }

        return pairs;
    }
}
