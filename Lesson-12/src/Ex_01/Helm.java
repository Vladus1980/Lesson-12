package Ex_01;

public class Helm {

	private int diametrOfHelm;
	private String HelmMaterial;

	public Helm(int diametrOfHelm, String HelmMaterial) {
		super();
		this.diametrOfHelm = diametrOfHelm;
		this.HelmMaterial = HelmMaterial;
	}

	public int getDiametrOfHelm() {
		return diametrOfHelm;
	}

	public void setDiametrOfHelm(int diametrOfHelm) {
		this.diametrOfHelm = diametrOfHelm;
	}

	public String getHelmMaterial() {
		return HelmMaterial;
	}

	public void setHelmMaterial(String HelmMaterial) {
		this.HelmMaterial = HelmMaterial;
	}

	@Override
	public String toString() {
		return "Helm [diametrOfHelm=" + diametrOfHelm + ", HelmMaterial=" + HelmMaterial + "]";
	}

}