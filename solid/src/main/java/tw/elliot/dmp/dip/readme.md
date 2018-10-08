## DIP

### bad 不好的演示
[Client](./bad/Client.java)
[妈妈](./bad/Mother.java)只会读书[Book](./bad/Book.java)，但不会读报纸[Newspaper](./bad/Newspaper.java)

### better 较好的演示
[Client](./better/Client.java)
将[妈妈](./better/Mother.java)能读有内容的概念找出来，建立一个[IReader](./better/IReader.java)的接口，要求[Book](./bettter/Book.java)与[Newspaper](./better/Newspaper.java)都实践该接口
所以妈妈可以读书，也可以读报纸了。