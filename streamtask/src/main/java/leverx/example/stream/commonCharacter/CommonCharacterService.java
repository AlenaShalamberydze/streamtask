package leverx.example.stream.commonCharacter;

import java.util.HashMap;
import java.util.Map;

import static java.util.Map.Entry.comparingByValue;

public class CommonCharacterService {

    private static Map<Character, Integer> chars;

    public static Map.Entry<Character, Integer> countMostCommonCharacter(String string) {
        chars = getCharsMapFromString(string);
        return chars.entrySet().stream()
                .max(comparingByValue()).orElse(null);
    }

    private static Map<Character, Integer> getCharsMapFromString(String string) {
        chars = new HashMap<>();
        string.chars()
                .mapToObj(characters -> (char) characters)
                .forEach(CommonCharacterService::fillCharsMap);
        return chars;
    }

    private static void fillCharsMap(char character) {
        chars.put(character, chars.containsKey(character)
                ? chars.get(character) + 1
                : 1);
    }

}
