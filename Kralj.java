
public class Kralj extends Figura {
	
	String col;
	
	public Kralj(String col) {
		this.col = col;
	}
	
	@Override
	boolean provera(String boja, int trenutnoX, int trenutnoY, int pomerenoX, int pomerenoY) {
		
		if(trenutnoX == pomerenoX && trenutnoY == pomerenoY)
			return false;
		
		int pomeranjeX = Math.abs(trenutnoX - pomerenoX);
		int pomeranjeY = Math.abs(trenutnoY - pomerenoY);
		
		if(pomeranjeX < 2 && pomeranjeY < 2 && pomerenoX < 8 && pomerenoX >= 0 && pomerenoY < 8 && pomerenoY >=0) {
			return true;
		}
		
//		//mala rokada 
//		if(pomerenoX == 6 && trenutnoX == 4 && pomeranjeY == trenutnoY && (trenutnoY == 1 || trenutnoY == 7))
//			return true;
//		
//		if(pomerenoX==2 && trenutnoX == 4 && pomeranjeY == trenutnoY && (trenutnoY == 1 || trenutnoY == 7))
//			return true;
//		
		
		return false;
	}
	
	public static boolean proveriKralja(Tabla t,String boja,int x,int y,int x2,int y2,Figura fig) {
	
		Figura[][] pom = new Figura[8][8];
		for (int i = 0; i < 8; i++) {
			for(int j=0;j<8;j++) {
				pom[i][j] = t.tabla[i][j];
			}
		}
		
		pom[x2][y2] = fig;
		pom[x][y] = null;
		int kraljX=0,kraljY = 0,i,j;
		if(boja == "bela") {
			for(i = 0;i<8;i++) {
				for(j = 0;j<8;j++) {
					if(pom[i][j]!= null) {
						if(pom[i][j].toString().equals(" Kb")) {
							kraljX = i;
							kraljY = j;
							j = 10;
							i = 10;
						}
					}
				}
			}
			
			pom[kraljX][kraljY] = null;
			for(i = 0; i < 8;i++) {
				for(j=0;j<8;j++) {
					if(pom[i][j] != null && pom[i][j].toString().toCharArray()[2] == 'c') {
						if(DaLiJeMoguce2.daLiMoze(pom, i, j, kraljX, kraljY)) {
							if(pom[i][j].provera("crna", i, j, kraljX, kraljY)) {
								System.out.println("Kod kralja " + pom[i][j].toString() + " " + i + j +" "+  kraljX + kraljY);
								return false;
							}
						}
					}
				}
			}
		}
		
		else {
			for(i = 0;i<8;i++) {
				for(j = 0;j<8;j++) {
					if(pom[i][j]!= null) {
						if(pom[i][j].toString().equals(" Kc")) {
							kraljX = i;
							kraljY = j;
							j = 10;
							i = 10;
						}
					}
				}
			}
			
			pom[kraljX][kraljY] = null;
			
//			String s="";
//			for (i = 0; i < 8; i++) {
//				for (j = 0; j < 8; j++) {
//					if (pom[i][j] == null)
//						s+= " X ";
//					else
//						s += pom[i][j];
//				}
//				s+="\n";
//			}
//			System.out.println("Tablaaaa\n  "+ s);
			
			for(i = 0; i < 8;i++) {
				for(j=0;j<8;j++) {
					if(pom[i][j] != null && pom[i][j].toString().toCharArray()[2] == 'b') {
						if(DaLiJeMoguce2.daLiMoze(pom, i, j, kraljX, kraljY)) {
	//						System.out.println("ZOvem pomoc " + i + " " + j + " " + kraljX + " " + kraljY);
							if(pom[i][j].provera("bela", i, j, kraljX, kraljY))
								return false;
						}
					}
				}
			}
		}
		return true;
	}
	
	public static boolean rokada(Tabla t,int trenutnoX,int trenutnoY,int pomerenoX,int pomerenoY,String boja) {
		if(boja == "bela") {
			if(trenutnoX == 4 && pomerenoX == 6 && trenutnoY == 0 && pomerenoY == 0) {
				if(t.tabla[5][0] == null && t.tabla[6][0] == null && t.tabla[7][0].toString().equals(" Tb")) 
					if(proveriKralja(t,boja,trenutnoX,trenutnoY,pomerenoX-1,pomerenoY,t.tabla[4][0]))
						if(proveriKralja(t,boja,trenutnoX,trenutnoY,pomerenoX-1,pomerenoY,t.tabla[4][0])) {
							t.tabla[6][0] = t.tabla[4][0];
							t.tabla[4][0] = null;
							t.tabla[5][0] = t.tabla[7][0];
							t.tabla[7][0] = null;
							return true;
						}
			}
		}
		else {
			if(trenutnoX == 4 && pomerenoX == 6 && trenutnoY == 7 && pomerenoY == 7) {
				if(t.tabla[5][7] == null && t.tabla[6][7] == null && t.tabla[7][7].toString().equals(" Tc")) 
					if(proveriKralja(t,boja,trenutnoX,trenutnoY,pomerenoX-1,pomerenoY,t.tabla[4][7]))
						if(proveriKralja(t,boja,trenutnoX,trenutnoY,pomerenoX-1,pomerenoY,t.tabla[4][7])) {
							t.tabla[6][7] = t.tabla[4][7];
							t.tabla[4][7] = null;
							t.tabla[5][7] = t.tabla[7][7];
							t.tabla[7][7] = null;
							return true;
						}
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		return " K" + col;
	}
	
}
