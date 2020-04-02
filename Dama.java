
public class Dama extends Figura {

String col;
	
	public Dama(String col) {
		this.col = col;
	}
	
	@Override
	boolean provera(String boja, int trenutnoX, int trenutnoY, int pomerenoX, int pomerenoY) {
//		System.out.println("pozicija dama: " + trenutnoY + pomerenoY + trenutnoX + pomerenoX);
		
		if(trenutnoX == pomerenoX && trenutnoY == pomerenoY)
			return false;
		
		int pomerajX = pomerenoX - trenutnoX;
		int pomerajY = pomerenoY - trenutnoY;
		
//		System.out.println("DAMA Pomerayi: " + pomerajX+ " " + pomerajY);
		
		if(pomerenoX >=0 && pomerenoX < 8 && pomerenoY < 8 && pomerenoY >= 0) {
		if(Math.abs(pomerajX) == Math.abs(pomerajY))
			return true;
		if(pomerajX != 0 && pomerajY ==0)
			return true;
		if(pomerajY != 0 && pomerajX == 0 )
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return " Q" + col + "";
	}


}
