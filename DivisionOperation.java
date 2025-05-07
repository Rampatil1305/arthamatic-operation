public class DivisionOperation {
    public static void main(String[] args) {

        int a =15;
        int b =0;
        try{
            System.out.println("Division of a and b is: "+(a/b));

        }catch(ArithmeticException e){
            System.out.println("Division by zero is not allowed.");
        }
        finally{
            System.out.println("This block is always executed.");
        }
    }
}
