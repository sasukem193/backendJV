package datastructures.lab1;

public class MyListTest {
    public static void main(String[] args) {

        Mylist<Integer> listInterger= new Mylist<Integer>();

        listInterger.add(1);// size =2// element length =10; => element[2}=1
        listInterger.add(2);// size =2// element length =10; => element[3}=2
        listInterger.add(3);
        listInterger.add(4);
        listInterger.add(5);

        System.out.println("a "+listInterger.get(1));

        listInterger.get(-1);
        System.out.println("element 6: "+listInterger.get(-1));
    }
}
