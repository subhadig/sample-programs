public class Fibonacci {

    public static void main(String[] args) {
    	System.out.println("Fibonacci of 6:" + fibonacci(6, 0, 0, 0));
    	printFibonacci(6, 0, 0, 0);
    	System.out.println("Fibonacci of 1:" + fibonacci(1, 0, 0, 0));
    	printFibonacci(1, 0, 0, 0);
    }

    static void printFibonacci(int n, int i, int curr, int prev) {
    	int val;
    	if(i == 0) {
    		val = 0;
    	} else if(i == 1) {
    		val = 1;
    	} else {
    		val = curr + prev;
    	}
    	System.out.println(val);
		if(i < n) {
			printFibonacci(n, ++i, val, curr);
		}
    }
    
    static int fibonacci(int n, int i, int curr, int prev) {
        int val;
        if(i == 0) {
            val = 0;
        } else if(i == 1) {
            val = 1;
        } else {
            val = curr + prev;
        }
        if(i < n) {
            return fibonacci(n, ++i, val, curr);
		} else {
            return val;
        }
    }
}
