public class Test {
	public static void main(String[] argv) {
		Tabla t = new Tabla("bela");
		
		for (int i = 0; i < 8; i++) {
			Figura f = new Pesak("b");
			t.dodajFiguru(f, i, 1);
		}
		
		for (int i = 0; i < 8; i++) {
			Figura f = new Pesak("c");
			t.dodajFiguru(f, i, 6);
		}
		
		Figura f = new Kralj("b");
		t.dodajFiguru(f, 4, 0);
		f = new Kralj("c");
		t.dodajFiguru(f, 4, 7);
		
		f = new Dama("b");
		t.dodajFiguru(f, 3, 0);
		f = new Dama("c");
		t.dodajFiguru(f, 3, 7);
		
		f = new Lovac("b");
		t.dodajFiguru(f, 2, 0);
		f = new Lovac("b");
		t.dodajFiguru(f, 5, 0);
		
		f = new Lovac("c");
		t.dodajFiguru(f, 2, 7);
		f = new Lovac("c");
		t.dodajFiguru(f, 5, 7);
		
		f = new Konj("b");
		t.dodajFiguru(f, 1, 0);
		f = new Konj("b");
		t.dodajFiguru(f, 6, 0);
		f = new Konj("c");
		t.dodajFiguru(f, 1, 7);
		f = new Konj("c");
		t.dodajFiguru(f, 6, 7);
		
		f = new Top("b");
		t.dodajFiguru(f, 0, 0);
		f = new Top("b");
		t.dodajFiguru(f, 7, 0);
		f = new Top("c");
		t.dodajFiguru(f, 0, 7);
		f = new Top("c");
		t.dodajFiguru(f, 7, 7);
		
//		Figura f = new Pesak();
//		t.dodajFiguru(f, 3, 1);
//		
//		f = new Kralj();
//		t.dodajFiguru(f, 4, 0);
//		
//		f = new Dama();
//		t.dodajFiguru(f,3,0);
//		
//		f = new Pesak();
//		t.dodajFiguru(f,3,6);
//		
//		f = new Lovac();
//		t.dodajFiguru(f, 5, 0);
//		
//		f = new Konj();
//		t.dodajFiguru(f, 6, 0);
//		
//		f = new Kralj();
//		t.dodajFiguru(f,4,7);
//		
//		f = new Top();
//		t.dodajFiguru(f, 7, 7);
//		
//		System.out.println(t);
//		
//		t.odigrajPotez(4, 0, 4, 1);
//	//	System.out.println(t);
//		t.odigrajPotez(3, 0, 0, 3);
//		

//		t.odigrajPotez(5, 1,5, 3);
//		t.odigrajPotez(4, 6,4, 4);
//		t.odigrajPotez(4, 0,5, 1);
//		t.odigrajPotez(3, 7,7, 3);
//		t.odigrajPotez(0, 1,0, 2);
//		t.odigrajPotez(4, 1,4, 3);
//		t.odigrajPotez(4, 6,4, 4);
		
//		t.odigrajPotez(5, 1,5, 2);
//		t.odigrajPotez(4, 6,4, 5);
//		t.odigrajPotez(6, 1,6, 3);
//		t.odigrajPotez(3, 7,7, 3);
//	//	t.odigrajPotez(0, 1,0, 3);
//		
	//	t.naPotezu = "bela";
		t.odigrajPotez(4, 1, 4, 3);
		t.odigrajPotez(2, 6, 2, 4);
		t.odigrajPotez(6, 0, 5, 2);
		t.odigrajPotez(3, 6, 3, 5);
		t.odigrajPotez(5, 0, 1, 4);
		t.odigrajPotez(6, 7,5,5);
		
		System.out.println(t);
		
	}
}
