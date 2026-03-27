package HashMap;
import java.util.*;
public class HashMapCode {
   static class HashMap<K,V>{
        private class Node{
            K key;
            V value;

            Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }
        private int n;
        private int N;
        private LinkedList<Node> buckets[];
        @SuppressWarnings("Unchecked")
        public HashMap(){
            this.N = 0;
            this.buckets = new LinkedList[4];

            for(int i = 0; i<4; i++){
                this.buckets[i] = new LinkedList<>();
            }
        }
        private int hashFunction(K key){
            int hc = key.hashCode();
            return Math.abs(hc) % N;
        }

        private int SearchInLL(K key,int bi){
            LinkedList<Node> ll = buckets[bi];
            int di = 0;
            for(int i = 0; i<ll.size(); i++){
                Node node = ll.get(i);
                if(node.key==key){
                    return di;
                }
                di++;
            }
            return -1;
        }

        private void rehash(){
            LinkedList<Node> oldBuck[] = buckets;
            
        }

        void put(K key,V value){
            int bi = hashFunction(key);
            int di = SearchInLL(key,bi);

            if(di != -1){
                Node node = buckets[bi].get(di);
                node.value = value;
            }else{
                buckets[bi].add(new Node(key,value));
                n++;
            }
            double lambda = (double)n/N;
            if(lambda>2.0){
                rehash();
            }
        }
   }
}
