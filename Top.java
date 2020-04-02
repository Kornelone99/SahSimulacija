
public class Top extends Figura {
	
String col;
	
	public Top(String col) {
		this.col = col;
	}
	
	@Override
	boolean provera(String boja, int trenutnoX, int trenutnoY, int pomerenoX, int pomerenoY) {
		
		if(trenutnoX == pomerenoX && trenutnoY != pomerenoY)
			return true;
		if(trenutnoX != pomerenoX && trenutnoY == pomerenoY)
			return true;
		
		return false;
	}
	
	public String toString() {
		return " T" + col + "";
	}

}
