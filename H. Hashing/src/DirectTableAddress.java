//  Search, Add and Delete operation in O(1) time.

class Dat {
    int table[] = new int[1000];

    int search(int number) {
        return table[number];
    }

    void add(int number) {
        table[number] = 1;
    }

    void delete(int number) {
        table[number] = 0;
    }
}

public class DirectTableAddress {
    public static void main(String[] args) {
        Dat dat = new Dat();
        dat.add(1);
        dat.add(2);
        dat.add(3);
        System.out.println(dat.search(1));
        System.out.println(dat.search(2));
        dat.delete(1);
        System.out.println(dat.search(1));
    }
}
