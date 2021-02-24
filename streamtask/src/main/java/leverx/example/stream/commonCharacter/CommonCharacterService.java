package leverx.example.stream.commonCharacter;

import java.util.HashMap;
import java.util.Map;

import static java.util.Map.Entry.comparingByValue;

public class CommonCharacterService {

    public static Map.Entry<Character, Integer> countMostCommonCharacter(String string) {
        Map<Character, Integer> chars = getCharsMapFromString(string);
        return chars.entrySet().stream()
                .max(comparingByValue()).orElse(null);
    }

    private static Map<Character, Integer> getCharsMapFromString(String string) {
        Map<Character, Integer> chars = new HashMap<>();
        string.chars()
                .mapToObj(characters -> (char) characters)
                .forEach(character -> {
                    chars.put(character, chars.containsKey(character)
                            ? chars.get(character) + 1
                            : 1);
                });
        return chars;
    }

}
