package soru3;

public class Kertenkele extends Surungen {
	
	

	public Kertenkele(String ad, int kilosu, int uzunlugu, boolean tehlikeliMi) {
		super(ad, kilosu, uzunlugu, tehlikeliMi);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sesCikar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void surun() {
		System.out.println(this.getAd() +" isimli Kertenkele Sürünerek gidiyor");
		
	}

}
