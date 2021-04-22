package lauramititelu.java11arrayscollections.generics;

import java.util.List;

public class Widget <T>{

    private T type;

    public T getType() {
        return type;
    }

    public void setType(T type) {
        this.type = type;
    }

    public static <T> T firstArrayElement(T[] t){
        //if there is a first element return it
        if(t.length > 0){
            return  t[0];
        }
        //otherwise return null
        return null;
    }

    public void printList(List<?> list){
        list.forEach(System.out::println);
    }

}
