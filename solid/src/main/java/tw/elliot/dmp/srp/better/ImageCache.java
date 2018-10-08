package tw.elliot.dmp.srp.better;

import org.apache.commons.collections4.map.LRUMap;

import java.awt.image.BufferedImage;

public class ImageCache {
	private LRUMap<String, BufferedImage> mImageCache;

	public ImageCache() {
		int maxMemory = (int) (Runtime.getRuntime().maxMemory() / 1024);
		mImageCache = new LRUMap<>(maxMemory);
	}

	public boolean containsKey(String key) {
		return this.mImageCache.containsKey(key);
	}

	public BufferedImage get(String key) {
		return this.mImageCache.get(key);
	}

	public void put(String key, BufferedImage image) {
		this.mImageCache.put(key, image);
	}
}
