package tw.elliot.dmp.srp;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class ImageDrawer extends Panel {

	private BufferedImage bi;

	Graphics graphics = null;

	public ImageDrawer() {

		URL url = this.getClass().getResource("/web01.png");
		try {
			this.bi = ImageIO.read(url);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void paint(Graphics g) {
		g.clearRect(0,0, 400, 400);
		g.drawImage(this.bi, 0, 0, this);
	}

	public void init() {

		JFrame frame = new JFrame("ImageDrawer");
		Panel panel = new ImageDrawer();
		frame.getContentPane().add(panel);
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		graphics = panel.getGraphics();
	}
	public void showImage(File image) throws IOException {
		this.bi = ImageIO.read(image);
		this.imageUpdate(this.bi,1,0, 0, 400, 400);
		this.paint(graphics);
	}

	public void showImage(BufferedImage image) {
		this.bi = image;
		this.imageUpdate(this.bi, 0, 0,0,400,400);
		this.paint(graphics);
	}
}
