package FunctionalProgram;

public class WindChill {
	public static void main(String args[]) {
		Double t=Double.parseDouble(args[0]);
		Double v=Double.parseDouble(args[1]);
		if(v<3&&v<120 ||t<50) {
//		if(t>50&&(v>120||v>3)) {
			Double w=35.74+0.6215*t+(0.4275*t-35.75)*Math.pow(v, 0.16);
			System.out.println(w);
		}
	}
}
