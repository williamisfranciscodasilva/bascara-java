package bascara;

import javax.swing.JOptionPane;

public class formula {
	
	public void bascara(){
		
		float a, b, c, delta, x1, x2;
		
		a = Float.parseFloat(JOptionPane.showInputDialog("Digite um valor para A: "));
		b = Float.parseFloat(JOptionPane.showInputDialog("Digite um valor para B: "));
		c = Float.parseFloat(JOptionPane.showInputDialog("Digite um valor para C: "));
		
		delta = (float) (Math.pow(b,2) -4 * a * c);

		x1 = (float) (-b +(Math.sqrt(delta)))/(2*a);
		x2 = (float) (-b -(Math.sqrt(delta)))/(2*a);
		
		
		JOptionPane.showMessageDialog(null, "Para A= "+a+
				"\nB="+b+"\nC="+c+"\nDelta = "+delta+
				"\nX1 ="+x1+"\nX2 ="+x2);

		System.out.println("Para A= "+a);
		System.out.println("B="+b);
		System.out.println("C="+c);
		System.out.println("Delta = "+delta);
		System.out.println("X1 ="+x1);
		System.out.println("X2 ="+x2);
	}
}
