## LOD
保持最少的了解

### 较不好的示范

[BadClient](./bad/BadClient.java)

因[Computer](./bad/Computer.java)将不必要的method全设为public，所以造成开发上的混淆。

### 较好的示范

[BetterClient](./better/BetterClient.java)

因[Computer](./better/Computer.java)仅释出```close()```，所以开发人员不会误用。

### 扩展
[ExtendClient](./extend/ExtendClient.java)
利用```DIP```的概念，将使用者可关闭的概念提出来，产生可用的IContainer接口，增加扩展的能力。