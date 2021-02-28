package DniValidatorKata;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DniValidator {

    private String dni;
    private static Map<Integer, Character> modToLetter;
    static {
        modToLetter = new HashMap<>(){{
            put(0, 'T');
            put(1, 'R');
            put(2, 'W');
            put(3, 'A');
            put(4, 'G');
            put(5, 'M');
            put(6, 'Y');
            put(7, 'F');
            put(8, 'P');
            put(9, 'D');
            put(10, 'X');
            put(11, 'B');
            put(12, 'N');
            put(13, 'J');
            put(14, 'Z');
            put(15, 'S');
            put(16, 'Q');
            put(17, 'V');
            put(18, 'H');
            put(19, 'L');
            put(20, 'C');
            put(21, 'K');
            put(22, 'E');
        }};
    }

    public DniValidator(String dni) {
        this.dni = dni;
    }

    public boolean isValid() {
        if (dni.length() != 9)
            return false;
        if (countLetters() != 1)
            return false;
        if (!isLastCharALetter())
            return false;
        if (!isLastCharALetter())
            return false;
        if (!checkNumberMatchLetter())
            return false;
        return true;
    }

    private int countLetters() {
        Pattern pattern = Pattern.compile("[a-zA-Z]");
        Matcher matcher = pattern.matcher(dni);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }

    private boolean isLastCharALetter() {
        return Character.isLetter(dni.charAt(dni.length()-1));
    }

    private boolean checkNumberMatchLetter() {
        long dniNumber = Long.parseLong(dni.substring(0,dni.length()-1));
        return modToLetter.get((int) dniNumber % 23).equals(dni.charAt(dni.length()-1));
    }
}

