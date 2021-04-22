package lauramititelu.java11arrayscollections.generics;

import java.util.ArrayList;
import java.util.List;

public class WidgetMain {
    public static void main(String[] args) {
        Widget<String> widget = new Widget<>();
        widget.setType("hello");

        Widget widget2 = new Widget<>();
        Widget widget3 = new Widget();

        String[] strings = new String[]{"Hi", "There"};
        Integer[] integers = new Integer[]{79,9,63};
        System.out.println(Widget.firstArrayElement(strings));
        System.out.println(Widget.firstArrayElement(integers));

        List<Integer> intList = new ArrayList<>();
        intList.add(3);
        intList.add(96);
        intList.add(46);
        widget.printList(intList);

    }
}
