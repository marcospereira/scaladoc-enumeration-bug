# How to reproduce

You can reproduce it using sbt or scaladoc directly:

1. `sbt compile` works as expected
2. `sbt compile:doc` fails
3. `scaladoc -d target src/main/scala/com/acme/Foo.scala src/main/scala/com/acme/Bar.java` fails

`sbt compile:doc` fails with the following output:

```
[info] Main Scala API documentation to /Users/marcospereira/Lightbend/scaladoc-enumeration-bug/target/scala-2.12/api...
[error] /Users/marcospereira/Lightbend/scaladoc-enumeration-bug/src/main/scala/com/acme/Bar.java:6: not found: value Enumeration
[error]     void init(Enumeration.Value mode);
[error]               ^
[info] No documentation generated with unsuccessful compiler run
[error] one error found
[error] (compile:doc) Scaladoc generation failed
[error] Total time: 2 s, completed Apr 5, 2017 12:09:57 PM
```

This was also tested with `scalaVersion` configured to Scala 2.11.8 and 2.10.6 and fails consistently for these versions too.

And running `scaladoc` directly fails with:

```
src/main/scala/com/acme/Bar.java:6: error: not found: value Enumeration
    void init(Enumeration.Value mode);
              ^
model contains 5 documentable templates
one error found
```

