import java.util.*;

public class Main {

    public static void rearray(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            Integer current = list.get(i);
            if (current < 0) {
                list.remove(i);
                list.add(current);
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Set size of List: ");
        int size = sc.nextInt();
        System.out.print("Enter the elements of the original list: ");
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < size; i++) arr.add(sc.nextInt());
        rearray(arr);
        System.out.println("Final List: " + arr);
    }
}