package Interest;

class simple_Interest extends Interest
{
	Double calculateInterest(Double P,Double T,Double R)
	{
		return (P*T*R)/100;
	}
}