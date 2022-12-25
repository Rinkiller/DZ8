
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
// Создайте обобщённую функцию filter. Ей дают любую коллекцию любого типа, и одобрятель IsGood.
// Функция возвращает новую коллекцию, куда входят только одобренные элементы из коллекции.
// Продемонстрируйте, что это работает.
class Filter<T>{
    <T> Iterable<T> filter(Iterable<T> list, isGood<T> approver){
        Iterable<T> newList = list;
        Iterator<T> iterator = newList.iterator();
        while(iterator.hasNext()){
            T item = iterator.next();
            if(!approver.isGood(item)) {iterator.remove();}
        } 
        System.out.println();    
        return   newList;
    }
}
public class Main {

    public static void main(String[] args) {
        Filter filter = new Filter();

        IsPositive approver1 = new IsPositive(); 
        List<Integer> ansortedList = new ArrayList<Integer>(Arrays.asList(1,-4,3,5,-7,-4,2));
        System.out.println( filter.filter(ansortedList, approver1));


        BeginsWith approver2 = new BeginsWith("123");
        List<String> strList = new ArrayList<>(Arrays.asList("43gf","123fgfhd","123wwwww"));
        System.out.println(filter.filter(strList, approver2));


        IsEven approver3 = new IsEven();
        List<Integer> ansortedList1 = new ArrayList<Integer>(Arrays.asList(1,-4,3,-5,7,-4,2));
        System.out.println( filter.filter(ansortedList1, approver3));

    }
}
