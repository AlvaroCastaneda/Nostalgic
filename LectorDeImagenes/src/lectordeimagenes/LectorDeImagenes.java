/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lectordeimagenes;

import java.awt.Color;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author tank3
 */
public class LectorDeImagenes {

    boolean neg;
    
    public LectorDeImagenes(){
        this(false);
    }
    
    public LectorDeImagenes(boolean neg){
        this.neg = neg;
    }
    
    public String convert(final BufferedImage image) {
	StringBuilder sb = new StringBuilder((image.getWidth() + 1) * image.getHeight());
	for (int y = 0; y < image.getHeight(); y++) {
		if (sb.length() != 0) sb.append("\n");
		for (int x = 0; x < image.getWidth(); x++) {
			Color pixelColor = new Color(image.getRGB(x, y));
			double gValue = (double) pixelColor.getRed() * 0.2989 + (double) pixelColor.getBlue() * 0.5870 + (double) pixelColor.getGreen() * 0.1140;
			final char s = neg ? returnStrNeg(gValue) : returnStrPos(gValue);
			sb.append(s);
		}
	}
	return sb.toString();
    }

	/**
         * Crea un nuevo String y lo asigna a una cadena basada en valores de escala de grises
         * Si la escala de grises es un valor muy alto, el pixel es muy brilloso y asigna caracteres
         * como . y , que no son tan oscuros. Si la escala de Grises es muy baja es pixel es oscuro,
         * y asignamos caracteres como # y @ que se ven mas oscuros.
	 * @param g grayscale
	 * @return char
	 */
	private char returnStrPos(double g)//takes the grayscale value as parameter
	{
		final char str;

		if (g >= 230.0) {
			str = ' ';
		} else if (g >= 200.0) {
			str = '.';
		} else if (g >= 180.0) {
			str = '*';
		} else if (g >= 160.0) {
			str = ':';
		} else if (g >= 130.0) {
			str = 'o';
		} else if (g >= 100.0) {
			str = '&';
		} else if (g >= 70.0) {
			str = '8';
		} else if (g >= 50.0) {
			str = '#';
		} else {
			str = '@';
		}
		return str; // return the character

	}

	/**
	 * Same method as above, except it reverses the darkness of the pixel. A dark pixel is given a light character and vice versa.
	 *
	 * @param g grayscale
	 * @return char
	 */
	private char returnStrNeg(double g) {
		final char str;

		if (g >= 230.0) {
			str = '@';
		} else if (g >= 200.0) {
			str = '#';
		} else if (g >= 180.0) {
			str = '8';
		} else if (g >= 160.0) {
			str = '&';
		} else if (g >= 130.0) {
			str = 'o';
		} else if (g >= 100.0) {
			str = ':';
		} else if (g >= 70.0) {
			str = '*';
		} else if (g >= 50.0) {
			str = '.';
		} else {
			str = ' ';
		}
		return str;

	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				JFileChooser fileChooser = new JFileChooser();
				fileChooser.setFileFilter(new FileNameExtensionFilter("Images", "jpg", "gif", "png"));
				while (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
					try {
						File f = fileChooser.getSelectedFile();
						final BufferedImage image = ImageIO.read(f);
						if (image == null) throw new IllegalArgumentException(f + " is not a valid image.");
						final String ascii = new LectorDeImagenes().convert(image);
						final JTextArea textArea = new JTextArea(ascii, image.getHeight(), image.getWidth());
						textArea.setFont(new Font("Monospaced", Font.BOLD, 5));
						textArea.setEditable(false);
						final JDialog dialog = new JOptionPane(new JScrollPane(textArea), JOptionPane.PLAIN_MESSAGE).createDialog(LectorDeImagenes.class.getName());
						dialog.setResizable(true);
						dialog.setVisible(true);
                                                
					} catch (Exception e) {
						JOptionPane.showMessageDialog(null, e.toString(), "Error", JOptionPane.ERROR_MESSAGE);
					}
				}
				System.exit(0);
			}
		});
	}
    
}
