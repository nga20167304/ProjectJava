package algoPackage;

public class FAV {
	private float F,a,v,m;

	public float getF() {
		return F;
	}

	public void setF(float f) {
		F = f;
	}

	public float getA() {
		return a;
	}

	public void setA(float a) {
		this.a = a;
	}

	public float getV() {
		return v;
	}

	public void setV(float v) {
		this.v = v;
	}
	
	public float getM() {
		return m;
	}

	public void setM(float m) {
		this.m = m;
	}
	
	public FAV(float m) {
		this.m = m;
	}
	
	public FAV(float F,float m) {
		this.m = m;
		this.F = F;
	}

	public float getForce() {
		this.F = m*a;
		return F;
	}
	public float getAcce() {
		this.a = F/m;
		return a;
	}
	public float getVelocity(float v0,float t) {
		return (v0+a*t);
	}
}
