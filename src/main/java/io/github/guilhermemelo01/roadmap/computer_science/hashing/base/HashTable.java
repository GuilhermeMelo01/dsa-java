package io.github.guilhermemelo01.roadmap.computer_science.hashing.base;

public class HashTable {
    private static HashNode<Integer, String>[] buckets = new HashNode[10]; // 10 is my capacity

    public static void main(String[] args) {
        add(new HashNode<>(10, "João"));
        add(new HashNode<>(110, "Gui"));
        add(new HashNode<>(11, "Ana"));
        add(new HashNode<>(1110, "Ana"));

        for (HashNode bucket : buckets) {
            System.out.println(bucket);
        }
    }

    public static void add(HashNode node) {
        Integer index = hashFunction((Integer) node.getChave());
        if (buckets[index] == null) {
            buckets[index] = node;
        } else {
            HashNode<Integer, String> bucket = buckets[index];
            while (bucket.next != null) {
                bucket = bucket.next;
            }
            bucket.next = node;
        }
    }

    private static Integer hashFunction(Integer chave) {
        return (chave % buckets.length);
    }

    private static class HashNode<C, V> {
        C chave;
        V valor;
        HashNode<C, V> next;

        public HashNode() {
        }

        public HashNode(C chave, V valor) {
            this.chave = chave;
            this.valor = valor;
        }

        public C getChave() {
            return chave;
        }

        public void setChave(C chave) {
            this.chave = chave;
        }

        public V getValor() {
            return valor;
        }

        public void setValor(V valor) {
            this.valor = valor;
        }

        public HashNode<C, V> getNext() {
            return next;
        }

        public void setNext(HashNode<C, V> next) {
            this.next = next;
        }

        @Override
        public String toString() {
            return "HashNode[" +
                    "chave=" + chave +
                    ", valor=" + valor +
                    ", next=" + next +
                    ']';
        }
    }

}
