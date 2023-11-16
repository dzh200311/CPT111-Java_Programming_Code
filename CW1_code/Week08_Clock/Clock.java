package Week08_Clock;/*
 * CW1 Week 7
 */
public class Clock {
    private int hours;
    private int minutes;

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    // CW1 #7.1
    // Creates a clock whose initial time is h hours and m minutes.
    public Clock(int h, int m) {
		if (h > 23 || h < 0 || m < 0 || m > 59){
            throw  new IllegalArgumentException();
        }else {
            this.hours = h;
            this.minutes = m;
        }
    }

    // CW1 #7.2
    // Creates a clock whose initial time is specified as a string, using the format HH:MM.
    public Clock(String s) {
        if (s.length() == 5 ) {
            int colon_locate = s.indexOf(':');
            if (colon_locate != -1) {
                String hours  = s.substring(0, colon_locate);
                String minutes = s.substring(colon_locate + 1);
                if (hours.length() == 2 && minutes.length() == 2){
                    int h = Integer.parseInt(hours);
                    int m  = Integer.parseInt(minutes);
                    if (h > 23 || h < 0 || m < 0 || m > 59){
                        throw  new IllegalArgumentException();
                    }else {
                        this.hours = h;
                        this.minutes = m;
                    }
                }else {
                    throw  new IllegalArgumentException();
                }
            }else {
                throw  new IllegalArgumentException();
            }
        }else {
            throw  new IllegalArgumentException();

        }

    }

    // CW1 #7.3
    // Returns a string representation of this clock, using the format HH:MM.
    public String toString() {
        if (hours < 10){
            if (minutes < 10){
                return "0"+hours+":"+"0"+minutes;
            }else return "0"+hours+":"+minutes;
        }else if(minutes < 10){
            return hours + ":" + "0" +minutes;
        }return hours+":"+minutes;

    }

    // CW1 #7.4
    // Is the time on this clock earlier than the time on that one?
    public boolean isEarlierThan(Clock that) {
        if (this.hours < that.hours){
            return true;
        }else if (this.hours == that.hours){
            return this.minutes < that.minutes;
        } else return false;

    }

    // CW1 #7.5
    // Adds 1 minute to the time on this clock.
    public void tick() {
        this.minutes++;
        if (minutes > 59){
            minutes = 0;
            hours ++;
        }
        if (hours > 23){
            hours = 0;
            minutes = 0;
        }
    }
    public static void tick(Clock clock) {
        clock.tick();
    }//归属于类

    // CW1 #7.6
    // Adds delta minutes to the time on this clock.
    public void tock(int delta) {
        if (delta >= 0) {
            int hourRemain = delta / 60;
            int minuteRemain = delta % 60;

            minutes += minuteRemain;
            if (minutes >= 60){
                hours++;
                minutes -= 60;
            }
            hours += hourRemain;
            if (hours / 24 >= 1) {
                hours -= 24 * (hours / 24);
            }
        }else {
            throw new IllegalArgumentException("Illegal negative delta " + delta);
        }
    }





    /*public void tock3(int delta) {
        int num=hours*60+minutes+delta;
        if(num<1440){
            int mins=num%60;
            int hor=num/60;
            hours=hor;
            minutes=mins;}
        else{
            //num = num % 60 == 0 ? num-1440 : num-1440*((hours+delta/60)/24);
            //num -= 1440*((hours+delta/60)/24);
            num = num % 1440;
            int mins=num%60;
            int hor=num/60;
            hours=hor;
            minutes=mins;}
    }*/



    // Test client
    public static void main(String[] args) {

        // Testing Exercise #10.1
        Clock clock1 = new Clock(1, 0);
        System.out.println(clock1);

        try {
            Clock clock2 = new Clock(90, 90);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid argument in constructor 1!");
        }

        // Testing Exercise #10.2
        Clock clock3 = new Clock("02:30");
        System.out.println(clock3);

        try {
            Clock clock4 = new Clock("99:30");
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid argument in constructor 2!");
        }

        // Testing Exercise #10.3
        Clock clock5 = new Clock("02:30");
        clock5.tock(100);
        System.out.println(clock5);

        try {
            clock5.tock(-50);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Testing Exercise #10.4
        AlarmClock clock6 = new AlarmClock(5, 59, 6, 0);
        AlarmClock.tick(clock6);  // Beep beep beep beep!
        System.out.println("+");
        clock6.tick();
        System.out.println("+");



    }
}
