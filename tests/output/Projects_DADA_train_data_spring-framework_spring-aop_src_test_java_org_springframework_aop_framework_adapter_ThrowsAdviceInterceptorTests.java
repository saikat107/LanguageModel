<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { new ThrowsAdviceInterceptor ( new java.lang.Object ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Throwable { org.springframework.aop.framework.adapter.ThrowsAdviceInterceptorTests.MyThrowsHandler org.springframework.aop.framework.adapter.ThrowsAdviceInterceptorTests.MyThrowsHandler = new org.springframework.aop.framework.adapter.ThrowsAdviceInterceptorTests.MyThrowsHandler ( ) ; ThrowsAdviceInterceptor org.springframework.aop.framework.adapter.ThrowsAdviceInterceptor = new ThrowsAdviceInterceptor ( org.springframework.aop.framework.adapter.ThrowsAdviceInterceptorTests.MyThrowsHandler ) ; java.lang.Object java.lang.Object = new java.lang.Object ( ) ; MethodInvocation org.springframework.aop.framework.adapter.MethodInvocation = mock ( MethodInvocation .class ) ; given ( org.springframework.aop.framework.adapter.MethodInvocation . proceed ( ) ) . willReturn ( java.lang.Object ) ; assertEquals ( java.lang.Object , org.springframework.aop.framework.adapter.ThrowsAdviceInterceptor . invoke ( org.springframework.aop.framework.adapter.MethodInvocation ) ) ; assertEquals ( NUMBER , org.springframework.aop.framework.adapter.ThrowsAdviceInterceptorTests.MyThrowsHandler . getCalls ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Throwable { org.springframework.aop.framework.adapter.ThrowsAdviceInterceptorTests.MyThrowsHandler org.springframework.aop.framework.adapter.ThrowsAdviceInterceptorTests.MyThrowsHandler = new org.springframework.aop.framework.adapter.ThrowsAdviceInterceptorTests.MyThrowsHandler ( ) ; ThrowsAdviceInterceptor org.springframework.aop.framework.adapter.ThrowsAdviceInterceptor = new ThrowsAdviceInterceptor ( org.springframework.aop.framework.adapter.ThrowsAdviceInterceptorTests.MyThrowsHandler ) ; assertEquals ( NUMBER , org.springframework.aop.framework.adapter.ThrowsAdviceInterceptor . getHandlerMethodCount ( ) ) ; java.lang.Exception java.lang.Exception = new java.lang.Exception ( ) ; MethodInvocation org.springframework.aop.framework.adapter.MethodInvocation = mock ( MethodInvocation .class ) ; given ( org.springframework.aop.framework.adapter.MethodInvocation . proceed ( ) ) . willThrow ( java.lang.Exception ) ; try { org.springframework.aop.framework.adapter.ThrowsAdviceInterceptor . invoke ( org.springframework.aop.framework.adapter.MethodInvocation ) ; fail ( ) ; } catch ( java.lang.Exception java.lang.Exception ) { assertEquals ( java.lang.Exception , java.lang.Exception ) ; } assertEquals ( NUMBER , org.springframework.aop.framework.adapter.ThrowsAdviceInterceptorTests.MyThrowsHandler . getCalls ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Throwable { org.springframework.aop.framework.adapter.ThrowsAdviceInterceptorTests.MyThrowsHandler org.springframework.aop.framework.adapter.ThrowsAdviceInterceptorTests.MyThrowsHandler = new org.springframework.aop.framework.adapter.ThrowsAdviceInterceptorTests.MyThrowsHandler ( ) ; ThrowsAdviceInterceptor org.springframework.aop.framework.adapter.ThrowsAdviceInterceptor = new ThrowsAdviceInterceptor ( org.springframework.aop.framework.adapter.ThrowsAdviceInterceptorTests.MyThrowsHandler ) ; java.io.FileNotFoundException java.io.FileNotFoundException = new java.io.FileNotFoundException ( ) ; MethodInvocation org.springframework.aop.framework.adapter.MethodInvocation = mock ( MethodInvocation .class ) ; given ( org.springframework.aop.framework.adapter.MethodInvocation . getMethod ( ) ) . willReturn ( java.lang.Object .class . java.lang.reflect.Method ( STRING ) ) ; given ( org.springframework.aop.framework.adapter.MethodInvocation . getThis ( ) ) . willReturn ( new java.lang.Object ( ) ) ; given ( org.springframework.aop.framework.adapter.MethodInvocation . proceed ( ) ) . willThrow ( java.io.FileNotFoundException ) ; try { org.springframework.aop.framework.adapter.ThrowsAdviceInterceptor . invoke ( org.springframework.aop.framework.adapter.MethodInvocation ) ; fail ( ) ; } catch ( java.lang.Exception java.lang.Exception ) { assertEquals ( java.io.FileNotFoundException , java.lang.Exception ) ; } assertEquals ( NUMBER , org.springframework.aop.framework.adapter.ThrowsAdviceInterceptorTests.MyThrowsHandler . getCalls ( ) ) ; assertEquals ( NUMBER , org.springframework.aop.framework.adapter.ThrowsAdviceInterceptorTests.MyThrowsHandler . getCalls ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Throwable { org.springframework.aop.framework.adapter.ThrowsAdviceInterceptorTests.MyThrowsHandler org.springframework.aop.framework.adapter.ThrowsAdviceInterceptorTests.MyThrowsHandler = new org.springframework.aop.framework.adapter.ThrowsAdviceInterceptorTests.MyThrowsHandler ( ) ; ThrowsAdviceInterceptor org.springframework.aop.framework.adapter.ThrowsAdviceInterceptor = new ThrowsAdviceInterceptor ( org.springframework.aop.framework.adapter.ThrowsAdviceInterceptorTests.MyThrowsHandler ) ; java.rmi.ConnectException java.rmi.ConnectException = new java.rmi.ConnectException ( STRING ) ; MethodInvocation org.springframework.aop.framework.adapter.MethodInvocation = mock ( MethodInvocation .class ) ; given ( org.springframework.aop.framework.adapter.MethodInvocation . proceed ( ) ) . willThrow ( java.rmi.ConnectException ) ; try { org.springframework.aop.framework.adapter.ThrowsAdviceInterceptor . invoke ( org.springframework.aop.framework.adapter.MethodInvocation ) ; fail ( ) ; } catch ( java.lang.Exception java.lang.Exception ) { assertEquals ( java.rmi.ConnectException , java.lang.Exception ) ; } assertEquals ( NUMBER , org.springframework.aop.framework.adapter.ThrowsAdviceInterceptorTests.MyThrowsHandler . getCalls ( ) ) ; assertEquals ( NUMBER , org.springframework.aop.framework.adapter.ThrowsAdviceInterceptorTests.MyThrowsHandler . getCalls ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Throwable { final java.lang.Throwable java.lang.Throwable = new java.lang.Throwable ( ) ; @ java.lang.SuppressWarnings ( STRING ) org.springframework.aop.framework.adapter.ThrowsAdviceInterceptorTests.MyThrowsHandler org.springframework.aop.framework.adapter.ThrowsAdviceInterceptorTests.MyThrowsHandler = new org.springframework.aop.framework.adapter.ThrowsAdviceInterceptorTests.MyThrowsHandler ( ) { @ java.lang.Override public void void ( java.rmi.RemoteException java.rmi.RemoteException ) throws java.lang.Throwable { super. void ( java.rmi.RemoteException ) ; throw java.lang.Throwable ; } } ; ThrowsAdviceInterceptor org.springframework.aop.framework.adapter.ThrowsAdviceInterceptor = new ThrowsAdviceInterceptor ( org.springframework.aop.framework.adapter.ThrowsAdviceInterceptorTests.MyThrowsHandler ) ; java.rmi.ConnectException java.rmi.ConnectException = new java.rmi.ConnectException ( STRING ) ; MethodInvocation org.springframework.aop.framework.adapter.MethodInvocation = mock ( MethodInvocation .class ) ; given ( org.springframework.aop.framework.adapter.MethodInvocation . proceed ( ) ) . willThrow ( java.rmi.ConnectException ) ; try { org.springframework.aop.framework.adapter.ThrowsAdviceInterceptor . invoke ( org.springframework.aop.framework.adapter.MethodInvocation ) ; fail ( ) ; } catch ( java.lang.Throwable java.lang.Throwable ) { assertEquals ( java.lang.Throwable , java.lang.Throwable ) ; } assertEquals ( NUMBER , org.springframework.aop.framework.adapter.ThrowsAdviceInterceptorTests.MyThrowsHandler . getCalls ( ) ) ; assertEquals ( NUMBER , org.springframework.aop.framework.adapter.ThrowsAdviceInterceptorTests.MyThrowsHandler . getCalls ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.rmi.RemoteException java.rmi.RemoteException ) throws java.lang.Throwable { super. void ( java.rmi.RemoteException ) ; throw java.lang.Throwable ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.reflect.Method java.lang.reflect.Method , java.lang.Object [] java.lang.Object[] , java.lang.Object java.lang.Object , java.io.IOException java.io.IOException ) { count ( STRING ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.rmi.RemoteException java.rmi.RemoteException ) throws java.lang.Throwable { count ( STRING ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.reflect.Method java.lang.reflect.Method , java.lang.Exception java.lang.Exception ) throws java.lang.Throwable { throw new java.lang.UnsupportedOperationException ( STRING ) ; }  <METHOD_END>
