package dz2.Task2;

import java.util.List;

class PrintReport implements OutputReport{
    public void output(List<ReportItem> items){
        System.out.println("Output to printer");
        for(ReportItem item : items){
            System.out.format("printer %s - %f \n\r", item.getDescription(), item.getAmount());
        }
    }
}
