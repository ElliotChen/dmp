package tw.elliot.dmp.srp.better;

import org.apache.commons.collections4.map.LRUMap;
import tw.elliot.dmp.srp.ImageDrawer;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class ImageLoader {
	private ImageCache mImageCache;

	public ImageLoader() {
	}

	public void setMImageCache(ImageCache imageCache) {
		this.mImageCache = imageCache;
	}


	public void displayImage(final String url, final ImageDrawer drawer) {
		BufferedImage bi = null;
		//check cache
		if(mImageCache.containsKey(url)) {
			System.out.println("Load image ["+url+"] from cache");
			bi = mImageCache.get(url);

		} else {
			System.out.println("Load image ["+url+"] from file");

			try {
				bi = this.loadImage(url);
				mImageCache.put(url, bi);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		drawer.showImage(bi);
	}

	public BufferedImage loadImage(String url) throws IOException {
		URL fileUrl = this.getClass().getResource(url);
		BufferedImage bi = ImageIO.read(new File(fileUrl.getFile()));
		return bi;
	}

}
