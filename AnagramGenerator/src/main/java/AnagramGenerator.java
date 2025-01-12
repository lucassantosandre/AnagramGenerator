import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnagramGenerator {

    public static List<String> generateAnagrams(String input) {
        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException("A entrada deve ser uma string não vazia.");
        }
        if (!input.matches("[a-zA-Z]+")) {
            throw new IllegalArgumentException("A entrada deve conter apenas letras.");
        }

        List<String> anagrams = new ArrayList<>();
        generateAnagramsHelper("", input, anagrams);
        return anagrams;
    }

    private static void generateAnagramsHelper(String prefix, String remaining, List<String> anagrams) {
        if (remaining.isEmpty()) {
            anagrams.add(prefix);
            return;
        }

        for (int i = 0; i < remaining.length(); i++) {
            String newPrefix = prefix + remaining.charAt(i);
            String newRemaining = remaining.substring(0, i) + remaining.substring(i + 1);
            generateAnagramsHelper(newPrefix, newRemaining, anagrams);
        }
    }

    public static void main(String[] args) {
        String input = null;

        if (args.length > 0) {
            input = args[0];
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.println("🖊️ Digite uma string de letras distintas para gerar anagramas:");
            if (scanner.hasNextLine()) {
                input = scanner.nextLine();
            }
            scanner.close();
        }

        try {
            if (input == null || input.isEmpty()) {
                throw new IllegalArgumentException("A entrada deve ser fornecida como argumento ou no modo interativo.");
            }

            List<String> anagrams = generateAnagrams(input);

            String blue = "\u001B[34m";
            String green = "\u001B[32m";
            String reset = "\u001B[0m";

            System.out.println();
            System.out.println(green + "🚀 Anagramas de '" + input + "' gerados com sucesso: 🚀" + reset);
            System.out.println(blue + anagrams + reset);
        } catch (IllegalArgumentException e) {
            String red = "\u001B[31m";
            System.err.println(red + e.getMessage() + "\u001B[0m");
        }
    }
}
