package Week07;




public class test {
    public static void main(String[] args) {
        /*Clock clock1 = new Clock(23, 59);
        Clock clock2 = new Clock("20:59");

        System.out.println(clock1);
        System.out.println(clock2);

        System.out.println(clock1.isEarlierThan(clock2));

        clock1.tick();
        clock2.tock(100000);

        System.out.println(clock1);
        System.out.println(clock2);*/

/*

        StockPrice sp1 = new StockPrice("AAPL","1999-9-9",100,901,95,95,765432100);
        StockPrice sp2 = new StockPrice("AAPL","2020-1-1",1010,9140,915,915,71232100);
        StockPrice sp3 = new StockPrice("AAPL","2010-1-1",1101,9199,915,915,71232100);
        System.out.println(sub(sp1.getHigh(),sp1.getLow()));
        StockPrice[] a = {sp1,sp2,sp3};
        for (int i = 0; i < a.length; i++) {
            System.out.println("Ticker is " + a[i].getTicker());
            System.out.println("================================================");
            System.out.println("---open price is " + a[i].getOpen());
            System.out.println("---close price is " + a[i].getClose());
        }
*/






    }
    public static double sub(double high, double low){
        return (high - low);
    }

}
