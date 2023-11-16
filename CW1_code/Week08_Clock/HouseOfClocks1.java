package Week08_Clock;

/*
 * CW1 Week 10
 */
public class HouseOfClocks1 {

    // A house of clocks stores all its clocks in an array of Clock objects
    private Clock[] clocksCollection;
    // the number of clocks
    private int numClocks;


    // CW1 #10.1
    // Creates a house of clocks which has a collection of numClocks clocks.
    // numClocks must be between 1 and 24, inclusive,
    //     and throws IllegalArgumentException otherwise.
    // The first clock must start at 00:00, the second clock at 01:00, and so on.
    // For example,
    //     if numClocks = 3, it stores 3 clocks starting at 00:00, 01:00, and 02:00.
    //     if numClocks = 24, it stores 24 clocks where the last one at index 23 starts at 23:00.
    public HouseOfClocks1(int numClocks) {
        if (numClocks < 1 || numClocks > 24) {
            throw new IllegalArgumentException();
        }else {
            this.numClocks = numClocks;
            clocksCollection = new Clock[numClocks];
            for (int i = 0; i < numClocks; i++) {
                clocksCollection[i] = new Clock(i,0);
            }
        }



    }

    // CW1 #10.2
    // creates a house of clocks which has a collection of four types of clocks in Week 9:
    // nClock, nAlarm, nCuckoo, nHalloween number of Clock, AlarmClock, CuckooClock, and HalloweenClock objects, respectively
    // all number of clock of any types must be between 0 and 24, inclusive;
    // and the total number of clocks must be between 1 and 24, inclusive;
    // and throws IllegalArgumentException, otherwise
    // the first clock must start at 00:00, the second clock at 01:00, and so on
    // the alarm time of the AlarmClock objects must be 1 hour after the starting time
    // for example,
    // if nClock = 1, nAlarm = 1, nCuckoo = 1, nHalloween = 1,
    // it stores total of 4 clocks where the first clock at index 0 is a Clock object starts at 00:00,
    // the second clock at index 1 is an AlarmClock object starts at 01:00
    // the third clock at index 2 is a CuckooClock object starts at 02:00
    // and the fourth clock at index 3 is a HalloweenClock object starts at 03:00

    public HouseOfClocks1(int nClock, int nAlarm, int nCuckoo, int nHalloween) {
        //
        int count = 0;
        if (nClock < 0 ||nAlarm < 0 ||nCuckoo < 0 ||nHalloween < 0 || nClock > 24 || nAlarm  > 24 || nCuckoo  > 24 || nHalloween > 24 ) {
            throw new IllegalArgumentException();
        }else {
            int total = nClock + nAlarm + nCuckoo + nHalloween;
            if (total >= 1 && total <= 24) {
                this.numClocks = total;
                clocksCollection = new Clock[numClocks];
                for (int i = 0; i < nClock; i++) {
                    clocksCollection[count] = new Clock(i,0);
                    count++;
                }
                for (int i = 0; i < nAlarm; i++) {
                    clocksCollection[count] = new AlarmClock(count, 0,count+1 ,0);
                    count++;
                }
                for (int i = 0; i < nCuckoo; i++) {
                    clocksCollection[count] = new CuckooClock(count,0);
                    count++;
                }
                for (int i = 0; i < nHalloween; i++) {
                    clocksCollection[count] = new HalloweenClock(count, 0);
                    count++;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }

    }


    // CW1 #10.3
    // Calls the tick method of the clock in the collection at index clockIndex.
    // Throw an IndexOutOfBoundsException if the clockIndex is not valid,
    //     and use the message "No clock stored at index " followed by the invalid index.
    public void tick(int clockIndex) {
        if(clockIndex < 0 || clockIndex >= this.numClocks) {
            throw new IndexOutOfBoundsException("No clock stored at index " + clockIndex);
        }
        clocksCollection[clockIndex].tick();
    }



    // Prints the time of all the clocks in the collection
    // Do NOT modify this method
    public void printClocks() {
        for (int i = 0; i < numClocks; i++) {
            System.out.println(clocksCollection[i]);
        }
    }


    // Test Client
    public static void main(String[] args) {

        // Test Case First Constructor #1
        HouseOfClocks1 hc1 = new HouseOfClocks1(3);
        hc1.printClocks();                       // 00:00↵01:00↵02:00

        // Test Case First Constructor #2
        try {
            HouseOfClocks1 hc2 = new HouseOfClocks1(100);
        } catch (IllegalArgumentException e) {
            System.out.println("Too much clocks to store!");
        }

        // Test Case Tick #1
        hc1.tick(0);
        hc1.tick(0);
        hc1.tick(1);
        hc1.printClocks();                       // 00:02↵01:01↵02:00

        // Test Case Second Constructor and Polymorphic Tick
        HouseOfClocks1 hc3 = new HouseOfClocks1(1, 1, 1, 1);
        hc3.printClocks();              // 00:00↵01:00↵02:00↵03:00

        for (int i = 0; i < 60; i++) {
            hc3.tick(1);                // Beep beep beep beep!
        }
        for (int i = 0; i < 60; i++) {
            hc3.tick(2);                // Cuckoo!↵Cuckoo!↵Cuckoo!
        }
        for (int i = 0; i < 3; i++) {
            hc3.tick(3);                // Halloween!
        }
        try {
            HouseOfClocks1 hc4 = new HouseOfClocks1(0, 0, 0, 24);
        }
        catch (IllegalArgumentException e) {
            System.out.println("No negative arguments!");
        }



        // Test Case Tick #2
        try {
            hc1.tick(100);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());  // No clock stored at index 100
        }

        AlarmClock clock6 = new AlarmClock(5, 59, 6, 0);
        Clock.tick(clock6);  // Beep beep beep beep!
        System.out.println("+");
        clock6.tick();
        System.out.println("+");

    }

}
