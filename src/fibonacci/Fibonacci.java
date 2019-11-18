/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

/**
 *
 * @author esmeralda.iyescas001
 */
public class Fibonacci {
    public int fibonacci(long n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        return fibonacci(n -2) + fibonacci(n -1);
        }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long beginTime = System.currentTimeMillis();
        System.out.println(new Fibonacci().fibonacci(48));
        long endTime = System.currentTimeMillis();
        System.out.println("Execution took " + (endTime - beginTime) / 1000.0 + "seconds." );
    }
    
}
