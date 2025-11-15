package morseconverter;

import java.util.HashMap;

public class Logic {
    private String input = "";
    private String output;
    private HashMap<String, String> engToMor = new HashMap<>();
    private HashMap<String, String> morToEng = new HashMap<>();

    public Logic() {
        engToMor.put("A", ".-");
        engToMor.put("B", "-...");
        engToMor.put("C", "-.-.");
        engToMor.put("D", "-..");
        engToMor.put("E", ".");
        engToMor.put("F", "..-.");
        engToMor.put("G", "--.");
        engToMor.put("H", "....");
        engToMor.put("I", "..");
        engToMor.put("J", ".---");
        engToMor.put("K", "-.-");
        engToMor.put("L", ".-..");
        engToMor.put("M", "--");
        engToMor.put("N", "-.");
        engToMor.put("O", "---");
        engToMor.put("P", ".--.");
        engToMor.put("Q", "--.-");
        engToMor.put("R", ".-.");
        engToMor.put("S", "...");
        engToMor.put("T", "-");
        engToMor.put("U", "..-");
        engToMor.put("V", "...-");
        engToMor.put("W", ".--");
        engToMor.put("X", "-..-");
        engToMor.put("Y", "-.--");
        engToMor.put("Z", "--..");
        engToMor.put(" ", " ");

        for (String key : engToMor.keySet()) {
            morToEng.put(engToMor.get(key), key);
        }
    }

    public String convert(String input) {
        try {
            output = "";
            this.input = input.toUpperCase();

            if (input.contains(".") || input.contains("-")) {
                String[] morseSnippets = input.split(" ");
                for (String morseSnippet : morseSnippets) {
                    output = output.concat(morToEng.getOrDefault(morseSnippet, " Fel 1! "));
                }
            } else {
                char[] letters = this.input.toCharArray();
                for (char letter : letters) {
                    output = output.concat(engToMor.getOrDefault(String.valueOf(letter), " Fel 2! "));
                }
            }

        } catch (Exception e) {
            System.out.println("Något gick fel" + e);
        }
        return output.trim();
    }

}
