public class FitnessTrackerTest {

    public static void main(String[] args) throws InterruptedException
    {

        long delay = 10;
        int howManyTimes = 70;

        FitnessTracker myTracker = new FitnessTracker();

        String message;

        int nightTimeCounter = 0;

        int greatCounter = 0; // more than 150 watts

        int lowCounter = 0; //less than 50 watts
        myTracker.setName("Annett");
        System.out.println(myTracker.getName());

        for (int x = 1; x<= howManyTimes; x++){

            message = myTracker.getInfo();
            System.out.println(message);

            myTracker.getCurrrentTime();

            myTracker.getEnergyLevel();

            Thread.sleep(delay);

            myTracker.goOn();


            }



        }


    }
