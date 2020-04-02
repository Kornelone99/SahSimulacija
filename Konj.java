
public class Konj extends Figura {
	
	String col;
	
	public Konj(String col) {
		this.col = col;
	}
	
	@Override
	boolean provera(String boja, int trenutnoX, int trenutnoY, int pomerenoX, int pomerenoY) {
		
		if(trenutnoX == pomerenoX && trenutnoY == pomerenoY)
			return false;
		
		int pomerajX = Math.abs(pomerenoX - trenutnoX);
		int pomerajY = Math.abs(pomerenoY - trenutnoY);
	//	System.out.println("Konj " + pomerajX + pomerajY);
		
		if(pomerajX == 0 || pomerajY == 0 )
			return false;
		if(pomerajX + pomerajY == 3)
			return true;
		
		return false;
	}
	
	@Override
	public String toString() {
		return " S" + col + "";
	}

}
