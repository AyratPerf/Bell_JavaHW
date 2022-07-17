package Tasks;

public class Task1 {
    public static void main(String[] args) {
        int start = 1000;
        int finish = 1;
        int step = 2;
        for(int i = start; i > finish; i -= step) {
            System.out.println(i);
        }
    }
}
