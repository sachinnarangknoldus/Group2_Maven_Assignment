import java.util.Scanner;

public class Application {
    public static void main(String Args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter Your String");
        String input=sc.next();
        StringFunctions obj=new StringFunctions();
        System.out.println("Reversed Value is :  "+obj.ReverseString(input));
        System.out.println("Length of the string is :  "+obj.Length_String(input));
    }
}
