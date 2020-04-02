import java.util.Scanner;

public class Test {
	
	
	public static void poredjajFigure(Tabla t) {
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
	}
	
	public static void main(String[] argv) {
		Tabla t = new Tabla("bela");
		

//		 
		
		 
		 
		
		 poredjajFigure(t);
		 
		 System.out.println("Pesak moze da se pomera za 2 polja u prvom potezu");
		 t.odigrajPotez(4,1,4,3);
		 System.out.println(t);
		 t.odigrajPotez(2,6,2,4);
		 t.odigrajPotez(6,0,5,2);
		 t.odigrajPotez(3,6,3,5);
		 t.odigrajPotez(5,0,1,4);
		 t.odigrajPotez(2,7,4,5);
		 System.out.println(t);
		 t.odigrajPotez(2,7,3,6);
		 t.odigrajPotez(1,4,2,3);
		 t.odigrajPotez(1,7,2,5);
		 System.out.println("Beli vrsi malu rokadu");
		 t.odigrajPotez(4,0,6,0);
		 System.out.println(t);
		 t.odigrajPotez(0,6,0,4);
		 t.odigrajPotez(3,1,3,3);
		 System.out.println("Pesak moze da se krece jedno polje ukoso ako jede drugu figuru");
		 t.odigrajPotez(2,4,3,3);
		 System.out.println(t);
		 t.odigrajPotez(5,2,3,3);
		 t.odigrajPotez(0,4,0,3);
		 System.out.println("Pravilo anpasan");
		 t.odigrajPotez(1,1,1,3);
		 t.odigrajPotez(0,3,1,2);
		 System.out.println(t);
		 t.odigrajPotez(2,0,4,2);
		 t.odigrajPotez(1,2,1,1);
		 t.odigrajPotez(3,0,5,2);
		 System.out.println("Promocij dame");
		 t.odigrajPotez(1,1,0,0);
		 System.out.println(t);
		 System.out.println("Crni je matiran, ako pokusa da povuce pote dobice obavestenje");
		 t.odigrajPotez(5,2,5,6);
		 t.odigrajPotez(7,6,7,5);
		 
		 System.out.println(t);

	}
}
