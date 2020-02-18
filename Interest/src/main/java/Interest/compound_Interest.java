package Interest;

class compound_Interest extends Interest
{
	Double calculateInterest(Double P,Double T,Double R)
	{
		Double I=(P*Math.pow((1+(R/100.0)),T))-P;
		return I;
	}
}