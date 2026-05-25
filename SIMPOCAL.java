import java.util.Scanner;
public class SIMPOCAL{
    public static void main(String [] args){
        System.out.println("SIMPLE CALCULATOR:");
        Scanner input=new Scanner(System.in);
        System.out.println("ENTER THE FIRST NUMBER");
        int num1=input.nextInt();
        System.out.println("ENTER THE SECOND NUMBER");
        int num2=input.nextInt();
        System.out.println("ENTER OPERATOR(+,-,*,/):");
        char operator=input.next().charAt(0);
        switch(operator){
            case'+':
            System.out.println("Result:="+(num1+num2));
            break;
            case'-':
            System.out.println("Result:="+(num1-num2));
            break;
            case'*':
            System.out.println("Result:="+(num1*num2));
            break;
            case'/':
            System.out.println("Result:="+(num1/num2));
            break;
            default:
            System.out.println("Invalid Operator");
            
        }
          input.close();
        
        
        
    
        
        
    }
}
