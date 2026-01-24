package jan20.CollectionDemos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Taskque1 {
    public static void main(String[] args) {

        List<Integer> attendanceList = new ArrayList<>();

        attendanceList.add(101);
        attendanceList.add(102);
        attendanceList.add(103);
        attendanceList.add(101);
        attendanceList.add(104);
        attendanceList.add(102);

        HashSet<Integer> uniqueAttendance = new HashSet<>(attendanceList);

        System.out.println("Total entries recorded: " + attendanceList.size());

        int duplicates = attendanceList.size() - uniqueAttendance.size();
        System.out.println("Duplicate entries detected: " + duplicates);
        System.out.println("Final unique attendance list:");

        for(Integer roll : uniqueAttendance) {
            System.out.println(roll);
        }
    }
}

