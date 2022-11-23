public class Main {


    static void isPrime(int num) {
        for (int i = 2; i <= num / 2; ++i) {
            boolean isPrime = true;
            if (num % i == 0) {
                isPrime = false;
                break;
            }
            if(isPrime){
                System.out.println("your number is prime number");
            } else{ 
                System.out.println("your number is not prime number");
            }
        }
    }

    static void isMultipleOf7(int num) {
        if(num%7 == 0){
            System.out.println("your number is Multiple of Number7");
        } else{
            System.out.println("your number is not Multiple of Number7");
        }
    }
    
    static void isPerfectSquer(double num) {
        double sqrt=Math.sqrt(num);   
        if(Math.floor(sqrt) == 0){
            System.out.println("your number is perfect squer");
        } else{
            System.out.println("your number is not perfect squer");
        }
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        
        for (int i = 0; i < 15; i++) {
            int intNumber = scan.nextint();
            isMultipleOf7(intNumber)
            isPerfectSquer(intNumber)
            isPrime(intNumber)
        }
    }
}


