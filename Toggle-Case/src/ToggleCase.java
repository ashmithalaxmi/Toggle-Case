import java.util.Scanner;

public class ToggleCase {
    public static String toggleString(String str){
        int n = str.length();
        char[] arr = str.toCharArray();
        for(int i=0;i<n;i++){
            if(arr[i]>=65 && arr[i]<=90)
                arr[i] += 32;
            else if(arr[i]>=97 && arr[i]<=122)
                arr[i] -= 32;
        }
        return String.valueOf(arr);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(toggleString(str));
    }
}
