## LSP

## Override Issue
[Client](./Client.java)

[B](./B.java) extends from [A](./A.java) ，但override ```sub()```时没考虑A的情况，造成B无法完全取代A，也造成了系统不可预期的问题。
