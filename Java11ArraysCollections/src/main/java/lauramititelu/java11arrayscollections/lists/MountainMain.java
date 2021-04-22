package lauramititelu.java11arrayscollections.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MountainMain {

    public static void main(String[] args) {
        joacaLaura();

        List<Mountain> mountains = new ArrayList<>();
        mountains.add(new Mountain("Everest", 8848));
        mountains.add(new Mountain("Matterhorn", 4478));
        mountains.add(new Mountain("K2", 8611));
        Collections.sort(mountains);
        System.out.println(mountains.stream().
                map(Mountain::getName).
                collect(Collectors.toList()));

        Comparator<Mountain> mountainComparator = new Comparator<Mountain>() {
            @Override
            public int compare(Mountain o1, Mountain o2) {
                return o2.getHeight() - o1.getHeight();
            }
        };
        Collections.sort(mountains, mountainComparator);
        System.out.println(mountains.stream().
                map(Mountain::getName).
                collect(Collectors.toList()));

        Comparator<Mountain> mountainComparator2 = (m1, m2 )->
                m2.getHeight() - m1.getHeight();
        Collections.sort(mountains, mountainComparator2);
        System.out.println(mountains.stream().
                map(Mountain::getName).
                collect(Collectors.toList()));

    }

    private static void joacaLaura() {
        Mountain moldoveanu = new Mountain("Moldoveanu", 2544);
        Mountain ciucas = new Mountain("Ciucas", 1954);
        Mountain omu = new Mountain("Omu ", 2504);
        //System.out.println(moldoveanu.compareTo(omu));
        List<Mountain> muntiRo = new ArrayList<>();
        muntiRo.add(moldoveanu);
        muntiRo.add(ciucas);
        muntiRo.add(omu);
        System.out.println(muntiRo);
        Collections.sort(muntiRo);
        System.out.println(muntiRo);

//        Collections.sort(muntiRo, (m1, m2) -> m2.getHeight() - m1.getHeight() );
//        System.out.println(muntiRo);

        System.out.println(Collections.binarySearch(muntiRo, omu));

    }
}
