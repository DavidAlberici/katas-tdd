package DniValidatorKata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DniValidatorTest {
    @Test
    void isValid_whenDniIsValid_thenIsValid() {
        DniValidator dniValidator = new DniValidator("06341529S");
        assertTrue(dniValidator.isValid());
    }

    @Test
    void isValid_whenLengthIsNotCorrectSize_thenIsInvalid() {
        DniValidator dniValidator = new DniValidator("1234567890");
        assertFalse(dniValidator.isValid());
    }

    @Test
    void isValid_whenDoesNotContainLetter_thenIsInvalid() {
        DniValidator dniValidator = new DniValidator("123456789");
        assertFalse(dniValidator.isValid());
    }

    @Test
    void isValid_whenContainsMoreThanOneLetter_thenIsInvalid() {
        DniValidator dniValidator = new DniValidator("1234567AV");
        assertFalse(dniValidator.isValid());
    }

    @Test
    void isValid_whenLetterIsNotTheLastCharacter_thenIsInvalid() {
        DniValidator dniValidator = new DniValidator("1234Z5678");
        assertFalse(dniValidator.isValid());
    }

    @Test
    void isValid_whenLetterDoesNotMatchNumber_thenIsInvalid() {
        DniValidator dniValidator = new DniValidator("12345678A");
        assertFalse(dniValidator.isValid());
    }
}