import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[] { 5, 1, 7, 3, 4, 0};
        insertionSort(array);
        System.out.println(fib(100));
        for (int anArray : array) {
            System.out.println(anArray);
        }

        MyLinkedList<Integer> list = new MyLinkedList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i+1);
        }

        for (Integer value : list) {
            System.out.println(value);
        }
    }



    //Sorting  Сложность - O(n ^ 2).
    private static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while(j >= 0 && current < array[j]) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = current;
        }
    }


    //Fibonacci
    private static long fib(int n){
        long[]arr = new long [n+1];
        arr[0]=0;
        arr[1]=1;

        for(int i=2; i <= n; i++)
            arr[i]=arr[i-1]+arr[i-2];
            return arr[n];
        }
    }


 class Node<T> {

    T value;
    Node<T> prev, next;

    Node(T value) {
        this.value = value;
        prev = next = null;
    }
}

    class MyLinkedList<T> implements Iterable<T> {

        private Node<T> head, tail, iteratorNode;
        private Iterator<T> iterator;
        private int size;

        MyLinkedList() {
            head = tail = null;
            size = 0;
        }


        public Iterator<T> iterator() {

            iteratorNode = head;
            return new Iterator<T>() {

                @Override
                public boolean hasNext() {
                    return iteratorNode != null;
                }

                @Override
                public T next() {
                    if (hasNext()) {
                        T data = iteratorNode.value;
                        iteratorNode = iteratorNode.next;
                        return data;
                    }
                    return null;
                }
            };
        }


        void add(T element) {
            if (size == 0) {
                head = tail = new Node<>(element);
                size++;
                return;
            }
            Node<T> node = new Node<>(element);
            node.prev = tail;
            tail.next = node;
            tail = node;
            size++;
        }

        void add(int index, T element) {
            if (index == 0 && index == size)
                add(element);
            else {
                Node newNode = new Node<>(element);


                Node oldNode = head;
                for (int i = 0; i < index; i++) {
                    oldNode = oldNode.next;
                }
                newNode.next = oldNode;
                newNode.prev = oldNode.prev;
                if (oldNode.prev == null)
                    head = newNode;
                else
                    oldNode.prev.next = newNode;
                oldNode.prev = newNode;
                size++;
            }
        }

        void remove() {
            if (size != 0) {
                if (size == 1) {
                    head = null;
                    tail = null;
                } else {
                    tail.prev.next = null;
                    tail = tail.prev;
                }
                size--;
            }
        }

        int size() {
            return size;
        }

        void remove(int index) {
            Node<T> node = head;
            for (int i = 0; i < index; i++) {
                node = node.next;
            }
            size--;
            if (size == 0)
                head = tail = null;
            else {
                if (node == head) {
                    head = node.next;
                    node.next.prev = null;
                } else if (node == tail) {
                    tail = node.prev;
                    node.prev.next = null;
                } else {
                    node.next.prev = node.prev;
                    node.prev.next = node.next;
                }
            }
        }

        T get(int index) {
            Node<T> node = head;
            int i = 1;
            while (i < index) {
                node = node.next;
                i++;
            }
            return node.value;
        }

        void set(int index, T value) {
            Node<T> node = head;
            for (int i = 0; i < index; i++) {
                node = node.next;
            }
            node.value = value;
        }

        @Override
        public String toString() {
            Node<T> node = head;
            StringBuilder s = new StringBuilder();
            s.append("[");
            while (node != null) {
                s.append(node.value).append(", ");
                node = node.next;
            }
            s.deleteCharAt(s.length() - 1);
            s.deleteCharAt(s.length() - 1);
            s.append("]");
            return s.toString();
        }
    }

