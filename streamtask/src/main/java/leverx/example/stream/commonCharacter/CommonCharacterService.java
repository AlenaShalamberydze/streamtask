package leverx.example.stream.commonCharacter;

import java.util.HashMap;
import java.util.Map;

public class CommonCharacterService {

    public static void countMostCommonCharacter(String string) {

        Map<Character, Integer> chars = new HashMap<>();

        string.chars()
                .mapToObj(characters -> (char) characters)
                .forEach(character -> {
                    chars.put(character, chars.containsKey(character)
                            ? chars.get(character) + 1
                            : 1);
                });

        System.out.println(chars.entrySet().stream()
                .max(Map.Entry.comparingByValue()).toString());
    }
}
