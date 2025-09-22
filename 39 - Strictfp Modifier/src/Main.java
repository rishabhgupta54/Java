/*
 * Strictfp Modifier (Strict Floating Point)
 * it was introduced in v1.2
 * we can declare strictfp for classes and methods but not for variables
 * Usually the results of floating point arithmetic is varied from platform to platform. If we want platform independent then we should go for strictfp modifier
 * If a method is declared as strictfp all floating point calculation in that method has to follow IEEE754 standard so that we will get platform independent results
 *
 * strictfp method
 * abstract modifier never talks about implementation whereas strictfp method always talk about the implementation hence abstract and strictfp combination are illegal
 *
 * strictfp class
 * if a class is declared as strictfp then every floating point calculations present in every concrete method has to follow IEEE754 standards so that we will get platform independent results
 * we can declare abstract strictfp combination for classes i.e. abstract strictfp combination is legal for classes but not for methods.
 */
public class Main {
    public static void main(String[] args) {
        
    }
}
