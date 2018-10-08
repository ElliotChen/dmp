package tw.elliot.dmp.srp;

import tw.elliot.dmp.srp.better.ImageLoader;
import tw.elliot.dmp.srp.better.ImageCache;

import javax.swing.*;

/**
 * 依据SRP，较好的示范
 * 分离ImageLoader,ImageCache，
 * 减少因ImageCache改变时造成ImageLoader的影响
 */
public class BetterImageClient {

	public static void main(String[] args) {
		ImageDrawer drawer = new ImageDrawer();
		ImageLoader loader = new ImageLoader();
		ImageCache cache = new ImageCache();
		loader.setMImageCache(cache);

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
