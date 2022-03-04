import org.junit.Assert;
import org.junit.Test;

public class CalculatorTests {

    @Test
    public void TestOne(){
        // Arrange
        int x = 5;
        int y = 10;

        // Act
        int sum = x + y;

        //Assert
        Assert.assertEquals(15, sum);
    }
}
