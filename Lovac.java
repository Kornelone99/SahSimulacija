
public class Lovac extends Figura {

String col;
	
	public Lovac(String col) {
		this.col = col;
	}
	
	@Override
	boolean provera(String boja, int trenutnoX, int trenutnoY, int pomerenoX, int pomerenoY) {
		
		int pomerajX = Math.abs(pomerenoX - trenutnoX);
		int pomerajY = Math.abs(pomerenoY - trenutnoY);
		
		if(pomerajX == pomerajY)
			return true;
		
		if(trenutnoX == pomerenoX && trenutnoY == pomerenoY)
			return false;
		
		
		return false;
	}
	
	@Override
	public String toString() {
		return " L" + col + "";
	}

}
