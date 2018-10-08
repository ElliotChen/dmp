package tw.elliot.dmp.srp;

import tw.elliot.dmp.srp.bad.ImageLoader;

import javax.swing.*;

/**
 * 依据SRP，较不好的示范
 * 修改Cache机制时，需要在ImageLoader中修改
 * 会让ImageLoader看起来较复杂，而且增加更动的机会。
 */
public class BadImageClient {

	public static void main(String[] args) {
		ImageDrawer drawer = new ImageDrawer();
		ImageLoader loader = new ImageLoader();
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				drawer.init();
			}
		});

		String[] imageUrl = new String[] {"/web01.png", "/web02.png", "/web03.png", "/web04.png", "/web01.png", "/web02.png"};

		for (String url: imageUrl
		     ) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			loader.displayImage(url, drawer);
		}

	}
}
