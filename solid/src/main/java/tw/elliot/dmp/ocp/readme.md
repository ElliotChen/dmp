## 价格修改
40元以上打8折，40元以下打9折

### change01 思路1：修改IBook接口
[BookStore](./change01/BookStore.java)

[IBook](./change01/IBook.java)增加```float getOffPrice()```

### change02 思路2：修改NoveBook
[BookStore](./change02/BookStore.java)

[NoveBook](./change02/NoveBook.java)直接修改```float getPrice()```

### change03 思路3：通过扩展修改
[BookStore](./change03/BookStore.java)
[OffNoveBook](./change03/OffNoveBook.java)extend NoveBook and override ```float getPrice()```