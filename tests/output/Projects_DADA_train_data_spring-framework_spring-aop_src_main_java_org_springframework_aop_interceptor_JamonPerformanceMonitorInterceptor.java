<METHOD_START> public void ( ) {	}  <METHOD_END>
<METHOD_START> public void ( boolean boolean ) { setUseDynamicLogger ( boolean ) ; }  <METHOD_END>
<METHOD_START> public void ( boolean boolean , boolean boolean ) { setUseDynamicLogger ( boolean ) ; void ( boolean ) ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected boolean boolean ( MethodInvocation org.springframework.aop.interceptor.MethodInvocation , Log org.springframework.aop.interceptor.Log ) { return ( this . boolean || isLogEnabled ( org.springframework.aop.interceptor.Log ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Object java.lang.Object ( MethodInvocation org.springframework.aop.interceptor.MethodInvocation , Log org.springframework.aop.interceptor.Log ) throws java.lang.Throwable { java.lang.String java.lang.String = createInvocationTraceName ( org.springframework.aop.interceptor.MethodInvocation ) ; MonKey org.springframework.aop.interceptor.MonKey = new MonKeyImp ( java.lang.String , java.lang.String , STRING ) ; Monitor org.springframework.aop.interceptor.Monitor = MonitorFactory . start ( org.springframework.aop.interceptor.MonKey ) ; try { return org.springframework.aop.interceptor.MethodInvocation . proceed ( ) ; } catch ( java.lang.Throwable java.lang.Throwable ) { void ( org.springframework.aop.interceptor.MonKey , java.lang.Throwable ) ; throw java.lang.Throwable ; } finally { org.springframework.aop.interceptor.Monitor . stop ( ) ; if ( ! this . boolean || isLogEnabled ( org.springframework.aop.interceptor.Log ) ) { org.springframework.aop.interceptor.Log . trace ( STRING + java.lang.String + STRING + org.springframework.aop.interceptor.Monitor ) ; } } }  <METHOD_END>
<METHOD_START> protected void void ( MonKey org.springframework.aop.interceptor.MonKey , java.lang.Throwable java.lang.Throwable ) { java.lang.String java.lang.String = STRING + Misc . getExceptionTrace ( java.lang.Throwable ) ; org.springframework.aop.interceptor.MonKey . setDetails ( java.lang.String ) ; MonitorFactory . add ( new MonKeyImp ( java.lang.Throwable . java.lang.Class<? extends java.lang.Throwable> ( ) . java.lang.String ( ) , java.lang.String , STRING ) , NUMBER ) ; MonitorFactory . add ( new MonKeyImp ( MonitorFactory . EXCEPTIONS_LABEL , java.lang.String , STRING ) , NUMBER ) ; }  <METHOD_END>
