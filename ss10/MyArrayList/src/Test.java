package ss10.MyArrayList.src;

public class Test {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>(10);
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        myList.add(6);
        myList.add(7);
        myList.add(8);
        myList.add(9);


        myList.clear();

        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        myList.add(6);
        myList.add(7);
        myList.add(8);
        myList.add(9);
        myList.add(10);

        MyList<Integer> newObj = myList.clone();
        for (int i = 0; i < newObj.size(); i++) {
            System.out.println(newObj.get(i));
        }

        myList.add(3, 200);
        myList.remove(4);
        myList.add(7, 200);
        System.out.println(myList.contains(200));
    }
}

