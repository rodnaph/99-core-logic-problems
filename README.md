
# 99 core.logic Problems

This is an implementation of [P-99: Ninety-None Prolog Problems](https://sites.google.com/site/prologsite/prolog-problems)
using Clojure's core.logic.

## Solutions

The solutions are implemented as relations, for example for
the first problem "last element of a list" ...

```clojure
(run 1 [q]
  (my-lasto [1 2 3] q))

; (3)
```

## Disclaimer

Just a learning tool, probably hopelessly incomplete.

