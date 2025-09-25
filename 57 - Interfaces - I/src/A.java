/*
 * Interfaces
 * An interface in Java is a blueprint of a class.
 * Key Points:
 * By default, every method inside an interface is:
 * - public
 * - abstract
 *   (whether we declare it or not).
 * → Implementation must be provided by the implementing class.
 * Multiple inheritance is possible with interfaces (a class can implement multiple interfaces).
 * Interfaces provide 100% abstraction.
 */

public interface A {
    void m1(); // implicitly public and abstract
    public void m2(); // explicitly public
    abstract void m3(); // explicitly abstract
    public abstract void m4(); // explicitly public and abstract
}
