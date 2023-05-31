public class Mars {
    public static void main(String[] args) throws InterruptedException {

        String colonyName = "SpaceX";
        int shipPopulation = 300;
        double meals = 4000.00;
        boolean landing = true;
//Calculate how many meals are left after landing using mathematical operators.
        meals = meals - (shipPopulation * 0.75);
        meals = meals - (shipPopulation * 0.75);

        //Print the number of meals that are left.
        System.out.println(meals);

        //An extra crate of food is found increasing meals by 50%!
        // Reassign the value of meals to be 50% higher than it was using a mathematical expression.

        meals = meals + (meals * .5);

        //The births onboard are very perfectly timed and 5 more babies join the population
        // during the 2 days it takes to land.Reassign shipPopulation to reflect that.

        shipPopulation = shipPopulation + 5;

        String landingLocation = "The hill";
        if (landingLocation.equalsIgnoreCase("The Plain")) {
            System.out.println("Buzz landing on The Plain");

        } else {
            System.out.println("ERROR!!! Flight plan already set. Landing on The Plain");
        }
        landing = landingCheck(100);
        new GuessingGame(); // Instantiate the GuessingGame class


    }

    private static boolean landingCheck(int minutesLeft) throws InterruptedException {
        for (int minute = 0; minute <= minutesLeft; minute++) {
            if (((minute % 3) == 0) && ((minute % 2) == 0)) {
                System.out.println("Keep Center");
            } else if ((minute % 2) == 0) {
                System.out.println("Right");
            } else if ((minute % 3) == 0) {
                System.out.println("Left");
            } else {
                System.out.println("Calculating");
            }
            Thread.sleep(250);
        }
        System.out.println("Landed");
        return false;
    }
}






