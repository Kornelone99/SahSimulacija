
public class Pesak extends Figura {
	
	String col;
	
	public Pesak(String col){
		this.col = col;
	}
	
	@Override
	boolean provera(String boja, int trenutnoX, int trenutnoY, int pomerenoX, int pomerenoY) {
		
		if(boja == "bela") {
			if((trenutnoX == pomerenoX) && (pomerenoY - trenutnoY == 1) && pomerenoY <= 7 ) {
				return true;
			}
			//prvi poter
		//	System.out.println(trenutnoX+ " " +   trenutnoY + " " + pomerenoX + " " + pomerenoY);
			if((trenutnoX == pomerenoX) && (pomerenoY - trenutnoY == 2)&&(trenutnoY == 1)) {
//				System.out.println("Dajajaj");
				return true;
			}
			
			if((trenutnoY+1 == pomerenoY) && trenutnoX+1 == pomerenoX)
				return true;
			if((trenutnoY+1 == pomerenoY) && trenutnoX-1 == pomerenoX)
				return true;
		}
		else {
		//	System.out.println("pozicija: " + trenutnoY + pomerenoY + trenutnoX + pomerenoX);
			if((trenutnoX == pomerenoX) && (trenutnoY - pomerenoY == 1) && pomerenoY >= 0)
				return true;
			if((trenutnoX == pomerenoX) && (pomerenoY - trenutnoY == -2)&&(trenutnoY == 6)) {
				return true;
			}
			
			if((trenutnoY-1 == pomerenoY) && trenutnoX+1 == pomerenoX)
				return true;
			if((trenutnoY-1 == pomerenoY) && trenutnoX-1 == pomerenoX)
				return true;
		}
		
//		System.out.println("Puko je " + trenutnoX+ " " +   trenutnoY + " " + pomerenoX + " " + pomerenoY + " " + boja);
		return false;
	}
	
	
	
	@Override
	public String toString() {
		return " P" + col + "";
	}

}