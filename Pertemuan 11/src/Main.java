class MyClass<T extends Comparable<T>> implements MinMax<T> {
    T[] vals;


    MyClass(T[] o) {
        vals = o;
    }

    public T max() {
        T v = vals[0];
        for (int i = 1; i < vals.length; i++) {
            if (vals[i].compareTo(v) > 0) { // compareTo(v) > 0 digunakan untuk membandingkan elemen saat ini vals[i] dengan v. Jika vals[i] lebih besar, v diperbarui menjadi vals[i].
                v = vals[i];
            }
        }
        return v;
    }
}

public class Main {
    public static void main(String args[]) {
        Integer inums[] = { 3, 6, 2, 8, 6 };
        Character chs[] = { 'b', 'r', 'p', 'w' };
        MyClass<Integer> a = new MyClass<Integer>(inums);
        MyClass<Character> b = new MyClass<Character>(chs);
        System.out.println(a.max());
        System.out.println(b.max());
    }
}