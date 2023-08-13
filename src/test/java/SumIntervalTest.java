import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumIntervalTest {

    @Test
    public void testSumIntervals() {
        int[][] intervals1 = {{1, 5}};
        assertEquals(4, SumInterval.sumIntervals(intervals1));

        int[][] intervals2 = {{1, 4}, {7, 10}, {3, 5}};
        assertEquals(7, SumInterval.sumIntervals(intervals2));

        int[][] intervals3 = {{1, 10}, {2, 5}};
        assertEquals(9, SumInterval.sumIntervals(intervals3));

        int[][] intervals4 = {{1, 5}, {12, 15}, {3, 10}};
        assertEquals(12, SumInterval.sumIntervals(intervals4));

        int[][] intervals5 = {{1, 5}, {12, 15}, {3, 10}, {13, 18}};
        assertEquals(15, SumInterval.sumIntervals(intervals5));

        int[][] intervals6 = {{-5, -2}, {-3, 0}, {-1, 4}};
        assertEquals(9, SumInterval.sumIntervals(intervals6));

        int[][] intervals7 = {};
        assertEquals(0, SumInterval.sumIntervals(intervals7));

        int[][] intervals8 = {{1, 1}, {5, 5}, {10, 10}};
        assertEquals(0, SumInterval.sumIntervals(intervals8));
    }

    public static void main(String[] args) {
        SumIntervalTest test = new SumIntervalTest();
        System.out.println("Test start");
        test.testSumIntervals();
        System.out.println("Test end with no exception error");
    }
}