package arrayList;
import java.util.*;

public class Multi_DimArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> Marks = new ArrayList<>();

        System.out.print("Enter number of subjects: ");
        int subjects = sc.nextInt();

        for (int i = 0; i < subjects; i++) {
            System.out.print("Enter number of marks for subject " + (i + 1) + ": ");
            int markCount = sc.nextInt();

            ArrayList<Integer> subjectMarks = new ArrayList<>();

            System.out.println("Enter marks:");
            for (int j = 0; j < markCount; j++) {
                subjectMarks.add(sc.nextInt());
            }

            Marks.add(subjectMarks);
        }

        System.out.println("Marks List: " + Marks);
    }
}

