//в конструкторе запоминает строку. Ему дают строку, он проверяет, что она начинается с того, что он запомнил
public class BeginsWith extends isGood<String> {
    private String controlStr;

    public BeginsWith(String controlStr) {
        this.controlStr = controlStr;
    }
    public boolean   isGood (String item){
        String subStr = item.substring(0, controlStr.length());
        return controlStr.equals(subStr);
    }    
}
