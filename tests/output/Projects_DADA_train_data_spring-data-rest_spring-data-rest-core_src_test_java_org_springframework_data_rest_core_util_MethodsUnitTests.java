<METHOD_START> @ Test public void void ( ) java.lang.Exception { ProxyFactory org.springframework.data.rest.core.util.ProxyFactory = new ProxyFactory ( ) ; org.springframework.data.rest.core.util.ProxyFactory . setTarget ( new org.springframework.data.rest.core.util.MethodsUnitTests.Sample ( ) ) ; org.springframework.data.rest.core.util.ProxyFactory . setProxyTargetClass ( true ) ; java.util.Set<java.lang.reflect.Method> < java.lang.reflect.Method > java.util.Set<java.lang.reflect.Method> = new java.util.HashSet<java.lang.reflect.Method> < java.lang.reflect.Method > ( ) ; ReflectionUtils . doWithMethods ( org.springframework.data.rest.core.util.ProxyFactory . getProxy ( ) . getClass ( ) , method -> methods . add ( method ) , Methods . USER_METHODS ) ; assertThat ( java.util.Set<java.lang.reflect.Method> ) . hasSize ( NUMBER ) ; assertThat ( java.util.Set<java.lang.reflect.Method> ) . contains ( org.springframework.data.rest.core.util.MethodsUnitTests.Sample .class . java.lang.reflect.Method ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> public void void ( ) {}  <METHOD_END>
