//ему дают строку, он одобряет её, если она начинается с буквы A

public class BeginsWithA extends isGood<String> {
    public boolean   isGood (String item){

        return item.indexOf("A")==0;
    }
}
