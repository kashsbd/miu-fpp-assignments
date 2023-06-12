import java.util.Arrays;

public class MyPersonList {
    private final int INITIAL_LENGTH = 4;
    private Person[] currentArray;
    private int size;

    public MyPersonList() {
        currentArray = new Person[INITIAL_LENGTH];
        size = 0;
    }

    public void add(Person s) {
        if (s == null) return;
        if (size == currentArray.length) resize();
        currentArray[size++] = s;
    }

    public Person get(int i) {
        if (i < 0 || i >= size) {
            return null;
        }
        return currentArray[i];
    }

    private void resize() {
        int len = currentArray.length;
        Person[] newArray = new Person[len * 2];
        System.arraycopy(currentArray, 0, newArray, 0, len);
        currentArray = newArray;
    }

    public boolean find(String s) {
        if (s == null) return false;
        for (Person test : currentArray) {
            if (test.getLast().equals(s)) return true;
        }
        return false;
    }

    public void insert(Person s, int pos) {
        if (pos > size || pos < 0) return;
        if (pos == currentArray.length || size + 1 > currentArray.length) {
            resize();
        }

        Person[] temp = new Person[currentArray.length + 1];
        System.arraycopy(currentArray, 0, temp, 0, pos);
        temp[pos] = s;

        System.arraycopy(currentArray, pos, temp, pos + 1, currentArray.length - pos);
        currentArray = temp;
        ++size;
    }

    public boolean remove(Person s) {
        if (size == 0) return false;
        if (s == null) return false;

        int index = -1;
        for (int i = 0; i < size; ++i) {
            if (currentArray[i].getLast().equals(s.getLast())) {
                index = i;
                break;
            }
        }
        if (index == -1) return false;

        Person[] temp = new Person[currentArray.length];
        System.arraycopy(currentArray, 0, temp, 0, index);
        System.arraycopy(currentArray, index + 1, temp, index, currentArray.length - (index + 1));
        currentArray = temp;
        --size;

        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size - 1; ++i) {
            sb.append(currentArray[i] + ", ");
        }
        sb.append(currentArray[size - 1] + "]");
        return sb.toString();
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public Object clone() {
        return Arrays.copyOf(currentArray, size);
    }

    public static void main(String[] args) {
        MyPersonList l = new MyPersonList();
        l.add(new Person("Bob", "", 25));
        l.add(new Person("Steve", "", 25));
        l.add(new Person("Susan", "", 25));
        l.add(new Person("Mark", "", 25));
        l.add(new Person("Joe", "", 25));

        System.out.println("Number of elements: " + l.size);
        System.out.println(l);

        System.out.println(l.remove(new Person("Steve", "", 25)));

        l.insert(new Person("Kash", "", 26), 1);
        System.out.println(l.get(1));

    }
}
