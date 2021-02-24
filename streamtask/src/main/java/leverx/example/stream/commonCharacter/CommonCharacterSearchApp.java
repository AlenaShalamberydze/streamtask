package leverx.example.stream.commonCharacter;

import static leverx.example.stream.commonCharacter.CommonCharacterService.countMostCommonCharacter;

public class CommonCharacterSearchApp {

    public static void main(String[] args) {
        String stringForTest = "aabbbcdefghhhhhhijkklm";

        System.out.println(countMostCommonCharacter(stringForTest));
    }
}
