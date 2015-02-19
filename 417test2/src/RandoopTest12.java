
import junit.framework.*;

public class RandoopTest12 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test1");


    QueueFaulty var0 = new QueueFaulty();
    var0.enqueue((java.lang.Object)(short)(-1));
    boolean var3 = var0.isFull();
    java.lang.Object var4 = var0.dequeue();
    QueueFaulty var5 = new QueueFaulty();
    var5.enqueue((java.lang.Object)false);
    boolean var8 = var5.isEmpty();
    java.lang.Object var9 = var5.dequeue();
    var5.setCapacity(10);
    boolean var12 = var5.isFull();
    java.lang.String var13 = var5.toString();
    boolean var14 = var5.isEmpty();
    boolean var15 = var5.isEmpty();
    var5.setCapacity(100);
    var0.enqueue((java.lang.Object)var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + (short)(-1)+ "'", var4.equals((short)(-1)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + false+ "'", var9.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "[]"+ "'", var13.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test2() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test2");


    QueueFaulty var0 = new QueueFaulty();
    var0.enqueue((java.lang.Object)false);
    boolean var3 = var0.isEmpty();
    java.lang.String var4 = var0.toString();
    boolean var5 = var0.isFull();
    boolean var6 = var0.isEmpty();
    java.lang.Object var7 = var0.dequeue();
    java.lang.String var8 = var0.toString();
    var0.setCapacity(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "[false]"+ "'", var4.equals("[false]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + false+ "'", var7.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "[]"+ "'", var8.equals("[]"));

  }

  public void test3() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test3");


    QueueFaulty var0 = new QueueFaulty();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    boolean var3 = var0.isFull();
    java.lang.String var4 = var0.toString();
    boolean var5 = var0.isEmpty();
    var0.setCapacity(100);
    QueueFaulty var8 = new QueueFaulty();
    boolean var9 = var8.isFull();
    boolean var10 = var8.isFull();
    QueueFaulty var11 = new QueueFaulty();
    var11.enqueue((java.lang.Object)false);
    boolean var14 = var11.isEmpty();
    boolean var15 = var11.isFull();
    java.lang.String var16 = var11.toString();
    boolean var17 = var11.isEmpty();
    QueueFaulty var18 = new QueueFaulty();
    var18.enqueue((java.lang.Object)false);
    boolean var21 = var18.isEmpty();
    java.lang.String var22 = var18.toString();
    boolean var23 = var18.isFull();
    java.lang.Object var24 = var18.dequeue();
    var18.setCapacity(10);
    QueueFaulty var27 = new QueueFaulty();
    java.lang.String var28 = var27.toString();
    var27.setCapacity(1);
    QueueFaulty var31 = new QueueFaulty();
    var31.enqueue((java.lang.Object)false);
    boolean var34 = var31.isFull();
    boolean var35 = var31.isFull();
    java.lang.Object var36 = var31.dequeue();
    java.lang.String var37 = var31.toString();
    var27.enqueue((java.lang.Object)var31);
    boolean var39 = var27.isEmpty();
    boolean var40 = var27.isEmpty();
    var27.setCapacity(10);
    var18.enqueue((java.lang.Object)var27);
    var11.enqueue((java.lang.Object)var27);
    var8.enqueue((java.lang.Object)var11);
    var0.enqueue((java.lang.Object)var8);
    QueueFaulty var47 = new QueueFaulty();
    var47.enqueue((java.lang.Object)false);
    boolean var50 = var47.isFull();
    java.lang.String var51 = var47.toString();
    var47.setCapacity(0);
    var47.setCapacity(100);
    var47.setCapacity((-1));
    var8.enqueue((java.lang.Object)(-1));
    java.lang.Object var59 = var8.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "[]"+ "'", var4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "[false]"+ "'", var16.equals("[false]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "[false]"+ "'", var22.equals("[false]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + false+ "'", var24.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "[]"+ "'", var28.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + false+ "'", var36.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "[]"+ "'", var37.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + "[false]"+ "'", var51.equals("[false]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);

  }

  public void test4() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test4");


    QueueFaulty var0 = new QueueFaulty();
    var0.enqueue((java.lang.Object)false);
    boolean var3 = var0.isEmpty();
    boolean var4 = var0.isFull();
    boolean var5 = var0.isEmpty();
    java.lang.String var6 = var0.toString();
    QueueFaulty var7 = new QueueFaulty();
    var7.enqueue((java.lang.Object)false);
    boolean var10 = var7.isFull();
    boolean var11 = var7.isFull();
    java.lang.Object var12 = var7.dequeue();
    var7.enqueue((java.lang.Object)1.0f);
    QueueFaulty var15 = new QueueFaulty();
    var15.enqueue((java.lang.Object)false);
    boolean var18 = var15.isEmpty();
    java.lang.Object var19 = var15.dequeue();
    var15.setCapacity(10);
    boolean var22 = var15.isFull();
    var7.enqueue((java.lang.Object)var15);
    var7.setCapacity(1);
    var0.enqueue((java.lang.Object)1);
    boolean var27 = var0.isEmpty();
    var0.setCapacity(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "[false]"+ "'", var6.equals("[false]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + false+ "'", var12.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + false+ "'", var19.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);

  }

  public void test5() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test5");


    QueueFaulty var0 = new QueueFaulty();
    var0.enqueue((java.lang.Object)false);
    boolean var3 = var0.isEmpty();
    java.lang.Object var4 = var0.dequeue();
    var0.setCapacity(10);
    boolean var7 = var0.isFull();
    java.lang.String var8 = var0.toString();
    boolean var9 = var0.isEmpty();
    QueueFaulty var10 = new QueueFaulty();
    var10.enqueue((java.lang.Object)false);
    boolean var13 = var10.isEmpty();
    java.lang.String var14 = var10.toString();
    boolean var15 = var10.isFull();
    boolean var16 = var10.isEmpty();
    java.lang.Object var17 = var10.dequeue();
    java.lang.String var18 = var10.toString();
    boolean var19 = var10.isFull();
    var0.enqueue((java.lang.Object)var19);
    boolean var21 = var0.isEmpty();
    boolean var22 = var0.isFull();
    var0.setCapacity(10);
    boolean var25 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + false+ "'", var4.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "[]"+ "'", var8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "[false]"+ "'", var14.equals("[false]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + false+ "'", var17.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "[]"+ "'", var18.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test6() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test6");


    QueueFaulty var0 = new QueueFaulty();
    var0.enqueue((java.lang.Object)false);
    boolean var3 = var0.isFull();
    boolean var4 = var0.isFull();
    java.lang.Object var5 = var0.dequeue();
    boolean var6 = var0.isFull();
    boolean var7 = var0.isFull();
    java.lang.String var8 = var0.toString();
    var0.setCapacity((-1));
    QueueFaulty var11 = new QueueFaulty();
    var11.enqueue((java.lang.Object)false);
    boolean var14 = var11.isEmpty();
    java.lang.Object var15 = var11.dequeue();
    var11.setCapacity(10);
    boolean var18 = var11.isFull();
    java.lang.String var19 = var11.toString();
    boolean var20 = var11.isEmpty();
    QueueFaulty var21 = new QueueFaulty();
    java.lang.String var22 = var21.toString();
    var21.setCapacity(1);
    QueueFaulty var25 = new QueueFaulty();
    var25.enqueue((java.lang.Object)false);
    boolean var28 = var25.isFull();
    boolean var29 = var25.isFull();
    java.lang.Object var30 = var25.dequeue();
    java.lang.String var31 = var25.toString();
    var21.enqueue((java.lang.Object)var25);
    var11.enqueue((java.lang.Object)var21);
    boolean var34 = var11.isEmpty();
    var0.enqueue((java.lang.Object)var11);
    java.lang.Object var36 = var11.dequeue();
    java.lang.String var37 = var11.toString();
    java.lang.String var38 = var11.toString();
    boolean var39 = var11.isFull();
    java.lang.String var40 = var11.toString();
    java.lang.String var41 = var11.toString();
    var11.setCapacity(100);
    boolean var44 = var11.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + false+ "'", var5.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "[]"+ "'", var8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + false+ "'", var15.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "[]"+ "'", var19.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "[]"+ "'", var22.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + false+ "'", var30.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "[]"+ "'", var31.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var36);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "[]"+ "'", var37.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "[]"+ "'", var38.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "[]"+ "'", var40.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "[]"+ "'", var41.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);

  }

  public void test7() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test7");


    QueueFaulty var0 = new QueueFaulty();
    var0.enqueue((java.lang.Object)false);
    boolean var3 = var0.isFull();
    boolean var4 = var0.isFull();
    java.lang.Object var5 = var0.dequeue();
    boolean var6 = var0.isFull();
    boolean var7 = var0.isFull();
    java.lang.String var8 = var0.toString();
    var0.setCapacity((-1));
    var0.setCapacity(0);
    QueueFaulty var13 = new QueueFaulty();
    var13.enqueue((java.lang.Object)false);
    boolean var16 = var13.isFull();
    var13.enqueue((java.lang.Object)0.0f);
    java.lang.Object var19 = var13.dequeue();
    boolean var20 = var13.isEmpty();
    var0.enqueue((java.lang.Object)var20);
    java.lang.String var22 = var0.toString();
    var0.setCapacity(100);
    var0.setCapacity(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + false+ "'", var5.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "[]"+ "'", var8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + false+ "'", var19.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "[false]"+ "'", var22.equals("[false]"));

  }

  public void test8() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test8");


    QueueFaulty var0 = new QueueFaulty();
    var0.enqueue((java.lang.Object)false);
    boolean var3 = var0.isEmpty();
    boolean var4 = var0.isFull();
    java.lang.String var5 = var0.toString();
    java.lang.Object var6 = var0.dequeue();
    QueueFaulty var7 = new QueueFaulty();
    var7.enqueue((java.lang.Object)false);
    boolean var10 = var7.isEmpty();
    java.lang.Object var11 = var7.dequeue();
    var7.setCapacity(10);
    boolean var14 = var7.isFull();
    var7.setCapacity(1);
    boolean var17 = var7.isEmpty();
    var7.setCapacity(10);
    var0.enqueue((java.lang.Object)var7);
    boolean var21 = var7.isFull();
    boolean var22 = var7.isEmpty();
    boolean var23 = var7.isFull();
    boolean var24 = var7.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "[false]"+ "'", var5.equals("[false]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + false+ "'", var6.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + false+ "'", var11.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test9() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test9");


    QueueFaulty var0 = new QueueFaulty();
    var0.enqueue((java.lang.Object)false);
    boolean var3 = var0.isEmpty();
    java.lang.String var4 = var0.toString();
    boolean var5 = var0.isFull();
    boolean var6 = var0.isEmpty();
    java.lang.Object var7 = var0.dequeue();
    java.lang.String var8 = var0.toString();
    boolean var9 = var0.isFull();
    java.lang.String var10 = var0.toString();
    QueueFaulty var11 = new QueueFaulty();
    var11.enqueue((java.lang.Object)false);
    boolean var14 = var11.isEmpty();
    java.lang.String var15 = var11.toString();
    boolean var16 = var11.isFull();
    boolean var17 = var11.isEmpty();
    java.lang.Object var18 = var11.dequeue();
    var0.enqueue((java.lang.Object)var11);
    var11.enqueue((java.lang.Object)(short)(-1));
    boolean var22 = var11.isFull();
    var11.setCapacity(0);
    QueueFaulty var25 = new QueueFaulty();
    QueueFaulty var26 = new QueueFaulty();
    var26.enqueue((java.lang.Object)false);
    boolean var29 = var26.isFull();
    boolean var30 = var26.isFull();
    java.lang.Object var31 = var26.dequeue();
    boolean var32 = var26.isFull();
    boolean var33 = var26.isFull();
    java.lang.String var34 = var26.toString();
    var26.setCapacity(0);
    var25.enqueue((java.lang.Object)var26);
    boolean var38 = var26.isEmpty();
    var26.setCapacity(100);
    var11.enqueue((java.lang.Object)100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "[false]"+ "'", var4.equals("[false]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + false+ "'", var7.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "[]"+ "'", var8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "[]"+ "'", var10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "[false]"+ "'", var15.equals("[false]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + false+ "'", var18.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + false+ "'", var31.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "[]"+ "'", var34.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);

  }

  public void test10() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test10");


    QueueFaulty var0 = new QueueFaulty();
    var0.enqueue((java.lang.Object)false);
    boolean var3 = var0.isFull();
    boolean var4 = var0.isFull();
    java.lang.Object var5 = var0.dequeue();
    boolean var6 = var0.isFull();
    boolean var7 = var0.isFull();
    java.lang.String var8 = var0.toString();
    var0.enqueue((java.lang.Object)1.0d);
    boolean var11 = var0.isEmpty();
    boolean var12 = var0.isEmpty();
    QueueFaulty var13 = new QueueFaulty();
    var13.enqueue((java.lang.Object)false);
    boolean var16 = var13.isFull();
    boolean var17 = var13.isFull();
    java.lang.Object var18 = var13.dequeue();
    boolean var19 = var13.isFull();
    boolean var20 = var13.isFull();
    boolean var21 = var13.isFull();
    var13.setCapacity(0);
    QueueFaulty var24 = new QueueFaulty();
    boolean var25 = var24.isEmpty();
    java.lang.String var26 = var24.toString();
    QueueFaulty var27 = new QueueFaulty();
    var27.enqueue((java.lang.Object)false);
    boolean var30 = var27.isFull();
    boolean var31 = var27.isFull();
    java.lang.Object var32 = var27.dequeue();
    boolean var33 = var27.isFull();
    boolean var34 = var27.isFull();
    java.lang.String var35 = var27.toString();
    var27.enqueue((java.lang.Object)1.0d);
    boolean var38 = var27.isFull();
    var24.enqueue((java.lang.Object)var27);
    QueueFaulty var40 = new QueueFaulty();
    var40.enqueue((java.lang.Object)false);
    boolean var43 = var40.isFull();
    boolean var44 = var40.isFull();
    java.lang.Object var45 = var40.dequeue();
    boolean var46 = var40.isFull();
    boolean var47 = var40.isFull();
    java.lang.String var48 = var40.toString();
    var40.enqueue((java.lang.Object)1.0d);
    var40.setCapacity(0);
    boolean var53 = var40.isEmpty();
    var40.setCapacity(0);
    var27.enqueue((java.lang.Object)var40);
    var13.enqueue((java.lang.Object)var27);
    boolean var58 = var27.isEmpty();
    var27.setCapacity(10);
    java.lang.Object var61 = var27.dequeue();
    var0.enqueue((java.lang.Object)var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + false+ "'", var5.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "[]"+ "'", var8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + false+ "'", var18.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "[]"+ "'", var26.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + false+ "'", var32.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "[]"+ "'", var35.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + false+ "'", var45.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "[]"+ "'", var48.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var61);

  }

  public void test11() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test11");


    QueueFaulty var0 = new QueueFaulty();
    var0.enqueue((java.lang.Object)false);
    boolean var3 = var0.isEmpty();
    java.lang.Object var4 = var0.dequeue();
    var0.setCapacity(10);
    boolean var7 = var0.isFull();
    var0.setCapacity(1);
    var0.setCapacity(10);
    boolean var12 = var0.isFull();
    boolean var13 = var0.isEmpty();
    var0.setCapacity(0);
    boolean var16 = var0.isFull();
    QueueFaulty var17 = new QueueFaulty();
    var17.enqueue((java.lang.Object)false);
    boolean var20 = var17.isEmpty();
    java.lang.Object var21 = var17.dequeue();
    java.lang.String var22 = var17.toString();
    java.lang.String var23 = var17.toString();
    var0.enqueue((java.lang.Object)var17);
    var0.setCapacity(0);
    boolean var27 = var0.isEmpty();
    java.lang.Object var28 = var0.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + false+ "'", var4.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + false+ "'", var21.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "[]"+ "'", var22.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "[]"+ "'", var23.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test12() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test12");


    QueueFaulty var0 = new QueueFaulty();
    var0.enqueue((java.lang.Object)false);
    boolean var3 = var0.isFull();
    boolean var4 = var0.isFull();
    java.lang.Object var5 = var0.dequeue();
    var0.enqueue((java.lang.Object)1.0f);
    java.lang.String var8 = var0.toString();
    java.lang.String var9 = var0.toString();
    var0.setCapacity(10);
    boolean var12 = var0.isEmpty();
    QueueFaulty var13 = new QueueFaulty();
    var13.enqueue((java.lang.Object)false);
    boolean var16 = var13.isFull();
    boolean var17 = var13.isFull();
    java.lang.Object var18 = var13.dequeue();
    java.lang.String var19 = var13.toString();
    boolean var20 = var13.isFull();
    var0.enqueue((java.lang.Object)var20);
    boolean var22 = var0.isEmpty();
    QueueFaulty var23 = new QueueFaulty();
    var23.enqueue((java.lang.Object)false);
    boolean var26 = var23.isFull();
    boolean var27 = var23.isFull();
    java.lang.Object var28 = var23.dequeue();
    var23.enqueue((java.lang.Object)1.0f);
    QueueFaulty var31 = new QueueFaulty();
    var31.enqueue((java.lang.Object)false);
    boolean var34 = var31.isEmpty();
    java.lang.Object var35 = var31.dequeue();
    var31.setCapacity(10);
    boolean var38 = var31.isFull();
    var23.enqueue((java.lang.Object)var31);
    boolean var40 = var31.isFull();
    var0.enqueue((java.lang.Object)var31);
    java.lang.String var42 = var31.toString();
    QueueFaulty var43 = new QueueFaulty();
    var43.enqueue((java.lang.Object)false);
    boolean var46 = var43.isFull();
    boolean var47 = var43.isFull();
    java.lang.Object var48 = var43.dequeue();
    java.lang.String var49 = var43.toString();
    var43.setCapacity(0);
    boolean var52 = var43.isFull();
    QueueFaulty var53 = new QueueFaulty();
    var53.enqueue((java.lang.Object)false);
    boolean var56 = var53.isEmpty();
    java.lang.String var57 = var53.toString();
    boolean var58 = var53.isFull();
    boolean var59 = var53.isEmpty();
    java.lang.Object var60 = var53.dequeue();
    java.lang.String var61 = var53.toString();
    boolean var62 = var53.isFull();
    boolean var63 = var53.isEmpty();
    boolean var64 = var53.isEmpty();
    var43.enqueue((java.lang.Object)var53);
    java.lang.Object var66 = var43.dequeue();
    var31.enqueue(var66);
    boolean var68 = var31.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + false+ "'", var5.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "[1.0]"+ "'", var8.equals("[1.0]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "[1.0]"+ "'", var9.equals("[1.0]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + false+ "'", var18.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "[]"+ "'", var19.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + false+ "'", var28.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + false+ "'", var35.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "[]"+ "'", var42.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + false+ "'", var48.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + "[]"+ "'", var49.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var57 + "' != '" + "[false]"+ "'", var57.equals("[false]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + false+ "'", var60.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var61 + "' != '" + "[]"+ "'", var61.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);

  }

  public void test13() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test13");


    QueueFaulty var0 = new QueueFaulty();
    var0.enqueue((java.lang.Object)false);
    boolean var3 = var0.isEmpty();
    java.lang.Object var4 = var0.dequeue();
    java.lang.String var5 = var0.toString();
    boolean var6 = var0.isEmpty();
    var0.setCapacity(0);
    QueueFaulty var9 = new QueueFaulty();
    var9.enqueue((java.lang.Object)false);
    boolean var12 = var9.isFull();
    boolean var13 = var9.isFull();
    java.lang.Object var14 = var9.dequeue();
    var9.enqueue((java.lang.Object)1.0f);
    java.lang.String var17 = var9.toString();
    java.lang.String var18 = var9.toString();
    boolean var19 = var9.isEmpty();
    java.lang.Object var20 = var9.dequeue();
    var9.setCapacity(100);
    boolean var23 = var9.isFull();
    var0.enqueue((java.lang.Object)var9);
    boolean var25 = var0.isEmpty();
    boolean var26 = var0.isFull();
    boolean var27 = var0.isEmpty();
    java.lang.Object var28 = var0.dequeue();
    var0.setCapacity(100);
    var0.setCapacity(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + false+ "'", var4.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "[]"+ "'", var5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + false+ "'", var14.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "[1.0]"+ "'", var17.equals("[1.0]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "[1.0]"+ "'", var18.equals("[1.0]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + 1.0f+ "'", var20.equals(1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var28);

  }

  public void test14() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test14");


    QueueFaulty var0 = new QueueFaulty();
    java.lang.String var1 = var0.toString();
    var0.setCapacity(1);
    QueueFaulty var4 = new QueueFaulty();
    var4.enqueue((java.lang.Object)false);
    boolean var7 = var4.isFull();
    boolean var8 = var4.isFull();
    java.lang.Object var9 = var4.dequeue();
    java.lang.String var10 = var4.toString();
    var0.enqueue((java.lang.Object)var4);
    boolean var12 = var0.isEmpty();
    boolean var13 = var0.isEmpty();
    java.lang.String var14 = var0.toString();
    boolean var15 = var0.isEmpty();
    boolean var16 = var0.isEmpty();
    boolean var17 = var0.isEmpty();
    boolean var18 = var0.isEmpty();
    java.lang.String var19 = var0.toString();
    boolean var20 = var0.isEmpty();
    boolean var21 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "[]"+ "'", var1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + false+ "'", var9.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "[]"+ "'", var10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "[[]]"+ "'", var14.equals("[[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "[[]]"+ "'", var19.equals("[[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);

  }

  public void test15() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test15");


    QueueFaulty var0 = new QueueFaulty();
    var0.enqueue((java.lang.Object)false);
    boolean var3 = var0.isEmpty();
    boolean var4 = var0.isFull();
    var0.setCapacity(10);
    boolean var7 = var0.isEmpty();
    QueueFaulty var8 = new QueueFaulty();
    var8.enqueue((java.lang.Object)false);
    boolean var11 = var8.isFull();
    boolean var12 = var8.isFull();
    java.lang.Object var13 = var8.dequeue();
    java.lang.String var14 = var8.toString();
    var0.enqueue((java.lang.Object)var14);
    var0.setCapacity((-1));
    QueueFaulty var18 = new QueueFaulty();
    var18.enqueue((java.lang.Object)false);
    boolean var21 = var18.isEmpty();
    java.lang.Object var22 = var18.dequeue();
    var18.setCapacity(10);
    boolean var25 = var18.isFull();
    var18.enqueue((java.lang.Object)"hi!");
    var0.enqueue((java.lang.Object)var18);
    java.lang.Object var29 = var0.dequeue();
    boolean var30 = var0.isFull();
    boolean var31 = var0.isFull();
    boolean var32 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + false+ "'", var13.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "[]"+ "'", var14.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + false+ "'", var22.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "[]"+ "'", var29.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);

  }

  public void test16() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test16");


    QueueFaulty var0 = new QueueFaulty();
    var0.enqueue((java.lang.Object)false);
    boolean var3 = var0.isFull();
    boolean var4 = var0.isFull();
    java.lang.Object var5 = var0.dequeue();
    boolean var6 = var0.isFull();
    boolean var7 = var0.isFull();
    java.lang.String var8 = var0.toString();
    QueueFaulty var9 = new QueueFaulty();
    var9.enqueue((java.lang.Object)false);
    boolean var12 = var9.isFull();
    boolean var13 = var9.isFull();
    java.lang.Object var14 = var9.dequeue();
    boolean var15 = var9.isFull();
    boolean var16 = var9.isFull();
    java.lang.String var17 = var9.toString();
    var9.enqueue((java.lang.Object)1.0d);
    var9.setCapacity(0);
    var0.enqueue((java.lang.Object)0);
    java.lang.String var23 = var0.toString();
    java.lang.String var24 = var0.toString();
    java.lang.String var25 = var0.toString();
    QueueFaulty var26 = new QueueFaulty();
    var26.enqueue((java.lang.Object)false);
    boolean var29 = var26.isEmpty();
    boolean var30 = var26.isFull();
    boolean var31 = var26.isEmpty();
    java.lang.String var32 = var26.toString();
    QueueFaulty var33 = new QueueFaulty();
    var33.enqueue((java.lang.Object)false);
    boolean var36 = var33.isFull();
    boolean var37 = var33.isFull();
    java.lang.Object var38 = var33.dequeue();
    var33.enqueue((java.lang.Object)1.0f);
    QueueFaulty var41 = new QueueFaulty();
    var41.enqueue((java.lang.Object)false);
    boolean var44 = var41.isEmpty();
    java.lang.Object var45 = var41.dequeue();
    var41.setCapacity(10);
    boolean var48 = var41.isFull();
    var33.enqueue((java.lang.Object)var41);
    var33.setCapacity(1);
    var26.enqueue((java.lang.Object)1);
    var0.enqueue((java.lang.Object)1);
    var0.setCapacity(0);
    var0.setCapacity(10);
    boolean var58 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + false+ "'", var5.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "[]"+ "'", var8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + false+ "'", var14.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "[]"+ "'", var17.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "[0]"+ "'", var23.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "[0]"+ "'", var24.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "[0]"+ "'", var25.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "[false]"+ "'", var32.equals("[false]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + false+ "'", var38.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + false+ "'", var45.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);

  }

  public void test17() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test17");


    QueueFaulty var0 = new QueueFaulty();
    boolean var1 = var0.isEmpty();
    java.lang.String var2 = var0.toString();
    QueueFaulty var3 = new QueueFaulty();
    var3.enqueue((java.lang.Object)false);
    boolean var6 = var3.isFull();
    boolean var7 = var3.isFull();
    java.lang.Object var8 = var3.dequeue();
    boolean var9 = var3.isFull();
    boolean var10 = var3.isFull();
    java.lang.String var11 = var3.toString();
    var3.enqueue((java.lang.Object)1.0d);
    boolean var14 = var3.isFull();
    var0.enqueue((java.lang.Object)var3);
    java.lang.String var16 = var3.toString();
    boolean var17 = var3.isEmpty();
    var3.setCapacity(10);
    boolean var20 = var3.isEmpty();
    QueueFaulty var21 = new QueueFaulty();
    java.lang.String var22 = var21.toString();
    var21.setCapacity(1);
    java.lang.String var25 = var21.toString();
    var21.setCapacity(0);
    QueueFaulty var28 = new QueueFaulty();
    QueueFaulty var29 = new QueueFaulty();
    var29.enqueue((java.lang.Object)false);
    boolean var32 = var29.isFull();
    boolean var33 = var29.isFull();
    java.lang.Object var34 = var29.dequeue();
    boolean var35 = var29.isFull();
    boolean var36 = var29.isFull();
    java.lang.String var37 = var29.toString();
    var29.setCapacity(0);
    var28.enqueue((java.lang.Object)var29);
    boolean var41 = var29.isEmpty();
    java.lang.String var42 = var29.toString();
    var21.enqueue((java.lang.Object)var29);
    java.lang.String var44 = var29.toString();
    boolean var45 = var29.isEmpty();
    QueueFaulty var46 = new QueueFaulty();
    var46.setCapacity(100);
    java.lang.String var49 = var46.toString();
    boolean var50 = var46.isFull();
    var29.enqueue((java.lang.Object)var50);
    var3.enqueue((java.lang.Object)var29);
    java.lang.String var53 = var29.toString();
    QueueFaulty var54 = new QueueFaulty();
    var54.enqueue((java.lang.Object)false);
    boolean var57 = var54.isEmpty();
    java.lang.Object var58 = var54.dequeue();
    var54.setCapacity(10);
    var54.setCapacity(1);
    var54.setCapacity(10);
    QueueFaulty var65 = new QueueFaulty();
    var65.enqueue((java.lang.Object)false);
    boolean var68 = var65.isEmpty();
    java.lang.Object var69 = var65.dequeue();
    var65.setCapacity(10);
    boolean var72 = var65.isFull();
    var65.enqueue((java.lang.Object)"hi!");
    boolean var75 = var65.isFull();
    var54.enqueue((java.lang.Object)var65);
    java.lang.String var77 = var65.toString();
    java.lang.Object var78 = var65.dequeue();
    QueueFaulty var79 = new QueueFaulty();
    var79.enqueue((java.lang.Object)false);
    boolean var82 = var79.isFull();
    boolean var83 = var79.isFull();
    java.lang.Object var84 = var79.dequeue();
    var79.enqueue((java.lang.Object)1.0f);
    java.lang.String var87 = var79.toString();
    java.lang.String var88 = var79.toString();
    boolean var89 = var79.isEmpty();
    java.lang.Object var90 = var79.dequeue();
    var79.setCapacity(100);
    boolean var93 = var79.isFull();
    var79.setCapacity(0);
    boolean var96 = var79.isEmpty();
    var65.enqueue((java.lang.Object)var96);
    boolean var98 = var65.isEmpty();
    var29.enqueue((java.lang.Object)var65);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "[]"+ "'", var2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + false+ "'", var8.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "[]"+ "'", var11.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "[1.0]"+ "'", var16.equals("[1.0]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "[]"+ "'", var22.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "[]"+ "'", var25.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + false+ "'", var34.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "[]"+ "'", var37.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "[]"+ "'", var42.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "[]"+ "'", var44.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + "[]"+ "'", var49.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + "[false]"+ "'", var53.equals("[false]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var58 + "' != '" + false+ "'", var58.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var69 + "' != '" + false+ "'", var69.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var77 + "' != '" + "[hi!]"+ "'", var77.equals("[hi!]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var78 + "' != '" + "hi!"+ "'", var78.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var84 + "' != '" + false+ "'", var84.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var87 + "' != '" + "[1.0]"+ "'", var87.equals("[1.0]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var88 + "' != '" + "[1.0]"+ "'", var88.equals("[1.0]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var89 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var90 + "' != '" + 1.0f+ "'", var90.equals(1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var93 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var96 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var98 == false);

  }

  public void test18() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test18");


    QueueFaulty var0 = new QueueFaulty();
    java.lang.String var1 = var0.toString();
    var0.setCapacity(1);
    boolean var4 = var0.isEmpty();
    java.lang.String var5 = var0.toString();
    boolean var6 = var0.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var7 = var0.dequeue();
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "[]"+ "'", var1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "[]"+ "'", var5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test19() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test19");


    QueueFaulty var0 = new QueueFaulty();
    var0.enqueue((java.lang.Object)false);
    boolean var3 = var0.isFull();
    boolean var4 = var0.isFull();
    java.lang.Object var5 = var0.dequeue();
    boolean var6 = var0.isFull();
    boolean var7 = var0.isFull();
    java.lang.String var8 = var0.toString();
    var0.setCapacity((-1));
    QueueFaulty var11 = new QueueFaulty();
    var11.enqueue((java.lang.Object)false);
    boolean var14 = var11.isFull();
    boolean var15 = var11.isFull();
    java.lang.Object var16 = var11.dequeue();
    var11.enqueue((java.lang.Object)1.0f);
    java.lang.String var19 = var11.toString();
    java.lang.String var20 = var11.toString();
    boolean var21 = var11.isEmpty();
    java.lang.Object var22 = var11.dequeue();
    var0.enqueue(var22);
    boolean var24 = var0.isFull();
    java.lang.String var25 = var0.toString();
    QueueFaulty var26 = new QueueFaulty();
    var26.enqueue((java.lang.Object)false);
    boolean var29 = var26.isEmpty();
    boolean var30 = var26.isFull();
    var26.setCapacity(10);
    boolean var33 = var26.isEmpty();
    var26.setCapacity(100);
    var26.setCapacity(0);
    var26.setCapacity(100);
    boolean var40 = var26.isEmpty();
    var0.enqueue((java.lang.Object)var26);
    var0.setCapacity((-1));
    boolean var44 = var0.isEmpty();
    boolean var45 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + false+ "'", var5.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "[]"+ "'", var8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + false+ "'", var16.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "[1.0]"+ "'", var19.equals("[1.0]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "[1.0]"+ "'", var20.equals("[1.0]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + 1.0f+ "'", var22.equals(1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "[1.0]"+ "'", var25.equals("[1.0]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);

  }

  public void test20() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test20");


    QueueFaulty var0 = new QueueFaulty();
    var0.enqueue((java.lang.Object)false);
    boolean var3 = var0.isFull();
    boolean var4 = var0.isFull();
    java.lang.Object var5 = var0.dequeue();
    boolean var6 = var0.isFull();
    boolean var7 = var0.isFull();
    java.lang.String var8 = var0.toString();
    var0.setCapacity(0);
    boolean var11 = var0.isEmpty();
    QueueFaulty var12 = new QueueFaulty();
    var12.enqueue((java.lang.Object)false);
    boolean var15 = var12.isEmpty();
    boolean var16 = var12.isFull();
    var12.setCapacity(10);
    boolean var19 = var12.isEmpty();
    var12.setCapacity(100);
    var12.setCapacity(0);
    java.lang.Object var24 = var12.dequeue();
    var0.enqueue((java.lang.Object)var12);
    java.lang.String var26 = var12.toString();
    boolean var27 = var12.isFull();
    boolean var28 = var12.isEmpty();
    boolean var29 = var12.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var30 = var12.dequeue();
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + false+ "'", var5.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "[]"+ "'", var8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "[]"+ "'", var26.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);

  }

  public void test21() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test21");


    QueueFaulty var0 = new QueueFaulty();
    var0.enqueue((java.lang.Object)false);
    boolean var3 = var0.isEmpty();
    java.lang.String var4 = var0.toString();
    boolean var5 = var0.isFull();
    boolean var6 = var0.isEmpty();
    java.lang.String var7 = var0.toString();
    java.lang.Object var8 = var0.dequeue();
    boolean var9 = var0.isFull();
    var0.setCapacity((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "[false]"+ "'", var4.equals("[false]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "[false]"+ "'", var7.equals("[false]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + false+ "'", var8.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test22() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test22");


    QueueFaulty var0 = new QueueFaulty();
    var0.enqueue((java.lang.Object)false);
    boolean var3 = var0.isFull();
    java.lang.String var4 = var0.toString();
    var0.setCapacity(0);
    var0.setCapacity(100);
    QueueFaulty var9 = new QueueFaulty();
    var9.enqueue((java.lang.Object)false);
    boolean var12 = var9.isEmpty();
    java.lang.String var13 = var9.toString();
    var9.setCapacity((-1));
    java.lang.String var16 = var9.toString();
    java.lang.Object var17 = var9.dequeue();
    boolean var18 = var9.isEmpty();
    boolean var19 = var9.isEmpty();
    var9.setCapacity(100);
    var0.enqueue((java.lang.Object)var9);
    boolean var23 = var9.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "[false]"+ "'", var4.equals("[false]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "[false]"+ "'", var13.equals("[false]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "[false]"+ "'", var16.equals("[false]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + false+ "'", var17.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test23() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test23");


    QueueFaulty var0 = new QueueFaulty();
    var0.enqueue((java.lang.Object)false);
    boolean var3 = var0.isFull();
    boolean var4 = var0.isFull();
    java.lang.Object var5 = var0.dequeue();
    boolean var6 = var0.isFull();
    boolean var7 = var0.isFull();
    java.lang.String var8 = var0.toString();
    var0.setCapacity(1);
    boolean var11 = var0.isEmpty();
    boolean var12 = var0.isEmpty();
    boolean var13 = var0.isEmpty();
    boolean var14 = var0.isEmpty();
    boolean var15 = var0.isEmpty();
    boolean var16 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + false+ "'", var5.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "[]"+ "'", var8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test24() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test24");


    QueueFaulty var0 = new QueueFaulty();
    var0.enqueue((java.lang.Object)false);
    boolean var3 = var0.isFull();
    boolean var4 = var0.isFull();
    java.lang.Object var5 = var0.dequeue();
    boolean var6 = var0.isFull();
    boolean var7 = var0.isFull();
    boolean var8 = var0.isFull();
    var0.setCapacity(0);
    QueueFaulty var11 = new QueueFaulty();
    var11.enqueue((java.lang.Object)false);
    boolean var14 = var11.isEmpty();
    java.lang.Object var15 = var11.dequeue();
    var11.setCapacity(10);
    boolean var18 = var11.isFull();
    var11.setCapacity(1);
    boolean var21 = var11.isEmpty();
    var0.enqueue((java.lang.Object)var11);
    var0.setCapacity(10);
    QueueFaulty var25 = new QueueFaulty();
    var25.enqueue((java.lang.Object)false);
    boolean var28 = var25.isEmpty();
    java.lang.String var29 = var25.toString();
    boolean var30 = var25.isFull();
    boolean var31 = var25.isEmpty();
    QueueFaulty var32 = new QueueFaulty();
    var32.enqueue((java.lang.Object)false);
    boolean var35 = var32.isEmpty();
    java.lang.Object var36 = var32.dequeue();
    var32.setCapacity(10);
    boolean var39 = var32.isFull();
    var32.enqueue((java.lang.Object)"hi!");
    var25.enqueue((java.lang.Object)var32);
    var0.enqueue((java.lang.Object)var25);
    var25.setCapacity((-1));
    var25.setCapacity(10);
    java.lang.Object var48 = var25.dequeue();
    boolean var49 = var25.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + false+ "'", var5.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + false+ "'", var15.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "[false]"+ "'", var29.equals("[false]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + false+ "'", var36.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);

  }

  public void test25() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test25");


    QueueFaulty var0 = new QueueFaulty();
    var0.enqueue((java.lang.Object)false);
    boolean var3 = var0.isEmpty();
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isFull();
    java.lang.String var6 = var0.toString();
    boolean var7 = var0.isEmpty();
    var0.enqueue((java.lang.Object)(byte)10);
    boolean var10 = var0.isFull();
    boolean var11 = var0.isEmpty();
    QueueFaulty var12 = new QueueFaulty();
    var12.enqueue((java.lang.Object)false);
    boolean var15 = var12.isEmpty();
    boolean var16 = var12.isFull();
    java.lang.String var17 = var12.toString();
    java.lang.Object var18 = var12.dequeue();
    QueueFaulty var19 = new QueueFaulty();
    var19.enqueue((java.lang.Object)false);
    boolean var22 = var19.isEmpty();
    java.lang.Object var23 = var19.dequeue();
    var19.setCapacity(10);
    boolean var26 = var19.isFull();
    var19.setCapacity(1);
    boolean var29 = var19.isEmpty();
    var19.setCapacity(10);
    var12.enqueue((java.lang.Object)var19);
    boolean var33 = var19.isEmpty();
    var19.setCapacity(0);
    boolean var36 = var19.isEmpty();
    java.lang.String var37 = var19.toString();
    boolean var38 = var19.isEmpty();
    boolean var39 = var19.isEmpty();
    var0.enqueue((java.lang.Object)var39);
    var0.setCapacity(100);
    java.lang.Object var43 = var0.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + false+ "'", var4.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "[]"+ "'", var6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "[false]"+ "'", var17.equals("[false]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + false+ "'", var18.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + false+ "'", var23.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "[]"+ "'", var37.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var43);

  }

  public void test26() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test26");


    QueueFaulty var0 = new QueueFaulty();
    QueueFaulty var1 = new QueueFaulty();
    var1.enqueue((java.lang.Object)false);
    boolean var4 = var1.isFull();
    boolean var5 = var1.isFull();
    java.lang.Object var6 = var1.dequeue();
    boolean var7 = var1.isFull();
    boolean var8 = var1.isFull();
    java.lang.String var9 = var1.toString();
    var1.setCapacity(0);
    var0.enqueue((java.lang.Object)var1);
    var1.setCapacity(10);
    QueueFaulty var15 = new QueueFaulty();
    boolean var16 = var15.isEmpty();
    boolean var17 = var15.isEmpty();
    boolean var18 = var15.isEmpty();
    QueueFaulty var19 = new QueueFaulty();
    var19.enqueue((java.lang.Object)false);
    boolean var22 = var19.isFull();
    boolean var23 = var19.isFull();
    java.lang.Object var24 = var19.dequeue();
    var19.enqueue((java.lang.Object)1.0f);
    var15.enqueue((java.lang.Object)var19);
    var1.enqueue((java.lang.Object)var19);
    boolean var29 = var1.isEmpty();
    java.lang.String var30 = var1.toString();
    QueueFaulty var31 = new QueueFaulty();
    boolean var32 = var31.isEmpty();
    java.lang.String var33 = var31.toString();
    var31.setCapacity((-1));
    boolean var36 = var31.isEmpty();
    boolean var37 = var31.isFull();
    var1.enqueue((java.lang.Object)var31);
    QueueFaulty var39 = new QueueFaulty();
    var39.enqueue((java.lang.Object)false);
    boolean var42 = var39.isEmpty();
    boolean var43 = var39.isFull();
    var39.setCapacity(10);
    boolean var46 = var39.isEmpty();
    QueueFaulty var47 = new QueueFaulty();
    var47.enqueue((java.lang.Object)false);
    boolean var50 = var47.isFull();
    boolean var51 = var47.isFull();
    java.lang.Object var52 = var47.dequeue();
    java.lang.String var53 = var47.toString();
    var39.enqueue((java.lang.Object)var53);
    java.lang.Object var55 = var39.dequeue();
    boolean var56 = var39.isEmpty();
    var31.enqueue((java.lang.Object)var39);
    java.lang.String var58 = var31.toString();
    java.lang.Object var59 = var31.dequeue();
    var31.setCapacity(100);
    java.lang.String var62 = var31.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + false+ "'", var6.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "[]"+ "'", var9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + false+ "'", var24.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "[[1.0]]"+ "'", var30.equals("[[1.0]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "[]"+ "'", var33.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + false+ "'", var52.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + "[]"+ "'", var53.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var58 + "' != '" + "[[[]]]"+ "'", var58.equals("[[[]]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var62 + "' != '" + "[]"+ "'", var62.equals("[]"));

  }

  public void test27() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test27");


    QueueFaulty var0 = new QueueFaulty();
    var0.enqueue((java.lang.Object)false);
    boolean var3 = var0.isEmpty();
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isFull();
    java.lang.String var6 = var0.toString();
    boolean var7 = var0.isEmpty();
    var0.setCapacity(10);
    var0.setCapacity((-1));
    QueueFaulty var12 = new QueueFaulty();
    var12.enqueue((java.lang.Object)false);
    boolean var15 = var12.isEmpty();
    boolean var16 = var12.isFull();
    boolean var17 = var12.isEmpty();
    java.lang.String var18 = var12.toString();
    var0.enqueue((java.lang.Object)var12);
    java.lang.String var20 = var12.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + false+ "'", var4.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "[]"+ "'", var6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "[false]"+ "'", var18.equals("[false]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "[false]"+ "'", var20.equals("[false]"));

  }

  public void test28() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test28");


    QueueFaulty var0 = new QueueFaulty();
    var0.enqueue((java.lang.Object)false);
    boolean var3 = var0.isFull();
    boolean var4 = var0.isFull();
    java.lang.Object var5 = var0.dequeue();
    var0.enqueue((java.lang.Object)1.0f);
    boolean var8 = var0.isFull();
    boolean var9 = var0.isFull();
    boolean var10 = var0.isEmpty();
    var0.setCapacity(1);
    QueueFaulty var13 = new QueueFaulty();
    var13.enqueue((java.lang.Object)false);
    java.lang.String var16 = var13.toString();
    boolean var17 = var13.isEmpty();
    boolean var18 = var13.isEmpty();
    boolean var19 = var13.isFull();
    boolean var20 = var13.isFull();
    var13.setCapacity((-1));
    boolean var23 = var13.isEmpty();
    boolean var24 = var13.isFull();
    java.lang.String var25 = var13.toString();
    boolean var26 = var13.isFull();
    var13.setCapacity(1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.enqueue((java.lang.Object)1);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + false+ "'", var5.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "[false]"+ "'", var16.equals("[false]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "[false]"+ "'", var25.equals("[false]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);

  }

  public void test29() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test29");


    QueueFaulty var0 = new QueueFaulty();
    var0.enqueue((java.lang.Object)false);
    boolean var3 = var0.isEmpty();
    boolean var4 = var0.isFull();
    var0.setCapacity(10);
    boolean var7 = var0.isEmpty();
    QueueFaulty var8 = new QueueFaulty();
    var8.enqueue((java.lang.Object)false);
    boolean var11 = var8.isFull();
    boolean var12 = var8.isFull();
    java.lang.Object var13 = var8.dequeue();
    java.lang.String var14 = var8.toString();
    var0.enqueue((java.lang.Object)var14);
    var0.setCapacity((-1));
    QueueFaulty var18 = new QueueFaulty();
    var18.enqueue((java.lang.Object)false);
    boolean var21 = var18.isEmpty();
    java.lang.Object var22 = var18.dequeue();
    var18.setCapacity(10);
    boolean var25 = var18.isFull();
    var18.enqueue((java.lang.Object)"hi!");
    var0.enqueue((java.lang.Object)var18);
    boolean var29 = var18.isEmpty();
    boolean var30 = var18.isFull();
    var18.setCapacity(10);
    boolean var33 = var18.isFull();
    boolean var34 = var18.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + false+ "'", var13.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "[]"+ "'", var14.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + false+ "'", var22.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test30() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test30");


    QueueFaulty var0 = new QueueFaulty();
    var0.enqueue((java.lang.Object)false);
    boolean var3 = var0.isEmpty();
    java.lang.Object var4 = var0.dequeue();
    var0.setCapacity(10);
    boolean var7 = var0.isFull();
    java.lang.String var8 = var0.toString();
    boolean var9 = var0.isEmpty();
    QueueFaulty var10 = new QueueFaulty();
    java.lang.String var11 = var10.toString();
    var10.setCapacity(1);
    QueueFaulty var14 = new QueueFaulty();
    var14.enqueue((java.lang.Object)false);
    boolean var17 = var14.isFull();
    boolean var18 = var14.isFull();
    java.lang.Object var19 = var14.dequeue();
    java.lang.String var20 = var14.toString();
    var10.enqueue((java.lang.Object)var14);
    var0.enqueue((java.lang.Object)var10);
    var10.setCapacity(100);
    QueueFaulty var25 = new QueueFaulty();
    var25.enqueue((java.lang.Object)false);
    boolean var28 = var25.isFull();
    var25.enqueue((java.lang.Object)0.0f);
    java.lang.Object var31 = var25.dequeue();
    var25.setCapacity(100);
    var10.enqueue((java.lang.Object)100);
    QueueFaulty var35 = new QueueFaulty();
    var35.enqueue((java.lang.Object)false);
    boolean var38 = var35.isFull();
    boolean var39 = var35.isFull();
    var35.setCapacity(100);
    boolean var42 = var35.isFull();
    boolean var43 = var35.isEmpty();
    var10.enqueue((java.lang.Object)var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + false+ "'", var4.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "[]"+ "'", var8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "[]"+ "'", var11.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + false+ "'", var19.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "[]"+ "'", var20.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + false+ "'", var31.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);

  }

  public void test31() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test31");


    QueueFaulty var0 = new QueueFaulty();
    var0.enqueue((java.lang.Object)false);
    boolean var3 = var0.isFull();
    boolean var4 = var0.isFull();
    java.lang.Object var5 = var0.dequeue();
    java.lang.String var6 = var0.toString();
    boolean var7 = var0.isFull();
    boolean var8 = var0.isFull();
    QueueFaulty var9 = new QueueFaulty();
    boolean var10 = var9.isEmpty();
    boolean var11 = var9.isEmpty();
    boolean var12 = var9.isEmpty();
    QueueFaulty var13 = new QueueFaulty();
    var13.enqueue((java.lang.Object)false);
    boolean var16 = var13.isFull();
    boolean var17 = var13.isFull();
    java.lang.Object var18 = var13.dequeue();
    var13.enqueue((java.lang.Object)1.0f);
    var9.enqueue((java.lang.Object)var13);
    boolean var22 = var9.isEmpty();
    var0.enqueue((java.lang.Object)var9);
    boolean var24 = var0.isEmpty();
    boolean var25 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + false+ "'", var5.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "[]"+ "'", var6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + false+ "'", var18.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test32() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test32");


    QueueFaulty var0 = new QueueFaulty();
    var0.enqueue((java.lang.Object)false);
    boolean var3 = var0.isEmpty();
    boolean var4 = var0.isFull();
    var0.setCapacity(10);
    boolean var7 = var0.isEmpty();
    QueueFaulty var8 = new QueueFaulty();
    var8.enqueue((java.lang.Object)false);
    boolean var11 = var8.isFull();
    boolean var12 = var8.isFull();
    java.lang.Object var13 = var8.dequeue();
    java.lang.String var14 = var8.toString();
    var0.enqueue((java.lang.Object)var14);
    java.lang.Object var16 = var0.dequeue();
    boolean var17 = var0.isEmpty();
    boolean var18 = var0.isFull();
    java.lang.String var19 = var0.toString();
    java.lang.String var20 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + false+ "'", var13.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "[]"+ "'", var14.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "[[]]"+ "'", var19.equals("[[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "[[]]"+ "'", var20.equals("[[]]"));

  }

  public void test33() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test33");


    QueueFaulty var0 = new QueueFaulty();
    var0.enqueue((java.lang.Object)false);
    boolean var3 = var0.isEmpty();
    java.lang.Object var4 = var0.dequeue();
    var0.setCapacity(10);
    boolean var7 = var0.isFull();
    java.lang.String var8 = var0.toString();
    boolean var9 = var0.isEmpty();
    QueueFaulty var10 = new QueueFaulty();
    var10.enqueue((java.lang.Object)false);
    boolean var13 = var10.isEmpty();
    java.lang.String var14 = var10.toString();
    boolean var15 = var10.isFull();
    boolean var16 = var10.isEmpty();
    java.lang.Object var17 = var10.dequeue();
    java.lang.String var18 = var10.toString();
    boolean var19 = var10.isFull();
    var0.enqueue((java.lang.Object)var19);
    boolean var21 = var0.isEmpty();
    var0.setCapacity(100);
    boolean var24 = var0.isEmpty();
    java.lang.Object var25 = var0.dequeue();
    var0.setCapacity(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + false+ "'", var4.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "[]"+ "'", var8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "[false]"+ "'", var14.equals("[false]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + false+ "'", var17.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "[]"+ "'", var18.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var25);

  }

  public void test34() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test34");


    QueueFaulty var0 = new QueueFaulty();
    java.lang.String var1 = var0.toString();
    var0.setCapacity(1);
    QueueFaulty var4 = new QueueFaulty();
    var4.enqueue((java.lang.Object)false);
    boolean var7 = var4.isFull();
    boolean var8 = var4.isFull();
    java.lang.Object var9 = var4.dequeue();
    java.lang.String var10 = var4.toString();
    var0.enqueue((java.lang.Object)var4);
    java.lang.Object var12 = var0.dequeue();
    var0.enqueue((java.lang.Object)100);
    boolean var15 = var0.isFull();
    var0.setCapacity((-1));
    var0.setCapacity(10);
    java.lang.Object var20 = var0.dequeue();
    QueueFaulty var21 = new QueueFaulty();
    var21.enqueue((java.lang.Object)false);
    boolean var24 = var21.isEmpty();
    java.lang.Object var25 = var21.dequeue();
    var21.setCapacity(10);
    boolean var28 = var21.isFull();
    java.lang.String var29 = var21.toString();
    boolean var30 = var21.isEmpty();
    QueueFaulty var31 = new QueueFaulty();
    QueueFaulty var32 = new QueueFaulty();
    var32.enqueue((java.lang.Object)false);
    boolean var35 = var32.isFull();
    boolean var36 = var32.isFull();
    java.lang.Object var37 = var32.dequeue();
    boolean var38 = var32.isFull();
    boolean var39 = var32.isFull();
    java.lang.String var40 = var32.toString();
    var32.setCapacity(0);
    var31.enqueue((java.lang.Object)var32);
    var32.setCapacity(10);
    QueueFaulty var46 = new QueueFaulty();
    boolean var47 = var46.isEmpty();
    boolean var48 = var46.isEmpty();
    boolean var49 = var46.isEmpty();
    QueueFaulty var50 = new QueueFaulty();
    var50.enqueue((java.lang.Object)false);
    boolean var53 = var50.isFull();
    boolean var54 = var50.isFull();
    java.lang.Object var55 = var50.dequeue();
    var50.enqueue((java.lang.Object)1.0f);
    var46.enqueue((java.lang.Object)var50);
    var32.enqueue((java.lang.Object)var50);
    boolean var60 = var32.isEmpty();
    boolean var61 = var32.isEmpty();
    var21.enqueue((java.lang.Object)var61);
    var21.setCapacity(0);
    boolean var65 = var21.isFull();
    QueueFaulty var66 = new QueueFaulty();
    var66.enqueue((java.lang.Object)false);
    boolean var69 = var66.isFull();
    boolean var70 = var66.isFull();
    java.lang.Object var71 = var66.dequeue();
    boolean var72 = var66.isFull();
    boolean var73 = var66.isFull();
    java.lang.String var74 = var66.toString();
    var66.setCapacity((-1));
    var66.setCapacity(0);
    QueueFaulty var79 = new QueueFaulty();
    var79.enqueue((java.lang.Object)false);
    boolean var82 = var79.isFull();
    var79.enqueue((java.lang.Object)0.0f);
    java.lang.Object var85 = var79.dequeue();
    boolean var86 = var79.isEmpty();
    var66.enqueue((java.lang.Object)var86);
    java.lang.String var88 = var66.toString();
    var66.setCapacity(100);
    boolean var91 = var66.isEmpty();
    boolean var92 = var66.isEmpty();
    boolean var93 = var66.isEmpty();
    var21.enqueue((java.lang.Object)var66);
    java.lang.Object var95 = var21.dequeue();
    var0.enqueue(var95);
    boolean var97 = var0.isFull();
    boolean var98 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "[]"+ "'", var1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + false+ "'", var9.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "[]"+ "'", var10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + false+ "'", var25.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "[]"+ "'", var29.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + false+ "'", var37.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "[]"+ "'", var40.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + false+ "'", var55.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var71 + "' != '" + false+ "'", var71.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var74 + "' != '" + "[]"+ "'", var74.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var85 + "' != '" + false+ "'", var85.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var88 + "' != '" + "[false]"+ "'", var88.equals("[false]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var91 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var92 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var93 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var95 + "' != '" + false+ "'", var95.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var97 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var98 == false);

  }

  public void test35() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test35");


    QueueFaulty var0 = new QueueFaulty();
    var0.enqueue((java.lang.Object)false);
    boolean var3 = var0.isEmpty();
    boolean var4 = var0.isFull();
    java.lang.String var5 = var0.toString();
    java.lang.Object var6 = var0.dequeue();
    QueueFaulty var7 = new QueueFaulty();
    var7.enqueue((java.lang.Object)false);
    boolean var10 = var7.isEmpty();
    java.lang.Object var11 = var7.dequeue();
    var7.setCapacity(10);
    boolean var14 = var7.isFull();
    var7.setCapacity(1);
    boolean var17 = var7.isEmpty();
    var7.setCapacity(10);
    var0.enqueue((java.lang.Object)var7);
    boolean var21 = var7.isFull();
    boolean var22 = var7.isEmpty();
    boolean var23 = var7.isFull();
    QueueFaulty var24 = new QueueFaulty();
    var24.enqueue((java.lang.Object)false);
    boolean var27 = var24.isEmpty();
    java.lang.Object var28 = var24.dequeue();
    var24.setCapacity(10);
    boolean var31 = var24.isFull();
    java.lang.String var32 = var24.toString();
    boolean var33 = var24.isEmpty();
    var7.enqueue((java.lang.Object)var24);
    java.lang.Object var35 = var7.dequeue();
    var7.setCapacity((-1));
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var38 = var7.dequeue();
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "[false]"+ "'", var5.equals("[false]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + false+ "'", var6.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + false+ "'", var11.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + false+ "'", var28.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "[]"+ "'", var32.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);

  }

  public void test36() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test36");


    QueueFaulty var0 = new QueueFaulty();
    java.lang.String var1 = var0.toString();
    var0.setCapacity(1);
    QueueFaulty var4 = new QueueFaulty();
    var4.enqueue((java.lang.Object)false);
    boolean var7 = var4.isFull();
    boolean var8 = var4.isFull();
    java.lang.Object var9 = var4.dequeue();
    java.lang.String var10 = var4.toString();
    var0.enqueue((java.lang.Object)var4);
    boolean var12 = var0.isEmpty();
    boolean var13 = var0.isEmpty();
    java.lang.String var14 = var0.toString();
    var0.setCapacity(100);
    boolean var17 = var0.isFull();
    boolean var18 = var0.isFull();
    boolean var19 = var0.isFull();
    boolean var20 = var0.isEmpty();
    java.lang.Object var21 = var0.dequeue();
    var0.setCapacity(0);
    java.lang.String var24 = var0.toString();
    java.lang.String var25 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "[]"+ "'", var1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + false+ "'", var9.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "[]"+ "'", var10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "[[]]"+ "'", var14.equals("[[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var21);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "[]"+ "'", var24.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "[]"+ "'", var25.equals("[]"));

  }

  public void test37() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test37");


    QueueFaulty var0 = new QueueFaulty();
    var0.enqueue((java.lang.Object)false);
    boolean var3 = var0.isFull();
    boolean var4 = var0.isFull();
    java.lang.Object var5 = var0.dequeue();
    boolean var6 = var0.isFull();
    boolean var7 = var0.isFull();
    java.lang.String var8 = var0.toString();
    QueueFaulty var9 = new QueueFaulty();
    var9.enqueue((java.lang.Object)false);
    boolean var12 = var9.isFull();
    boolean var13 = var9.isFull();
    java.lang.Object var14 = var9.dequeue();
    boolean var15 = var9.isFull();
    boolean var16 = var9.isFull();
    java.lang.String var17 = var9.toString();
    var9.enqueue((java.lang.Object)1.0d);
    var9.setCapacity(0);
    var0.enqueue((java.lang.Object)0);
    java.lang.String var23 = var0.toString();
    var0.setCapacity(10);
    boolean var26 = var0.isEmpty();
    QueueFaulty var27 = new QueueFaulty();
    var27.enqueue((java.lang.Object)false);
    boolean var30 = var27.isFull();
    boolean var31 = var27.isFull();
    java.lang.Object var32 = var27.dequeue();
    java.lang.String var33 = var27.toString();
    boolean var34 = var27.isFull();
    boolean var35 = var27.isEmpty();
    boolean var36 = var27.isFull();
    boolean var37 = var27.isEmpty();
    var0.enqueue((java.lang.Object)var37);
    QueueFaulty var39 = new QueueFaulty();
    var39.enqueue((java.lang.Object)false);
    boolean var42 = var39.isEmpty();
    boolean var43 = var39.isFull();
    java.lang.String var44 = var39.toString();
    QueueFaulty var45 = new QueueFaulty();
    var45.enqueue((java.lang.Object)false);
    boolean var48 = var45.isFull();
    boolean var49 = var45.isFull();
    java.lang.Object var50 = var45.dequeue();
    var45.enqueue((java.lang.Object)1.0f);
    var45.setCapacity(10);
    var39.enqueue((java.lang.Object)var45);
    boolean var56 = var39.isEmpty();
    var0.enqueue((java.lang.Object)var56);
    QueueFaulty var58 = new QueueFaulty();
    java.lang.String var59 = var58.toString();
    var58.setCapacity(1);
    java.lang.String var62 = var58.toString();
    var58.setCapacity(0);
    QueueFaulty var65 = new QueueFaulty();
    QueueFaulty var66 = new QueueFaulty();
    var66.enqueue((java.lang.Object)false);
    boolean var69 = var66.isFull();
    boolean var70 = var66.isFull();
    java.lang.Object var71 = var66.dequeue();
    boolean var72 = var66.isFull();
    boolean var73 = var66.isFull();
    java.lang.String var74 = var66.toString();
    var66.setCapacity(0);
    var65.enqueue((java.lang.Object)var66);
    boolean var78 = var66.isEmpty();
    java.lang.String var79 = var66.toString();
    var58.enqueue((java.lang.Object)var66);
    java.lang.String var81 = var58.toString();
    var0.enqueue((java.lang.Object)var81);
    var0.setCapacity(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + false+ "'", var5.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "[]"+ "'", var8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + false+ "'", var14.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "[]"+ "'", var17.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "[0]"+ "'", var23.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + false+ "'", var32.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "[]"+ "'", var33.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "[false]"+ "'", var44.equals("[false]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + false+ "'", var50.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var59 + "' != '" + "[]"+ "'", var59.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var62 + "' != '" + "[]"+ "'", var62.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var71 + "' != '" + false+ "'", var71.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var74 + "' != '" + "[]"+ "'", var74.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var79 + "' != '" + "[]"+ "'", var79.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var81 + "' != '" + "[[]]"+ "'", var81.equals("[[]]"));

  }

  public void test38() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test38");


    QueueFaulty var0 = new QueueFaulty();
    QueueFaulty var1 = new QueueFaulty();
    var1.enqueue((java.lang.Object)false);
    boolean var4 = var1.isFull();
    boolean var5 = var1.isFull();
    java.lang.Object var6 = var1.dequeue();
    boolean var7 = var1.isFull();
    boolean var8 = var1.isFull();
    java.lang.String var9 = var1.toString();
    var1.setCapacity(0);
    var0.enqueue((java.lang.Object)var1);
    var1.setCapacity(10);
    QueueFaulty var15 = new QueueFaulty();
    boolean var16 = var15.isEmpty();
    boolean var17 = var15.isEmpty();
    boolean var18 = var15.isEmpty();
    QueueFaulty var19 = new QueueFaulty();
    var19.enqueue((java.lang.Object)false);
    boolean var22 = var19.isFull();
    boolean var23 = var19.isFull();
    java.lang.Object var24 = var19.dequeue();
    var19.enqueue((java.lang.Object)1.0f);
    var15.enqueue((java.lang.Object)var19);
    var1.enqueue((java.lang.Object)var19);
    boolean var29 = var1.isEmpty();
    boolean var30 = var1.isEmpty();
    boolean var31 = var1.isEmpty();
    QueueFaulty var32 = new QueueFaulty();
    var32.enqueue((java.lang.Object)false);
    boolean var35 = var32.isEmpty();
    java.lang.String var36 = var32.toString();
    boolean var37 = var32.isFull();
    java.lang.Object var38 = var32.dequeue();
    boolean var39 = var32.isFull();
    var1.enqueue((java.lang.Object)var32);
    boolean var41 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + false+ "'", var6.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "[]"+ "'", var9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + false+ "'", var24.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "[false]"+ "'", var36.equals("[false]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + false+ "'", var38.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);

  }

  public void test39() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test39");


    QueueFaulty var0 = new QueueFaulty();
    java.lang.String var1 = var0.toString();
    var0.setCapacity(1);
    java.lang.String var4 = var0.toString();
    var0.setCapacity(0);
    QueueFaulty var7 = new QueueFaulty();
    QueueFaulty var8 = new QueueFaulty();
    var8.enqueue((java.lang.Object)false);
    boolean var11 = var8.isFull();
    boolean var12 = var8.isFull();
    java.lang.Object var13 = var8.dequeue();
    boolean var14 = var8.isFull();
    boolean var15 = var8.isFull();
    java.lang.String var16 = var8.toString();
    var8.setCapacity(0);
    var7.enqueue((java.lang.Object)var8);
    boolean var20 = var8.isEmpty();
    java.lang.String var21 = var8.toString();
    var0.enqueue((java.lang.Object)var8);
    var8.setCapacity(100);
    java.lang.String var25 = var8.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "[]"+ "'", var1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "[]"+ "'", var4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + false+ "'", var13.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "[]"+ "'", var16.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "[]"+ "'", var21.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "[]"+ "'", var25.equals("[]"));

  }

  public void test40() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test40");


    QueueFaulty var0 = new QueueFaulty();
    var0.setCapacity(100);
    QueueFaulty var3 = new QueueFaulty();
    QueueFaulty var4 = new QueueFaulty();
    var4.enqueue((java.lang.Object)false);
    boolean var7 = var4.isFull();
    boolean var8 = var4.isFull();
    java.lang.Object var9 = var4.dequeue();
    boolean var10 = var4.isFull();
    boolean var11 = var4.isFull();
    java.lang.String var12 = var4.toString();
    var4.setCapacity(0);
    var3.enqueue((java.lang.Object)var4);
    boolean var16 = var4.isEmpty();
    var0.enqueue((java.lang.Object)var16);
    boolean var18 = var0.isEmpty();
    QueueFaulty var19 = new QueueFaulty();
    var19.enqueue((java.lang.Object)false);
    boolean var22 = var19.isEmpty();
    boolean var23 = var19.isFull();
    java.lang.String var24 = var19.toString();
    var19.setCapacity((-1));
    java.lang.String var27 = var19.toString();
    java.lang.String var28 = var19.toString();
    java.lang.String var29 = var19.toString();
    var19.setCapacity(0);
    boolean var32 = var19.isEmpty();
    boolean var33 = var19.isFull();
    var0.enqueue((java.lang.Object)var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + false+ "'", var9.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "[]"+ "'", var12.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "[false]"+ "'", var24.equals("[false]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "[false]"+ "'", var27.equals("[false]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "[false]"+ "'", var28.equals("[false]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "[false]"+ "'", var29.equals("[false]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);

  }

  public void test41() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test41");


    QueueFaulty var0 = new QueueFaulty();
    QueueFaulty var1 = new QueueFaulty();
    var1.enqueue((java.lang.Object)false);
    boolean var4 = var1.isFull();
    boolean var5 = var1.isFull();
    java.lang.Object var6 = var1.dequeue();
    boolean var7 = var1.isFull();
    boolean var8 = var1.isFull();
    java.lang.String var9 = var1.toString();
    var1.setCapacity(0);
    var0.enqueue((java.lang.Object)var1);
    boolean var13 = var1.isEmpty();
    boolean var14 = var1.isFull();
    QueueFaulty var15 = new QueueFaulty();
    var15.enqueue((java.lang.Object)false);
    boolean var18 = var15.isEmpty();
    boolean var19 = var15.isFull();
    var15.setCapacity(10);
    boolean var22 = var15.isEmpty();
    var15.setCapacity(100);
    var15.setCapacity(0);
    java.lang.Object var27 = var15.dequeue();
    var1.enqueue((java.lang.Object)var15);
    boolean var29 = var15.isEmpty();
    java.lang.String var30 = var15.toString();
    java.lang.String var31 = var15.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + false+ "'", var6.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "[]"+ "'", var9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "[]"+ "'", var30.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "[]"+ "'", var31.equals("[]"));

  }

  public void test42() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test42");


    QueueFaulty var0 = new QueueFaulty();
    var0.enqueue((java.lang.Object)false);
    boolean var3 = var0.isEmpty();
    java.lang.String var4 = var0.toString();
    boolean var5 = var0.isFull();
    boolean var6 = var0.isEmpty();
    java.lang.Object var7 = var0.dequeue();
    java.lang.String var8 = var0.toString();
    boolean var9 = var0.isFull();
    java.lang.String var10 = var0.toString();
    QueueFaulty var11 = new QueueFaulty();
    var11.enqueue((java.lang.Object)false);
    boolean var14 = var11.isEmpty();
    java.lang.String var15 = var11.toString();
    boolean var16 = var11.isFull();
    boolean var17 = var11.isEmpty();
    java.lang.Object var18 = var11.dequeue();
    var0.enqueue((java.lang.Object)var11);
    boolean var20 = var11.isFull();
    boolean var21 = var11.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "[false]"+ "'", var4.equals("[false]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + false+ "'", var7.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "[]"+ "'", var8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "[]"+ "'", var10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "[false]"+ "'", var15.equals("[false]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + false+ "'", var18.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test43() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test43");


    QueueFaulty var0 = new QueueFaulty();
    var0.enqueue((java.lang.Object)false);
    boolean var3 = var0.isEmpty();
    boolean var4 = var0.isFull();
    java.lang.String var5 = var0.toString();
    var0.setCapacity((-1));
    java.lang.String var8 = var0.toString();
    java.lang.String var9 = var0.toString();
    QueueFaulty var10 = new QueueFaulty();
    boolean var11 = var10.isEmpty();
    java.lang.String var12 = var10.toString();
    QueueFaulty var13 = new QueueFaulty();
    var13.enqueue((java.lang.Object)false);
    boolean var16 = var13.isFull();
    boolean var17 = var13.isFull();
    java.lang.Object var18 = var13.dequeue();
    boolean var19 = var13.isFull();
    boolean var20 = var13.isFull();
    java.lang.String var21 = var13.toString();
    var13.enqueue((java.lang.Object)1.0d);
    boolean var24 = var13.isFull();
    var10.enqueue((java.lang.Object)var13);
    QueueFaulty var26 = new QueueFaulty();
    var26.enqueue((java.lang.Object)false);
    boolean var29 = var26.isFull();
    boolean var30 = var26.isFull();
    java.lang.Object var31 = var26.dequeue();
    boolean var32 = var26.isFull();
    boolean var33 = var26.isFull();
    boolean var34 = var26.isFull();
    java.lang.String var35 = var26.toString();
    QueueFaulty var36 = new QueueFaulty();
    var36.enqueue((java.lang.Object)false);
    boolean var39 = var36.isEmpty();
    java.lang.Object var40 = var36.dequeue();
    QueueFaulty var41 = new QueueFaulty();
    java.lang.String var42 = var41.toString();
    var36.enqueue((java.lang.Object)var42);
    var36.setCapacity(10);
    var26.enqueue((java.lang.Object)10);
    var13.enqueue((java.lang.Object)var26);
    var0.enqueue((java.lang.Object)var26);
    boolean var49 = var0.isFull();
    boolean var50 = var0.isEmpty();
    boolean var51 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "[false]"+ "'", var5.equals("[false]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "[false]"+ "'", var8.equals("[false]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "[false]"+ "'", var9.equals("[false]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "[]"+ "'", var12.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + false+ "'", var18.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "[]"+ "'", var21.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + false+ "'", var31.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "[]"+ "'", var35.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + false+ "'", var40.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "[]"+ "'", var42.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);

  }

  public void test44() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test44");


    QueueFaulty var0 = new QueueFaulty();
    java.lang.String var1 = var0.toString();
    var0.setCapacity(1);
    QueueFaulty var4 = new QueueFaulty();
    var4.enqueue((java.lang.Object)false);
    boolean var7 = var4.isFull();
    boolean var8 = var4.isFull();
    java.lang.Object var9 = var4.dequeue();
    java.lang.String var10 = var4.toString();
    var0.enqueue((java.lang.Object)var4);
    boolean var12 = var0.isEmpty();
    boolean var13 = var0.isEmpty();
    java.lang.String var14 = var0.toString();
    boolean var15 = var0.isEmpty();
    boolean var16 = var0.isEmpty();
    java.lang.String var17 = var0.toString();
    java.lang.Object var18 = var0.dequeue();
    QueueFaulty var19 = new QueueFaulty();
    var19.enqueue((java.lang.Object)false);
    boolean var22 = var19.isFull();
    boolean var23 = var19.isFull();
    java.lang.Object var24 = var19.dequeue();
    var19.enqueue((java.lang.Object)1.0f);
    java.lang.String var27 = var19.toString();
    java.lang.String var28 = var19.toString();
    boolean var29 = var19.isFull();
    var0.enqueue((java.lang.Object)var19);
    java.lang.String var31 = var19.toString();
    java.lang.Object var32 = var19.dequeue();
    QueueFaulty var33 = new QueueFaulty();
    var33.enqueue((java.lang.Object)false);
    boolean var36 = var33.isEmpty();
    java.lang.Object var37 = var33.dequeue();
    var33.setCapacity(10);
    boolean var40 = var33.isFull();
    java.lang.String var41 = var33.toString();
    boolean var42 = var33.isEmpty();
    QueueFaulty var43 = new QueueFaulty();
    java.lang.String var44 = var43.toString();
    var43.setCapacity(1);
    QueueFaulty var47 = new QueueFaulty();
    var47.enqueue((java.lang.Object)false);
    boolean var50 = var47.isFull();
    boolean var51 = var47.isFull();
    java.lang.Object var52 = var47.dequeue();
    java.lang.String var53 = var47.toString();
    var43.enqueue((java.lang.Object)var47);
    var33.enqueue((java.lang.Object)var43);
    java.lang.Object var56 = var33.dequeue();
    var33.setCapacity(10);
    boolean var59 = var33.isEmpty();
    var33.setCapacity(100);
    var19.enqueue((java.lang.Object)var33);
    QueueFaulty var63 = new QueueFaulty();
    boolean var64 = var63.isEmpty();
    boolean var65 = var63.isEmpty();
    boolean var66 = var63.isEmpty();
    QueueFaulty var67 = new QueueFaulty();
    var67.enqueue((java.lang.Object)false);
    boolean var70 = var67.isFull();
    boolean var71 = var67.isFull();
    java.lang.Object var72 = var67.dequeue();
    var67.enqueue((java.lang.Object)1.0f);
    var63.enqueue((java.lang.Object)var67);
    java.lang.String var76 = var63.toString();
    boolean var77 = var63.isFull();
    var63.setCapacity(100);
    var33.enqueue((java.lang.Object)100);
    java.lang.String var81 = var33.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "[]"+ "'", var1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + false+ "'", var9.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "[]"+ "'", var10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "[[]]"+ "'", var14.equals("[[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "[[]]"+ "'", var17.equals("[[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + false+ "'", var24.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "[1.0]"+ "'", var27.equals("[1.0]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "[1.0]"+ "'", var28.equals("[1.0]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "[1.0]"+ "'", var31.equals("[1.0]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + 1.0f+ "'", var32.equals(1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + false+ "'", var37.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "[]"+ "'", var41.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "[]"+ "'", var44.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + false+ "'", var52.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + "[]"+ "'", var53.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var72 + "' != '" + false+ "'", var72.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var76 + "' != '" + "[[1.0]]"+ "'", var76.equals("[[1.0]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var81 + "' != '" + "[100]"+ "'", var81.equals("[100]"));

  }

  public void test45() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test45");


    QueueFaulty var0 = new QueueFaulty();
    var0.enqueue((java.lang.Object)false);
    boolean var3 = var0.isEmpty();
    boolean var4 = var0.isFull();
    var0.setCapacity(10);
    boolean var7 = var0.isEmpty();
    QueueFaulty var8 = new QueueFaulty();
    var8.enqueue((java.lang.Object)false);
    boolean var11 = var8.isFull();
    boolean var12 = var8.isFull();
    java.lang.Object var13 = var8.dequeue();
    java.lang.String var14 = var8.toString();
    var0.enqueue((java.lang.Object)var14);
    var0.setCapacity((-1));
    boolean var18 = var0.isFull();
    boolean var19 = var0.isEmpty();
    boolean var20 = var0.isEmpty();
    var0.setCapacity(1);
    java.lang.Object var23 = var0.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + false+ "'", var13.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "[]"+ "'", var14.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);

  }

  public void test46() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test46");


    QueueFaulty var0 = new QueueFaulty();
    var0.enqueue((java.lang.Object)false);
    boolean var3 = var0.isFull();
    boolean var4 = var0.isFull();
    java.lang.Object var5 = var0.dequeue();
    boolean var6 = var0.isFull();
    boolean var7 = var0.isFull();
    java.lang.String var8 = var0.toString();
    var0.enqueue((java.lang.Object)1.0d);
    var0.setCapacity(0);
    boolean var13 = var0.isEmpty();
    QueueFaulty var14 = new QueueFaulty();
    var14.enqueue((java.lang.Object)false);
    boolean var17 = var14.isEmpty();
    java.lang.Object var18 = var14.dequeue();
    var14.setCapacity(10);
    var14.setCapacity(1);
    boolean var23 = var14.isFull();
    boolean var24 = var14.isEmpty();
    boolean var25 = var14.isFull();
    var14.setCapacity(100);
    boolean var28 = var14.isEmpty();
    QueueFaulty var29 = new QueueFaulty();
    java.lang.String var30 = var29.toString();
    var29.setCapacity(1);
    QueueFaulty var33 = new QueueFaulty();
    var33.enqueue((java.lang.Object)false);
    boolean var36 = var33.isFull();
    boolean var37 = var33.isFull();
    java.lang.Object var38 = var33.dequeue();
    java.lang.String var39 = var33.toString();
    var29.enqueue((java.lang.Object)var33);
    java.lang.Object var41 = var29.dequeue();
    var29.enqueue((java.lang.Object)100);
    boolean var44 = var29.isFull();
    java.lang.Object var45 = var29.dequeue();
    java.lang.String var46 = var29.toString();
    java.lang.String var47 = var29.toString();
    var14.enqueue((java.lang.Object)var29);
    java.lang.String var49 = var29.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.enqueue((java.lang.Object)var29);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + false+ "'", var5.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "[]"+ "'", var8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + false+ "'", var18.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "[]"+ "'", var30.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + false+ "'", var38.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "[]"+ "'", var39.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + 100+ "'", var45.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + "[]"+ "'", var46.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "[]"+ "'", var47.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + "[]"+ "'", var49.equals("[]"));

  }

  public void test47() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test47");


    QueueFaulty var0 = new QueueFaulty();
    QueueFaulty var1 = new QueueFaulty();
    var1.enqueue((java.lang.Object)false);
    boolean var4 = var1.isFull();
    boolean var5 = var1.isFull();
    java.lang.Object var6 = var1.dequeue();
    boolean var7 = var1.isFull();
    boolean var8 = var1.isFull();
    java.lang.String var9 = var1.toString();
    var1.setCapacity(0);
    var0.enqueue((java.lang.Object)var1);
    boolean var13 = var1.isEmpty();
    boolean var14 = var1.isFull();
    QueueFaulty var15 = new QueueFaulty();
    var15.enqueue((java.lang.Object)false);
    boolean var18 = var15.isEmpty();
    boolean var19 = var15.isFull();
    var15.setCapacity(10);
    boolean var22 = var15.isEmpty();
    var15.setCapacity(100);
    var15.setCapacity(0);
    java.lang.Object var27 = var15.dequeue();
    var1.enqueue((java.lang.Object)var15);
    boolean var29 = var15.isEmpty();
    boolean var30 = var15.isEmpty();
    boolean var31 = var15.isEmpty();
    QueueFaulty var32 = new QueueFaulty();
    var32.enqueue((java.lang.Object)false);
    boolean var35 = var32.isEmpty();
    java.lang.Object var36 = var32.dequeue();
    var32.setCapacity(10);
    var32.setCapacity(1);
    boolean var41 = var32.isFull();
    boolean var42 = var32.isEmpty();
    boolean var43 = var32.isFull();
    var32.setCapacity(100);
    boolean var46 = var32.isEmpty();
    QueueFaulty var47 = new QueueFaulty();
    java.lang.String var48 = var47.toString();
    var47.setCapacity(1);
    QueueFaulty var51 = new QueueFaulty();
    var51.enqueue((java.lang.Object)false);
    boolean var54 = var51.isFull();
    boolean var55 = var51.isFull();
    java.lang.Object var56 = var51.dequeue();
    java.lang.String var57 = var51.toString();
    var47.enqueue((java.lang.Object)var51);
    java.lang.Object var59 = var47.dequeue();
    var47.enqueue((java.lang.Object)100);
    boolean var62 = var47.isFull();
    java.lang.Object var63 = var47.dequeue();
    java.lang.String var64 = var47.toString();
    java.lang.String var65 = var47.toString();
    var32.enqueue((java.lang.Object)var47);
    java.lang.String var67 = var47.toString();
    java.lang.String var68 = var47.toString();
    var15.enqueue((java.lang.Object)var68);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + false+ "'", var6.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "[]"+ "'", var9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + false+ "'", var36.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "[]"+ "'", var48.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + false+ "'", var56.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var57 + "' != '" + "[]"+ "'", var57.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var63 + "' != '" + 100+ "'", var63.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var64 + "' != '" + "[]"+ "'", var64.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var65 + "' != '" + "[]"+ "'", var65.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var67 + "' != '" + "[]"+ "'", var67.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var68 + "' != '" + "[]"+ "'", var68.equals("[]"));

  }

  public void test48() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test48");


    QueueFaulty var0 = new QueueFaulty();
    var0.enqueue((java.lang.Object)false);
    java.lang.String var3 = var0.toString();
    boolean var4 = var0.isEmpty();
    java.lang.String var5 = var0.toString();
    boolean var6 = var0.isFull();
    boolean var7 = var0.isEmpty();
    var0.setCapacity(100);
    boolean var10 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "[false]"+ "'", var3.equals("[false]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "[false]"+ "'", var5.equals("[false]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test49() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test49");


    QueueFaulty var0 = new QueueFaulty();
    var0.enqueue((java.lang.Object)(short)(-1));
    QueueFaulty var3 = new QueueFaulty();
    var3.enqueue((java.lang.Object)false);
    boolean var6 = var3.isFull();
    boolean var7 = var3.isFull();
    java.lang.Object var8 = var3.dequeue();
    boolean var9 = var3.isFull();
    java.lang.String var10 = var3.toString();
    boolean var11 = var3.isFull();
    var0.enqueue((java.lang.Object)var11);
    java.lang.String var13 = var0.toString();
    var0.setCapacity(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + false+ "'", var8.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "[]"+ "'", var10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "[-1, false]"+ "'", var13.equals("[-1, false]"));

  }

  public void test50() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test50");


    QueueFaulty var0 = new QueueFaulty();
    var0.enqueue((java.lang.Object)false);
    boolean var3 = var0.isEmpty();
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isFull();
    boolean var6 = var0.isEmpty();
    boolean var7 = var0.isFull();
    java.lang.String var8 = var0.toString();
    boolean var9 = var0.isEmpty();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var10 = var0.dequeue();
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + false+ "'", var4.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "[]"+ "'", var8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test51() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test51");


    QueueFaulty var0 = new QueueFaulty();
    var0.enqueue((java.lang.Object)false);
    boolean var3 = var0.isEmpty();
    boolean var4 = var0.isFull();
    java.lang.String var5 = var0.toString();
    java.lang.Object var6 = var0.dequeue();
    QueueFaulty var7 = new QueueFaulty();
    var7.enqueue((java.lang.Object)false);
    boolean var10 = var7.isEmpty();
    java.lang.Object var11 = var7.dequeue();
    var7.setCapacity(10);
    boolean var14 = var7.isFull();
    var7.setCapacity(1);
    boolean var17 = var7.isEmpty();
    var7.setCapacity(10);
    var0.enqueue((java.lang.Object)var7);
    boolean var21 = var7.isEmpty();
    var7.setCapacity(0);
    boolean var24 = var7.isEmpty();
    var7.setCapacity(100);
    boolean var27 = var7.isFull();
    boolean var28 = var7.isFull();
    boolean var29 = var7.isEmpty();
    QueueFaulty var30 = new QueueFaulty();
    var30.enqueue((java.lang.Object)false);
    java.lang.String var33 = var30.toString();
    boolean var34 = var30.isEmpty();
    boolean var35 = var30.isEmpty();
    boolean var36 = var30.isFull();
    boolean var37 = var30.isFull();
    boolean var38 = var30.isFull();
    var7.enqueue((java.lang.Object)var38);
    java.lang.String var40 = var7.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "[false]"+ "'", var5.equals("[false]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + false+ "'", var6.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + false+ "'", var11.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "[false]"+ "'", var33.equals("[false]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "[false]"+ "'", var40.equals("[false]"));

  }

  public void test52() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test52");


    QueueFaulty var0 = new QueueFaulty();
    var0.enqueue((java.lang.Object)false);
    boolean var3 = var0.isEmpty();
    java.lang.String var4 = var0.toString();
    boolean var5 = var0.isFull();
    boolean var6 = var0.isEmpty();
    java.lang.Object var7 = var0.dequeue();
    java.lang.String var8 = var0.toString();
    boolean var9 = var0.isFull();
    java.lang.String var10 = var0.toString();
    QueueFaulty var11 = new QueueFaulty();
    var11.enqueue((java.lang.Object)false);
    boolean var14 = var11.isEmpty();
    java.lang.String var15 = var11.toString();
    boolean var16 = var11.isFull();
    boolean var17 = var11.isEmpty();
    java.lang.Object var18 = var11.dequeue();
    var0.enqueue((java.lang.Object)var11);
    java.lang.Object var20 = var0.dequeue();
    java.lang.String var21 = var0.toString();
    var0.setCapacity((-1));
    boolean var24 = var0.isEmpty();
    java.lang.String var25 = var0.toString();
    java.lang.String var26 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "[false]"+ "'", var4.equals("[false]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + false+ "'", var7.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "[]"+ "'", var8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "[]"+ "'", var10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "[false]"+ "'", var15.equals("[false]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + false+ "'", var18.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "[]"+ "'", var21.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "[]"+ "'", var25.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "[]"+ "'", var26.equals("[]"));

  }

  public void test53() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test53");


    QueueFaulty var0 = new QueueFaulty();
    var0.enqueue((java.lang.Object)false);
    boolean var3 = var0.isEmpty();
    boolean var4 = var0.isFull();
    boolean var5 = var0.isEmpty();
    java.lang.String var6 = var0.toString();
    java.lang.Object var7 = var0.dequeue();
    QueueFaulty var8 = new QueueFaulty();
    var8.enqueue((java.lang.Object)false);
    boolean var11 = var8.isEmpty();
    boolean var12 = var8.isFull();
    var8.setCapacity(10);
    boolean var15 = var8.isEmpty();
    QueueFaulty var16 = new QueueFaulty();
    var16.enqueue((java.lang.Object)false);
    boolean var19 = var16.isFull();
    boolean var20 = var16.isFull();
    java.lang.Object var21 = var16.dequeue();
    java.lang.String var22 = var16.toString();
    var8.enqueue((java.lang.Object)var22);
    var8.setCapacity((-1));
    QueueFaulty var26 = new QueueFaulty();
    var26.enqueue((java.lang.Object)false);
    boolean var29 = var26.isEmpty();
    java.lang.Object var30 = var26.dequeue();
    var26.setCapacity(10);
    boolean var33 = var26.isFull();
    var26.enqueue((java.lang.Object)"hi!");
    var8.enqueue((java.lang.Object)var26);
    boolean var37 = var26.isEmpty();
    java.lang.Object var38 = var26.dequeue();
    var26.setCapacity(100);
    var0.enqueue((java.lang.Object)var26);
    java.lang.String var42 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "[false]"+ "'", var6.equals("[false]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + false+ "'", var7.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + false+ "'", var21.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "[]"+ "'", var22.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + false+ "'", var30.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "hi!"+ "'", var38.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "[[]]"+ "'", var42.equals("[[]]"));

  }

  public void test54() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test54");


    QueueFaulty var0 = new QueueFaulty();
    var0.enqueue((java.lang.Object)false);
    boolean var3 = var0.isEmpty();
    java.lang.Object var4 = var0.dequeue();
    QueueFaulty var5 = new QueueFaulty();
    java.lang.String var6 = var5.toString();
    var0.enqueue((java.lang.Object)var6);
    QueueFaulty var8 = new QueueFaulty();
    var8.enqueue((java.lang.Object)false);
    java.lang.String var11 = var8.toString();
    java.lang.Object var12 = var8.dequeue();
    var0.enqueue(var12);
    java.lang.String var14 = var0.toString();
    var0.setCapacity(1);
    java.lang.Object var17 = var0.dequeue();
    QueueFaulty var18 = new QueueFaulty();
    var18.enqueue((java.lang.Object)false);
    boolean var21 = var18.isEmpty();
    java.lang.Object var22 = var18.dequeue();
    var18.setCapacity(10);
    boolean var25 = var18.isFull();
    java.lang.String var26 = var18.toString();
    boolean var27 = var18.isEmpty();
    java.lang.String var28 = var18.toString();
    boolean var29 = var18.isEmpty();
    QueueFaulty var30 = new QueueFaulty();
    var30.enqueue((java.lang.Object)false);
    boolean var33 = var30.isEmpty();
    java.lang.Object var34 = var30.dequeue();
    var30.setCapacity(10);
    boolean var37 = var30.isFull();
    var30.setCapacity(1);
    var30.setCapacity(10);
    java.lang.String var42 = var30.toString();
    java.lang.String var43 = var30.toString();
    var18.enqueue((java.lang.Object)var30);
    var0.enqueue((java.lang.Object)var30);
    boolean var46 = var30.isEmpty();
    java.lang.String var47 = var30.toString();
    QueueFaulty var48 = new QueueFaulty();
    var48.enqueue((java.lang.Object)false);
    boolean var51 = var48.isEmpty();
    java.lang.Object var52 = var48.dequeue();
    boolean var53 = var48.isFull();
    java.lang.String var54 = var48.toString();
    boolean var55 = var48.isEmpty();
    var48.setCapacity(10);
    boolean var58 = var48.isFull();
    java.lang.String var59 = var48.toString();
    var48.setCapacity((-1));
    var48.setCapacity(1);
    var30.enqueue((java.lang.Object)var48);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var65 = var48.dequeue();
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + false+ "'", var4.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "[]"+ "'", var6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "[false]"+ "'", var11.equals("[false]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + false+ "'", var12.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "[[], false]"+ "'", var14.equals("[[], false]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "[]"+ "'", var17.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + false+ "'", var22.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "[]"+ "'", var26.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "[]"+ "'", var28.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + false+ "'", var34.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "[]"+ "'", var42.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "[]"+ "'", var43.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "[]"+ "'", var47.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + false+ "'", var52.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + "[]"+ "'", var54.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var59 + "' != '" + "[]"+ "'", var59.equals("[]"));

  }

  public void test55() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test55");


    QueueFaulty var0 = new QueueFaulty();
    var0.enqueue((java.lang.Object)false);
    boolean var3 = var0.isFull();
    boolean var4 = var0.isFull();
    java.lang.Object var5 = var0.dequeue();
    boolean var6 = var0.isFull();
    boolean var7 = var0.isFull();
    java.lang.String var8 = var0.toString();
    var0.enqueue((java.lang.Object)1.0d);
    boolean var11 = var0.isEmpty();
    boolean var12 = var0.isEmpty();
    boolean var13 = var0.isFull();
    java.lang.Object var14 = var0.dequeue();
    java.lang.String var15 = var0.toString();
    var0.setCapacity(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + false+ "'", var5.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "[]"+ "'", var8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + 1.0d+ "'", var14.equals(1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "[]"+ "'", var15.equals("[]"));

  }

  public void test56() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test56");


    QueueFaulty var0 = new QueueFaulty();
    java.lang.String var1 = var0.toString();
    var0.setCapacity(1);
    java.lang.String var4 = var0.toString();
    java.lang.String var5 = var0.toString();
    boolean var6 = var0.isEmpty();
    java.lang.String var7 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "[]"+ "'", var1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "[]"+ "'", var4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "[]"+ "'", var5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "[]"+ "'", var7.equals("[]"));

  }

  public void test57() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test57");


    QueueFaulty var0 = new QueueFaulty();
    var0.enqueue((java.lang.Object)false);
    boolean var3 = var0.isEmpty();
    java.lang.Object var4 = var0.dequeue();
    var0.setCapacity(10);
    var0.setCapacity(1);
    var0.setCapacity(10);
    boolean var11 = var0.isFull();
    boolean var12 = var0.isFull();
    boolean var13 = var0.isFull();
    QueueFaulty var14 = new QueueFaulty();
    var14.enqueue((java.lang.Object)false);
    boolean var17 = var14.isEmpty();
    java.lang.String var18 = var14.toString();
    var14.setCapacity((-1));
    java.lang.String var21 = var14.toString();
    java.lang.Object var22 = var14.dequeue();
    boolean var23 = var14.isEmpty();
    var14.enqueue((java.lang.Object)(short)100);
    QueueFaulty var26 = new QueueFaulty();
    var26.enqueue((java.lang.Object)false);
    boolean var29 = var26.isFull();
    boolean var30 = var26.isFull();
    java.lang.Object var31 = var26.dequeue();
    boolean var32 = var26.isFull();
    boolean var33 = var26.isFull();
    java.lang.String var34 = var26.toString();
    var26.setCapacity((-1));
    java.lang.String var37 = var26.toString();
    QueueFaulty var38 = new QueueFaulty();
    var38.enqueue((java.lang.Object)false);
    boolean var41 = var38.isEmpty();
    boolean var42 = var38.isFull();
    var38.setCapacity(10);
    boolean var45 = var38.isEmpty();
    QueueFaulty var46 = new QueueFaulty();
    var46.enqueue((java.lang.Object)false);
    boolean var49 = var46.isFull();
    boolean var50 = var46.isFull();
    java.lang.Object var51 = var46.dequeue();
    java.lang.String var52 = var46.toString();
    var38.enqueue((java.lang.Object)var52);
    var26.enqueue((java.lang.Object)var52);
    var14.enqueue((java.lang.Object)var26);
    QueueFaulty var56 = new QueueFaulty();
    boolean var57 = var56.isEmpty();
    java.lang.String var58 = var56.toString();
    QueueFaulty var59 = new QueueFaulty();
    var59.enqueue((java.lang.Object)false);
    boolean var62 = var59.isFull();
    boolean var63 = var59.isFull();
    java.lang.Object var64 = var59.dequeue();
    boolean var65 = var59.isFull();
    boolean var66 = var59.isFull();
    java.lang.String var67 = var59.toString();
    var59.enqueue((java.lang.Object)1.0d);
    boolean var70 = var59.isFull();
    var56.enqueue((java.lang.Object)var59);
    var14.enqueue((java.lang.Object)var59);
    var0.enqueue((java.lang.Object)var14);
    var14.setCapacity(0);
    var14.setCapacity((-1));
    java.lang.String var78 = var14.toString();
    boolean var79 = var14.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + false+ "'", var4.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "[false]"+ "'", var18.equals("[false]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "[false]"+ "'", var21.equals("[false]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + false+ "'", var22.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + false+ "'", var31.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "[]"+ "'", var34.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "[]"+ "'", var37.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + false+ "'", var51.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "[]"+ "'", var52.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var58 + "' != '" + "[]"+ "'", var58.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var64 + "' != '" + false+ "'", var64.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var67 + "' != '" + "[]"+ "'", var67.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var78 + "' != '" + "[100, [[]], [1.0]]"+ "'", var78.equals("[100, [[]], [1.0]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == false);

  }

  public void test58() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test58");


    QueueFaulty var0 = new QueueFaulty();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    var0.setCapacity(100);
    boolean var5 = var0.isEmpty();
    java.lang.String var6 = var0.toString();
    java.lang.String var7 = var0.toString();
    QueueFaulty var8 = new QueueFaulty();
    java.lang.String var9 = var8.toString();
    var8.setCapacity(1);
    QueueFaulty var12 = new QueueFaulty();
    var12.enqueue((java.lang.Object)false);
    boolean var15 = var12.isFull();
    boolean var16 = var12.isFull();
    java.lang.Object var17 = var12.dequeue();
    java.lang.String var18 = var12.toString();
    var8.enqueue((java.lang.Object)var12);
    boolean var20 = var8.isEmpty();
    boolean var21 = var8.isEmpty();
    java.lang.Object var22 = var8.dequeue();
    QueueFaulty var23 = new QueueFaulty();
    var23.enqueue((java.lang.Object)false);
    boolean var26 = var23.isEmpty();
    java.lang.Object var27 = var23.dequeue();
    var23.setCapacity(10);
    boolean var30 = var23.isFull();
    java.lang.String var31 = var23.toString();
    boolean var32 = var23.isEmpty();
    java.lang.String var33 = var23.toString();
    var8.enqueue((java.lang.Object)var33);
    var0.enqueue((java.lang.Object)var8);
    var8.setCapacity(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "[]"+ "'", var6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "[]"+ "'", var7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "[]"+ "'", var9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + false+ "'", var17.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "[]"+ "'", var18.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + false+ "'", var27.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "[]"+ "'", var31.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "[]"+ "'", var33.equals("[]"));

  }

  public void test59() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test59");


    QueueFaulty var0 = new QueueFaulty();
    QueueFaulty var1 = new QueueFaulty();
    var1.enqueue((java.lang.Object)false);
    boolean var4 = var1.isFull();
    boolean var5 = var1.isFull();
    java.lang.Object var6 = var1.dequeue();
    boolean var7 = var1.isFull();
    boolean var8 = var1.isFull();
    java.lang.String var9 = var1.toString();
    var1.setCapacity(0);
    var0.enqueue((java.lang.Object)var1);
    var1.setCapacity(10);
    QueueFaulty var15 = new QueueFaulty();
    boolean var16 = var15.isEmpty();
    boolean var17 = var15.isEmpty();
    boolean var18 = var15.isEmpty();
    QueueFaulty var19 = new QueueFaulty();
    var19.enqueue((java.lang.Object)false);
    boolean var22 = var19.isFull();
    boolean var23 = var19.isFull();
    java.lang.Object var24 = var19.dequeue();
    var19.enqueue((java.lang.Object)1.0f);
    var15.enqueue((java.lang.Object)var19);
    var1.enqueue((java.lang.Object)var19);
    boolean var29 = var1.isEmpty();
    java.lang.String var30 = var1.toString();
    QueueFaulty var31 = new QueueFaulty();
    boolean var32 = var31.isEmpty();
    java.lang.String var33 = var31.toString();
    var31.setCapacity((-1));
    boolean var36 = var31.isEmpty();
    boolean var37 = var31.isFull();
    var1.enqueue((java.lang.Object)var31);
    QueueFaulty var39 = new QueueFaulty();
    java.lang.String var40 = var39.toString();
    var39.setCapacity(1);
    QueueFaulty var43 = new QueueFaulty();
    var43.enqueue((java.lang.Object)false);
    boolean var46 = var43.isFull();
    boolean var47 = var43.isFull();
    java.lang.Object var48 = var43.dequeue();
    java.lang.String var49 = var43.toString();
    var39.enqueue((java.lang.Object)var43);
    java.lang.Object var51 = var39.dequeue();
    var39.enqueue((java.lang.Object)100);
    java.lang.String var54 = var39.toString();
    var31.enqueue((java.lang.Object)var39);
    QueueFaulty var56 = new QueueFaulty();
    var56.enqueue((java.lang.Object)false);
    QueueFaulty var59 = new QueueFaulty();
    var59.enqueue((java.lang.Object)false);
    boolean var62 = var59.isEmpty();
    boolean var63 = var59.isFull();
    var59.setCapacity(10);
    boolean var66 = var59.isEmpty();
    var59.setCapacity(100);
    var59.setCapacity(0);
    var56.enqueue((java.lang.Object)0);
    var31.enqueue((java.lang.Object)var56);
    QueueFaulty var73 = new QueueFaulty();
    var73.enqueue((java.lang.Object)false);
    java.lang.String var76 = var73.toString();
    boolean var77 = var73.isEmpty();
    boolean var78 = var73.isEmpty();
    var31.enqueue((java.lang.Object)var73);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var80 = var31.toString();
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + false+ "'", var6.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "[]"+ "'", var9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + false+ "'", var24.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "[[1.0]]"+ "'", var30.equals("[[1.0]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "[]"+ "'", var33.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "[]"+ "'", var40.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + false+ "'", var48.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + "[]"+ "'", var49.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + "[100]"+ "'", var54.equals("[100]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var76 + "' != '" + "[false]"+ "'", var76.equals("[false]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == false);

  }

  public void test60() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test60");


    QueueFaulty var0 = new QueueFaulty();
    var0.enqueue((java.lang.Object)false);
    boolean var3 = var0.isEmpty();
    boolean var4 = var0.isFull();
    java.lang.String var5 = var0.toString();
    var0.setCapacity((-1));
    java.lang.String var8 = var0.toString();
    java.lang.String var9 = var0.toString();
    QueueFaulty var10 = new QueueFaulty();
    java.lang.String var11 = var10.toString();
    var10.setCapacity(1);
    QueueFaulty var14 = new QueueFaulty();
    var14.enqueue((java.lang.Object)false);
    boolean var17 = var14.isFull();
    boolean var18 = var14.isFull();
    java.lang.Object var19 = var14.dequeue();
    java.lang.String var20 = var14.toString();
    var10.enqueue((java.lang.Object)var14);
    boolean var22 = var10.isEmpty();
    boolean var23 = var10.isEmpty();
    var10.setCapacity(10);
    var0.enqueue((java.lang.Object)10);
    java.lang.Object var27 = var0.dequeue();
    boolean var28 = var0.isEmpty();
    QueueFaulty var29 = new QueueFaulty();
    java.lang.String var30 = var29.toString();
    java.lang.String var31 = var29.toString();
    var29.setCapacity(100);
    QueueFaulty var34 = new QueueFaulty();
    boolean var35 = var34.isEmpty();
    java.lang.String var36 = var34.toString();
    QueueFaulty var37 = new QueueFaulty();
    var37.enqueue((java.lang.Object)false);
    boolean var40 = var37.isFull();
    boolean var41 = var37.isFull();
    java.lang.Object var42 = var37.dequeue();
    boolean var43 = var37.isFull();
    boolean var44 = var37.isFull();
    java.lang.String var45 = var37.toString();
    var37.enqueue((java.lang.Object)1.0d);
    boolean var48 = var37.isFull();
    var34.enqueue((java.lang.Object)var37);
    QueueFaulty var50 = new QueueFaulty();
    var50.enqueue((java.lang.Object)false);
    boolean var53 = var50.isFull();
    boolean var54 = var50.isFull();
    java.lang.Object var55 = var50.dequeue();
    boolean var56 = var50.isFull();
    boolean var57 = var50.isFull();
    java.lang.String var58 = var50.toString();
    var50.enqueue((java.lang.Object)1.0d);
    var50.setCapacity(0);
    boolean var63 = var50.isEmpty();
    var50.setCapacity(0);
    var37.enqueue((java.lang.Object)var50);
    var37.setCapacity((-1));
    var29.enqueue((java.lang.Object)var37);
    boolean var70 = var29.isEmpty();
    boolean var71 = var29.isFull();
    var0.enqueue((java.lang.Object)var29);
    var29.setCapacity((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "[false]"+ "'", var5.equals("[false]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "[false]"+ "'", var8.equals("[false]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "[false]"+ "'", var9.equals("[false]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "[]"+ "'", var11.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + false+ "'", var19.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "[]"+ "'", var20.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + false+ "'", var27.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "[]"+ "'", var30.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "[]"+ "'", var31.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "[]"+ "'", var36.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + false+ "'", var42.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "[]"+ "'", var45.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + false+ "'", var55.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var58 + "' != '" + "[]"+ "'", var58.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);

  }

  public void test61() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test61");


    QueueFaulty var0 = new QueueFaulty();
    java.lang.String var1 = var0.toString();
    var0.setCapacity(1);
    QueueFaulty var4 = new QueueFaulty();
    var4.enqueue((java.lang.Object)false);
    boolean var7 = var4.isFull();
    boolean var8 = var4.isFull();
    java.lang.Object var9 = var4.dequeue();
    java.lang.String var10 = var4.toString();
    var0.enqueue((java.lang.Object)var4);
    QueueFaulty var12 = new QueueFaulty();
    boolean var13 = var12.isEmpty();
    boolean var14 = var12.isEmpty();
    boolean var15 = var12.isFull();
    var4.enqueue((java.lang.Object)var12);
    java.lang.String var17 = var12.toString();
    boolean var18 = var12.isFull();
    boolean var19 = var12.isFull();
    QueueFaulty var20 = new QueueFaulty();
    QueueFaulty var21 = new QueueFaulty();
    var21.enqueue((java.lang.Object)false);
    boolean var24 = var21.isFull();
    boolean var25 = var21.isFull();
    java.lang.Object var26 = var21.dequeue();
    boolean var27 = var21.isFull();
    boolean var28 = var21.isFull();
    java.lang.String var29 = var21.toString();
    var21.setCapacity(0);
    var20.enqueue((java.lang.Object)var21);
    java.lang.String var33 = var20.toString();
    var12.enqueue((java.lang.Object)var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "[]"+ "'", var1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + false+ "'", var9.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "[]"+ "'", var10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "[]"+ "'", var17.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + false+ "'", var26.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "[]"+ "'", var29.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "[[]]"+ "'", var33.equals("[[]]"));

  }

  public void test62() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test62");


    QueueFaulty var0 = new QueueFaulty();
    var0.enqueue((java.lang.Object)false);
    boolean var3 = var0.isEmpty();
    java.lang.Object var4 = var0.dequeue();
    java.lang.String var5 = var0.toString();
    boolean var6 = var0.isEmpty();
    var0.setCapacity(0);
    var0.enqueue((java.lang.Object)(short)1);
    QueueFaulty var11 = new QueueFaulty();
    QueueFaulty var12 = new QueueFaulty();
    var12.enqueue((java.lang.Object)false);
    boolean var15 = var12.isFull();
    boolean var16 = var12.isFull();
    java.lang.Object var17 = var12.dequeue();
    boolean var18 = var12.isFull();
    boolean var19 = var12.isFull();
    java.lang.String var20 = var12.toString();
    var12.setCapacity(0);
    var11.enqueue((java.lang.Object)var12);
    var12.setCapacity(10);
    QueueFaulty var26 = new QueueFaulty();
    boolean var27 = var26.isEmpty();
    boolean var28 = var26.isEmpty();
    boolean var29 = var26.isEmpty();
    QueueFaulty var30 = new QueueFaulty();
    var30.enqueue((java.lang.Object)false);
    boolean var33 = var30.isFull();
    boolean var34 = var30.isFull();
    java.lang.Object var35 = var30.dequeue();
    var30.enqueue((java.lang.Object)1.0f);
    var26.enqueue((java.lang.Object)var30);
    var12.enqueue((java.lang.Object)var30);
    java.lang.Object var40 = var12.dequeue();
    var0.enqueue((java.lang.Object)var12);
    QueueFaulty var42 = new QueueFaulty();
    java.lang.String var43 = var42.toString();
    var42.setCapacity(1);
    QueueFaulty var46 = new QueueFaulty();
    var46.enqueue((java.lang.Object)false);
    boolean var49 = var46.isFull();
    boolean var50 = var46.isFull();
    java.lang.Object var51 = var46.dequeue();
    java.lang.String var52 = var46.toString();
    var42.enqueue((java.lang.Object)var46);
    boolean var54 = var42.isFull();
    boolean var55 = var42.isFull();
    java.lang.String var56 = var42.toString();
    java.lang.String var57 = var42.toString();
    java.lang.Object var58 = var42.dequeue();
    var0.enqueue(var58);
    boolean var60 = var0.isFull();
    boolean var61 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + false+ "'", var4.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "[]"+ "'", var5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + false+ "'", var17.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "[]"+ "'", var20.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + false+ "'", var35.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "[]"+ "'", var43.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + false+ "'", var51.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "[]"+ "'", var52.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + "[[]]"+ "'", var56.equals("[[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var57 + "' != '" + "[[]]"+ "'", var57.equals("[[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);

  }

  public void test63() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test63");


    QueueFaulty var0 = new QueueFaulty();
    var0.enqueue((java.lang.Object)false);
    boolean var3 = var0.isFull();
    boolean var4 = var0.isFull();
    java.lang.Object var5 = var0.dequeue();
    boolean var6 = var0.isFull();
    boolean var7 = var0.isFull();
    java.lang.String var8 = var0.toString();
    var0.setCapacity((-1));
    java.lang.String var11 = var0.toString();
    boolean var12 = var0.isEmpty();
    boolean var13 = var0.isEmpty();
    QueueFaulty var14 = new QueueFaulty();
    java.lang.String var15 = var14.toString();
    var14.setCapacity(1);
    QueueFaulty var18 = new QueueFaulty();
    var18.enqueue((java.lang.Object)false);
    boolean var21 = var18.isFull();
    boolean var22 = var18.isFull();
    java.lang.Object var23 = var18.dequeue();
    java.lang.String var24 = var18.toString();
    var14.enqueue((java.lang.Object)var18);
    boolean var26 = var14.isEmpty();
    boolean var27 = var14.isEmpty();
    java.lang.String var28 = var14.toString();
    var14.setCapacity(100);
    boolean var31 = var14.isFull();
    boolean var32 = var14.isFull();
    var0.enqueue((java.lang.Object)var14);
    java.lang.Object var34 = var14.dequeue();
    boolean var35 = var14.isFull();
    var14.setCapacity(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + false+ "'", var5.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "[]"+ "'", var8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "[]"+ "'", var11.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "[]"+ "'", var15.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + false+ "'", var23.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "[]"+ "'", var24.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "[[]]"+ "'", var28.equals("[[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);

  }

  public void test64() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test64");


    QueueFaulty var0 = new QueueFaulty();
    var0.enqueue((java.lang.Object)false);
    boolean var3 = var0.isFull();
    boolean var4 = var0.isFull();
    java.lang.Object var5 = var0.dequeue();
    var0.enqueue((java.lang.Object)1.0f);
    QueueFaulty var8 = new QueueFaulty();
    var8.enqueue((java.lang.Object)false);
    boolean var11 = var8.isEmpty();
    java.lang.Object var12 = var8.dequeue();
    var8.setCapacity(10);
    boolean var15 = var8.isFull();
    var0.enqueue((java.lang.Object)var8);
    java.lang.String var17 = var8.toString();
    boolean var18 = var8.isEmpty();
    QueueFaulty var19 = new QueueFaulty();
    var19.enqueue((java.lang.Object)false);
    boolean var22 = var19.isEmpty();
    java.lang.Object var23 = var19.dequeue();
    boolean var24 = var19.isFull();
    java.lang.String var25 = var19.toString();
    boolean var26 = var19.isEmpty();
    var19.setCapacity(10);
    boolean var29 = var19.isFull();
    java.lang.String var30 = var19.toString();
    java.lang.String var31 = var19.toString();
    java.lang.String var32 = var19.toString();
    QueueFaulty var33 = new QueueFaulty();
    java.lang.String var34 = var33.toString();
    java.lang.String var35 = var33.toString();
    boolean var36 = var33.isFull();
    java.lang.String var37 = var33.toString();
    var19.enqueue((java.lang.Object)var37);
    boolean var39 = var19.isEmpty();
    var8.enqueue((java.lang.Object)var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + false+ "'", var5.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + false+ "'", var12.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "[]"+ "'", var17.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + false+ "'", var23.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "[]"+ "'", var25.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "[]"+ "'", var30.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "[]"+ "'", var31.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "[]"+ "'", var32.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "[]"+ "'", var34.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "[]"+ "'", var35.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "[]"+ "'", var37.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);

  }

  public void test65() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test65");


    QueueFaulty var0 = new QueueFaulty();
    var0.enqueue((java.lang.Object)false);
    boolean var3 = var0.isFull();
    java.lang.String var4 = var0.toString();
    var0.setCapacity(0);
    boolean var7 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "[false]"+ "'", var4.equals("[false]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test66() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test66");


    QueueFaulty var0 = new QueueFaulty();
    java.lang.String var1 = var0.toString();
    var0.setCapacity(1);
    var0.setCapacity(0);
    QueueFaulty var6 = new QueueFaulty();
    var6.enqueue((java.lang.Object)false);
    boolean var9 = var6.isEmpty();
    java.lang.Object var10 = var6.dequeue();
    java.lang.String var11 = var6.toString();
    boolean var12 = var6.isEmpty();
    var6.setCapacity(0);
    boolean var15 = var6.isEmpty();
    boolean var16 = var6.isFull();
    var0.enqueue((java.lang.Object)var6);
    QueueFaulty var18 = new QueueFaulty();
    var18.enqueue((java.lang.Object)false);
    boolean var21 = var18.isEmpty();
    java.lang.Object var22 = var18.dequeue();
    java.lang.String var23 = var18.toString();
    boolean var24 = var18.isEmpty();
    boolean var25 = var18.isEmpty();
    boolean var26 = var18.isFull();
    boolean var27 = var18.isFull();
    QueueFaulty var28 = new QueueFaulty();
    var28.enqueue((java.lang.Object)false);
    boolean var31 = var28.isEmpty();
    java.lang.Object var32 = var28.dequeue();
    java.lang.String var33 = var28.toString();
    boolean var34 = var28.isEmpty();
    var28.setCapacity(0);
    boolean var37 = var28.isEmpty();
    java.lang.String var38 = var28.toString();
    var18.enqueue((java.lang.Object)var28);
    var0.enqueue((java.lang.Object)var28);
    var28.setCapacity(10);
    java.lang.String var43 = var28.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "[]"+ "'", var1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + false+ "'", var10.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "[]"+ "'", var11.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + false+ "'", var22.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "[]"+ "'", var23.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + false+ "'", var32.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "[]"+ "'", var33.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "[]"+ "'", var38.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "[]"+ "'", var43.equals("[]"));

  }

  public void test67() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test67");


    QueueFaulty var0 = new QueueFaulty();
    var0.enqueue((java.lang.Object)false);
    boolean var3 = var0.isEmpty();
    java.lang.Object var4 = var0.dequeue();
    boolean var5 = var0.isFull();
    java.lang.String var6 = var0.toString();
    boolean var7 = var0.isEmpty();
    var0.setCapacity(10);
    var0.setCapacity((-1));
    QueueFaulty var12 = new QueueFaulty();
    var12.enqueue((java.lang.Object)false);
    boolean var15 = var12.isEmpty();
    boolean var16 = var12.isFull();
    boolean var17 = var12.isEmpty();
    java.lang.String var18 = var12.toString();
    var0.enqueue((java.lang.Object)var12);
    java.lang.Object var20 = var12.dequeue();
    boolean var21 = var12.isEmpty();
    boolean var22 = var12.isFull();
    QueueFaulty var23 = new QueueFaulty();
    var23.enqueue((java.lang.Object)false);
    java.lang.String var26 = var23.toString();
    var23.setCapacity(0);
    java.lang.Object var29 = var23.dequeue();
    var12.enqueue(var29);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + false+ "'", var4.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "[]"+ "'", var6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "[false]"+ "'", var18.equals("[false]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + false+ "'", var20.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "[false]"+ "'", var26.equals("[false]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + false+ "'", var29.equals(false));

  }

  public void test68() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test68");


    QueueFaulty var0 = new QueueFaulty();
    var0.enqueue((java.lang.Object)false);
    java.lang.String var3 = var0.toString();
    boolean var4 = var0.isEmpty();
    java.lang.String var5 = var0.toString();
    boolean var6 = var0.isFull();
    boolean var7 = var0.isEmpty();
    QueueFaulty var8 = new QueueFaulty();
    var8.enqueue((java.lang.Object)false);
    boolean var11 = var8.isFull();
    boolean var12 = var8.isFull();
    java.lang.Object var13 = var8.dequeue();
    boolean var14 = var8.isFull();
    boolean var15 = var8.isFull();
    boolean var16 = var8.isFull();
    boolean var17 = var8.isEmpty();
    var0.enqueue((java.lang.Object)var8);
    QueueFaulty var19 = new QueueFaulty();
    QueueFaulty var20 = new QueueFaulty();
    var20.enqueue((java.lang.Object)false);
    boolean var23 = var20.isFull();
    boolean var24 = var20.isFull();
    java.lang.Object var25 = var20.dequeue();
    boolean var26 = var20.isFull();
    boolean var27 = var20.isFull();
    java.lang.String var28 = var20.toString();
    var20.setCapacity(0);
    var19.enqueue((java.lang.Object)var20);
    var20.setCapacity(10);
    QueueFaulty var34 = new QueueFaulty();
    boolean var35 = var34.isEmpty();
    boolean var36 = var34.isEmpty();
    boolean var37 = var34.isEmpty();
    QueueFaulty var38 = new QueueFaulty();
    var38.enqueue((java.lang.Object)false);
    boolean var41 = var38.isFull();
    boolean var42 = var38.isFull();
    java.lang.Object var43 = var38.dequeue();
    var38.enqueue((java.lang.Object)1.0f);
    var34.enqueue((java.lang.Object)var38);
    var20.enqueue((java.lang.Object)var38);
    var0.enqueue((java.lang.Object)var38);
    var0.setCapacity(0);
    boolean var51 = var0.isEmpty();
    java.lang.Object var52 = var0.dequeue();
    boolean var53 = var0.isFull();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var54 = var0.toString();
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "[false]"+ "'", var3.equals("[false]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "[false]"+ "'", var5.equals("[false]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + false+ "'", var13.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + false+ "'", var25.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "[]"+ "'", var28.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + false+ "'", var43.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);

  }

  public void test69() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test69");


    QueueFaulty var0 = new QueueFaulty();
    boolean var1 = var0.isEmpty();
    var0.setCapacity((-1));
    boolean var4 = var0.isEmpty();
    var0.setCapacity(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test70() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test70");


    QueueFaulty var0 = new QueueFaulty();
    var0.enqueue((java.lang.Object)false);
    boolean var3 = var0.isEmpty();
    java.lang.String var4 = var0.toString();
    boolean var5 = var0.isFull();
    java.lang.Object var6 = var0.dequeue();
    boolean var7 = var0.isFull();
    var0.setCapacity((-1));
    boolean var10 = var0.isFull();
    boolean var11 = var0.isEmpty();
    java.lang.String var12 = var0.toString();
    var0.setCapacity(0);
    QueueFaulty var15 = new QueueFaulty();
    var15.enqueue((java.lang.Object)false);
    boolean var18 = var15.isFull();
    boolean var19 = var15.isFull();
    java.lang.Object var20 = var15.dequeue();
    var15.enqueue((java.lang.Object)1.0f);
    java.lang.String var23 = var15.toString();
    java.lang.String var24 = var15.toString();
    var15.setCapacity(10);
    boolean var27 = var15.isEmpty();
    QueueFaulty var28 = new QueueFaulty();
    var28.enqueue((java.lang.Object)false);
    boolean var31 = var28.isFull();
    boolean var32 = var28.isFull();
    java.lang.Object var33 = var28.dequeue();
    java.lang.String var34 = var28.toString();
    boolean var35 = var28.isFull();
    var15.enqueue((java.lang.Object)var35);
    boolean var37 = var15.isEmpty();
    boolean var38 = var15.isFull();
    boolean var39 = var15.isEmpty();
    var15.setCapacity(100);
    java.lang.Object var42 = var15.dequeue();
    var15.setCapacity(100);
    var0.enqueue((java.lang.Object)var15);
    boolean var46 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "[false]"+ "'", var4.equals("[false]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + false+ "'", var6.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + "[]"+ "'", var12.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + false+ "'", var20.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "[1.0]"+ "'", var23.equals("[1.0]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "[1.0]"+ "'", var24.equals("[1.0]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + false+ "'", var33.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "[]"+ "'", var34.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);

  }

  public void test71() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test71");


    QueueFaulty var0 = new QueueFaulty();
    var0.enqueue((java.lang.Object)false);
    boolean var3 = var0.isEmpty();
    java.lang.Object var4 = var0.dequeue();
    var0.setCapacity(10);
    QueueFaulty var7 = new QueueFaulty();
    boolean var8 = var7.isEmpty();
    java.lang.String var9 = var7.toString();
    QueueFaulty var10 = new QueueFaulty();
    var10.enqueue((java.lang.Object)false);
    boolean var13 = var10.isFull();
    boolean var14 = var10.isFull();
    java.lang.Object var15 = var10.dequeue();
    boolean var16 = var10.isFull();
    boolean var17 = var10.isFull();
    java.lang.String var18 = var10.toString();
    var10.enqueue((java.lang.Object)1.0d);
    boolean var21 = var10.isFull();
    var7.enqueue((java.lang.Object)var10);
    var0.enqueue((java.lang.Object)var7);
    java.lang.Object var24 = var0.dequeue();
    boolean var25 = var0.isEmpty();
    boolean var26 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + false+ "'", var4.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "[]"+ "'", var9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + false+ "'", var15.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "[]"+ "'", var18.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);

  }

  public void test72() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test72");


    QueueFaulty var0 = new QueueFaulty();
    java.lang.String var1 = var0.toString();
    var0.setCapacity(1);
    QueueFaulty var4 = new QueueFaulty();
    var4.enqueue((java.lang.Object)false);
    boolean var7 = var4.isFull();
    boolean var8 = var4.isFull();
    java.lang.Object var9 = var4.dequeue();
    java.lang.String var10 = var4.toString();
    var0.enqueue((java.lang.Object)var4);
    boolean var12 = var0.isEmpty();
    boolean var13 = var0.isFull();
    var0.setCapacity(10);
    QueueFaulty var16 = new QueueFaulty();
    var16.enqueue((java.lang.Object)false);
    boolean var19 = var16.isFull();
    var16.enqueue((java.lang.Object)0.0f);
    var0.enqueue((java.lang.Object)var16);
    boolean var23 = var0.isFull();
    var0.enqueue((java.lang.Object)0L);
    boolean var26 = var0.isEmpty();
    QueueFaulty var27 = new QueueFaulty();
    java.lang.String var28 = var27.toString();
    var27.setCapacity(1);
    QueueFaulty var31 = new QueueFaulty();
    var31.enqueue((java.lang.Object)false);
    boolean var34 = var31.isFull();
    boolean var35 = var31.isFull();
    java.lang.Object var36 = var31.dequeue();
    java.lang.String var37 = var31.toString();
    var27.enqueue((java.lang.Object)var31);
    boolean var39 = var27.isEmpty();
    boolean var40 = var27.isFull();
    boolean var41 = var27.isFull();
    boolean var42 = var27.isEmpty();
    var0.enqueue((java.lang.Object)var27);
    boolean var44 = var27.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "[]"+ "'", var1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + false+ "'", var9.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "[]"+ "'", var10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "[]"+ "'", var28.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + false+ "'", var36.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "[]"+ "'", var37.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);

  }

  public void test73() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test73");


    QueueFaulty var0 = new QueueFaulty();
    var0.enqueue((java.lang.Object)false);
    boolean var3 = var0.isEmpty();
    java.lang.Object var4 = var0.dequeue();
    java.lang.String var5 = var0.toString();
    boolean var6 = var0.isEmpty();
    boolean var7 = var0.isFull();
    var0.setCapacity(100);
    boolean var10 = var0.isFull();
    QueueFaulty var11 = new QueueFaulty();
    QueueFaulty var12 = new QueueFaulty();
    var12.enqueue((java.lang.Object)false);
    boolean var15 = var12.isFull();
    boolean var16 = var12.isFull();
    java.lang.Object var17 = var12.dequeue();
    boolean var18 = var12.isFull();
    boolean var19 = var12.isFull();
    java.lang.String var20 = var12.toString();
    var12.setCapacity(0);
    var11.enqueue((java.lang.Object)var12);
    var12.setCapacity(10);
    QueueFaulty var26 = new QueueFaulty();
    boolean var27 = var26.isEmpty();
    boolean var28 = var26.isEmpty();
    boolean var29 = var26.isEmpty();
    QueueFaulty var30 = new QueueFaulty();
    var30.enqueue((java.lang.Object)false);
    boolean var33 = var30.isFull();
    boolean var34 = var30.isFull();
    java.lang.Object var35 = var30.dequeue();
    var30.enqueue((java.lang.Object)1.0f);
    var26.enqueue((java.lang.Object)var30);
    var12.enqueue((java.lang.Object)var30);
    boolean var40 = var12.isEmpty();
    java.lang.String var41 = var12.toString();
    var12.setCapacity(1);
    var0.enqueue((java.lang.Object)var12);
    var0.setCapacity(1);
    QueueFaulty var47 = new QueueFaulty();
    var47.enqueue((java.lang.Object)false);
    boolean var50 = var47.isFull();
    boolean var51 = var47.isFull();
    java.lang.Object var52 = var47.dequeue();
    boolean var53 = var47.isFull();
    boolean var54 = var47.isFull();
    java.lang.String var55 = var47.toString();
    var47.setCapacity((-1));
    boolean var58 = var47.isEmpty();
    var0.enqueue((java.lang.Object)var47);
    var0.setCapacity((-1));
    boolean var62 = var0.isFull();
    boolean var63 = var0.isEmpty();
    var0.setCapacity(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + false+ "'", var4.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "[]"+ "'", var5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + false+ "'", var17.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "[]"+ "'", var20.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + false+ "'", var35.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "[[1.0]]"+ "'", var41.equals("[[1.0]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + false+ "'", var52.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + "[]"+ "'", var55.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);

  }

  public void test74() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test74");


    QueueFaulty var0 = new QueueFaulty();
    var0.enqueue((java.lang.Object)false);
    boolean var3 = var0.isFull();
    boolean var4 = var0.isFull();
    java.lang.Object var5 = var0.dequeue();
    boolean var6 = var0.isFull();
    boolean var7 = var0.isFull();
    boolean var8 = var0.isFull();
    var0.setCapacity(0);
    QueueFaulty var11 = new QueueFaulty();
    var11.enqueue((java.lang.Object)false);
    boolean var14 = var11.isEmpty();
    java.lang.Object var15 = var11.dequeue();
    var11.setCapacity(10);
    boolean var18 = var11.isFull();
    var11.setCapacity(1);
    boolean var21 = var11.isEmpty();
    var0.enqueue((java.lang.Object)var11);
    var0.setCapacity(10);
    QueueFaulty var25 = new QueueFaulty();
    var25.enqueue((java.lang.Object)false);
    boolean var28 = var25.isEmpty();
    java.lang.String var29 = var25.toString();
    boolean var30 = var25.isFull();
    boolean var31 = var25.isEmpty();
    QueueFaulty var32 = new QueueFaulty();
    var32.enqueue((java.lang.Object)false);
    boolean var35 = var32.isEmpty();
    java.lang.Object var36 = var32.dequeue();
    var32.setCapacity(10);
    boolean var39 = var32.isFull();
    var32.enqueue((java.lang.Object)"hi!");
    var25.enqueue((java.lang.Object)var32);
    var0.enqueue((java.lang.Object)var25);
    boolean var44 = var25.isFull();
    java.lang.String var45 = var25.toString();
    boolean var46 = var25.isEmpty();
    java.lang.Object var47 = var25.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + false+ "'", var5.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + false+ "'", var15.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + "[false]"+ "'", var29.equals("[false]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + false+ "'", var36.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "[false, [hi!]]"+ "'", var45.equals("[false, [hi!]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + false+ "'", var47.equals(false));

  }

  public void test75() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test75");


    QueueFaulty var0 = new QueueFaulty();
    boolean var1 = var0.isEmpty();
    java.lang.String var2 = var0.toString();
    QueueFaulty var3 = new QueueFaulty();
    var3.enqueue((java.lang.Object)false);
    boolean var6 = var3.isFull();
    boolean var7 = var3.isFull();
    java.lang.Object var8 = var3.dequeue();
    boolean var9 = var3.isFull();
    boolean var10 = var3.isFull();
    java.lang.String var11 = var3.toString();
    var3.enqueue((java.lang.Object)1.0d);
    boolean var14 = var3.isFull();
    var0.enqueue((java.lang.Object)var3);
    QueueFaulty var16 = new QueueFaulty();
    var16.enqueue((java.lang.Object)false);
    boolean var19 = var16.isFull();
    boolean var20 = var16.isFull();
    java.lang.Object var21 = var16.dequeue();
    boolean var22 = var16.isFull();
    boolean var23 = var16.isFull();
    boolean var24 = var16.isFull();
    java.lang.String var25 = var16.toString();
    QueueFaulty var26 = new QueueFaulty();
    var26.enqueue((java.lang.Object)false);
    boolean var29 = var26.isEmpty();
    java.lang.Object var30 = var26.dequeue();
    QueueFaulty var31 = new QueueFaulty();
    java.lang.String var32 = var31.toString();
    var26.enqueue((java.lang.Object)var32);
    var26.setCapacity(10);
    var16.enqueue((java.lang.Object)10);
    var3.enqueue((java.lang.Object)var16);
    java.lang.String var38 = var16.toString();
    var16.setCapacity(100);
    boolean var41 = var16.isFull();
    boolean var42 = var16.isFull();
    var16.setCapacity((-1));
    boolean var45 = var16.isFull();
    var16.setCapacity(1);
    boolean var48 = var16.isFull();
    boolean var49 = var16.isFull();
    java.lang.Object var50 = var16.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "[]"+ "'", var2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + false+ "'", var8.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "[]"+ "'", var11.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + false+ "'", var21.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "[]"+ "'", var25.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + false+ "'", var30.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "[]"+ "'", var32.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "[10]"+ "'", var38.equals("[10]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var50);

  }

  public void test76() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test76");


    QueueFaulty var0 = new QueueFaulty();
    QueueFaulty var1 = new QueueFaulty();
    var1.enqueue((java.lang.Object)false);
    boolean var4 = var1.isFull();
    boolean var5 = var1.isFull();
    java.lang.Object var6 = var1.dequeue();
    boolean var7 = var1.isFull();
    boolean var8 = var1.isFull();
    java.lang.String var9 = var1.toString();
    var1.setCapacity(0);
    var0.enqueue((java.lang.Object)var1);
    var1.setCapacity(10);
    QueueFaulty var15 = new QueueFaulty();
    boolean var16 = var15.isEmpty();
    boolean var17 = var15.isEmpty();
    boolean var18 = var15.isEmpty();
    QueueFaulty var19 = new QueueFaulty();
    var19.enqueue((java.lang.Object)false);
    boolean var22 = var19.isFull();
    boolean var23 = var19.isFull();
    java.lang.Object var24 = var19.dequeue();
    var19.enqueue((java.lang.Object)1.0f);
    var15.enqueue((java.lang.Object)var19);
    var1.enqueue((java.lang.Object)var19);
    boolean var29 = var1.isEmpty();
    boolean var30 = var1.isEmpty();
    boolean var31 = var1.isEmpty();
    boolean var32 = var1.isFull();
    boolean var33 = var1.isEmpty();
    java.lang.Object var34 = var1.dequeue();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var35 = var1.dequeue();
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + false+ "'", var6.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "[]"+ "'", var9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + false+ "'", var24.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var34);

  }

  public void test77() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test77");


    QueueFaulty var0 = new QueueFaulty();
    var0.enqueue((java.lang.Object)false);
    java.lang.String var3 = var0.toString();
    boolean var4 = var0.isEmpty();
    java.lang.String var5 = var0.toString();
    boolean var6 = var0.isFull();
    boolean var7 = var0.isEmpty();
    java.lang.Object var8 = var0.dequeue();
    var0.setCapacity(0);
    boolean var11 = var0.isEmpty();
    boolean var12 = var0.isFull();
    boolean var13 = var0.isFull();
    QueueFaulty var14 = new QueueFaulty();
    var14.enqueue((java.lang.Object)false);
    boolean var17 = var14.isEmpty();
    java.lang.Object var18 = var14.dequeue();
    QueueFaulty var19 = new QueueFaulty();
    java.lang.String var20 = var19.toString();
    var14.enqueue((java.lang.Object)var20);
    var14.setCapacity(10);
    boolean var24 = var14.isFull();
    boolean var25 = var14.isEmpty();
    QueueFaulty var26 = new QueueFaulty();
    var26.enqueue((java.lang.Object)(short)(-1));
    java.lang.Object var29 = var26.dequeue();
    java.lang.String var30 = var26.toString();
    var14.enqueue((java.lang.Object)var30);
    boolean var32 = var14.isFull();
    java.lang.Object var33 = var14.dequeue();
    boolean var34 = var14.isEmpty();
    var0.enqueue((java.lang.Object)var14);
    var14.setCapacity(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "[false]"+ "'", var3.equals("[false]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "[false]"+ "'", var5.equals("[false]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + false+ "'", var8.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + false+ "'", var18.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "[]"+ "'", var20.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + (short)(-1)+ "'", var29.equals((short)(-1)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "[]"+ "'", var30.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test78() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test78");


    QueueFaulty var0 = new QueueFaulty();
    var0.enqueue((java.lang.Object)false);
    boolean var3 = var0.isEmpty();
    java.lang.String var4 = var0.toString();
    boolean var5 = var0.isFull();
    boolean var6 = var0.isEmpty();
    java.lang.Object var7 = var0.dequeue();
    java.lang.String var8 = var0.toString();
    boolean var9 = var0.isFull();
    java.lang.String var10 = var0.toString();
    boolean var11 = var0.isEmpty();
    boolean var12 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "[false]"+ "'", var4.equals("[false]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + false+ "'", var7.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "[]"+ "'", var8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "[]"+ "'", var10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test79() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test79");


    QueueFaulty var0 = new QueueFaulty();
    var0.enqueue((java.lang.Object)false);
    boolean var3 = var0.isEmpty();
    java.lang.Object var4 = var0.dequeue();
    var0.setCapacity(10);
    boolean var7 = var0.isFull();
    java.lang.String var8 = var0.toString();
    boolean var9 = var0.isEmpty();
    java.lang.String var10 = var0.toString();
    boolean var11 = var0.isEmpty();
    QueueFaulty var12 = new QueueFaulty();
    var12.enqueue((java.lang.Object)false);
    boolean var15 = var12.isEmpty();
    java.lang.String var16 = var12.toString();
    boolean var17 = var12.isEmpty();
    boolean var18 = var12.isFull();
    var0.enqueue((java.lang.Object)var12);
    boolean var20 = var12.isFull();
    java.lang.String var21 = var12.toString();
    boolean var22 = var12.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + false+ "'", var4.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "[]"+ "'", var8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "[]"+ "'", var10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "[false]"+ "'", var16.equals("[false]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "[false]"+ "'", var21.equals("[false]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test80() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test80");


    QueueFaulty var0 = new QueueFaulty();
    java.lang.String var1 = var0.toString();
    var0.setCapacity(1);
    QueueFaulty var4 = new QueueFaulty();
    var4.enqueue((java.lang.Object)false);
    boolean var7 = var4.isFull();
    boolean var8 = var4.isFull();
    java.lang.Object var9 = var4.dequeue();
    java.lang.String var10 = var4.toString();
    var0.enqueue((java.lang.Object)var4);
    boolean var12 = var0.isEmpty();
    boolean var13 = var0.isEmpty();
    java.lang.String var14 = var0.toString();
    boolean var15 = var0.isEmpty();
    java.lang.Object var16 = var0.dequeue();
    boolean var17 = var0.isFull();
    java.lang.String var18 = var0.toString();
    java.lang.String var19 = var0.toString();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var20 = var0.dequeue();
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "[]"+ "'", var1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + false+ "'", var9.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "[]"+ "'", var10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "[[]]"+ "'", var14.equals("[[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "[]"+ "'", var18.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "[]"+ "'", var19.equals("[]"));

  }

  public void test81() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test81");


    QueueFaulty var0 = new QueueFaulty();
    var0.enqueue((java.lang.Object)false);
    boolean var3 = var0.isFull();
    boolean var4 = var0.isFull();
    java.lang.Object var5 = var0.dequeue();
    boolean var6 = var0.isFull();
    boolean var7 = var0.isFull();
    java.lang.String var8 = var0.toString();
    QueueFaulty var9 = new QueueFaulty();
    var9.enqueue((java.lang.Object)false);
    boolean var12 = var9.isFull();
    boolean var13 = var9.isFull();
    java.lang.Object var14 = var9.dequeue();
    boolean var15 = var9.isFull();
    boolean var16 = var9.isFull();
    java.lang.String var17 = var9.toString();
    var9.enqueue((java.lang.Object)1.0d);
    var9.setCapacity(0);
    var0.enqueue((java.lang.Object)0);
    java.lang.String var23 = var0.toString();
    boolean var24 = var0.isFull();
    java.lang.String var25 = var0.toString();
    boolean var26 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + false+ "'", var5.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "[]"+ "'", var8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + false+ "'", var14.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "[]"+ "'", var17.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "[0]"+ "'", var23.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "[0]"+ "'", var25.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test82() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test82");


    QueueFaulty var0 = new QueueFaulty();
    QueueFaulty var1 = new QueueFaulty();
    var1.enqueue((java.lang.Object)false);
    boolean var4 = var1.isFull();
    boolean var5 = var1.isFull();
    java.lang.Object var6 = var1.dequeue();
    boolean var7 = var1.isFull();
    boolean var8 = var1.isFull();
    java.lang.String var9 = var1.toString();
    var1.setCapacity(0);
    var0.enqueue((java.lang.Object)var1);
    var1.setCapacity(10);
    QueueFaulty var15 = new QueueFaulty();
    boolean var16 = var15.isEmpty();
    boolean var17 = var15.isEmpty();
    boolean var18 = var15.isEmpty();
    QueueFaulty var19 = new QueueFaulty();
    var19.enqueue((java.lang.Object)false);
    boolean var22 = var19.isFull();
    boolean var23 = var19.isFull();
    java.lang.Object var24 = var19.dequeue();
    var19.enqueue((java.lang.Object)1.0f);
    var15.enqueue((java.lang.Object)var19);
    var1.enqueue((java.lang.Object)var19);
    boolean var29 = var1.isEmpty();
    var1.enqueue((java.lang.Object)1.0f);
    boolean var32 = var1.isFull();
    QueueFaulty var33 = new QueueFaulty();
    boolean var34 = var33.isEmpty();
    java.lang.String var35 = var33.toString();
    QueueFaulty var36 = new QueueFaulty();
    var36.enqueue((java.lang.Object)false);
    boolean var39 = var36.isFull();
    boolean var40 = var36.isFull();
    java.lang.Object var41 = var36.dequeue();
    boolean var42 = var36.isFull();
    boolean var43 = var36.isFull();
    java.lang.String var44 = var36.toString();
    var36.enqueue((java.lang.Object)1.0d);
    boolean var47 = var36.isFull();
    var33.enqueue((java.lang.Object)var36);
    QueueFaulty var49 = new QueueFaulty();
    var49.enqueue((java.lang.Object)false);
    boolean var52 = var49.isFull();
    boolean var53 = var49.isFull();
    java.lang.Object var54 = var49.dequeue();
    boolean var55 = var49.isFull();
    boolean var56 = var49.isFull();
    java.lang.String var57 = var49.toString();
    var49.enqueue((java.lang.Object)1.0d);
    var49.setCapacity(0);
    boolean var62 = var49.isEmpty();
    var49.setCapacity(0);
    var36.enqueue((java.lang.Object)var49);
    var1.enqueue((java.lang.Object)var49);
    var1.setCapacity(0);
    boolean var69 = var1.isEmpty();
    boolean var70 = var1.isEmpty();
    boolean var71 = var1.isFull();
    java.lang.Object var72 = var1.dequeue();
    var1.setCapacity(1);
    java.lang.Object var75 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + false+ "'", var6.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "[]"+ "'", var9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + false+ "'", var24.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "[]"+ "'", var35.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + false+ "'", var41.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "[]"+ "'", var44.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + false+ "'", var54.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var57 + "' != '" + "[]"+ "'", var57.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var72);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var75 + "' != '" + 1.0f+ "'", var75.equals(1.0f));

  }

  public void test83() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test83");


    QueueFaulty var0 = new QueueFaulty();
    QueueFaulty var1 = new QueueFaulty();
    var1.enqueue((java.lang.Object)false);
    boolean var4 = var1.isFull();
    boolean var5 = var1.isFull();
    java.lang.Object var6 = var1.dequeue();
    boolean var7 = var1.isFull();
    boolean var8 = var1.isFull();
    java.lang.String var9 = var1.toString();
    var1.setCapacity(0);
    var0.enqueue((java.lang.Object)var1);
    boolean var13 = var1.isEmpty();
    boolean var14 = var1.isFull();
    QueueFaulty var15 = new QueueFaulty();
    var15.enqueue((java.lang.Object)false);
    boolean var18 = var15.isEmpty();
    boolean var19 = var15.isFull();
    var15.setCapacity(10);
    boolean var22 = var15.isEmpty();
    var15.setCapacity(100);
    var15.setCapacity(0);
    java.lang.Object var27 = var15.dequeue();
    var1.enqueue((java.lang.Object)var15);
    boolean var29 = var15.isEmpty();
    java.lang.String var30 = var15.toString();
    boolean var31 = var15.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + false+ "'", var6.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "[]"+ "'", var9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "[]"+ "'", var30.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);

  }

  public void test84() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test84");


    QueueFaulty var0 = new QueueFaulty();
    var0.enqueue((java.lang.Object)false);
    boolean var3 = var0.isFull();
    boolean var4 = var0.isFull();
    java.lang.Object var5 = var0.dequeue();
    boolean var6 = var0.isFull();
    boolean var7 = var0.isFull();
    java.lang.String var8 = var0.toString();
    QueueFaulty var9 = new QueueFaulty();
    var9.enqueue((java.lang.Object)false);
    boolean var12 = var9.isFull();
    boolean var13 = var9.isFull();
    java.lang.Object var14 = var9.dequeue();
    boolean var15 = var9.isFull();
    boolean var16 = var9.isFull();
    java.lang.String var17 = var9.toString();
    var9.enqueue((java.lang.Object)1.0d);
    var9.setCapacity(0);
    var0.enqueue((java.lang.Object)0);
    java.lang.String var23 = var0.toString();
    var0.setCapacity(10);
    QueueFaulty var26 = new QueueFaulty();
    var26.enqueue((java.lang.Object)false);
    boolean var29 = var26.isFull();
    boolean var30 = var26.isFull();
    java.lang.Object var31 = var26.dequeue();
    boolean var32 = var26.isFull();
    boolean var33 = var26.isFull();
    boolean var34 = var26.isFull();
    java.lang.String var35 = var26.toString();
    QueueFaulty var36 = new QueueFaulty();
    var36.enqueue((java.lang.Object)false);
    boolean var39 = var36.isEmpty();
    java.lang.Object var40 = var36.dequeue();
    QueueFaulty var41 = new QueueFaulty();
    java.lang.String var42 = var41.toString();
    var36.enqueue((java.lang.Object)var42);
    var36.setCapacity(10);
    var26.enqueue((java.lang.Object)10);
    QueueFaulty var47 = new QueueFaulty();
    var47.enqueue((java.lang.Object)false);
    boolean var50 = var47.isEmpty();
    boolean var51 = var47.isFull();
    boolean var52 = var47.isEmpty();
    var26.enqueue((java.lang.Object)var52);
    var0.enqueue((java.lang.Object)var26);
    var26.setCapacity(10);
    boolean var57 = var26.isFull();
    boolean var58 = var26.isFull();
    var26.setCapacity(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + false+ "'", var5.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "[]"+ "'", var8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + false+ "'", var14.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "[]"+ "'", var17.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "[0]"+ "'", var23.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + false+ "'", var31.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "[]"+ "'", var35.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + false+ "'", var40.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "[]"+ "'", var42.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);

  }

  public void test85() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test85");


    QueueFaulty var0 = new QueueFaulty();
    java.lang.String var1 = var0.toString();
    var0.setCapacity(1);
    java.lang.String var4 = var0.toString();
    QueueFaulty var5 = new QueueFaulty();
    var5.enqueue((java.lang.Object)false);
    boolean var8 = var5.isFull();
    boolean var9 = var5.isFull();
    java.lang.Object var10 = var5.dequeue();
    var5.enqueue((java.lang.Object)1.0f);
    QueueFaulty var13 = new QueueFaulty();
    var13.enqueue((java.lang.Object)false);
    boolean var16 = var13.isEmpty();
    java.lang.Object var17 = var13.dequeue();
    var13.setCapacity(10);
    boolean var20 = var13.isFull();
    var5.enqueue((java.lang.Object)var13);
    var5.setCapacity(0);
    java.lang.Object var24 = var5.dequeue();
    var0.enqueue(var24);
    boolean var26 = var0.isEmpty();
    java.lang.String var27 = var0.toString();
    boolean var28 = var0.isFull();
    QueueFaulty var29 = new QueueFaulty();
    var29.enqueue((java.lang.Object)false);
    boolean var32 = var29.isFull();
    boolean var33 = var29.isFull();
    java.lang.Object var34 = var29.dequeue();
    boolean var35 = var29.isFull();
    boolean var36 = var29.isFull();
    java.lang.String var37 = var29.toString();
    var29.setCapacity((-1));
    java.lang.String var40 = var29.toString();
    boolean var41 = var29.isEmpty();
    var29.setCapacity(100);
    java.lang.String var44 = var29.toString();
    var29.setCapacity(1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.enqueue((java.lang.Object)var29);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "[]"+ "'", var1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "[]"+ "'", var4.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + false+ "'", var10.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + false+ "'", var17.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + "[[]]"+ "'", var27.equals("[[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + false+ "'", var34.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "[]"+ "'", var37.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "[]"+ "'", var40.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "[]"+ "'", var44.equals("[]"));

  }

  public void test86() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test86");


    QueueFaulty var0 = new QueueFaulty();
    var0.enqueue((java.lang.Object)false);
    boolean var3 = var0.isEmpty();
    java.lang.Object var4 = var0.dequeue();
    var0.setCapacity(10);
    boolean var7 = var0.isFull();
    java.lang.String var8 = var0.toString();
    boolean var9 = var0.isEmpty();
    java.lang.String var10 = var0.toString();
    boolean var11 = var0.isEmpty();
    QueueFaulty var12 = new QueueFaulty();
    var12.enqueue((java.lang.Object)false);
    boolean var15 = var12.isEmpty();
    java.lang.String var16 = var12.toString();
    boolean var17 = var12.isEmpty();
    boolean var18 = var12.isFull();
    var0.enqueue((java.lang.Object)var12);
    boolean var20 = var12.isFull();
    boolean var21 = var12.isFull();
    var12.setCapacity(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + false+ "'", var4.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "[]"+ "'", var8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "[]"+ "'", var10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "[false]"+ "'", var16.equals("[false]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test87() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test87");


    QueueFaulty var0 = new QueueFaulty();
    var0.enqueue((java.lang.Object)false);
    boolean var3 = var0.isFull();
    boolean var4 = var0.isFull();
    java.lang.Object var5 = var0.dequeue();
    var0.enqueue((java.lang.Object)1.0f);
    java.lang.String var8 = var0.toString();
    boolean var9 = var0.isFull();
    var0.setCapacity(1);
    boolean var12 = var0.isFull();
    boolean var13 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + false+ "'", var5.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "[1.0]"+ "'", var8.equals("[1.0]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test88() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test88");


    QueueFaulty var0 = new QueueFaulty();
    QueueFaulty var1 = new QueueFaulty();
    var1.enqueue((java.lang.Object)false);
    boolean var4 = var1.isFull();
    boolean var5 = var1.isFull();
    java.lang.Object var6 = var1.dequeue();
    boolean var7 = var1.isFull();
    boolean var8 = var1.isFull();
    java.lang.String var9 = var1.toString();
    var1.setCapacity(0);
    var0.enqueue((java.lang.Object)var1);
    var1.setCapacity(10);
    QueueFaulty var15 = new QueueFaulty();
    boolean var16 = var15.isEmpty();
    boolean var17 = var15.isEmpty();
    boolean var18 = var15.isEmpty();
    QueueFaulty var19 = new QueueFaulty();
    var19.enqueue((java.lang.Object)false);
    boolean var22 = var19.isFull();
    boolean var23 = var19.isFull();
    java.lang.Object var24 = var19.dequeue();
    var19.enqueue((java.lang.Object)1.0f);
    var15.enqueue((java.lang.Object)var19);
    var1.enqueue((java.lang.Object)var19);
    boolean var29 = var1.isEmpty();
    var1.enqueue((java.lang.Object)1.0f);
    java.lang.Object var32 = var1.dequeue();
    boolean var33 = var1.isEmpty();
    boolean var34 = var1.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + false+ "'", var6.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "[]"+ "'", var9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + false+ "'", var24.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);

  }

  public void test89() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test89");


    QueueFaulty var0 = new QueueFaulty();
    java.lang.String var1 = var0.toString();
    var0.setCapacity(1);
    QueueFaulty var4 = new QueueFaulty();
    var4.enqueue((java.lang.Object)false);
    boolean var7 = var4.isFull();
    boolean var8 = var4.isFull();
    java.lang.Object var9 = var4.dequeue();
    java.lang.String var10 = var4.toString();
    var0.enqueue((java.lang.Object)var4);
    java.lang.Object var12 = var0.dequeue();
    var0.enqueue((java.lang.Object)100);
    java.lang.String var15 = var0.toString();
    java.lang.Object var16 = var0.dequeue();
    boolean var17 = var0.isEmpty();
    boolean var18 = var0.isFull();
    var0.setCapacity(10);
    var0.setCapacity(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "[]"+ "'", var1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + false+ "'", var9.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "[]"+ "'", var10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "[100]"+ "'", var15.equals("[100]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + 100+ "'", var16.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test90() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test90");


    QueueFaulty var0 = new QueueFaulty();
    var0.enqueue((java.lang.Object)false);
    boolean var3 = var0.isFull();
    boolean var4 = var0.isFull();
    java.lang.Object var5 = var0.dequeue();
    boolean var6 = var0.isFull();
    boolean var7 = var0.isFull();
    java.lang.String var8 = var0.toString();
    var0.enqueue((java.lang.Object)1.0d);
    var0.setCapacity(0);
    boolean var13 = var0.isEmpty();
    boolean var14 = var0.isFull();
    boolean var15 = var0.isFull();
    java.lang.String var16 = var0.toString();
    java.lang.Object var17 = var0.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + false+ "'", var5.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "[]"+ "'", var8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + "[1.0]"+ "'", var16.equals("[1.0]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + 1.0d+ "'", var17.equals(1.0d));

  }

  public void test91() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test91");


    QueueFaulty var0 = new QueueFaulty();
    QueueFaulty var1 = new QueueFaulty();
    var1.enqueue((java.lang.Object)false);
    boolean var4 = var1.isFull();
    boolean var5 = var1.isFull();
    java.lang.Object var6 = var1.dequeue();
    boolean var7 = var1.isFull();
    boolean var8 = var1.isFull();
    java.lang.String var9 = var1.toString();
    var1.setCapacity(0);
    var0.enqueue((java.lang.Object)var1);
    var1.setCapacity(10);
    QueueFaulty var15 = new QueueFaulty();
    boolean var16 = var15.isEmpty();
    boolean var17 = var15.isEmpty();
    boolean var18 = var15.isEmpty();
    QueueFaulty var19 = new QueueFaulty();
    var19.enqueue((java.lang.Object)false);
    boolean var22 = var19.isFull();
    boolean var23 = var19.isFull();
    java.lang.Object var24 = var19.dequeue();
    var19.enqueue((java.lang.Object)1.0f);
    var15.enqueue((java.lang.Object)var19);
    var1.enqueue((java.lang.Object)var19);
    boolean var29 = var1.isEmpty();
    var1.enqueue((java.lang.Object)1.0f);
    boolean var32 = var1.isEmpty();
    var1.setCapacity(100);
    java.lang.Object var35 = var1.dequeue();
    QueueFaulty var36 = new QueueFaulty();
    var36.enqueue((java.lang.Object)false);
    boolean var39 = var36.isFull();
    boolean var40 = var36.isFull();
    java.lang.Object var41 = var36.dequeue();
    var36.enqueue((java.lang.Object)1.0f);
    java.lang.String var44 = var36.toString();
    java.lang.String var45 = var36.toString();
    boolean var46 = var36.isEmpty();
    java.lang.Object var47 = var36.dequeue();
    var36.setCapacity(100);
    boolean var50 = var36.isEmpty();
    boolean var51 = var36.isFull();
    var36.setCapacity((-1));
    var36.setCapacity(1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.enqueue((java.lang.Object)1);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + false+ "'", var6.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "[]"+ "'", var9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + false+ "'", var24.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + false+ "'", var41.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "[1.0]"+ "'", var44.equals("[1.0]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "[1.0]"+ "'", var45.equals("[1.0]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + 1.0f+ "'", var47.equals(1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);

  }

  public void test92() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test92");


    QueueFaulty var0 = new QueueFaulty();
    var0.enqueue((java.lang.Object)false);
    boolean var3 = var0.isFull();
    boolean var4 = var0.isFull();
    java.lang.Object var5 = var0.dequeue();
    var0.enqueue((java.lang.Object)1.0f);
    java.lang.Object var8 = var0.dequeue();
    var0.setCapacity(1);
    QueueFaulty var11 = new QueueFaulty();
    var11.enqueue((java.lang.Object)false);
    boolean var14 = var11.isEmpty();
    java.lang.Object var15 = var11.dequeue();
    var11.setCapacity(10);
    java.lang.String var18 = var11.toString();
    boolean var19 = var11.isFull();
    QueueFaulty var20 = new QueueFaulty();
    var20.enqueue((java.lang.Object)false);
    boolean var23 = var20.isFull();
    boolean var24 = var20.isEmpty();
    java.lang.Object var25 = var20.dequeue();
    java.lang.String var26 = var20.toString();
    var11.enqueue((java.lang.Object)var26);
    var0.enqueue((java.lang.Object)var26);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + false+ "'", var5.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + 1.0f+ "'", var8.equals(1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + false+ "'", var15.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "[]"+ "'", var18.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + false+ "'", var25.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "[]"+ "'", var26.equals("[]"));

  }

  public void test93() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test93");


    QueueFaulty var0 = new QueueFaulty();
    QueueFaulty var1 = new QueueFaulty();
    var1.enqueue((java.lang.Object)false);
    boolean var4 = var1.isFull();
    boolean var5 = var1.isFull();
    java.lang.Object var6 = var1.dequeue();
    boolean var7 = var1.isFull();
    boolean var8 = var1.isFull();
    java.lang.String var9 = var1.toString();
    var1.setCapacity(0);
    var0.enqueue((java.lang.Object)var1);
    var1.setCapacity(10);
    QueueFaulty var15 = new QueueFaulty();
    boolean var16 = var15.isEmpty();
    boolean var17 = var15.isEmpty();
    boolean var18 = var15.isEmpty();
    QueueFaulty var19 = new QueueFaulty();
    var19.enqueue((java.lang.Object)false);
    boolean var22 = var19.isFull();
    boolean var23 = var19.isFull();
    java.lang.Object var24 = var19.dequeue();
    var19.enqueue((java.lang.Object)1.0f);
    var15.enqueue((java.lang.Object)var19);
    var1.enqueue((java.lang.Object)var19);
    boolean var29 = var19.isFull();
    boolean var30 = var19.isFull();
    boolean var31 = var19.isFull();
    java.lang.Object var32 = var19.dequeue();
    QueueFaulty var33 = new QueueFaulty();
    var33.enqueue((java.lang.Object)false);
    boolean var36 = var33.isEmpty();
    java.lang.String var37 = var33.toString();
    var33.setCapacity((-1));
    QueueFaulty var40 = new QueueFaulty();
    var40.enqueue((java.lang.Object)false);
    boolean var43 = var40.isEmpty();
    java.lang.Object var44 = var40.dequeue();
    var40.setCapacity(10);
    boolean var47 = var40.isFull();
    java.lang.String var48 = var40.toString();
    boolean var49 = var40.isEmpty();
    QueueFaulty var50 = new QueueFaulty();
    var50.enqueue((java.lang.Object)false);
    boolean var53 = var50.isEmpty();
    java.lang.String var54 = var50.toString();
    boolean var55 = var50.isFull();
    boolean var56 = var50.isEmpty();
    java.lang.Object var57 = var50.dequeue();
    java.lang.String var58 = var50.toString();
    boolean var59 = var50.isFull();
    var40.enqueue((java.lang.Object)var59);
    boolean var61 = var40.isEmpty();
    var33.enqueue((java.lang.Object)var61);
    QueueFaulty var63 = new QueueFaulty();
    java.lang.String var64 = var63.toString();
    var63.setCapacity(1);
    QueueFaulty var67 = new QueueFaulty();
    var67.enqueue((java.lang.Object)false);
    boolean var70 = var67.isFull();
    boolean var71 = var67.isFull();
    java.lang.Object var72 = var67.dequeue();
    java.lang.String var73 = var67.toString();
    var63.enqueue((java.lang.Object)var67);
    var33.enqueue((java.lang.Object)var67);
    var67.setCapacity(10);
    java.lang.String var78 = var67.toString();
    var19.enqueue((java.lang.Object)var67);
    java.lang.String var80 = var67.toString();
    java.lang.String var81 = var67.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + false+ "'", var6.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "[]"+ "'", var9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + false+ "'", var24.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + 1.0f+ "'", var32.equals(1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "[false]"+ "'", var37.equals("[false]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + false+ "'", var44.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "[]"+ "'", var48.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + "[false]"+ "'", var54.equals("[false]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var57 + "' != '" + false+ "'", var57.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var58 + "' != '" + "[]"+ "'", var58.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var64 + "' != '" + "[]"+ "'", var64.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var72 + "' != '" + false+ "'", var72.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var73 + "' != '" + "[]"+ "'", var73.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var78 + "' != '" + "[]"+ "'", var78.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var80 + "' != '" + "[]"+ "'", var80.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var81 + "' != '" + "[]"+ "'", var81.equals("[]"));

  }

  public void test94() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test94");


    QueueFaulty var0 = new QueueFaulty();
    QueueFaulty var1 = new QueueFaulty();
    var1.enqueue((java.lang.Object)false);
    boolean var4 = var1.isFull();
    boolean var5 = var1.isFull();
    java.lang.Object var6 = var1.dequeue();
    boolean var7 = var1.isFull();
    boolean var8 = var1.isFull();
    java.lang.String var9 = var1.toString();
    var1.setCapacity(0);
    var0.enqueue((java.lang.Object)var1);
    var1.setCapacity(10);
    QueueFaulty var15 = new QueueFaulty();
    boolean var16 = var15.isEmpty();
    boolean var17 = var15.isEmpty();
    boolean var18 = var15.isEmpty();
    QueueFaulty var19 = new QueueFaulty();
    var19.enqueue((java.lang.Object)false);
    boolean var22 = var19.isFull();
    boolean var23 = var19.isFull();
    java.lang.Object var24 = var19.dequeue();
    var19.enqueue((java.lang.Object)1.0f);
    var15.enqueue((java.lang.Object)var19);
    var1.enqueue((java.lang.Object)var19);
    boolean var29 = var1.isEmpty();
    java.lang.String var30 = var1.toString();
    boolean var31 = var1.isEmpty();
    var1.setCapacity(0);
    QueueFaulty var34 = new QueueFaulty();
    var34.enqueue((java.lang.Object)false);
    boolean var37 = var34.isFull();
    boolean var38 = var34.isFull();
    java.lang.Object var39 = var34.dequeue();
    java.lang.String var40 = var34.toString();
    boolean var41 = var34.isFull();
    boolean var42 = var34.isFull();
    boolean var43 = var34.isFull();
    QueueFaulty var44 = new QueueFaulty();
    var44.enqueue((java.lang.Object)false);
    boolean var47 = var44.isEmpty();
    java.lang.Object var48 = var44.dequeue();
    var44.setCapacity(10);
    boolean var51 = var44.isFull();
    java.lang.String var52 = var44.toString();
    boolean var53 = var44.isEmpty();
    QueueFaulty var54 = new QueueFaulty();
    java.lang.String var55 = var54.toString();
    var54.setCapacity(1);
    QueueFaulty var58 = new QueueFaulty();
    var58.enqueue((java.lang.Object)false);
    boolean var61 = var58.isFull();
    boolean var62 = var58.isFull();
    java.lang.Object var63 = var58.dequeue();
    java.lang.String var64 = var58.toString();
    var54.enqueue((java.lang.Object)var58);
    var44.enqueue((java.lang.Object)var54);
    var54.setCapacity(100);
    var34.enqueue((java.lang.Object)100);
    boolean var70 = var34.isFull();
    var1.enqueue((java.lang.Object)var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + false+ "'", var6.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "[]"+ "'", var9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + false+ "'", var24.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "[[1.0]]"+ "'", var30.equals("[[1.0]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + false+ "'", var39.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + "[]"+ "'", var40.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + false+ "'", var48.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "[]"+ "'", var52.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + "[]"+ "'", var55.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var63 + "' != '" + false+ "'", var63.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var64 + "' != '" + "[]"+ "'", var64.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == false);

  }

  public void test95() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test95");


    QueueFaulty var0 = new QueueFaulty();
    java.lang.String var1 = var0.toString();
    var0.setCapacity(1);
    QueueFaulty var4 = new QueueFaulty();
    var4.enqueue((java.lang.Object)false);
    boolean var7 = var4.isFull();
    boolean var8 = var4.isFull();
    java.lang.Object var9 = var4.dequeue();
    java.lang.String var10 = var4.toString();
    var0.enqueue((java.lang.Object)var4);
    boolean var12 = var0.isEmpty();
    boolean var13 = var0.isFull();
    var0.setCapacity(10);
    QueueFaulty var16 = new QueueFaulty();
    var16.enqueue((java.lang.Object)false);
    boolean var19 = var16.isFull();
    var16.enqueue((java.lang.Object)0.0f);
    var0.enqueue((java.lang.Object)var16);
    java.lang.Object var23 = var16.dequeue();
    java.lang.Object var24 = var16.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "[]"+ "'", var1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + false+ "'", var9.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "[]"+ "'", var10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + false+ "'", var23.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + 0.0f+ "'", var24.equals(0.0f));

  }

  public void test96() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test96");


    QueueFaulty var0 = new QueueFaulty();
    var0.enqueue((java.lang.Object)false);
    boolean var3 = var0.isEmpty();
    java.lang.String var4 = var0.toString();
    boolean var5 = var0.isFull();
    boolean var6 = var0.isEmpty();
    java.lang.Object var7 = var0.dequeue();
    java.lang.String var8 = var0.toString();
    boolean var9 = var0.isFull();
    java.lang.String var10 = var0.toString();
    QueueFaulty var11 = new QueueFaulty();
    var11.enqueue((java.lang.Object)false);
    boolean var14 = var11.isEmpty();
    java.lang.String var15 = var11.toString();
    boolean var16 = var11.isFull();
    boolean var17 = var11.isEmpty();
    java.lang.Object var18 = var11.dequeue();
    var0.enqueue((java.lang.Object)var11);
    java.lang.String var20 = var0.toString();
    java.lang.String var21 = var0.toString();
    java.lang.String var22 = var0.toString();
    java.lang.String var23 = var0.toString();
    QueueFaulty var24 = new QueueFaulty();
    var24.enqueue((java.lang.Object)false);
    boolean var27 = var24.isEmpty();
    java.lang.String var28 = var24.toString();
    boolean var29 = var24.isFull();
    boolean var30 = var24.isEmpty();
    java.lang.Object var31 = var24.dequeue();
    java.lang.String var32 = var24.toString();
    boolean var33 = var24.isFull();
    java.lang.String var34 = var24.toString();
    QueueFaulty var35 = new QueueFaulty();
    var35.enqueue((java.lang.Object)false);
    boolean var38 = var35.isEmpty();
    java.lang.String var39 = var35.toString();
    boolean var40 = var35.isFull();
    boolean var41 = var35.isEmpty();
    java.lang.Object var42 = var35.dequeue();
    var24.enqueue((java.lang.Object)var35);
    java.lang.String var44 = var24.toString();
    java.lang.String var45 = var24.toString();
    var0.enqueue((java.lang.Object)var24);
    boolean var47 = var0.isFull();
    var0.setCapacity(1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "[false]"+ "'", var4.equals("[false]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + false+ "'", var7.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "[]"+ "'", var8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "[]"+ "'", var10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "[false]"+ "'", var15.equals("[false]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + false+ "'", var18.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "[[]]"+ "'", var20.equals("[[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "[[]]"+ "'", var21.equals("[[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "[[]]"+ "'", var22.equals("[[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "[[]]"+ "'", var23.equals("[[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "[false]"+ "'", var28.equals("[false]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + false+ "'", var31.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "[]"+ "'", var32.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "[]"+ "'", var34.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "[false]"+ "'", var39.equals("[false]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + false+ "'", var42.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "[[]]"+ "'", var44.equals("[[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "[[]]"+ "'", var45.equals("[[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);

  }

  public void test97() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test97");


    QueueFaulty var0 = new QueueFaulty();
    var0.enqueue((java.lang.Object)false);
    boolean var3 = var0.isEmpty();
    boolean var4 = var0.isFull();
    java.lang.String var5 = var0.toString();
    java.lang.Object var6 = var0.dequeue();
    QueueFaulty var7 = new QueueFaulty();
    var7.enqueue((java.lang.Object)false);
    boolean var10 = var7.isEmpty();
    java.lang.Object var11 = var7.dequeue();
    var7.setCapacity(10);
    boolean var14 = var7.isFull();
    var7.setCapacity(1);
    boolean var17 = var7.isEmpty();
    var7.setCapacity(10);
    var0.enqueue((java.lang.Object)var7);
    boolean var21 = var7.isEmpty();
    var7.setCapacity(0);
    boolean var24 = var7.isEmpty();
    var7.setCapacity(100);
    boolean var27 = var7.isFull();
    boolean var28 = var7.isFull();
    var7.setCapacity(0);
    QueueFaulty var31 = new QueueFaulty();
    var31.enqueue((java.lang.Object)false);
    boolean var34 = var31.isFull();
    boolean var35 = var31.isFull();
    java.lang.Object var36 = var31.dequeue();
    boolean var37 = var31.isFull();
    boolean var38 = var31.isFull();
    java.lang.String var39 = var31.toString();
    var31.setCapacity(0);
    QueueFaulty var42 = new QueueFaulty();
    java.lang.String var43 = var42.toString();
    var42.setCapacity(1);
    QueueFaulty var46 = new QueueFaulty();
    var46.enqueue((java.lang.Object)false);
    boolean var49 = var46.isFull();
    boolean var50 = var46.isFull();
    java.lang.Object var51 = var46.dequeue();
    java.lang.String var52 = var46.toString();
    var42.enqueue((java.lang.Object)var46);
    java.lang.Object var54 = var42.dequeue();
    var42.enqueue((java.lang.Object)100);
    boolean var57 = var42.isFull();
    boolean var58 = var42.isEmpty();
    boolean var59 = var42.isFull();
    var31.enqueue((java.lang.Object)var42);
    java.lang.String var61 = var42.toString();
    java.lang.Object var62 = var42.dequeue();
    var7.enqueue((java.lang.Object)var42);
    boolean var64 = var7.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "[false]"+ "'", var5.equals("[false]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + false+ "'", var6.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + false+ "'", var11.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + false+ "'", var36.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "[]"+ "'", var39.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "[]"+ "'", var43.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + false+ "'", var51.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "[]"+ "'", var52.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var61 + "' != '" + "[100]"+ "'", var61.equals("[100]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var62 + "' != '" + 100+ "'", var62.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);

  }

  public void test98() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test98");


    QueueFaulty var0 = new QueueFaulty();
    var0.enqueue((java.lang.Object)false);
    boolean var3 = var0.isFull();
    boolean var4 = var0.isFull();
    java.lang.Object var5 = var0.dequeue();
    boolean var6 = var0.isFull();
    boolean var7 = var0.isFull();
    java.lang.String var8 = var0.toString();
    var0.setCapacity((-1));
    QueueFaulty var11 = new QueueFaulty();
    var11.enqueue((java.lang.Object)false);
    boolean var14 = var11.isFull();
    boolean var15 = var11.isFull();
    java.lang.Object var16 = var11.dequeue();
    var11.enqueue((java.lang.Object)1.0f);
    java.lang.String var19 = var11.toString();
    java.lang.String var20 = var11.toString();
    boolean var21 = var11.isEmpty();
    java.lang.Object var22 = var11.dequeue();
    var0.enqueue(var22);
    boolean var24 = var0.isFull();
    boolean var25 = var0.isFull();
    java.lang.Object var26 = var0.dequeue();
    var0.setCapacity(0);
    QueueFaulty var29 = new QueueFaulty();
    boolean var30 = var29.isEmpty();
    java.lang.String var31 = var29.toString();
    var29.setCapacity((-1));
    boolean var34 = var29.isEmpty();
    QueueFaulty var35 = new QueueFaulty();
    boolean var36 = var35.isEmpty();
    java.lang.String var37 = var35.toString();
    var35.setCapacity(0);
    var29.enqueue((java.lang.Object)var35);
    java.lang.Object var41 = var29.dequeue();
    var29.setCapacity(10);
    QueueFaulty var44 = new QueueFaulty();
    var44.enqueue((java.lang.Object)false);
    boolean var47 = var44.isFull();
    QueueFaulty var48 = new QueueFaulty();
    var48.enqueue((java.lang.Object)false);
    boolean var51 = var48.isEmpty();
    java.lang.String var52 = var48.toString();
    var48.setCapacity((-1));
    var44.enqueue((java.lang.Object)(-1));
    var44.enqueue((java.lang.Object)'a');
    QueueFaulty var58 = new QueueFaulty();
    var58.enqueue((java.lang.Object)false);
    boolean var61 = var58.isEmpty();
    java.lang.Object var62 = var58.dequeue();
    var44.enqueue((java.lang.Object)var58);
    java.lang.String var64 = var44.toString();
    java.lang.Object var65 = var44.dequeue();
    var29.enqueue((java.lang.Object)var44);
    QueueFaulty var67 = new QueueFaulty();
    var67.enqueue((java.lang.Object)false);
    boolean var70 = var67.isFull();
    boolean var71 = var67.isFull();
    java.lang.Object var72 = var67.dequeue();
    boolean var73 = var67.isFull();
    boolean var74 = var67.isFull();
    boolean var75 = var67.isFull();
    var67.setCapacity(0);
    boolean var78 = var67.isFull();
    boolean var79 = var67.isEmpty();
    var29.enqueue((java.lang.Object)var79);
    java.lang.Object var81 = var29.dequeue();
    var0.enqueue(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + false+ "'", var5.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "[]"+ "'", var8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + false+ "'", var16.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "[1.0]"+ "'", var19.equals("[1.0]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "[1.0]"+ "'", var20.equals("[1.0]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + 1.0f+ "'", var22.equals(1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + 1.0f+ "'", var26.equals(1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "[]"+ "'", var31.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "[]"+ "'", var37.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + "[false]"+ "'", var52.equals("[false]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var62 + "' != '" + false+ "'", var62.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var64 + "' != '" + "[false, -1, a, []]"+ "'", var64.equals("[false, -1, a, []]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var65 + "' != '" + false+ "'", var65.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var72 + "' != '" + false+ "'", var72.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var81);

  }

  public void test99() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test99");


    QueueFaulty var0 = new QueueFaulty();
    java.lang.String var1 = var0.toString();
    var0.setCapacity(1);
    var0.setCapacity(0);
    java.lang.String var6 = var0.toString();
    QueueFaulty var7 = new QueueFaulty();
    var7.enqueue((java.lang.Object)false);
    boolean var10 = var7.isFull();
    boolean var11 = var7.isFull();
    java.lang.Object var12 = var7.dequeue();
    boolean var13 = var7.isFull();
    boolean var14 = var7.isFull();
    java.lang.String var15 = var7.toString();
    var7.setCapacity((-1));
    java.lang.String var18 = var7.toString();
    java.lang.String var19 = var7.toString();
    var7.setCapacity((-1));
    boolean var22 = var7.isFull();
    var0.enqueue((java.lang.Object)var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "[]"+ "'", var1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "[]"+ "'", var6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + false+ "'", var12.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "[]"+ "'", var15.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var18 + "' != '" + "[]"+ "'", var18.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "[]"+ "'", var19.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test100() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test100");


    QueueFaulty var0 = new QueueFaulty();
    QueueFaulty var1 = new QueueFaulty();
    var1.enqueue((java.lang.Object)false);
    boolean var4 = var1.isFull();
    boolean var5 = var1.isFull();
    java.lang.Object var6 = var1.dequeue();
    boolean var7 = var1.isFull();
    boolean var8 = var1.isFull();
    java.lang.String var9 = var1.toString();
    var1.setCapacity(0);
    var0.enqueue((java.lang.Object)var1);
    var1.setCapacity(10);
    QueueFaulty var15 = new QueueFaulty();
    boolean var16 = var15.isEmpty();
    boolean var17 = var15.isEmpty();
    boolean var18 = var15.isEmpty();
    QueueFaulty var19 = new QueueFaulty();
    var19.enqueue((java.lang.Object)false);
    boolean var22 = var19.isFull();
    boolean var23 = var19.isFull();
    java.lang.Object var24 = var19.dequeue();
    var19.enqueue((java.lang.Object)1.0f);
    var15.enqueue((java.lang.Object)var19);
    var1.enqueue((java.lang.Object)var19);
    boolean var29 = var1.isEmpty();
    var1.enqueue((java.lang.Object)1.0f);
    boolean var32 = var1.isFull();
    var1.setCapacity(0);
    boolean var35 = var1.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + false+ "'", var6.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "[]"+ "'", var9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + false+ "'", var24.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);

  }

  public void test101() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test101");


    QueueFaulty var0 = new QueueFaulty();
    QueueFaulty var1 = new QueueFaulty();
    var1.enqueue((java.lang.Object)false);
    boolean var4 = var1.isFull();
    boolean var5 = var1.isFull();
    java.lang.Object var6 = var1.dequeue();
    boolean var7 = var1.isFull();
    boolean var8 = var1.isFull();
    java.lang.String var9 = var1.toString();
    var1.setCapacity(0);
    var0.enqueue((java.lang.Object)var1);
    var1.setCapacity(10);
    QueueFaulty var15 = new QueueFaulty();
    boolean var16 = var15.isEmpty();
    boolean var17 = var15.isEmpty();
    boolean var18 = var15.isEmpty();
    QueueFaulty var19 = new QueueFaulty();
    var19.enqueue((java.lang.Object)false);
    boolean var22 = var19.isFull();
    boolean var23 = var19.isFull();
    java.lang.Object var24 = var19.dequeue();
    var19.enqueue((java.lang.Object)1.0f);
    var15.enqueue((java.lang.Object)var19);
    var1.enqueue((java.lang.Object)var19);
    boolean var29 = var1.isEmpty();
    java.lang.String var30 = var1.toString();
    var1.setCapacity(0);
    java.lang.String var33 = var1.toString();
    var1.setCapacity(0);
    var1.setCapacity(100);
    boolean var38 = var1.isFull();
    java.lang.Object var39 = var1.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + false+ "'", var6.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "[]"+ "'", var9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + false+ "'", var24.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "[[1.0]]"+ "'", var30.equals("[[1.0]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "[[1.0]]"+ "'", var33.equals("[[1.0]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var39);

  }

  public void test102() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test102");


    QueueFaulty var0 = new QueueFaulty();
    var0.enqueue((java.lang.Object)false);
    boolean var3 = var0.isEmpty();
    boolean var4 = var0.isFull();
    java.lang.String var5 = var0.toString();
    boolean var6 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "[false]"+ "'", var5.equals("[false]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test103() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test103");


    QueueFaulty var0 = new QueueFaulty();
    boolean var1 = var0.isEmpty();
    boolean var2 = var0.isEmpty();
    boolean var3 = var0.isEmpty();
    QueueFaulty var4 = new QueueFaulty();
    var4.enqueue((java.lang.Object)false);
    boolean var7 = var4.isFull();
    boolean var8 = var4.isFull();
    java.lang.Object var9 = var4.dequeue();
    var4.enqueue((java.lang.Object)1.0f);
    var0.enqueue((java.lang.Object)var4);
    boolean var13 = var4.isFull();
    java.lang.Object var14 = var4.dequeue();
    boolean var15 = var4.isFull();
    boolean var16 = var4.isFull();
    boolean var17 = var4.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + false+ "'", var9.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + 1.0f+ "'", var14.equals(1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);

  }

  public void test104() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test104");


    QueueFaulty var0 = new QueueFaulty();
    var0.enqueue((java.lang.Object)false);
    boolean var3 = var0.isEmpty();
    java.lang.Object var4 = var0.dequeue();
    QueueFaulty var5 = new QueueFaulty();
    java.lang.String var6 = var5.toString();
    var0.enqueue((java.lang.Object)var6);
    QueueFaulty var8 = new QueueFaulty();
    var8.enqueue((java.lang.Object)false);
    java.lang.String var11 = var8.toString();
    java.lang.Object var12 = var8.dequeue();
    var0.enqueue(var12);
    boolean var14 = var0.isFull();
    var0.setCapacity((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + false+ "'", var4.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "[]"+ "'", var6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "[false]"+ "'", var11.equals("[false]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var12 + "' != '" + false+ "'", var12.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test105() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test105");


    QueueFaulty var0 = new QueueFaulty();
    java.lang.String var1 = var0.toString();
    var0.setCapacity(1);
    QueueFaulty var4 = new QueueFaulty();
    var4.enqueue((java.lang.Object)false);
    boolean var7 = var4.isFull();
    boolean var8 = var4.isFull();
    java.lang.Object var9 = var4.dequeue();
    java.lang.String var10 = var4.toString();
    var0.enqueue((java.lang.Object)var4);
    boolean var12 = var0.isEmpty();
    boolean var13 = var0.isEmpty();
    java.lang.String var14 = var0.toString();
    var0.setCapacity(100);
    java.lang.Object var17 = var0.dequeue();
    var0.setCapacity(100);
    java.lang.String var20 = var0.toString();
    boolean var21 = var0.isFull();
    boolean var22 = var0.isFull();
    java.lang.String var23 = var0.toString();
    QueueFaulty var24 = new QueueFaulty();
    java.lang.String var25 = var24.toString();
    var24.setCapacity(1);
    QueueFaulty var28 = new QueueFaulty();
    var28.enqueue((java.lang.Object)false);
    boolean var31 = var28.isFull();
    boolean var32 = var28.isFull();
    java.lang.Object var33 = var28.dequeue();
    java.lang.String var34 = var28.toString();
    var24.enqueue((java.lang.Object)var28);
    boolean var36 = var24.isFull();
    var24.setCapacity(1);
    var24.setCapacity(100);
    var0.enqueue((java.lang.Object)100);
    var0.setCapacity(10);
    boolean var44 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "[]"+ "'", var1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + false+ "'", var9.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "[]"+ "'", var10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "[[]]"+ "'", var14.equals("[[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "[]"+ "'", var20.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "[]"+ "'", var23.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "[]"+ "'", var25.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + false+ "'", var33.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "[]"+ "'", var34.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);

  }

  public void test106() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test106");


    QueueFaulty var0 = new QueueFaulty();
    QueueFaulty var1 = new QueueFaulty();
    var1.enqueue((java.lang.Object)false);
    boolean var4 = var1.isFull();
    boolean var5 = var1.isFull();
    java.lang.Object var6 = var1.dequeue();
    boolean var7 = var1.isFull();
    boolean var8 = var1.isFull();
    java.lang.String var9 = var1.toString();
    var1.setCapacity(0);
    var0.enqueue((java.lang.Object)var1);
    boolean var13 = var1.isEmpty();
    boolean var14 = var1.isFull();
    QueueFaulty var15 = new QueueFaulty();
    var15.enqueue((java.lang.Object)false);
    boolean var18 = var15.isEmpty();
    boolean var19 = var15.isFull();
    var15.setCapacity(10);
    boolean var22 = var15.isEmpty();
    var15.setCapacity(100);
    var15.setCapacity(0);
    java.lang.Object var27 = var15.dequeue();
    var1.enqueue((java.lang.Object)var15);
    boolean var29 = var15.isFull();
    QueueFaulty var30 = new QueueFaulty();
    var30.enqueue((java.lang.Object)false);
    boolean var33 = var30.isFull();
    boolean var34 = var30.isFull();
    java.lang.Object var35 = var30.dequeue();
    QueueFaulty var36 = new QueueFaulty();
    var36.enqueue((java.lang.Object)false);
    boolean var39 = var36.isFull();
    boolean var40 = var36.isFull();
    java.lang.Object var41 = var36.dequeue();
    boolean var42 = var36.isFull();
    boolean var43 = var36.isFull();
    java.lang.String var44 = var36.toString();
    var36.enqueue((java.lang.Object)1.0d);
    var30.enqueue((java.lang.Object)1.0d);
    boolean var48 = var30.isFull();
    java.lang.String var49 = var30.toString();
    var15.enqueue((java.lang.Object)var30);
    java.lang.String var51 = var30.toString();
    QueueFaulty var52 = new QueueFaulty();
    var52.enqueue((java.lang.Object)false);
    boolean var55 = var52.isFull();
    boolean var56 = var52.isFull();
    java.lang.Object var57 = var52.dequeue();
    var52.enqueue((java.lang.Object)1.0f);
    java.lang.String var60 = var52.toString();
    java.lang.String var61 = var52.toString();
    var52.setCapacity(10);
    boolean var64 = var52.isFull();
    QueueFaulty var65 = new QueueFaulty();
    var65.enqueue((java.lang.Object)false);
    boolean var68 = var65.isEmpty();
    java.lang.Object var69 = var65.dequeue();
    var65.setCapacity(10);
    boolean var72 = var65.isFull();
    var52.enqueue((java.lang.Object)var65);
    var65.setCapacity((-1));
    java.lang.String var76 = var65.toString();
    boolean var77 = var65.isEmpty();
    QueueFaulty var78 = new QueueFaulty();
    java.lang.String var79 = var78.toString();
    var78.setCapacity(1);
    QueueFaulty var82 = new QueueFaulty();
    var82.enqueue((java.lang.Object)false);
    boolean var85 = var82.isFull();
    boolean var86 = var82.isFull();
    java.lang.Object var87 = var82.dequeue();
    java.lang.String var88 = var82.toString();
    var78.enqueue((java.lang.Object)var82);
    boolean var90 = var78.isEmpty();
    boolean var91 = var78.isFull();
    var78.setCapacity((-1));
    java.lang.Object var94 = var78.dequeue();
    boolean var95 = var78.isFull();
    var65.enqueue((java.lang.Object)var78);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var30.enqueue((java.lang.Object)var78);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + false+ "'", var6.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "[]"+ "'", var9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + false+ "'", var35.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + false+ "'", var41.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var44 + "' != '" + "[]"+ "'", var44.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + "[1.0]"+ "'", var49.equals("[1.0]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + "[1.0]"+ "'", var51.equals("[1.0]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var57 + "' != '" + false+ "'", var57.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + "[1.0]"+ "'", var60.equals("[1.0]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var61 + "' != '" + "[1.0]"+ "'", var61.equals("[1.0]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var69 + "' != '" + false+ "'", var69.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var76 + "' != '" + "[]"+ "'", var76.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var79 + "' != '" + "[]"+ "'", var79.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var87 + "' != '" + false+ "'", var87.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var88 + "' != '" + "[]"+ "'", var88.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var90 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var91 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var94);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var95 == false);

  }

  public void test107() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test107");


    QueueFaulty var0 = new QueueFaulty();
    java.lang.String var1 = var0.toString();
    var0.setCapacity(1);
    QueueFaulty var4 = new QueueFaulty();
    var4.enqueue((java.lang.Object)false);
    boolean var7 = var4.isFull();
    boolean var8 = var4.isFull();
    java.lang.Object var9 = var4.dequeue();
    java.lang.String var10 = var4.toString();
    var0.enqueue((java.lang.Object)var4);
    QueueFaulty var12 = new QueueFaulty();
    java.lang.String var13 = var12.toString();
    var12.setCapacity(1);
    QueueFaulty var16 = new QueueFaulty();
    var16.enqueue((java.lang.Object)false);
    boolean var19 = var16.isFull();
    boolean var20 = var16.isFull();
    java.lang.Object var21 = var16.dequeue();
    java.lang.String var22 = var16.toString();
    var12.enqueue((java.lang.Object)var16);
    boolean var24 = var12.isEmpty();
    boolean var25 = var12.isFull();
    var4.enqueue((java.lang.Object)var25);
    java.lang.Object var27 = var4.dequeue();
    var4.setCapacity(1);
    QueueFaulty var30 = new QueueFaulty();
    var30.enqueue((java.lang.Object)false);
    boolean var33 = var30.isEmpty();
    java.lang.Object var34 = var30.dequeue();
    java.lang.String var35 = var30.toString();
    boolean var36 = var30.isEmpty();
    boolean var37 = var30.isFull();
    var30.setCapacity(100);
    var30.setCapacity(10);
    var4.enqueue((java.lang.Object)10);
    var4.setCapacity(1);
    java.lang.Object var45 = var4.dequeue();
    boolean var46 = var4.isEmpty();
    var4.setCapacity((-1));
    var4.setCapacity(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "[]"+ "'", var1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + false+ "'", var9.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "[]"+ "'", var10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + "[]"+ "'", var13.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + false+ "'", var21.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "[]"+ "'", var22.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + true+ "'", var27.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + false+ "'", var34.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "[]"+ "'", var35.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);

  }

  public void test108() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test108");


    QueueFaulty var0 = new QueueFaulty();
    var0.enqueue((java.lang.Object)false);
    boolean var3 = var0.isEmpty();
    java.lang.Object var4 = var0.dequeue();
    java.lang.String var5 = var0.toString();
    boolean var6 = var0.isEmpty();
    boolean var7 = var0.isEmpty();
    var0.setCapacity(1);
    boolean var10 = var0.isEmpty();
    java.lang.String var11 = var0.toString();
    boolean var12 = var0.isFull();
    boolean var13 = var0.isFull();
    boolean var14 = var0.isFull();
    var0.setCapacity(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + false+ "'", var4.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "[]"+ "'", var5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "[]"+ "'", var11.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test109() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test109");


    QueueFaulty var0 = new QueueFaulty();
    var0.enqueue((java.lang.Object)false);
    boolean var3 = var0.isFull();
    boolean var4 = var0.isFull();
    java.lang.Object var5 = var0.dequeue();
    boolean var6 = var0.isFull();
    boolean var7 = var0.isFull();
    java.lang.String var8 = var0.toString();
    var0.setCapacity((-1));
    QueueFaulty var11 = new QueueFaulty();
    var11.enqueue((java.lang.Object)false);
    boolean var14 = var11.isFull();
    boolean var15 = var11.isFull();
    java.lang.Object var16 = var11.dequeue();
    var11.enqueue((java.lang.Object)1.0f);
    java.lang.String var19 = var11.toString();
    java.lang.String var20 = var11.toString();
    boolean var21 = var11.isEmpty();
    java.lang.Object var22 = var11.dequeue();
    var0.enqueue(var22);
    boolean var24 = var0.isFull();
    boolean var25 = var0.isFull();
    java.lang.String var26 = var0.toString();
    QueueFaulty var27 = new QueueFaulty();
    var27.enqueue((java.lang.Object)false);
    boolean var30 = var27.isFull();
    boolean var31 = var27.isFull();
    java.lang.Object var32 = var27.dequeue();
    var27.enqueue((java.lang.Object)1.0f);
    java.lang.Object var35 = var27.dequeue();
    QueueFaulty var36 = new QueueFaulty();
    var36.enqueue((java.lang.Object)false);
    boolean var39 = var36.isEmpty();
    java.lang.Object var40 = var36.dequeue();
    boolean var41 = var36.isFull();
    boolean var42 = var36.isEmpty();
    var27.enqueue((java.lang.Object)var36);
    var0.enqueue((java.lang.Object)var27);
    var0.setCapacity(0);
    java.lang.Object var47 = var0.dequeue();
    java.lang.String var48 = var0.toString();
    boolean var49 = var0.isFull();
    java.lang.String var50 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + false+ "'", var5.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "[]"+ "'", var8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + false+ "'", var16.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "[1.0]"+ "'", var19.equals("[1.0]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "[1.0]"+ "'", var20.equals("[1.0]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + 1.0f+ "'", var22.equals(1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "[1.0]"+ "'", var26.equals("[1.0]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + false+ "'", var32.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + 1.0f+ "'", var35.equals(1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var40 + "' != '" + false+ "'", var40.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + 1.0f+ "'", var47.equals(1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "[[[]]]"+ "'", var48.equals("[[[]]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + "[[[]]]"+ "'", var50.equals("[[[]]]"));

  }

  public void test110() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test110");


    QueueFaulty var0 = new QueueFaulty();
    var0.enqueue((java.lang.Object)false);
    java.lang.String var3 = var0.toString();
    boolean var4 = var0.isEmpty();
    boolean var5 = var0.isEmpty();
    boolean var6 = var0.isEmpty();
    QueueFaulty var7 = new QueueFaulty();
    java.lang.String var8 = var7.toString();
    var7.setCapacity(1);
    QueueFaulty var11 = new QueueFaulty();
    var11.enqueue((java.lang.Object)false);
    boolean var14 = var11.isFull();
    boolean var15 = var11.isFull();
    java.lang.Object var16 = var11.dequeue();
    java.lang.String var17 = var11.toString();
    var7.enqueue((java.lang.Object)var11);
    boolean var19 = var7.isEmpty();
    boolean var20 = var7.isEmpty();
    java.lang.String var21 = var7.toString();
    var7.setCapacity(1);
    var7.setCapacity(10);
    var0.enqueue((java.lang.Object)var7);
    java.lang.Object var27 = var7.dequeue();
    boolean var28 = var7.isFull();
    boolean var29 = var7.isEmpty();
    java.lang.String var30 = var7.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "[false]"+ "'", var3.equals("[false]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "[]"+ "'", var8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + false+ "'", var16.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "[]"+ "'", var17.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "[[]]"+ "'", var21.equals("[[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "[]"+ "'", var30.equals("[]"));

  }

  public void test111() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test111");


    QueueFaulty var0 = new QueueFaulty();
    var0.enqueue((java.lang.Object)false);
    boolean var3 = var0.isEmpty();
    java.lang.Object var4 = var0.dequeue();
    java.lang.String var5 = var0.toString();
    boolean var6 = var0.isEmpty();
    var0.setCapacity(0);
    var0.enqueue((java.lang.Object)(short)1);
    java.lang.String var11 = var0.toString();
    var0.setCapacity(1);
    boolean var14 = var0.isFull();
    QueueFaulty var15 = new QueueFaulty();
    var15.enqueue((java.lang.Object)false);
    boolean var18 = var15.isEmpty();
    java.lang.Object var19 = var15.dequeue();
    var15.setCapacity(10);
    var15.setCapacity(100);
    boolean var24 = var15.isEmpty();
    QueueFaulty var25 = new QueueFaulty();
    var25.enqueue((java.lang.Object)false);
    boolean var28 = var25.isFull();
    boolean var29 = var25.isFull();
    java.lang.Object var30 = var25.dequeue();
    boolean var31 = var25.isFull();
    boolean var32 = var25.isFull();
    java.lang.String var33 = var25.toString();
    var25.setCapacity((-1));
    java.lang.String var36 = var25.toString();
    boolean var37 = var25.isEmpty();
    var25.setCapacity(1);
    var15.enqueue((java.lang.Object)1);
    java.lang.Object var41 = var15.dequeue();
    var15.setCapacity((-1));
    boolean var44 = var15.isFull();
    QueueFaulty var45 = new QueueFaulty();
    var45.enqueue((java.lang.Object)false);
    boolean var48 = var45.isFull();
    boolean var49 = var45.isFull();
    java.lang.Object var50 = var45.dequeue();
    var45.enqueue((java.lang.Object)1.0f);
    java.lang.String var53 = var45.toString();
    java.lang.String var54 = var45.toString();
    var45.setCapacity(10);
    boolean var57 = var45.isFull();
    QueueFaulty var58 = new QueueFaulty();
    var58.enqueue((java.lang.Object)false);
    boolean var61 = var58.isEmpty();
    java.lang.Object var62 = var58.dequeue();
    var58.setCapacity(10);
    boolean var65 = var58.isFull();
    var45.enqueue((java.lang.Object)var58);
    var58.setCapacity((-1));
    var15.enqueue((java.lang.Object)var58);
    boolean var70 = var58.isFull();
    var0.enqueue((java.lang.Object)var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + false+ "'", var4.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "[]"+ "'", var5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "[1]"+ "'", var11.equals("[1]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + false+ "'", var19.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + false+ "'", var30.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "[]"+ "'", var33.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "[]"+ "'", var36.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + 1+ "'", var41.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + false+ "'", var50.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + "[1.0]"+ "'", var53.equals("[1.0]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + "[1.0]"+ "'", var54.equals("[1.0]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var62 + "' != '" + false+ "'", var62.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == false);

  }

  public void test112() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test112");


    QueueFaulty var0 = new QueueFaulty();
    var0.enqueue((java.lang.Object)false);
    boolean var3 = var0.isFull();
    java.lang.String var4 = var0.toString();
    var0.enqueue((java.lang.Object)10.0d);
    java.lang.String var7 = var0.toString();
    java.lang.Object var8 = var0.dequeue();
    boolean var9 = var0.isEmpty();
    java.lang.String var10 = var0.toString();
    QueueFaulty var11 = new QueueFaulty();
    var11.enqueue((java.lang.Object)false);
    boolean var14 = var11.isFull();
    boolean var15 = var11.isFull();
    java.lang.Object var16 = var11.dequeue();
    boolean var17 = var11.isFull();
    boolean var18 = var11.isFull();
    java.lang.String var19 = var11.toString();
    var11.setCapacity((-1));
    var11.setCapacity(0);
    java.lang.String var24 = var11.toString();
    boolean var25 = var11.isEmpty();
    java.lang.String var26 = var11.toString();
    boolean var27 = var11.isEmpty();
    var0.enqueue((java.lang.Object)var11);
    boolean var29 = var11.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "[false]"+ "'", var4.equals("[false]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "[false, 10.0]"+ "'", var7.equals("[false, 10.0]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + false+ "'", var8.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "[10.0]"+ "'", var10.equals("[10.0]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + false+ "'", var16.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "[]"+ "'", var19.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "[]"+ "'", var24.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "[]"+ "'", var26.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == true);

  }

  public void test113() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test113");


    QueueFaulty var0 = new QueueFaulty();
    var0.enqueue((java.lang.Object)false);
    boolean var3 = var0.isFull();
    boolean var4 = var0.isFull();
    java.lang.Object var5 = var0.dequeue();
    var0.enqueue((java.lang.Object)1.0f);
    boolean var8 = var0.isFull();
    QueueFaulty var9 = new QueueFaulty();
    var9.enqueue((java.lang.Object)false);
    boolean var12 = var9.isEmpty();
    boolean var13 = var9.isFull();
    var9.setCapacity(10);
    var0.enqueue((java.lang.Object)10);
    java.lang.Object var17 = var0.dequeue();
    var0.setCapacity(10);
    java.lang.Object var20 = var0.dequeue();
    var0.setCapacity(10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + false+ "'", var5.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + 1.0f+ "'", var17.equals(1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var20);

  }

  public void test114() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test114");


    QueueFaulty var0 = new QueueFaulty();
    var0.enqueue((java.lang.Object)false);
    boolean var3 = var0.isFull();
    boolean var4 = var0.isFull();
    java.lang.Object var5 = var0.dequeue();
    boolean var6 = var0.isFull();
    boolean var7 = var0.isFull();
    java.lang.String var8 = var0.toString();
    var0.setCapacity((-1));
    java.lang.String var11 = var0.toString();
    boolean var12 = var0.isEmpty();
    boolean var13 = var0.isFull();
    boolean var14 = var0.isEmpty();
    QueueFaulty var15 = new QueueFaulty();
    var15.enqueue((java.lang.Object)false);
    boolean var18 = var15.isEmpty();
    java.lang.String var19 = var15.toString();
    boolean var20 = var15.isFull();
    boolean var21 = var15.isEmpty();
    java.lang.Object var22 = var15.dequeue();
    java.lang.String var23 = var15.toString();
    boolean var24 = var15.isFull();
    java.lang.String var25 = var15.toString();
    QueueFaulty var26 = new QueueFaulty();
    var26.enqueue((java.lang.Object)false);
    boolean var29 = var26.isEmpty();
    java.lang.String var30 = var26.toString();
    boolean var31 = var26.isFull();
    boolean var32 = var26.isEmpty();
    java.lang.Object var33 = var26.dequeue();
    var15.enqueue((java.lang.Object)var26);
    java.lang.Object var35 = var15.dequeue();
    java.lang.String var36 = var15.toString();
    var15.setCapacity((-1));
    var0.enqueue((java.lang.Object)(-1));
    QueueFaulty var40 = new QueueFaulty();
    var40.enqueue((java.lang.Object)false);
    boolean var43 = var40.isEmpty();
    boolean var44 = var40.isFull();
    var40.setCapacity(100);
    boolean var47 = var40.isEmpty();
    java.lang.Object var48 = var40.dequeue();
    boolean var49 = var40.isFull();
    boolean var50 = var40.isEmpty();
    boolean var51 = var40.isFull();
    var0.enqueue((java.lang.Object)var40);
    QueueFaulty var53 = new QueueFaulty();
    var53.enqueue((java.lang.Object)false);
    boolean var56 = var53.isEmpty();
    boolean var57 = var53.isFull();
    var53.setCapacity(10);
    boolean var60 = var53.isEmpty();
    QueueFaulty var61 = new QueueFaulty();
    var61.enqueue((java.lang.Object)false);
    boolean var64 = var61.isFull();
    boolean var65 = var61.isFull();
    java.lang.Object var66 = var61.dequeue();
    java.lang.String var67 = var61.toString();
    var53.enqueue((java.lang.Object)var67);
    java.lang.Object var69 = var53.dequeue();
    QueueFaulty var70 = new QueueFaulty();
    var70.enqueue((java.lang.Object)false);
    boolean var73 = var70.isFull();
    boolean var74 = var70.isFull();
    java.lang.Object var75 = var70.dequeue();
    boolean var76 = var70.isFull();
    boolean var77 = var70.isFull();
    java.lang.String var78 = var70.toString();
    var70.enqueue((java.lang.Object)1.0d);
    var70.setCapacity(0);
    var53.enqueue((java.lang.Object)0);
    var0.enqueue((java.lang.Object)var53);
    boolean var85 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + false+ "'", var5.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "[]"+ "'", var8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "[]"+ "'", var11.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "[false]"+ "'", var19.equals("[false]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + false+ "'", var22.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "[]"+ "'", var23.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "[]"+ "'", var25.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "[false]"+ "'", var30.equals("[false]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + false+ "'", var33.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "[]"+ "'", var36.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var48);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var66 + "' != '" + false+ "'", var66.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var67 + "' != '" + "[]"+ "'", var67.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var75 + "' != '" + false+ "'", var75.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var78 + "' != '" + "[]"+ "'", var78.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == false);

  }

  public void test115() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test115");


    QueueFaulty var0 = new QueueFaulty();
    var0.enqueue((java.lang.Object)false);
    boolean var3 = var0.isEmpty();
    java.lang.Object var4 = var0.dequeue();
    var0.setCapacity(10);
    boolean var7 = var0.isFull();
    java.lang.String var8 = var0.toString();
    boolean var9 = var0.isEmpty();
    QueueFaulty var10 = new QueueFaulty();
    java.lang.String var11 = var10.toString();
    var10.setCapacity(1);
    QueueFaulty var14 = new QueueFaulty();
    var14.enqueue((java.lang.Object)false);
    boolean var17 = var14.isFull();
    boolean var18 = var14.isFull();
    java.lang.Object var19 = var14.dequeue();
    java.lang.String var20 = var14.toString();
    var10.enqueue((java.lang.Object)var14);
    var0.enqueue((java.lang.Object)var10);
    boolean var23 = var0.isFull();
    QueueFaulty var24 = new QueueFaulty();
    boolean var25 = var24.isEmpty();
    boolean var26 = var24.isEmpty();
    boolean var27 = var24.isFull();
    java.lang.String var28 = var24.toString();
    QueueFaulty var29 = new QueueFaulty();
    java.lang.String var30 = var29.toString();
    var29.setCapacity(1);
    QueueFaulty var33 = new QueueFaulty();
    var33.enqueue((java.lang.Object)false);
    boolean var36 = var33.isFull();
    boolean var37 = var33.isFull();
    java.lang.Object var38 = var33.dequeue();
    java.lang.String var39 = var33.toString();
    var29.enqueue((java.lang.Object)var33);
    boolean var41 = var29.isEmpty();
    boolean var42 = var29.isEmpty();
    java.lang.String var43 = var29.toString();
    boolean var44 = var29.isEmpty();
    boolean var45 = var29.isEmpty();
    boolean var46 = var29.isEmpty();
    boolean var47 = var29.isEmpty();
    java.lang.String var48 = var29.toString();
    var24.enqueue((java.lang.Object)var29);
    java.lang.Object var50 = var24.dequeue();
    boolean var51 = var24.isFull();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.enqueue((java.lang.Object)var24);
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + false+ "'", var4.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "[]"+ "'", var8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "[]"+ "'", var11.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + false+ "'", var19.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + "[]"+ "'", var20.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "[]"+ "'", var28.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "[]"+ "'", var30.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + false+ "'", var38.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "[]"+ "'", var39.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "[[]]"+ "'", var43.equals("[[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "[[]]"+ "'", var48.equals("[[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);

  }

  public void test116() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test116");


    QueueFaulty var0 = new QueueFaulty();
    var0.enqueue((java.lang.Object)false);
    boolean var3 = var0.isFull();
    boolean var4 = var0.isFull();
    java.lang.Object var5 = var0.dequeue();
    java.lang.String var6 = var0.toString();
    boolean var7 = var0.isFull();
    boolean var8 = var0.isFull();
    var0.setCapacity((-1));
    var0.setCapacity(1);
    var0.setCapacity(0);
    QueueFaulty var15 = new QueueFaulty();
    QueueFaulty var16 = new QueueFaulty();
    var16.enqueue((java.lang.Object)false);
    boolean var19 = var16.isFull();
    boolean var20 = var16.isFull();
    java.lang.Object var21 = var16.dequeue();
    boolean var22 = var16.isFull();
    boolean var23 = var16.isFull();
    java.lang.String var24 = var16.toString();
    var16.setCapacity(0);
    var15.enqueue((java.lang.Object)var16);
    QueueFaulty var28 = new QueueFaulty();
    var28.enqueue((java.lang.Object)false);
    boolean var31 = var28.isEmpty();
    java.lang.Object var32 = var28.dequeue();
    QueueFaulty var33 = new QueueFaulty();
    java.lang.String var34 = var33.toString();
    var28.enqueue((java.lang.Object)var34);
    var28.setCapacity(10);
    java.lang.Object var38 = var28.dequeue();
    boolean var39 = var28.isEmpty();
    QueueFaulty var40 = new QueueFaulty();
    java.lang.String var41 = var40.toString();
    var40.setCapacity(1);
    QueueFaulty var44 = new QueueFaulty();
    var44.enqueue((java.lang.Object)false);
    boolean var47 = var44.isFull();
    boolean var48 = var44.isFull();
    java.lang.Object var49 = var44.dequeue();
    java.lang.String var50 = var44.toString();
    var40.enqueue((java.lang.Object)var44);
    boolean var52 = var40.isEmpty();
    boolean var53 = var40.isFull();
    var40.setCapacity(10);
    QueueFaulty var56 = new QueueFaulty();
    var56.enqueue((java.lang.Object)false);
    boolean var59 = var56.isFull();
    var56.enqueue((java.lang.Object)0.0f);
    var40.enqueue((java.lang.Object)var56);
    QueueFaulty var63 = new QueueFaulty();
    var63.enqueue((java.lang.Object)false);
    boolean var66 = var63.isFull();
    boolean var67 = var63.isFull();
    java.lang.Object var68 = var63.dequeue();
    var63.enqueue((java.lang.Object)1.0f);
    java.lang.String var71 = var63.toString();
    java.lang.String var72 = var63.toString();
    var63.setCapacity(10);
    boolean var75 = var63.isFull();
    var40.enqueue((java.lang.Object)var75);
    var28.enqueue((java.lang.Object)var75);
    var16.enqueue((java.lang.Object)var75);
    var0.enqueue((java.lang.Object)var16);
    boolean var80 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + false+ "'", var5.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "[]"+ "'", var6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + false+ "'", var21.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "[]"+ "'", var24.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + false+ "'", var32.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "[]"+ "'", var34.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "[]"+ "'", var41.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var49 + "' != '" + false+ "'", var49.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + "[]"+ "'", var50.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var68 + "' != '" + false+ "'", var68.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var71 + "' != '" + "[1.0]"+ "'", var71.equals("[1.0]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var72 + "' != '" + "[1.0]"+ "'", var72.equals("[1.0]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var80 == false);

  }

  public void test117() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test117");


    QueueFaulty var0 = new QueueFaulty();
    var0.enqueue((java.lang.Object)false);
    boolean var3 = var0.isEmpty();
    java.lang.Object var4 = var0.dequeue();
    java.lang.String var5 = var0.toString();
    boolean var6 = var0.isEmpty();
    var0.setCapacity(0);
    boolean var9 = var0.isEmpty();
    java.lang.String var10 = var0.toString();
    QueueFaulty var11 = new QueueFaulty();
    var11.enqueue((java.lang.Object)false);
    boolean var14 = var11.isFull();
    boolean var15 = var11.isFull();
    java.lang.Object var16 = var11.dequeue();
    boolean var17 = var11.isFull();
    boolean var18 = var11.isFull();
    java.lang.String var19 = var11.toString();
    QueueFaulty var20 = new QueueFaulty();
    var20.enqueue((java.lang.Object)false);
    boolean var23 = var20.isFull();
    boolean var24 = var20.isFull();
    java.lang.Object var25 = var20.dequeue();
    boolean var26 = var20.isFull();
    boolean var27 = var20.isFull();
    java.lang.String var28 = var20.toString();
    var20.enqueue((java.lang.Object)1.0d);
    var20.setCapacity(0);
    var11.enqueue((java.lang.Object)0);
    java.lang.String var34 = var11.toString();
    java.lang.String var35 = var11.toString();
    java.lang.String var36 = var11.toString();
    boolean var37 = var11.isFull();
    var0.enqueue((java.lang.Object)var11);
    var11.setCapacity(0);
    java.lang.String var41 = var11.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + false+ "'", var4.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "[]"+ "'", var5.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "[]"+ "'", var10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + false+ "'", var16.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + "[]"+ "'", var19.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + false+ "'", var25.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "[]"+ "'", var28.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "[0]"+ "'", var34.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "[0]"+ "'", var35.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var36 + "' != '" + "[0]"+ "'", var36.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + "[0]"+ "'", var41.equals("[0]"));

  }

  public void test118() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test118");


    QueueFaulty var0 = new QueueFaulty();
    QueueFaulty var1 = new QueueFaulty();
    var1.enqueue((java.lang.Object)false);
    boolean var4 = var1.isFull();
    boolean var5 = var1.isFull();
    java.lang.Object var6 = var1.dequeue();
    boolean var7 = var1.isFull();
    boolean var8 = var1.isFull();
    java.lang.String var9 = var1.toString();
    var1.setCapacity(0);
    var0.enqueue((java.lang.Object)var1);
    var1.setCapacity(10);
    QueueFaulty var15 = new QueueFaulty();
    boolean var16 = var15.isEmpty();
    boolean var17 = var15.isEmpty();
    boolean var18 = var15.isEmpty();
    QueueFaulty var19 = new QueueFaulty();
    var19.enqueue((java.lang.Object)false);
    boolean var22 = var19.isFull();
    boolean var23 = var19.isFull();
    java.lang.Object var24 = var19.dequeue();
    var19.enqueue((java.lang.Object)1.0f);
    var15.enqueue((java.lang.Object)var19);
    var1.enqueue((java.lang.Object)var19);
    boolean var29 = var1.isEmpty();
    var1.enqueue((java.lang.Object)1.0f);
    boolean var32 = var1.isEmpty();
    var1.setCapacity(100);
    var1.setCapacity((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + false+ "'", var6.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "[]"+ "'", var9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + false+ "'", var24.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);

  }

  public void test119() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test119");


    QueueFaulty var0 = new QueueFaulty();
    var0.enqueue((java.lang.Object)false);
    boolean var3 = var0.isFull();
    boolean var4 = var0.isFull();
    java.lang.Object var5 = var0.dequeue();
    boolean var6 = var0.isFull();
    boolean var7 = var0.isFull();
    boolean var8 = var0.isFull();
    java.lang.String var9 = var0.toString();
    var0.setCapacity(10);
    var0.setCapacity(0);
    QueueFaulty var14 = new QueueFaulty();
    var14.enqueue((java.lang.Object)false);
    boolean var17 = var14.isFull();
    var14.enqueue((java.lang.Object)0.0f);
    java.lang.Object var20 = var14.dequeue();
    boolean var21 = var14.isEmpty();
    java.lang.String var22 = var14.toString();
    java.lang.String var23 = var14.toString();
    var0.enqueue((java.lang.Object)var14);
    java.lang.Object var25 = var0.dequeue();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var26 = var0.dequeue();
      fail("Expected exception of type java.lang.IllegalStateException");
    } catch (java.lang.IllegalStateException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + false+ "'", var5.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + "[]"+ "'", var9.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + false+ "'", var20.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "[0.0]"+ "'", var22.equals("[0.0]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var23 + "' != '" + "[0.0]"+ "'", var23.equals("[0.0]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var25);

  }

  public void test120() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test120");


    QueueFaulty var0 = new QueueFaulty();
    var0.enqueue((java.lang.Object)false);
    boolean var3 = var0.isFull();
    boolean var4 = var0.isFull();
    java.lang.Object var5 = var0.dequeue();
    java.lang.String var6 = var0.toString();
    var0.setCapacity(0);
    boolean var9 = var0.isEmpty();
    boolean var10 = var0.isEmpty();
    java.lang.String var11 = var0.toString();
    var0.setCapacity(1);
    var0.setCapacity((-1));
    QueueFaulty var16 = new QueueFaulty();
    var16.enqueue((java.lang.Object)false);
    boolean var19 = var16.isFull();
    boolean var20 = var16.isFull();
    java.lang.Object var21 = var16.dequeue();
    boolean var22 = var16.isFull();
    boolean var23 = var16.isFull();
    java.lang.String var24 = var16.toString();
    QueueFaulty var25 = new QueueFaulty();
    var25.enqueue((java.lang.Object)false);
    boolean var28 = var25.isFull();
    boolean var29 = var25.isFull();
    java.lang.Object var30 = var25.dequeue();
    boolean var31 = var25.isFull();
    boolean var32 = var25.isFull();
    java.lang.String var33 = var25.toString();
    var25.enqueue((java.lang.Object)1.0d);
    var25.setCapacity(0);
    var16.enqueue((java.lang.Object)0);
    java.lang.String var39 = var16.toString();
    boolean var40 = var16.isFull();
    java.lang.Object var41 = var16.dequeue();
    var16.setCapacity(1);
    boolean var44 = var16.isEmpty();
    var0.enqueue((java.lang.Object)var44);
    boolean var46 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + false+ "'", var5.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "[]"+ "'", var6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "[]"+ "'", var11.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + false+ "'", var21.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + "[]"+ "'", var24.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + false+ "'", var30.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "[]"+ "'", var33.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "[0]"+ "'", var39.equals("[0]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var41 + "' != '" + 0+ "'", var41.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);

  }

  public void test121() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test121");


    QueueFaulty var0 = new QueueFaulty();
    boolean var1 = var0.isEmpty();
    java.lang.String var2 = var0.toString();
    QueueFaulty var3 = new QueueFaulty();
    var3.enqueue((java.lang.Object)false);
    boolean var6 = var3.isFull();
    boolean var7 = var3.isFull();
    java.lang.Object var8 = var3.dequeue();
    boolean var9 = var3.isFull();
    boolean var10 = var3.isFull();
    java.lang.String var11 = var3.toString();
    var3.enqueue((java.lang.Object)1.0d);
    boolean var14 = var3.isFull();
    var0.enqueue((java.lang.Object)var3);
    QueueFaulty var16 = new QueueFaulty();
    var16.enqueue((java.lang.Object)false);
    boolean var19 = var16.isEmpty();
    java.lang.Object var20 = var16.dequeue();
    QueueFaulty var21 = new QueueFaulty();
    java.lang.String var22 = var21.toString();
    var16.enqueue((java.lang.Object)var22);
    var16.setCapacity(10);
    boolean var26 = var16.isFull();
    boolean var27 = var16.isEmpty();
    QueueFaulty var28 = new QueueFaulty();
    var28.enqueue((java.lang.Object)(short)(-1));
    java.lang.Object var31 = var28.dequeue();
    java.lang.String var32 = var28.toString();
    var16.enqueue((java.lang.Object)var32);
    boolean var34 = var16.isFull();
    QueueFaulty var35 = new QueueFaulty();
    var35.enqueue((java.lang.Object)false);
    boolean var38 = var35.isEmpty();
    java.lang.Object var39 = var35.dequeue();
    var35.setCapacity(10);
    boolean var42 = var35.isFull();
    java.lang.String var43 = var35.toString();
    boolean var44 = var35.isEmpty();
    java.lang.String var45 = var35.toString();
    QueueFaulty var46 = new QueueFaulty();
    QueueFaulty var47 = new QueueFaulty();
    var47.enqueue((java.lang.Object)false);
    boolean var50 = var47.isFull();
    boolean var51 = var47.isFull();
    java.lang.Object var52 = var47.dequeue();
    boolean var53 = var47.isFull();
    boolean var54 = var47.isFull();
    java.lang.String var55 = var47.toString();
    var47.setCapacity(0);
    var46.enqueue((java.lang.Object)var47);
    var47.setCapacity(10);
    QueueFaulty var61 = new QueueFaulty();
    boolean var62 = var61.isEmpty();
    boolean var63 = var61.isEmpty();
    boolean var64 = var61.isEmpty();
    QueueFaulty var65 = new QueueFaulty();
    var65.enqueue((java.lang.Object)false);
    boolean var68 = var65.isFull();
    boolean var69 = var65.isFull();
    java.lang.Object var70 = var65.dequeue();
    var65.enqueue((java.lang.Object)1.0f);
    var61.enqueue((java.lang.Object)var65);
    var47.enqueue((java.lang.Object)var65);
    boolean var75 = var47.isEmpty();
    var47.enqueue((java.lang.Object)1.0f);
    boolean var78 = var47.isFull();
    var47.setCapacity((-1));
    var35.enqueue((java.lang.Object)(-1));
    var16.enqueue((java.lang.Object)(-1));
    var0.enqueue((java.lang.Object)var16);
    var0.setCapacity(100);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "[]"+ "'", var2.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + false+ "'", var8.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "[]"+ "'", var11.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var20 + "' != '" + false+ "'", var20.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var22 + "' != '" + "[]"+ "'", var22.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + (short)(-1)+ "'", var31.equals((short)(-1)));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var32 + "' != '" + "[]"+ "'", var32.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + false+ "'", var39.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "[]"+ "'", var43.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + "[]"+ "'", var45.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + false+ "'", var52.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var55 + "' != '" + "[]"+ "'", var55.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var70 + "' != '" + false+ "'", var70.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == false);

  }

  public void test122() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test122");


    QueueFaulty var0 = new QueueFaulty();
    var0.enqueue((java.lang.Object)false);
    boolean var3 = var0.isEmpty();
    boolean var4 = var0.isFull();
    java.lang.String var5 = var0.toString();
    QueueFaulty var6 = new QueueFaulty();
    var6.enqueue((java.lang.Object)false);
    boolean var9 = var6.isFull();
    boolean var10 = var6.isFull();
    java.lang.Object var11 = var6.dequeue();
    var6.enqueue((java.lang.Object)1.0f);
    var6.setCapacity(10);
    var0.enqueue((java.lang.Object)var6);
    boolean var17 = var0.isEmpty();
    boolean var18 = var0.isFull();
    java.lang.Object var19 = var0.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "[false]"+ "'", var5.equals("[false]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + false+ "'", var11.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var19 + "' != '" + false+ "'", var19.equals(false));

  }

  public void test123() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test123");


    QueueFaulty var0 = new QueueFaulty();
    var0.enqueue((java.lang.Object)false);
    boolean var3 = var0.isFull();
    boolean var4 = var0.isFull();
    java.lang.Object var5 = var0.dequeue();
    java.lang.String var6 = var0.toString();
    java.lang.String var7 = var0.toString();
    var0.setCapacity(10);
    QueueFaulty var10 = new QueueFaulty();
    var10.enqueue((java.lang.Object)false);
    boolean var13 = var10.isEmpty();
    boolean var14 = var10.isFull();
    java.lang.String var15 = var10.toString();
    java.lang.Object var16 = var10.dequeue();
    QueueFaulty var17 = new QueueFaulty();
    var17.enqueue((java.lang.Object)false);
    boolean var20 = var17.isEmpty();
    java.lang.Object var21 = var17.dequeue();
    var17.setCapacity(10);
    boolean var24 = var17.isFull();
    var17.setCapacity(1);
    boolean var27 = var17.isEmpty();
    var17.setCapacity(10);
    var10.enqueue((java.lang.Object)var17);
    boolean var31 = var17.isEmpty();
    var17.setCapacity(0);
    boolean var34 = var17.isEmpty();
    java.lang.String var35 = var17.toString();
    boolean var36 = var17.isFull();
    var0.enqueue((java.lang.Object)var36);
    boolean var38 = var0.isEmpty();
    QueueFaulty var39 = new QueueFaulty();
    QueueFaulty var40 = new QueueFaulty();
    var40.enqueue((java.lang.Object)false);
    boolean var43 = var40.isFull();
    boolean var44 = var40.isFull();
    java.lang.Object var45 = var40.dequeue();
    boolean var46 = var40.isFull();
    boolean var47 = var40.isFull();
    java.lang.String var48 = var40.toString();
    var40.setCapacity(0);
    var39.enqueue((java.lang.Object)var40);
    var40.setCapacity(10);
    java.lang.String var54 = var40.toString();
    QueueFaulty var55 = new QueueFaulty();
    var55.enqueue((java.lang.Object)false);
    boolean var58 = var55.isFull();
    boolean var59 = var55.isFull();
    java.lang.Object var60 = var55.dequeue();
    boolean var61 = var55.isFull();
    boolean var62 = var55.isFull();
    java.lang.String var63 = var55.toString();
    var55.enqueue((java.lang.Object)1.0d);
    var55.setCapacity(0);
    boolean var68 = var55.isEmpty();
    java.lang.String var69 = var55.toString();
    java.lang.Object var70 = var55.dequeue();
    java.lang.String var71 = var55.toString();
    var40.enqueue((java.lang.Object)var55);
    var55.setCapacity(0);
    var0.enqueue((java.lang.Object)0);
    boolean var76 = var0.isEmpty();
    var0.setCapacity(1);
    boolean var79 = var0.isFull();
    java.lang.Object var80 = var0.dequeue();
    boolean var81 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + false+ "'", var5.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + "[]"+ "'", var6.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + "[]"+ "'", var7.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + "[false]"+ "'", var15.equals("[false]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var16 + "' != '" + false+ "'", var16.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + false+ "'", var21.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "[]"+ "'", var35.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + false+ "'", var45.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "[]"+ "'", var48.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var54 + "' != '" + "[]"+ "'", var54.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var60 + "' != '" + false+ "'", var60.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var63 + "' != '" + "[]"+ "'", var63.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var69 + "' != '" + "[1.0]"+ "'", var69.equals("[1.0]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var70 + "' != '" + 1.0d+ "'", var70.equals(1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var71 + "' != '" + "[]"+ "'", var71.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var80 + "' != '" + false+ "'", var80.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == false);

  }

  public void test124() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test124");


    QueueFaulty var0 = new QueueFaulty();
    var0.enqueue((java.lang.Object)false);
    boolean var3 = var0.isEmpty();
    boolean var4 = var0.isFull();
    var0.setCapacity(10);
    boolean var7 = var0.isEmpty();
    QueueFaulty var8 = new QueueFaulty();
    var8.enqueue((java.lang.Object)false);
    boolean var11 = var8.isFull();
    boolean var12 = var8.isFull();
    java.lang.Object var13 = var8.dequeue();
    java.lang.String var14 = var8.toString();
    var0.enqueue((java.lang.Object)var14);
    var0.setCapacity((-1));
    var0.setCapacity(100);
    boolean var20 = var0.isEmpty();
    boolean var21 = var0.isEmpty();
    boolean var22 = var0.isEmpty();
    java.lang.Object var23 = var0.dequeue();
    boolean var24 = var0.isFull();
    var0.setCapacity(100);
    java.lang.Object var27 = var0.dequeue();
    var0.setCapacity(0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + false+ "'", var13.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var14 + "' != '" + "[]"+ "'", var14.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var23);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var27);

  }

  public void test125() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test125");


    QueueFaulty var0 = new QueueFaulty();
    var0.enqueue((java.lang.Object)false);
    boolean var3 = var0.isFull();
    boolean var4 = var0.isFull();
    java.lang.Object var5 = var0.dequeue();
    boolean var6 = var0.isFull();
    boolean var7 = var0.isFull();
    boolean var8 = var0.isFull();
    QueueFaulty var9 = new QueueFaulty();
    var9.enqueue((java.lang.Object)false);
    boolean var12 = var9.isEmpty();
    java.lang.Object var13 = var9.dequeue();
    var9.setCapacity(10);
    boolean var16 = var9.isFull();
    java.lang.String var17 = var9.toString();
    boolean var18 = var9.isEmpty();
    boolean var19 = var9.isEmpty();
    QueueFaulty var20 = new QueueFaulty();
    var20.enqueue((java.lang.Object)false);
    boolean var23 = var20.isFull();
    boolean var24 = var20.isFull();
    java.lang.Object var25 = var20.dequeue();
    boolean var26 = var20.isFull();
    boolean var27 = var20.isFull();
    java.lang.String var28 = var20.toString();
    var20.setCapacity((-1));
    QueueFaulty var31 = new QueueFaulty();
    var31.enqueue((java.lang.Object)false);
    boolean var34 = var31.isEmpty();
    java.lang.Object var35 = var31.dequeue();
    var31.setCapacity(10);
    boolean var38 = var31.isFull();
    java.lang.String var39 = var31.toString();
    boolean var40 = var31.isEmpty();
    QueueFaulty var41 = new QueueFaulty();
    java.lang.String var42 = var41.toString();
    var41.setCapacity(1);
    QueueFaulty var45 = new QueueFaulty();
    var45.enqueue((java.lang.Object)false);
    boolean var48 = var45.isFull();
    boolean var49 = var45.isFull();
    java.lang.Object var50 = var45.dequeue();
    java.lang.String var51 = var45.toString();
    var41.enqueue((java.lang.Object)var45);
    var31.enqueue((java.lang.Object)var41);
    boolean var54 = var31.isEmpty();
    var20.enqueue((java.lang.Object)var31);
    java.lang.Object var56 = var31.dequeue();
    boolean var57 = var31.isFull();
    var9.enqueue((java.lang.Object)var57);
    QueueFaulty var59 = new QueueFaulty();
    var59.enqueue((java.lang.Object)false);
    boolean var62 = var59.isFull();
    boolean var63 = var59.isFull();
    java.lang.Object var64 = var59.dequeue();
    var59.enqueue((java.lang.Object)1.0f);
    java.lang.String var67 = var59.toString();
    java.lang.String var68 = var59.toString();
    boolean var69 = var59.isEmpty();
    java.lang.Object var70 = var59.dequeue();
    var59.setCapacity(100);
    boolean var73 = var59.isEmpty();
    QueueFaulty var74 = new QueueFaulty();
    var74.enqueue((java.lang.Object)false);
    boolean var77 = var74.isFull();
    boolean var78 = var74.isFull();
    java.lang.Object var79 = var74.dequeue();
    var74.enqueue((java.lang.Object)1.0f);
    java.lang.String var82 = var74.toString();
    java.lang.String var83 = var74.toString();
    boolean var84 = var74.isFull();
    var59.enqueue((java.lang.Object)var74);
    var9.enqueue((java.lang.Object)var59);
    var0.enqueue((java.lang.Object)var59);
    boolean var88 = var0.isEmpty();
    boolean var89 = var0.isEmpty();
    java.lang.Object var90 = var0.dequeue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + false+ "'", var5.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var13 + "' != '" + false+ "'", var13.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var17 + "' != '" + "[]"+ "'", var17.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + false+ "'", var25.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var28 + "' != '" + "[]"+ "'", var28.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + false+ "'", var35.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "[]"+ "'", var39.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var42 + "' != '" + "[]"+ "'", var42.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var50 + "' != '" + false+ "'", var50.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var51 + "' != '" + "[]"+ "'", var51.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var64 + "' != '" + false+ "'", var64.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var67 + "' != '" + "[1.0]"+ "'", var67.equals("[1.0]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var68 + "' != '" + "[1.0]"+ "'", var68.equals("[1.0]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var70 + "' != '" + 1.0f+ "'", var70.equals(1.0f));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var79 + "' != '" + false+ "'", var79.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var82 + "' != '" + "[1.0]"+ "'", var82.equals("[1.0]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var83 + "' != '" + "[1.0]"+ "'", var83.equals("[1.0]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var88 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var89 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var90);

  }

  public void test126() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test126");


    QueueFaulty var0 = new QueueFaulty();
    var0.enqueue((java.lang.Object)false);
    boolean var3 = var0.isFull();
    boolean var4 = var0.isFull();
    java.lang.Object var5 = var0.dequeue();
    boolean var6 = var0.isFull();
    boolean var7 = var0.isFull();
    boolean var8 = var0.isFull();
    var0.setCapacity(0);
    QueueFaulty var11 = new QueueFaulty();
    var11.enqueue((java.lang.Object)false);
    boolean var14 = var11.isEmpty();
    java.lang.Object var15 = var11.dequeue();
    var11.setCapacity(10);
    boolean var18 = var11.isFull();
    var11.setCapacity(1);
    boolean var21 = var11.isEmpty();
    var0.enqueue((java.lang.Object)var11);
    boolean var23 = var0.isEmpty();
    java.lang.Object var24 = var0.dequeue();
    boolean var25 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + false+ "'", var5.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var15 + "' != '" + false+ "'", var15.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);

  }

  public void test127() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test127");


    QueueFaulty var0 = new QueueFaulty();
    var0.enqueue((java.lang.Object)false);
    boolean var3 = var0.isEmpty();
    java.lang.String var4 = var0.toString();
    boolean var5 = var0.isFull();
    boolean var6 = var0.isEmpty();
    java.lang.Object var7 = var0.dequeue();
    java.lang.String var8 = var0.toString();
    boolean var9 = var0.isFull();
    boolean var10 = var0.isEmpty();
    QueueFaulty var11 = new QueueFaulty();
    var11.enqueue((java.lang.Object)false);
    boolean var14 = var11.isEmpty();
    boolean var15 = var11.isFull();
    var11.setCapacity(10);
    boolean var18 = var11.isEmpty();
    QueueFaulty var19 = new QueueFaulty();
    var19.enqueue((java.lang.Object)false);
    boolean var22 = var19.isFull();
    boolean var23 = var19.isFull();
    java.lang.Object var24 = var19.dequeue();
    java.lang.String var25 = var19.toString();
    var11.enqueue((java.lang.Object)var25);
    var11.setCapacity((-1));
    QueueFaulty var29 = new QueueFaulty();
    var29.enqueue((java.lang.Object)false);
    boolean var32 = var29.isEmpty();
    java.lang.Object var33 = var29.dequeue();
    var29.setCapacity(10);
    boolean var36 = var29.isFull();
    var29.enqueue((java.lang.Object)"hi!");
    var11.enqueue((java.lang.Object)var29);
    var29.setCapacity(10);
    java.lang.Object var42 = var29.dequeue();
    java.lang.String var43 = var29.toString();
    var0.enqueue((java.lang.Object)var29);
    boolean var45 = var29.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "[false]"+ "'", var4.equals("[false]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var7 + "' != '" + false+ "'", var7.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "[]"+ "'", var8.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var24 + "' != '" + false+ "'", var24.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + "[]"+ "'", var25.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + false+ "'", var33.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var42);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var43 + "' != '" + "[]"+ "'", var43.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);

  }

  public void test128() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test128");


    QueueFaulty var0 = new QueueFaulty();
    var0.enqueue((java.lang.Object)false);
    boolean var3 = var0.isEmpty();
    boolean var4 = var0.isFull();
    java.lang.String var5 = var0.toString();
    java.lang.Object var6 = var0.dequeue();
    QueueFaulty var7 = new QueueFaulty();
    var7.enqueue((java.lang.Object)false);
    boolean var10 = var7.isEmpty();
    java.lang.Object var11 = var7.dequeue();
    var7.setCapacity(10);
    boolean var14 = var7.isFull();
    var7.setCapacity(1);
    boolean var17 = var7.isEmpty();
    var7.setCapacity(10);
    var0.enqueue((java.lang.Object)var7);
    boolean var21 = var7.isEmpty();
    boolean var22 = var7.isEmpty();
    QueueFaulty var23 = new QueueFaulty();
    var23.enqueue((java.lang.Object)false);
    boolean var26 = var23.isEmpty();
    java.lang.Object var27 = var23.dequeue();
    var23.setCapacity(10);
    boolean var30 = var23.isFull();
    java.lang.String var31 = var23.toString();
    boolean var32 = var23.isEmpty();
    java.lang.String var33 = var23.toString();
    boolean var34 = var23.isEmpty();
    QueueFaulty var35 = new QueueFaulty();
    var35.enqueue((java.lang.Object)false);
    boolean var38 = var35.isEmpty();
    java.lang.String var39 = var35.toString();
    boolean var40 = var35.isEmpty();
    boolean var41 = var35.isFull();
    var23.enqueue((java.lang.Object)var35);
    var7.enqueue((java.lang.Object)var35);
    boolean var44 = var35.isEmpty();
    QueueFaulty var45 = new QueueFaulty();
    boolean var46 = var45.isEmpty();
    java.lang.String var47 = var45.toString();
    QueueFaulty var48 = new QueueFaulty();
    var48.enqueue((java.lang.Object)false);
    boolean var51 = var48.isFull();
    boolean var52 = var48.isFull();
    java.lang.Object var53 = var48.dequeue();
    boolean var54 = var48.isFull();
    boolean var55 = var48.isFull();
    java.lang.String var56 = var48.toString();
    var48.enqueue((java.lang.Object)1.0d);
    boolean var59 = var48.isFull();
    var45.enqueue((java.lang.Object)var48);
    QueueFaulty var61 = new QueueFaulty();
    var61.enqueue((java.lang.Object)false);
    boolean var64 = var61.isEmpty();
    java.lang.Object var65 = var61.dequeue();
    boolean var66 = var61.isFull();
    java.lang.String var67 = var61.toString();
    boolean var68 = var61.isEmpty();
    var61.setCapacity(10);
    var45.enqueue((java.lang.Object)var61);
    var35.enqueue((java.lang.Object)var45);
    var45.setCapacity((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var5 + "' != '" + "[false]"+ "'", var5.equals("[false]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + false+ "'", var6.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + false+ "'", var11.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var27 + "' != '" + false+ "'", var27.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var31 + "' != '" + "[]"+ "'", var31.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var33 + "' != '" + "[]"+ "'", var33.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var39 + "' != '" + "[false]"+ "'", var39.equals("[false]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var47 + "' != '" + "[]"+ "'", var47.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + false+ "'", var53.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var56 + "' != '" + "[]"+ "'", var56.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var65 + "' != '" + false+ "'", var65.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var67 + "' != '" + "[]"+ "'", var67.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == true);

  }

  public void test129() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test129");


    QueueFaulty var0 = new QueueFaulty();
    var0.enqueue((java.lang.Object)false);
    boolean var3 = var0.isEmpty();
    java.lang.String var4 = var0.toString();
    boolean var5 = var0.isFull();
    java.lang.Object var6 = var0.dequeue();
    var0.setCapacity(10);
    var0.setCapacity(100);
    java.lang.String var11 = var0.toString();
    QueueFaulty var12 = new QueueFaulty();
    var12.enqueue((java.lang.Object)false);
    boolean var15 = var12.isEmpty();
    boolean var16 = var12.isFull();
    var12.setCapacity(10);
    boolean var19 = var12.isEmpty();
    QueueFaulty var20 = new QueueFaulty();
    var20.enqueue((java.lang.Object)false);
    boolean var23 = var20.isFull();
    boolean var24 = var20.isFull();
    java.lang.Object var25 = var20.dequeue();
    java.lang.String var26 = var20.toString();
    var12.enqueue((java.lang.Object)var26);
    java.lang.Object var28 = var12.dequeue();
    boolean var29 = var12.isEmpty();
    var12.setCapacity(100);
    QueueFaulty var32 = new QueueFaulty();
    var32.enqueue((java.lang.Object)false);
    java.lang.String var35 = var32.toString();
    boolean var36 = var32.isEmpty();
    boolean var37 = var32.isEmpty();
    boolean var38 = var32.isFull();
    boolean var39 = var32.isFull();
    var32.setCapacity((-1));
    boolean var42 = var32.isEmpty();
    var12.enqueue((java.lang.Object)var42);
    java.lang.Object var44 = var12.dequeue();
    boolean var45 = var12.isEmpty();
    java.lang.Object var46 = var12.dequeue();
    QueueFaulty var47 = new QueueFaulty();
    var47.enqueue((java.lang.Object)false);
    boolean var50 = var47.isFull();
    boolean var51 = var47.isFull();
    java.lang.Object var52 = var47.dequeue();
    java.lang.String var53 = var47.toString();
    boolean var54 = var47.isFull();
    boolean var55 = var47.isFull();
    boolean var56 = var47.isFull();
    boolean var57 = var47.isFull();
    var12.enqueue((java.lang.Object)var47);
    QueueFaulty var59 = new QueueFaulty();
    boolean var60 = var59.isEmpty();
    boolean var61 = var59.isEmpty();
    boolean var62 = var59.isEmpty();
    QueueFaulty var63 = new QueueFaulty();
    var63.enqueue((java.lang.Object)false);
    boolean var66 = var63.isFull();
    boolean var67 = var63.isFull();
    java.lang.Object var68 = var63.dequeue();
    var63.enqueue((java.lang.Object)1.0f);
    var59.enqueue((java.lang.Object)var63);
    boolean var72 = var59.isEmpty();
    boolean var73 = var59.isEmpty();
    boolean var74 = var59.isEmpty();
    var12.enqueue((java.lang.Object)var74);
    var0.enqueue((java.lang.Object)var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "[false]"+ "'", var4.equals("[false]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var6 + "' != '" + false+ "'", var6.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var11 + "' != '" + "[]"+ "'", var11.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var25 + "' != '" + false+ "'", var25.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var26 + "' != '" + "[]"+ "'", var26.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var35 + "' != '" + "[false]"+ "'", var35.equals("[false]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var46 + "' != '" + false+ "'", var46.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var52 + "' != '" + false+ "'", var52.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var53 + "' != '" + "[]"+ "'", var53.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var68 + "' != '" + false+ "'", var68.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == false);

  }

  public void test130() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest12.test130");


    QueueFaulty var0 = new QueueFaulty();
    java.lang.String var1 = var0.toString();
    var0.setCapacity(1);
    QueueFaulty var4 = new QueueFaulty();
    var4.enqueue((java.lang.Object)false);
    boolean var7 = var4.isFull();
    boolean var8 = var4.isFull();
    java.lang.Object var9 = var4.dequeue();
    java.lang.String var10 = var4.toString();
    var0.enqueue((java.lang.Object)var4);
    java.lang.Object var12 = var0.dequeue();
    var0.enqueue((java.lang.Object)100);
    boolean var15 = var0.isFull();
    var0.setCapacity((-1));
    var0.setCapacity(10);
    QueueFaulty var20 = new QueueFaulty();
    java.lang.String var21 = var20.toString();
    var20.setCapacity(1);
    QueueFaulty var24 = new QueueFaulty();
    var24.enqueue((java.lang.Object)false);
    boolean var27 = var24.isFull();
    boolean var28 = var24.isFull();
    java.lang.Object var29 = var24.dequeue();
    java.lang.String var30 = var24.toString();
    var20.enqueue((java.lang.Object)var24);
    boolean var32 = var20.isEmpty();
    boolean var33 = var20.isEmpty();
    java.lang.String var34 = var20.toString();
    var20.setCapacity((-1));
    java.lang.String var37 = var20.toString();
    java.lang.String var38 = var20.toString();
    QueueFaulty var39 = new QueueFaulty();
    QueueFaulty var40 = new QueueFaulty();
    var40.enqueue((java.lang.Object)false);
    boolean var43 = var40.isFull();
    boolean var44 = var40.isFull();
    java.lang.Object var45 = var40.dequeue();
    boolean var46 = var40.isFull();
    boolean var47 = var40.isFull();
    java.lang.String var48 = var40.toString();
    var40.setCapacity(0);
    var39.enqueue((java.lang.Object)var40);
    var40.setCapacity(10);
    QueueFaulty var54 = new QueueFaulty();
    boolean var55 = var54.isEmpty();
    boolean var56 = var54.isEmpty();
    boolean var57 = var54.isEmpty();
    QueueFaulty var58 = new QueueFaulty();
    var58.enqueue((java.lang.Object)false);
    boolean var61 = var58.isFull();
    boolean var62 = var58.isFull();
    java.lang.Object var63 = var58.dequeue();
    var58.enqueue((java.lang.Object)1.0f);
    var54.enqueue((java.lang.Object)var58);
    var40.enqueue((java.lang.Object)var58);
    boolean var68 = var40.isEmpty();
    boolean var69 = var40.isEmpty();
    boolean var70 = var40.isFull();
    var20.enqueue((java.lang.Object)var70);
    var20.setCapacity(100);
    var0.enqueue((java.lang.Object)100);
    boolean var75 = var0.isFull();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var1 + "' != '" + "[]"+ "'", var1.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var9 + "' != '" + false+ "'", var9.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var10 + "' != '" + "[]"+ "'", var10.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var21 + "' != '" + "[]"+ "'", var21.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var29 + "' != '" + false+ "'", var29.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var30 + "' != '" + "[]"+ "'", var30.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var34 + "' != '" + "[[]]"+ "'", var34.equals("[[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var37 + "' != '" + "[[]]"+ "'", var37.equals("[[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var38 + "' != '" + "[[]]"+ "'", var38.equals("[[]]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var45 + "' != '" + false+ "'", var45.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var48 + "' != '" + "[]"+ "'", var48.equals("[]"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var63 + "' != '" + false+ "'", var63.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == false);

  }

}
