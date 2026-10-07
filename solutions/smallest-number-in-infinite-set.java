import java.util.TreeSet;

class SmallestInfiniteSet {
    TreeSet<Integer> numbers = new TreeSet<>();

    public SmallestInfiniteSet() {
        for (int i = 1; i<= 1000; i++) {
            numbers.add(i);
        }
    }
    
    public int popSmallest() {
        return numbers.pollFirst();
    }
    
    public void addBack(int num) {
        numbers.add(num);
    }
}
