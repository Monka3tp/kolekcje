import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<Integer> liczby = new LinkedList<>();
        liczby.add(1);
        liczby.add(2);
        liczby.add(7);
        liczby.add(2);

        System.out.println(liczby.contains(8)); //czy element istnieje
        System.out.println(liczby.indexOf(8)); //index pierwszego wystapienia

        //set zawsze musi miec equals i hashcode
        Set<Integer> zbior = new HashSet<>();
        zbior.addAll(liczby);
        System.out.println(zbior);
    }
}