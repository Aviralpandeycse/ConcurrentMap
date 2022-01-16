package Map;

public interface MapInterface {
    void clear();
    void put(int key, int value);
    int get(int key);
    int	size();
    int remove(int key);
    int hashCode();
    boolean equals();
    boolean containsKey();
    int[] keySet();
    int[] valueSet();
    int[][] entrySet();
}
