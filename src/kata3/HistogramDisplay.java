package kata3;
import java.awt.Dimension;
import java.util.Iterator;
import java.util.Set;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

public class HistogramDisplay extends ApplicationFrame {
    public Histogram<String> histogram;
    
    public HistogramDisplay (Histogram<String> histogram) {
        super("HISTOGRAMA");
        this.histogram = histogram;
        setContentPane(createPanel());
        pack();     
    }
    public void execute() {
        setVisible(true);
    }

    private JPanel createPanel() {
        ChartPanel chartpanel = new ChartPanel(createChart(createDataSet()));
        chartpanel.setPreferredSize(new Dimension(500,400));
        return chartpanel;
    }
    
    private JFreeChart createChart(DefaultCategoryDataset dataSet) {
        JFreeChart  chart = ChartFactory.createBarChart("Histograma JFreeChart", "Dominios email",
                 "Nº de emails", dataSet, PlotOrientation.VERTICAL, false, false, true);
        return chart;
    }
    
    public DefaultCategoryDataset createDataSet() {
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        Set<String> set = histogram.keySet();
        for (Iterator<String> iterator = set.iterator(); iterator.hasNext();) {
            String next = iterator.next();
            dataSet.addValue(histogram.get(next), "", next);
        }
        return dataSet;
    }
}
