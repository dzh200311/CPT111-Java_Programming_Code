package Week07;

public class StockPrice {
    private String ticker;
    private String date;
    private double open;
    private double close;
    private double high;
    private double low;
    private int volume;
    //getter
    public String getTicker() {
        return ticker;
    }

    public String getDate() {
        return date;
    }

    public double getOpen() {
        return open;
    }

    public double getClose() {
        return close;
    }

    public double getHigh() {
        return high;
    }

    public double getLow() {
        return low;
    }

    public int getVolume() {
        return volume;
    }
    //constructor

    public StockPrice(String ticker, String date, double open, double high, double low, double close,int volume) {
        this.ticker = ticker;
        this.date = date;
        this.open = open;
        this.close = close;
        this.volume = volume;
        this.low = low;
        this.high = high;
        System.out.println("Stock"+this.ticker+"has created");
    }


}
