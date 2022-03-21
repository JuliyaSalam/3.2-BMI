public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int newweight = 70;
        int newheight = 170;
        int newbmi = service.calculate(newweight, newheight);
        System.out.println("Ваш BMI = " + newbmi);
    }
}
