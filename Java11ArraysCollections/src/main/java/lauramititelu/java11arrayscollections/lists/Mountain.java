package lauramititelu.java11arrayscollections.lists;

public class Mountain implements Comparable<Mountain> {
    private String name;
    private int height;

    public Mountain(String n, int h){
        this.name = n;
        this.height = h;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public int compareTo(Mountain o) {
         return this.height < o.getHeight() ? -1 : this.height > o.getHeight() ? 1: 0;
        // return this.height - o.height;
    }

    @Override
    public String toString() {
        return name + "-" + height + "m";
    }
}
