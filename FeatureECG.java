package lanc2018_QRS;

public class FeatureECG {

	public FeatureECG(double mediaQ,double mediaR, double mediaS,double desvioQ2, double desvioR2, double desvioS2) {
		this.meanQ =mediaQ;
		this.meanR =mediaR;
		this.meanS=mediaS;
		this.desvioQ= desvioQ2;
		this.desvioR= desvioR2;
		this.desvioS=desvioS2;
	}
	double meanQ;
	double meanR;
	double meanS;
	double desvioQ;
	double desvioR;
	double desvioS;
	 
	
	
	
}
