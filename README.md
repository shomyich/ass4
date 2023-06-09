# ass4
## MyHashTable
The MyHashTable class is an implementation of a hash table, also known as a hash map, which provides an associative array data structure. Here's a description of the class:

Inner class: HashNode:

HashNode is a private inner class within the MyHashTable class.
It represents a node in the hash table, containing a key-value pair and a reference to the next node in case of collisions (when multiple keys hash to the same index).
Each HashNode object consists of the following fields:
key: A key object of type K representing the key in the key-value pair.
value: A value object of type V representing the value in the key-value pair.
next: A reference to the next HashNode object in the chain (linked list) at the same index.
Fields:

chainArray: An array of HashNode objects that represents the underlying array-based implementation of the hash table. Each element of the array can hold a chain of HashNode objects.
M: An integer representing the number of chains or buckets in the hash table.
size: An integer representing the number of key-value pairs currently stored in the hash table.
Constructors:

MyHashTable(): Initializes a new instance of MyHashTable with default settings.
MyHashTable(int M): Initializes a new instance of MyHashTable with the specified number of chains.
Methods:

hash(K key): A private method that takes a key object and calculates the hash code to determine the index in the chainArray where the key-value pair should be stored.
put(K key, V value): Inserts a key-value pair into the hash table. If the key already exists, the associated value is updated.
get(K key): Retrieves the value associated with the specified key from the hash table.
remove(K key): Removes the key-value pair associated with the specified key from the hash table and returns the value.
contains(V value): Checks if the specified value exists in the hash table.
getKey(V value): Retrieves the key associated with the specified value from the hash table.
getBucketSizes(): Retrieves an array containing the number of elements in each bucket (chain) of the hash table.
The MyHashTable class provides a basic implementation of a hash table, allowing you to store key-value pairs and perform operations like insertion, retrieval, removal, and checking for the existence of values. It utilizes hashing techniques to distribute the key-value pairs across the array-based structure, handling collisions by using separate chaining (linked lists).


## MyTestingClass

The MyTestingClass is a custom class used for testing purposes in the given example. Here's a description of the class:

Fields:

name: A string field that represents the name of an object.
age: An integer field that represents the age of an object.
Constructor:

MyTestingClass(String name, int age): Initializes a new instance of MyTestingClass with the specified name and age.
Methods:

hashCode(): Overrides the default hashCode() method to provide a custom hashing implementation for MyTestingClass objects. It combines the hash codes of the name and age fields to calculate the hash code for the object.
equals(Object obj): Overrides the default equals() method to compare two MyTestingClass objects for equality. It compares the name and age fields of the objects to determine if they are equal.
The MyTestingClass is designed to be used as a key type in the MyHashTable class for testing purposes. It allows you to create objects with a name and an age and provides custom implementations for hashing and equality comparison. These custom implementations are necessary to ensure proper functioning of the hash table, such as accurate retrieval and removal of elements based on the key.

The example usage of MyTestingClass demonstrates creating instances of MyTestingClass objects, generating custom hash codes, and performing operations with the MyHashTable class, such as adding elements, retrieving values by key, removing key-value pairs, checking for the presence of values, and getting keys for given values.