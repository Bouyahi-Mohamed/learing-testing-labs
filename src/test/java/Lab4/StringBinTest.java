package Lab4;

import Lab2.Roman;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class StringBinTest {

    StringBin S;
    @BeforeEach
    void init(){
        S = new StringBin();
    }

    @DisplayName("test Sum les caracteur to code ascci")
    @ParameterizedTest
    @CsvSource({"'',0,converter de vide->decemal","A,65,converter de A->65","AB,131, convert  AB -> 131"})
    void  TestSum(String input , int expected,String msg) {
        Assertions.assertEquals(expected,S.sum(input),msg);
    }

    @DisplayName("test decimal to binary")
    @ParameterizedTest
    @CsvSource({"0,'',converter 0->binary 0 -> binary","65,'1000001',converter de 65-> binary 1000001","131,10000011, convert  131 -> binary 10000011 "})
    void  testBinary(int input , String expected,String msg) {
        Assertions.assertEquals(expected,S.binarise(input),msg);
    }

    @ParameterizedTest
    @CsvSource({"A,1000001,converter de a->binare","AB,10000011,converter de AB->binare","'','',converter de vide ->binare"})
    void  TestStingToBinary(String input , String expected,String msg) {
        Assertions.assertEquals(expected,S.convertSumStringToBin(input),msg);

    }


}