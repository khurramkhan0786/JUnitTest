package com.Test.ServiceTest;

import com.Test.Service.CalculatorService;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Date;

public class CalculatorServiceTest {

    @BeforeClass
    public static void init(){
        System.out.println("it is before intit class");
        System.out.println("Started date is : " + new Date());
    }

    @Test
    public void addTwoNumberTest(){
        int result = CalculatorService.add(23,43);
        int expected = 66;
        Assert.assertEquals(expected,result);
    }
   @Test
    public void SumNumbersTest(){
        int result = CalculatorService.SumanyNumbers(2,3,4,5);
        int expected = 14;
        Assert.assertEquals(expected,result);
    }

    @AfterClass
    public static void cleanUp(){
        System.out.println("it is after cleanUp class");
        System.out.println("end of the test : "+new Date());
    }
}
