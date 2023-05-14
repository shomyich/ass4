public class MyHashTable<K, V> {

    private class HashNode<K, V> {
        private K key;
        private V value;
        private HashNode<K, V> next;

        public HashNode(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return "{" + key + " " + value + "}";
        }
    }

    private HashNode<K, V>[] chainArray; // or Object[]
    private int M = 11; // default number of chains
    private int size;

    public MyHashTable() {
        chainArray = new HashNode[M];
        size = 0;
    }

    public MyHashTable(int M) {
        this.M = M;
        chainArray = new HashNode[M];
        size = 0;
    }

    private int hash(K key) {
        // Hash function to calculate the index of the key
        int hashCode = key.hashCode();
        int index = Math.abs(hashCode % M);
        return index;
    }


    public void put(K key, V value) {
        int index = hash(key);
        HashNode<K, V> newNode = new HashNode<>(key, value);

        if (chainArray[index] == null) {
            // No nodes exist at the index, insert the new node directly
            chainArray[index] = newNode;
        } else {
            // Traverse the chain at the index to find the appropriate position to insert the new node
            HashNode<K, V> currentNode = chainArray[index];
            while (currentNode.next != null) {
                if (currentNode.key.equals(key)) {
                    // Key already exists, update the value
                    currentNode.value = value;
                    return;
                }
                currentNode = currentNode.next;
            }

            if (currentNode.key.equals(key)) {
                // Key already exists, update the value
                currentNode.value = value;
            } else {
                // Append the new node to the end of the chain
                currentNode.next = newNode;
            }
        }

        size++;
    }


    public V get(K key) {
        int index = hash(key);

        if (chainArray[index] != null) {
            // Traverse the chain at the index to find the node with the given key
            HashNode<K, V> currentNode = chainArray[index];
            while (currentNode != null) {
                if (currentNode.key.equals(key)) {
                    // Key found, return the corresponding value
                    return currentNode.value;
                }
                currentNode = currentNode.next;
            }
        }

        // Key not found
        return null;
    }

    public V remove(K key) {
    }

    public boolean contains(V value) {
    }

    public K getKey(V value) {
    }
}