package school.mjc.stage0.conditions.task1;

public class PositiveNumberDeterminer {

    public void isPositive(int numberToBeDetermined) {

        if (numberToBeDetermined > 0) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is not positive.");
        }
    }

    public static void main(String[] args) {

        PositiveNumberDeterminer positiveNumberDeterminer = new PositiveNumberDeterminer();
        positiveNumberDeterminer.isPositive(10);
        positiveNumberDeterminer.isPositive(-10);
    }
}
