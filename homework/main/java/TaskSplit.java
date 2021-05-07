import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TaskSplit {

    public String setTextFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write something:");
        String textFromConsole = scanner.nextLine();
        return textFromConsole;
    }

    public ArrayList<String> split(String text) {

        String[] fixText = text.split("[ ,.!?]");

        ArrayList<String> stringToList = new ArrayList<>();

        for (String i : fixText) {
            stringToList.add(i);
        }
        return stringToList;
    }

    public void splitText() {

        ArrayList<String> arrayList = split(setTextFromConsole());

        Set<String> set = new HashSet<>(arrayList);
        arrayList.clear();
        arrayList.addAll(set);

        String fixed = "";
        for (String i : arrayList) {
            fixed += i + ",";
        }

        System.out.println("New: " + fixed);
    }


}
