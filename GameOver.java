
public class GameOver {
	public static boolean daLiJeMat(Tabla t,String boja) {
		
		
		int i,j;
//		int kraljX=0,kraljY = 0,i,j;
//		if(boja == "bela") {
//			for(i = 0;i<8;i++) {
//				for(j = 0;j<8;j++) {
//					if(t.tabla[i][j]!= null) {
//						if(t.tabla[i][j].toString().equals(" Kb")) {
//							kraljX = i;
//							kraljY = j;
//							j = 10;
//							i = 10;
//						}
//					}
//				}
//			}
			
			int pomX,pomY,k,l;
			
			if(boja == "bela") {
			
				for(i =0;i<8;i++) {
					for(j=0;j<8;j++) {
						if(t.tabla[i][j] != null && t.tabla[i][j].toString().toCharArray()[2] == 'b') {
					//		System.out.println("U gameoveru ");
							pomX = i;
							pomY = j;
							Figura fig = t.tabla[i][j];
							for(k=0;k<8;k++) {
								for(l=0;l<8;l++) {
									if(DaLiJeMoguce2.daLiMoze(t.tabla, pomX, pomY, k, l)) {
										if((fig.provera("bela", pomX, pomY, k, l))) {
									//		System.out.println("U gameoveru " + pomX + pomY);
											if(Kralj.proveriKralja(t,boja,pomX,pomY,k,l,fig)) {
												System.out.println("U game overu " + pomX + pomY + " " + k + l);
												return false;
											}
										//	else
										//		System.out.println(pomX + pomY + " " + k + l);
										}
									}
								}
							}
						}
						
					}
				}
			}
			
			else {
				for(i =0;i<8;i++) {
					for(j=0;j<8;j++) {
						if(t.tabla[i][j] != null && t.tabla[i][j].toString().toCharArray()[2] == 'c') {
					//		System.out.println("U gameoveru ");
							pomX = i;
							pomY = j;
							Figura fig = t.tabla[i][j];
							for(k=0;k<8;k++) {
								for(l=0;l<8;l++) {
									if(DaLiJeMoguce2.daLiMoze(t.tabla, pomX, pomY, k, l)) {
										if((fig.provera("crna", pomX, pomY, k, l))) {
								//		System.out.println("U gameoveru " + pomX + pomY);
											if(Kralj.proveriKralja(t,boja,pomX,pomY,k,l,fig)) {
									//			System.out.println("U game overu " + pomX + pomY + " " + k + l);
												return false;
											}
										//	else
											//	System.out.println(pomX + pomY + " " + k + l);
										}
									}
								}
							}
						}
						
					}
				}
			}
		
		return true;
	}
}
