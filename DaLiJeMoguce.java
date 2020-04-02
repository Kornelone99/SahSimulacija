
public class DaLiJeMoguce {
	public static boolean daLiMoze(Tabla t,int trenutnoX,int trenutnoY,int pomerenoX,int pomerenoY) {
		
	//	System.out.println(t.tabla[trenutnoX][trenutnoY].toString());
		if(t.tabla[trenutnoX][trenutnoY].toString().equals(" Pb")) {
			if(trenutnoX < 7 && trenutnoY < 7)
			if(t.tabla[trenutnoX+1][trenutnoY+1] != null && (trenutnoY+1 == pomerenoY) && trenutnoX+1 == pomerenoX)
				return true;
			if(trenutnoX < 7 && trenutnoY < 7)
			if(t.tabla[trenutnoX+1][trenutnoY+1] == null && (trenutnoY+1 == pomerenoY) && trenutnoX+1 == pomerenoX)
				return false;
		}
		if(t.tabla[trenutnoX][trenutnoY].toString().equals(" Pb")) {
			//	System.out.println(t.tabla[trenutnoX][trenutnoY].toString() + trenutnoX + trenutnoY + pomerenoX + pomerenoY);
			if(trenutnoX != 0 && trenutnoY < 7) {
			if(t.tabla[trenutnoX-1][trenutnoY+1] != null && (trenutnoY+1 == pomerenoY) && trenutnoX-1 == pomerenoX)
				return true;
			if(t.tabla[trenutnoX-1][trenutnoY+1] == null && (trenutnoY+1 == pomerenoY) && trenutnoX-1 == pomerenoX)
				return false;
			}
		}
		
		if(t.tabla[trenutnoX][trenutnoY].toString().equals(" Pc")) {
			//		System.out.println(t.tabla[trenutnoX][trenutnoY].toString() + trenutnoX + trenutnoY + pomerenoX + pomerenoY);
			if(trenutnoY != 0 && trenutnoX < 7) {
			if(t.tabla[trenutnoX+1][trenutnoY-1] != null && (trenutnoY-1 == pomerenoY) && trenutnoX+1 == pomerenoX)
				return true;
			if(t.tabla[trenutnoX+1][trenutnoY-1] == null && (trenutnoY-1 == pomerenoY) && trenutnoX+1 == pomerenoX)
				return false;
			}
		}
		if(t.tabla[trenutnoX][trenutnoY].toString().equals(" Pc")) {
			//	System.out.println(t.tabla[trenutnoX][trenutnoY].toString() + trenutnoX + trenutnoY + pomerenoX + pomerenoY);
			if(trenutnoX != 0 && trenutnoY != 0) {
			if(t.tabla[trenutnoX-1][trenutnoY-1] != null && (trenutnoY-1 == pomerenoY) && trenutnoX-1 == pomerenoX)
				return true;
			if(t.tabla[trenutnoX-1][trenutnoY-1] == null && (trenutnoY-1 == pomerenoY) && trenutnoX-1 == pomerenoX)
				return false;
			}
		}
		
		if(trenutnoX==pomerenoX && trenutnoY != pomerenoY) {
			if(trenutnoY < pomerenoY) {
				for(int i = trenutnoY+1;i<pomerenoY;i++) {
					if(t.tabla[trenutnoX][i] != null) {
	//					System.out.println("Greskaaa");
						return false;
					}
				}
			}
			else {
				for(int i = trenutnoY-1;i>pomerenoY;i--) {
					if(t.tabla[trenutnoX][i] != null) {
		//				System.out.println("Greskaaa");
						return false;
					}
				}
			}
		}
		else if(trenutnoX!=pomerenoX && trenutnoY == pomerenoY) {
			if(pomerenoX > trenutnoX) {
				for(int i=trenutnoX + 1;i < pomerenoX;i++) {
					if(t.tabla[i][trenutnoY] != null)
						return false;
				}
			}
			else {
				for(int i=trenutnoX - 1;i > pomerenoX;i--) {
					if(t.tabla[i][trenutnoY] != null)
						return false;
				}
			}
		}
		else if(Math.abs(trenutnoX - pomerenoX) == Math.abs(trenutnoY - pomerenoY)) {
			if(pomerenoX > trenutnoX && pomerenoY > trenutnoY) {
				for(int i=trenutnoX+1,j=trenutnoY+1;i<pomerenoX && j<pomerenoY;i++,j++) {
					if(t.tabla[i][j] != null)
						return false;
				}
			}
			else if(pomerenoX > trenutnoX && pomerenoY < trenutnoY) {
				for(int i=trenutnoX+1,j=trenutnoY-1;i<pomerenoX && j>pomerenoY;i++,j--) {
					if(t.tabla[i][j] != null)
						return false;
				}
			}
			else if(pomerenoX < trenutnoX && pomerenoY < trenutnoY) {
				for(int i=trenutnoX-1,j=trenutnoY-1;i>pomerenoX && j>pomerenoY;i--,j--) {
					if(t.tabla[i][j] != null)
						return false;
				}
			}
			else if(pomerenoX < trenutnoX && pomerenoY > trenutnoY) {
				for(int i=trenutnoX-1,j=trenutnoY+1;i>pomerenoX && j<pomerenoY;i--,j++) {
					if(t.tabla[i][j] != null)
						return false;
				}
			}
		}
		
		return true;
	}
}
