package Lab1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    Calculator calc;

    @BeforeEach
    void init(){
         calc = new Calculator();
    }

    @Test
    void addTento20() {
        //Araanger
        int resAttendv = 30;
        //Act
        int resObtenu = calc.addTen(20  );
        //Assert
        Assertions.assertEquals(resAttendv, resObtenu);

    }
    @Test
    void addTenThrowException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            System.out.println(calc.addTen(-10));

        });
    }

    @Test
    void addTenZeroException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            System.out.println(calc.addTen(0));

        });
    }
}
