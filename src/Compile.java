public class Compile {
    public static void main(String[] args) {
        fibonacci(5);
    }
    public static int fibonacci(int n){
        if (n == 1){
            System.out.println(1);
            return 1;
        }else if (n==2) {
            System.out.println(1);
            return 1;
        }else{
            System.out.println(fibonacci(n-1)+fibonacci(n-2));
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }
}







/*String original = "abcdefg";
       for(int i= 0; i <original.length(); i++) {
           System.out.println("The number of index" + i + " is " +original.charAt(i));

       }
        System.out.println("The number index of 'd' is " + original.indexOf("d"));*/
