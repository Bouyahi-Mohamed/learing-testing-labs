package lab5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class FuzzyTest {

    Fuzzy f = new Fuzzy();
//    @Test
//    public void testFuzzy1() {
//        Assertions.assertEquals("1",f.convert(1));
//    }
//    @Test
//    public void testFuzzy2() {
//        Assertions.assertEquals("2",f.convert(2));
//    }
//    @Test
//    public void testFuzzy3() {
//        Assertions.assertEquals("Fizz",f.convert(3));
//    }
//    @Test
//    public void testFuzzy4() {
//        Assertions.assertEquals("Fizz",f.convert(6));
//    }
//    @Test
//    public void testFuzzy5() {
//        Assertions.assertEquals("Fizz",f.convert(9));
//
//    }
//    @Test
//    public void testFuzzy6() {
//        Assertions.assertEquals("Buzz",f.convert(5));
//    }
//    @Test
//    public void testFuzzy7() {
//        Assertions.assertEquals("Buzz",f.convert(10));
    @DisplayName("test a single case ")
    @ParameterizedTest
    @CsvSource({
            "1,1", "2,2",
            "3,Fizz","6,Fizz","9,Fizz",
            "5,Buzz","10,Buzz",
            "15,FizzBuzz","30,FizzBuzz"
    })
    public void testFuzzyParameter(int input, String expected) {
        Assertions.assertEquals(expected, f.convert(input));

    }
    @DisplayName("test un numbre superieur a deux case  > ")
    @ParameterizedTest
    @CsvSource({
            "1,1,1","1,2,12",
            "1,3,12Fizz","1,5,12Fizz4Buzz",
            "1,15,12Fizz4BuzzFizz78FizzBuzz11Fizz1314FizzBuzz",

    })
    public void testFuzzyParameter(int input1,int input2 ,String expected) {
        Assertions.assertEquals(expected, f.genererchaine(input1,input2));

    }
}
