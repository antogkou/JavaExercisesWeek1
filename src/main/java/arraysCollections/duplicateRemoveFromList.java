package arraysCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class duplicateRemoveFromList {

    public static void main(String args[]) {

        List<Integer> list = new ArrayList<>(
                Arrays.asList(1, 10, 1, 2, 2, 3, 10, 3, 3, 4, 5, 5));
        // Original List
        System.out.println("ArrayList with duplicates: "
                + list);


        List<Integer> newList = list.stream()
                .distinct()
                .collect(Collectors.toList());

        // final list
        System.out.println("ArrayList with duplicates removed: "
                + newList);

    }
}
