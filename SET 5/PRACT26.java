public class PRACT26
 {

    int create_exception() {
        int x = 10 / 0;
        return x;
    }

    public void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Not Eligible for voting.");
        } else {
            System.out.println("Eligible for voting.");
        }
    }

    public static void main(String[] args) {
        PRACT26 obj = new PRACT26();
        
        try {
            obj.create_exception();
        } catch (ArithmeticException e) {
            System.out.println("An Error Has Occurred.");
            e.printStackTrace();
        }
        
        int age = 15;
        
        try {
            obj.checkAge(age);
        } catch (ArithmeticException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
