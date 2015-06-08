import java.lang.annotation.*; 
import java.lang.reflect.*; 
 
@Retention(RetentionPolicy.RUNTIME)  
@interface MyAnno2 { 
  String str(); 
  int val(); 
} 
 
class MetaWithTwoParamMeth { 
 
  // myMeth now has two arguments. 
  @MyAnno2(str = "Two Parameters", val = 19) 
  public static void myMeth(String str, int i)  
  { 
    MetaWithTwoParamMeth ob = new MetaWithTwoParamMeth(); 
 
    try { 
      Class<?> c = ob.getClass(); 
 
      // Here, the parameter types are specified. 
      Method m = c.getMethod("myMeth", String.class, int.class); 
 
      MyAnno2 anno = m.getAnnotation(MyAnno2.class); 
  
      System.out.println(anno.str() + " " + anno.val()); 
    } catch (NoSuchMethodException exc) { 
       System.out.println("Method Not Found."); 
    } 
  } 
 
  public static void main(String args[]) { 
    myMeth("test", 10); 
  } 
}
