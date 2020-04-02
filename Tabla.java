
public class Tabla {
	Figura[][] tabla = new Figura[8][8];
	String naPotezu;
	public boolean daLiJeMat = false;
	public static int prethodniX=0,prethodniY=0,pretPrethodniX=0,pretPrethodniY=0;
	public static int prethodniXc=0,prethodniYc=0,pretPrethodniXc=0,pretPrethodniYc=0;
	
	public Tabla(String naPotezu) {
		this.naPotezu = naPotezu;
	}
	
	boolean dodajFiguru(Figura figura,int x,int y) {
		if(tabla[x][y] == null) {
			tabla[x][y] = figura;
			return true;
		}
		return false;
	}
	
	
	boolean odigrajPotez(int trenutnoX,int trenutnoY,int pomerenoX,int pomerenoY) {
		if(daLiJeMat)
			return false;
		
		if(!(naPotezu == "bela")) {
			prethodniX = pomerenoX;
			pretPrethodniX = trenutnoX;
			prethodniY = pomerenoY;
			pretPrethodniY = trenutnoY;
		}
		else {
			prethodniXc = pomerenoX;
			pretPrethodniXc = trenutnoX;
			prethodniYc = pomerenoY;
			pretPrethodniYc = trenutnoY;
		}
		
		if(pomerenoX > 8 || pomerenoX < 0 || pomerenoY < 0 || pomerenoY > 8)
			return false;
		
		Figura f = tabla[trenutnoX][trenutnoY];
		Figura f1 = tabla[pomerenoX][pomerenoY];
		
		if(f != null) {
			if(f1 == null) {
				
				if(tabla[trenutnoX][trenutnoY].toString().equals(" Pb")) {
					if(pomerenoY == trenutnoY + 1 && trenutnoY == 4) {
					//	System.out.println("dsadjd");
						if(trenutnoX+1 == pomerenoX && tabla[pomerenoX][pomerenoY] == null && tabla[trenutnoX+1][4].toString().equals(" Pc")) {
							System.out.println("dsadjd " + pretPrethodniY + " " + trenutnoY);
							if(pretPrethodniY == trenutnoY +2 && pretPrethodniX == trenutnoX+1 && prethodniY == trenutnoY) {
				//				System.out.println("dsadjd");
								tabla[pomerenoX][pomerenoY] = tabla[pomerenoX][trenutnoY];
								tabla[pomerenoX][trenutnoY] = null;
							}
						}
						else if(trenutnoX-1 == pomerenoX && tabla[pomerenoX][pomerenoY] == null && tabla[trenutnoX-1][4].toString().equals(" Pc")) {
					//		System.out.println("dsadjd " + pretPrethodniY + " " + trenutnoY);
							if(pretPrethodniY == trenutnoY +2 && pretPrethodniX == trenutnoX-1 && prethodniY == trenutnoY) {
					//			System.out.println("dsadjd");
								tabla[pomerenoX][pomerenoY] = tabla[pomerenoX][trenutnoY];
								tabla[pomerenoX][trenutnoY] = null;
							}
						}
								
					}
				}
				else {
					if(pomerenoY == trenutnoY - 1 && trenutnoY == 3) {
						System.out.println("dsadjd");
						if(trenutnoX+1 == pomerenoX && tabla[pomerenoX][pomerenoY] == null && tabla[trenutnoX+1][3].toString().equals(" Pb")) {
					//		System.out.println("dsadjd " + pretPrethodniYc + " " + trenutnoY);
							if(pretPrethodniYc == trenutnoY -2 && pretPrethodniXc == trenutnoX+1 && prethodniYc == trenutnoY) {
					//			System.out.println("dsadjd");
								tabla[pomerenoX][pomerenoY] = tabla[pomerenoX][trenutnoY];
								tabla[pomerenoX][trenutnoY] = null;
							}
						}
						else if(trenutnoX-1 == pomerenoX && tabla[pomerenoX][pomerenoY] == null && tabla[trenutnoX-1][3].toString().equals(" Pb")) {
						//	System.out.println("dsadjd " + pretPrethodniY + " " + trenutnoY);
							if(pretPrethodniYc == trenutnoY -2 && pretPrethodniXc == trenutnoX-1 && prethodniYc == trenutnoY) {
						//		System.out.println("dsadjd");
								tabla[pomerenoX][pomerenoY] = tabla[pomerenoX][trenutnoY];
								tabla[pomerenoX][trenutnoY] = null;
							}
						}
								
					}
				}
				
				if(tabla[trenutnoX][trenutnoY].toString().equals(" Kb")) {
					if(Kralj.rokada(this,trenutnoX,trenutnoY,pomerenoX,pomerenoY,naPotezu)) {
			//			System.out.println("Proslo je");
						if(naPotezu == "bela") {
							naPotezu = "crna";
						}
						else {
							naPotezu = "bela";
						}
						return true;
					}
				}
				else if(tabla[trenutnoX][trenutnoY].toString().equals(" Kc")) {
					if(Kralj.rokada(this,trenutnoX,trenutnoY,pomerenoX,pomerenoY,naPotezu)) {
						System.out.println("Proslo je");
						if(naPotezu == "bela") {
							naPotezu = "crna";
						}
						else {
							naPotezu = "bela";
						}
						return true;
					}
				}
				
				if(!DaLiJeMoguce.daLiMoze(this, trenutnoX, trenutnoY, pomerenoX, pomerenoY)) {
					System.out.println("Nemoguce");
					return false;
				}
				
				if (f.provera(naPotezu, trenutnoX, trenutnoY, pomerenoX, pomerenoY)) {
					
					if(!Kralj.proveriKralja(this,naPotezu,trenutnoX,trenutnoY,pomerenoX,pomerenoY,tabla[trenutnoX][trenutnoY])) {
						if(GameOver.daLiJeMat(this, naPotezu)) {
							System.out.println("MAt je");
							daLiJeMat = true;
						}
						else
							System.out.println("Nemoguc potez zbog saha ");
						return false;
					}
					
					tabla[trenutnoX][trenutnoY] = null;
					tabla[pomerenoX][pomerenoY] = f;
					
					if(naPotezu == "bela") {
						naPotezu = "crna";
					}
					else {
						naPotezu = "bela";
					}
					return true;
				}
				else {
				System.out.println(f.toString() + " " + trenutnoX + " " + trenutnoY);
				System.out.println("NIJE prosao potez");
				}
			//	return true;
			}
			else {
				
				if(tabla[trenutnoX][trenutnoY].toString().equals(" Pb")) {
					if(tabla[trenutnoX][trenutnoY+1] != null && (trenutnoY+1 == pomerenoY) && trenutnoX == pomerenoX)
						return false;
				}
				else if(tabla[trenutnoX][trenutnoY].toString().equals(" Pc")) {
					if(tabla[trenutnoX][trenutnoY-1] != null && (trenutnoY-1 == pomerenoY) && trenutnoX == pomerenoX)
						return false;
				}
				
				if(!DaLiJeMoguce.daLiMoze(this, trenutnoX, trenutnoY, pomerenoX, pomerenoY)) {
					System.out.println("Nemoguce");
					return false;
				}
				
				
				

				
				if (f.provera(naPotezu, trenutnoX, trenutnoY, pomerenoX, pomerenoY)) {
					if(!Kralj.proveriKralja(this,naPotezu,trenutnoX,trenutnoY,pomerenoX,pomerenoY,tabla[trenutnoX][trenutnoY])) {
						if(GameOver.daLiJeMat(this, naPotezu)) {
							System.out.println("MAt je");
							daLiJeMat = true;
						}
						else
							System.out.println("Nemoguc potez zbog saha ");
						return false;
					}
				}
				
				if(naPotezu == "bela")
					if(f1.toString().toCharArray()[2] == 'b') {
						return false;
					}
				if(naPotezu == "crna") {
					if(f1.toString().toCharArray()[2] == 'c') {
						return false;
					}
				}
				
				if(naPotezu == "bela") {
					naPotezu = "crna";
				}
				else {
					naPotezu = "bela";
				}
				
				System.out.println("DSJAAAAAA");
				
				
				tabla[trenutnoX][trenutnoY] = null;
				tabla[pomerenoX][pomerenoY] = f;
				

				return true;
			}
		}
		else {
			System.out.println("F je null ");
		}
		
		return false;
	}
	
	@Override
	public String toString() {
		String s="";
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (tabla[i][j] == null)
					s+= " X ";
				else
					s += tabla[i][j];
			}
			s+="\n";
		}
		return s;
	}
}