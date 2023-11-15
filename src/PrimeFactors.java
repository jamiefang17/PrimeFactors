import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    
    public List<Integer> resolve(int value) {
        List<Integer> result = new ArrayList<Integer>();
        int candidate = 2;
        while (value > 1) {
            while (value % candidate == 0) {
                result.add(candidate);
                value /= candidate;
                }
                candidate++;
}
                
        if (value > 1){
            result.add(value);
        }
        return result;
    }
}
