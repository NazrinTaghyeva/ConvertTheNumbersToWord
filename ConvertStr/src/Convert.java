import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number 3 digit number...");
        int n = in.nextInt();
        if(n<1 || n>999){
            System.out.println("Wrong input...");
        }else {
            int u = n%10;
            int tt = n/10;
            int t = tt%10;
            int h = n/100;
            String uw[] = {
                    " ","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven",
                    "Twelve","Thirteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"
            } ;
            String tw[] = {" ","Ten","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
           String hw=" Hundred";
           if(n<20){
               System.out.println(uw[n]);
           }else if(n<100){
               System.out.println(tw[t]+" "+uw[u]);
           }else {
               System.out.println(uw[h]+" " +hw+" "+tw[t]+" "+uw[u]);
           }
        }

    }
}
