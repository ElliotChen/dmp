## SRP

### 较不好的示范

[BadImageClient](BadImageClient.java)

修改Cache机制时，需要在[ImageLoader](./bad/ImageLoader.java)中修改
会让ImageLoader看起来较复杂，而且增加更动的机会。

### 较好的示范

[BetterImageClient](BetterImageClient.java)

分离[ImageLoader](./better/ImageLoader.java),[ImageCache](./better/ImageCache.java)，
减少因ImageCache改变时造成ImageLoader的影响