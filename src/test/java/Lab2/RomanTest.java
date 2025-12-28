package Lab2;

import Lab2.Roman;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RomanTest {
    Roman r;
    @BeforeEach
    void init(){
         r = new Roman();
    }
    @DisplayName("V1")
    @Test
    void  testAdd() {
        int resAttendv = 3;
        int resObtenu = r.romanToNum("III");
        Assertions.assertEquals(resAttendv, resObtenu);

    }

    @Test
    void  testSub() {
        int resAttendv = 6;
        int resObtenu = r.romanToNum("VI");
        Assertions.assertEquals(resAttendv, resObtenu);

    }
    @Test
    void  testMix() {
        int resAttendv = 44;
        int resObtenu = r.romanToNum("XLIV");
        Assertions.assertEquals(resAttendv, resObtenu);

    }
    @Test
    void  testMix1000() {
        int resAttendv = 1000;
        int resObtenu = r.romanToNum("M");
        Assertions.assertEquals(resAttendv, resObtenu);

    }
    @Test
    void  test1ToRoman() {
        int resAttendv = 1;
        int resObtenu = r.romanToNum("I");
        Assertions.assertEquals(resAttendv, resObtenu);

    }
    @Test
    void  test5ToRoman() {
        int resAttendv = 5;
        int resObtenu = r.romanToNum("V");
        Assertions.assertEquals(resAttendv, resObtenu);

    }
    @Test
    void  test10ToRoman() {
        int resAttendv = 10;
        int resObtenu = r.romanToNum("X");
        Assertions.assertEquals(resAttendv, resObtenu);

    }
    @Test
    void  test50ToRoman() {
        int resAttendv = 50;
        int resObtenu = r.romanToNum("L");
        Assertions.assertEquals(resAttendv, resObtenu);

    }
    @Test
    void  test100ToRoman() {
        int resAttendv = 100;
        int resObtenu = r.romanToNum("C");
        Assertions.assertEquals(resAttendv, resObtenu);

    }
    @Test
    void  test500ToRoman() {
        int resAttendv = 500;
        int resObtenu = r.romanToNum("D");
        Assertions.assertEquals(resAttendv, resObtenu);

    }
    @Test
    void  test1000ToRoman() {
        int resAttendv = 1000;
        int resObtenu = r.romanToNum("M");
        Assertions.assertEquals(resAttendv, resObtenu);

    }
    @DisplayName("V3")
    @ParameterizedTest
    @CsvSource({"I,1,la valeur est 1","VII,7,la valeur est 7"})
    void  test3ToRoman(String input , int expected,String msg) {
        Assertions.assertEquals(expected,  r.romanToNum(input),msg);

    }


}