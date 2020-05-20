package dz2.Task2;

class Programm{
    public static void main(String[] args){
        Report report = new Report(new PrintReport());
        report.calculate();
        report.output();
        report.setOutputReport(new DisplayReport());
        report.output();
    }
}