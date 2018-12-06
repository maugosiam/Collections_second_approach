public class MyClass implements Comparable<MyClass> {
    String label;
    String value;

    public MyClass(String label, String value) {
        this.label = label;
        this.value = value;
    }

    public MyClass() {
        this.label = null;
        this.value = null;
    }

    @Override
    public int compareTo(MyClass o) {
        return 1;
    }
}
