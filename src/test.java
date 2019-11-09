import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class test {
    @Test
    public void testSolution() {
        Solution tester = new Solution(); // MyClass is tested

        // assert statements
        assertTrue(tester.twoSum(new int[]{2, 7, 11, 15}, 9), "2 + 7 = 9");
    }
}

