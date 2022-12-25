// IsEven — ему дают целое число, он одобряет его, если оно чётное
public class IsEven extends isGood<Integer>{
    public boolean   isGood (Integer item){
        return item%2 == 0;
    }   
    
}
