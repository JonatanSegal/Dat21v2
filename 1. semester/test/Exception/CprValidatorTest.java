/*
package Exception;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CprValidatorTest {

    @Test
    void validator() {
        //Arrange
        CprValidator Cpr = new CprValidator();

        //Act
        Boolean tenNumberCpr = Cpr.validator("1234567890");

        //Assert
        assertEquals(true,tenNumberCpr);
        assertThrows(WrongCprException.class,()-> Cpr.validator("123"));
        assertThrows(WrongCprException.class,()-> Cpr.validator("12345678910"));
        assertThrows(WrongCprException.class,()-> Cpr.validator("Abcd"));
    }
}

 */