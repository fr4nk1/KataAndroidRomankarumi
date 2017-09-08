package idealista.katatestromano;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    @Test
    public void testZeroIsEmpty(){
        ArabicToRomanCalculator calculator = new ArabicToRomanCalculator();
        String result = calculator.calculate(0);
        Assert.assertEquals("", result);
    }

    @Test
    public void testOneIsI(){
        ArabicToRomanCalculator calculator = new ArabicToRomanCalculator();
        String result = calculator.calculate(1);
        Assert.assertEquals("I", result);
    }

    @Test
    public void testTwoIsII(){
        ArabicToRomanCalculator calculator = new ArabicToRomanCalculator();
        String result = calculator.calculate(2);
        Assert.assertEquals("II", result);
    }

    @Test
    public void testTwoIsIII(){
        ArabicToRomanCalculator calculator = new ArabicToRomanCalculator();
        String result = calculator.calculate(3);
        Assert.assertEquals("III", result);
    }

    @Test
    public void testTwoIsIV(){
        ArabicToRomanCalculator calculator = new ArabicToRomanCalculator();
        String result = calculator.calculate(4);
        Assert.assertEquals("IV", result);
    }

    @Test
    public void testTwoIsV(){
        ArabicToRomanCalculator calculator = new ArabicToRomanCalculator();
        String result = calculator.calculate(5);
        Assert.assertEquals("V", result);
    }

    @Test
    public void testTwoIsVI(){
        ArabicToRomanCalculator calculator = new ArabicToRomanCalculator();
        String result = calculator.calculate(6);
        Assert.assertEquals("VI", result);
    }

    @Test
    public void testTwoIsX(){
        ArabicToRomanCalculator calculator = new ArabicToRomanCalculator();
        String result = calculator.calculate(10);
        Assert.assertEquals("X", result);
    }

    @Test
    public void testTwoIsIX(){
        ArabicToRomanCalculator calculator = new ArabicToRomanCalculator();
        String result = calculator.calculate(9);
        Assert.assertEquals("IX", result);
    }


    @Test
    public void testTwoIsXI(){
        ArabicToRomanCalculator calculator = new ArabicToRomanCalculator();
        String result = calculator.calculate(11);
        Assert.assertEquals("XI", result);
    }

}