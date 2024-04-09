package org.example;

public class HashMap<T, K> {
    private Node<T, K>[] array;

    public HashMap() {
        array = new Node[16];
    }

    public HashMap(int size) {
        array = new Node[size];
    }

    public void remove(T key){
        int index = getHashCode(key) % array.length;
        Node<T, K> tempHead = array[index];

        if(tempHead == null){
            return;
        }

        if(tempHead.key.equals(key)){
            array[index] = tempHead.next;
            return;
        }

        while(tempHead.next != null){
            if(tempHead.next.key.equals(key)){
                tempHead.next = tempHead.next.next;
                return;
            }
            tempHead = tempHead.next;
        }
    }

    public void add(T key, K value){
        int index = getHashCode(key) % array.length;
        Node<T, K> tempHead = array[index];

        if(tempHead == null){
            array[index] = new Node<>(key, value);
        }

        else{
            while(tempHead.next != null){
                tempHead = tempHead.next;
            }
            tempHead.next = new Node<>(key, value);
        }
    }

    public K get(T key){
        int index = getHashCode(key) % array.length;
        Node<T, K> tempHead = array[index];
        while(tempHead != null){
            if(tempHead.key.equals(key)){
                return tempHead.value;
            }
            tempHead = tempHead.next;
        }
        return null;
    }

    public int getHashCode(T key) {
        return key.hashCode();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Node<T, K> node : array) {
            while (node != null) {
                sb.append(node.key).append(": ").append(node.value).append(", ");
                node = node.next;
            }
        }
        return sb.toString();
    }
}

// LinkedList class
class Node<T, K> {
    T key;
    K value;
    Node<T, K> next;

    Node(T key, K value) {
        this.key = key;
        this.value = value;
    }
}