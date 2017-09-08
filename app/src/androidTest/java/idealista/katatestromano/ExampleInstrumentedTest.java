package idealista.katatestromano;

import org.junit.Assert;
import org.junit.Test;


public class ExampleInstrumentedTest {

    @Test
    public void testZeroIsEmpty(){
        ArabicToRomanCalculator calculator = new ArabicToRomanCalculator();
        String result = calculator.calculate(0);
        Assert.assertEquals("", result);
    }
}
