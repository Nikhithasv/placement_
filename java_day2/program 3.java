import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

 class HelloWorld {
    public static List<String> club(List<String> words) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < words.size(); i++) {
            for (int j = 0; j < words.size(); j++) {
                if (i != j && words.get(j).contains(words.get(i))) {
                    result.add(words.get(j));
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter words:");
        String inputLine = scanner.nextLine();
        List<String> inputWords = List.of(inputLine.split("\\s+"));

        List<String> output = club(inputWords);

        System.out.println("clubbed words: " + output);
    }
}
