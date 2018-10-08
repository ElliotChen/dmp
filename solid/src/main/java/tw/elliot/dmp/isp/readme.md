## ISP Demo

## bad 不好的演示
[BadBehaviorClient](./bad/BadBehaviorClient.java)

[Behavior](./bad/Behavior.java)订义了多组行为，想要适用所有的动物。
但狗不会飞，鸟不会跑，所以Behavior会有无用的method定义。

## better 较好的演示
[BetterBehaviorClient](./better/BetterBehaviorClient.java)

将[Behavior](./bad/Behavior.java)
分拆为三个[Huntable](./better/Huntable.java), [Runnable](./better/Runnable.java), [Flyable](./better/Flyable.java)
除了意义更明显外，也减少不必要的实做。