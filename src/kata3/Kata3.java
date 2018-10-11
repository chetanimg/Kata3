package kata3;

public class Kata3 {

    public static void main(String[] args) {
       Histogram<String> histogram= new Histogram<String>();
       histogram.increment("gmail.com");
       histogram.increment("yahoo.com");
       histogram.increment("gmail.com");
       histogram.increment("ulpgc.es");
       histogram.increment("hotmail.com");
       new HistogramDisplay(histogram).execute();
    }
}
