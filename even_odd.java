import java.util.Scanner;
public class even_odd {
    public void display(int n){
        if(n%2==0){
            System.out.println("EVEN");
        }
        else{
            System.out.println("ODD");
        }  
    }
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num = myScanner.nextInt();
        even_odd myObj = new even_odd();
        myObj.display(num);
    }   
}
