
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author namai
 */
public class PrimeFactor {

    static List<Integer> Generate(int number) {
        List<Integer> result = new ArrayList<>();

        Integer num = number;
        for (int divisor = 2; divisor <= number; divisor ++) {
            while ( number % divisor == 0 ) {
                result.add(divisor);
                number /= divisor;
            }
        }
        
        return result;
    } 
}
