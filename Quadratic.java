import java.util.Scanner;
class Quadratic{
		public static double discriminant(double a,double b,double c){
			return Math.pow(b,2)-(4*a*c);
}
        public static void main(String args[]){
				Scanner sc=new Scanner(System.in);
				double a,b,c,D,root1,root2;
				System.out.println("enter a,b and c values:");
				a=sc.nextDouble();
				b=sc.nextDouble();
				c=sc.nextDouble();
				D=discriminant(a,b,c);
				
	if(D>0){
		root1=(-b+ Math.sqrt(D))/(2*a);
		root2=(-b- Math.sqrt(D))/(2*a);
		System.out.println("Roots are real and distinct:");
		System.out.println("Root 1=" +root1);
		System.out.println("Root 2=" +root2);
	}
	else if(D==0){
		root1=(-b)/(2*a);
		System.out.println("Roots are real and equal");
		System.out.println("Root 1=Root 2="+root1);
	}
	else{
		System.out.println("Roots are complex and imaginary");
	}
}
}	
