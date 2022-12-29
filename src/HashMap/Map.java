package HashMap;

import java.util.ArrayList;

public class Map<K, V> {
    ArrayList<MapNode<K, V>> buckets;
    int size;                             // number of entry
    int numBuckets;                       // number of buckets

    public Map() {
        numBuckets = 20;
        buckets = new ArrayList<>();
        for (int i = 0; i < 20; ++i) {
            buckets.add(null);               // set all index to null by which we can access any of the index
        }
    }

    // method to find the index of the bucket
    private int getBucketIndex(K key) {
        int hashCode = key.hashCode();        // we simply get hashcode corresponding to key by using built-in hashCode method
        return hashCode % numBuckets;         // doing modulo so we store in only small size of arraylist that is size of map
    }

    // we built our own put function and name it insert
    public void insert(K key, V value) {
        int bucketIndex = getBucketIndex(key);
        MapNode<K, V> head = buckets.get(bucketIndex);

        while (head != null) {
            if (head.key.equals(key)) {           // if key is already present
                head.value = value;             // we just update the value corresponding to that key
                return;
            }
            head = head.next;
        }
        head = buckets.get(bucketIndex);      // if key is not present
        MapNode<K, V> newElementNode = new MapNode<>(key, value);
        size++;
        buckets.set(bucketIndex, newElementNode);   // inserting new key, value pair to our hashmap
        double loadFactor = (1.0 * size) / numBuckets;
        if (loadFactor > 0.7) {
            rehash();
        }
    }

    public double loadFactor() {
        return (1.0 * size) / numBuckets;
    }

    private void rehash() {
        System.out.println("Rehashing Buckets : " + numBuckets + " size : " + size);
        ArrayList<MapNode<K, V>> temp = buckets;
        buckets = new ArrayList<>();
        for (int i = 0; i < 2 * numBuckets; ++i) {
            buckets.add(null);
        }
        size = 0;
        numBuckets *= 2;
        for (int i = 0; i < temp.size(); ++i) {
            MapNode<K, V> head = temp.get(i);
            while (head != null) {
                K key = head.key;
                V value = head.value;
                insert(key, value);
                head = head.next;
            }
        }
    }

    // This function will return the size of the hashmap
    public int size() {
        return size;
    }

    // This function will return the value corresponding to key and if key is not present it will simply return null
    public V getValue(K key) {
        int bucketIndex = getBucketIndex(key);         // we are finding bucketIndex in the arraylist
        MapNode<K, V> head = buckets.get(bucketIndex);     // finding the head of that bucketIndex

        while (head != null) {                          // traversing through the entire linked list
            if (head.key.equals(key)) {
                return head.value;
            }
            head = head.next;
        }
        return null;
    }

    // This function will remove that key from hashmap and return its corresponding value
    public V removeKey(K key) {
        int bucketIndex = getBucketIndex(key);
        MapNode<K, V> head = buckets.get(bucketIndex);
        MapNode<K, V> prev = null;

        while (head != null) {
            if (head.key.equals(key)) {
                if (prev == null) {
                    buckets.set(bucketIndex, head.next);
                } else {
                    prev.next = head.next;
                }
                return head.value;
            }
            prev = head;
            head = head.next;
        }
        return null;
    }

}

// This code is contributed by Sunil Kumar
// This code is contributed by Sunil Kumar
