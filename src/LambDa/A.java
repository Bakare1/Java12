package LambDa;

import Interface.Runnable;
import org.jetbrains.annotations.NotNull;

import java.util.function.BiFunction;

public class A {

    public static void main(String[] args) {
        int x = 3;
        Runnable runnable = () -> System.out.println(42);
        Runnable runnable1 = () -> System.out.println(x * 42 + 42);

        BiFunction<Double, Integer, Double> f =
                (@NotNull var g, @NotNull var y) -> g / y;
        System.out.println(f.apply(3., 2));

        BiFunction<SomeReallyLongClassName, AnotherReallyLongClassName, Double> v =
                (@NotNull SomeReallyLongClassName a,
                 @NotNull AnotherReallyLongClassName d) -> a.doSomething(d);
    }
}
class SomeReallyLongClassName{

    public Double doSomething(AnotherReallyLongClassName d) {
        return 20.00;
    }
}
class AnotherReallyLongClassName{
    public Double doSomething(AnotherReallyLongClassName d) {
        return 20.00;
    }
}
