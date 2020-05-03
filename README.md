## Dotty test using Processing. 

Currently using Processing 3.5.4 jars. Requires Java8.

On mac, follow instructions for java8 here: https://stackoverflow.com/questions/61067260

### Usage

This is a normal sbt project, you can compile code with `sbt compile` and run it
with `sbt run`, `sbt console` will start a Dotty REPL.

For more information on the sbt-dotty plugin, see the
[dotty-example-project](https://github.com/lampepfl/dotty-example-project/blob/master/README.md).


Start interactive development with:

```
sbt "~reStart"
```