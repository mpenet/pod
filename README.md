# pod
[![Build Status](https://secure.travis-ci.org/mpenet/pod.png?branch=master)](http://travis-ci.org/mpenet/pod)

Cheap/lightweight volatile mutable type inspired by what could come out from
CLJ-1512, but available now and in pure clojure.

You probably don't need this. Use at your own risk.

```clojure
(require '[qbits.pod :as p])

(let [p (p/pod 1)]
  (p/reset! p 2)
  (p/setf! p inc)
  (p/swap! p (fn [old x y] (+ old x y)) 2 3)
  (println @p))

=> 8

```

## Installation

qbits.pod is [available on Clojars](https://clojars.org/cc.qbits/pod).

Add this to your dependencies:

```clojure
[cc.qbits/pod "0.1.0-SNAPSHOT"]
```

Please check the
[Changelog](https://github.com/mpenet/pod/blob/master/CHANGELOG.md)
if you are upgrading.

## License

Copyright © 2014 [Max Penet](http://twitter.com/mpenet)

Distributed under the
[Eclipse Public License](http://www.eclipse.org/legal/epl-v10.html),
the same as Clojure.
