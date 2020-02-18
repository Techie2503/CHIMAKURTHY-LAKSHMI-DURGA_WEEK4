package Interest;
import java.util.*;	

class interestCalculator
{
	public static void main(String args[])
	{
		try (Scanner s = new Scanner(System.in)) {
			Double T,R,P;
			Interest S=new simple_Interest();
			Interest C=new compound_Interest();
			System.out.println("Enter P:");
			P=s.nextDouble();
			System.out.println("Enter T:");
			T=s.nextDouble();
			System.out.println("Enter R:");
			R=s.nextDouble();
			Double simpleInterest=S.calculateInterest(P,T,R);
			Double compoundInterest=C.calculateInterest(P,T,R);
			System.out.println("Simple interest:"+Double.toString(simpleInterest));
			System.out.println("Compound interese:"+Double.toString(compoundInterest));
		}
	}
}