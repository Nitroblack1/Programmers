package programmers.Lv0_problems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

//        AlienDictionary alienDictionary = new AlienDictionary();
//                String[][] spell = {{"p", "o", "s"}, {"z", "d", "x"}, {"s", "o", "m", "d"}};
//                String[][] dic = {{"sod", "eocd", "qixm", "adio", "soo"}, {"def", "dww", "dzx", "loveaw"},
//                {"moos", "dzx", "smm", "sunmmo", "som"}};
//
//                for (int i = 0; i < spell.length; i++) {
//        System.out.println(alienDictionary.solution(spell[i], dic[i]));
//        }

public class AlienDictionary {

    public int solution(String[] spell, String[] dic) {
        for (String word : dic) {
            if (Arrays.stream(word.split("")).distinct().sorted(Comparator.naturalOrder()).collect(
                    Collectors.toList()).equals(Arrays.stream(spell)
                    .sorted(Comparator.naturalOrder()).collect(
                    Collectors.toList()))) {
                return 1;
            }
        }
        return 2;
    }
}
