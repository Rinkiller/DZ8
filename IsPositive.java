public class IsPositive extends isGood<Integer>{
    //ему дают целое число, он одобряет его, если оно положительное
    public boolean   isGood (Integer item){
        return (Integer)item > 0;
    } 
}
