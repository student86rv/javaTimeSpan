public class Main {

    public static void main(String[] args) {

        int hrs = 15;
        int min = 45;

        TimeSpan time1 = new TimeSpan(hrs, min);
        System.out.println("time1= "+time1);

        TimeSpan time2 = new TimeSpan(4, 30);
		System.out.println("time2= "+time2);
		System.out.println();
		
        time1.add(time2);
        System.out.println("time1 + time2= "+time1);

        time1.sub(time2);
        System.out.println("time1 - time2= "+time1);

        time1.mult(2.5);
        System.out.println("time1 * times= "+time1);
	}
}