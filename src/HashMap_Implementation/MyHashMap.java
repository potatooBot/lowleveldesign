package HashMap_Implementation;

public class MyHashMap <K,V> {

    private static int INITIAL_SIZE =1<<4;
    private static int MAXIMUM_CAPACITY =1<<30;
    Entry hasTable[];


    public MyHashMap( ) {
      hasTable=new Entry[INITIAL_SIZE];
    }

    public MyHashMap(int cap ) {
        int tableSize=tableSizeFor(cap);
        hasTable=new Entry[tableSize];
    }
    public int tableSizeFor(int cap){
        int n=cap-1;
        n|=n>>>1;
        n|=n>>>2;
        n|=n>>>4;
        n|=n>>>8;
        n|=n>>>16;
        return (n<0)?1:(n>=MAXIMUM_CAPACITY)?MAXIMUM_CAPACITY:n+1;
    }

    class Entry<K,V>{
        K Key;
        V Value;
        Entry next;

        public Entry(K key,V value) {
            this.Key = key;
            this.Value=value;
        }

        public K getKey() {
            return Key;
        }

        public void setKey(K key) {
            Key = key;
        }

        public V getValue() {
            return Value;
        }

        public void setValue(V value) {
            Value = value;
        }
    }

public void put(K key,V value){
        int hashCode=key.hashCode()%hasTable.length;
        Entry node=hasTable[hashCode];

        if(node==null){
            Entry newNode=new Entry<>(key,value);
            hasTable[hashCode]=newNode;
        }
        else {
            Entry previousNode=node;
            while(node!=null){
                if(node.Key==key){
                    node.Value=value;
                    return;
                }
                previousNode=node;
                node=node.next;
            }
            Entry newNode=new Entry<>(key,value);
            previousNode.next=newNode;
        }
}


public V get(K key){
        int hasCode=key.hashCode()%hasTable.length;
        Entry node=hasTable[hasCode];

        while (node!=null){
            if(node.Key.equals(key)){
                return (V)node.Value;
            }
            node=node.next;
        }
        return null;
}
    public static void main(String[] args) {
MyHashMap<Integer,String> map=new MyHashMap<>(10);
map.put(1,"Hey");
map.put(2,"Hi");
map.put(3,"Hello");
map.put(4,"Hola");
map.put(5,"Heyyyoooo");
    System.out.println(map.get(1));
    }
}
