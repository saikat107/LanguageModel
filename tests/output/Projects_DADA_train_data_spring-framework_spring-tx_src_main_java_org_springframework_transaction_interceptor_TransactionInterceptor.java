<METHOD_START> public void ( ) {	}  <METHOD_END>
<METHOD_START> public void ( PlatformTransactionManager org.springframework.transaction.interceptor.PlatformTransactionManager , java.util.Properties java.util.Properties ) { setTransactionManager ( org.springframework.transaction.interceptor.PlatformTransactionManager ) ; setTransactionAttributes ( java.util.Properties ) ; }  <METHOD_END>
<METHOD_START> public void ( PlatformTransactionManager org.springframework.transaction.interceptor.PlatformTransactionManager , TransactionAttributeSource org.springframework.transaction.interceptor.TransactionAttributeSource ) { setTransactionManager ( org.springframework.transaction.interceptor.PlatformTransactionManager ) ; setTransactionAttributeSource ( org.springframework.transaction.interceptor.TransactionAttributeSource ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( final MethodInvocation org.springframework.transaction.interceptor.MethodInvocation ) throws java.lang.Throwable { java.lang.Class<?> < ? > java.lang.Class<?> = ( org.springframework.transaction.interceptor.MethodInvocation . getThis ( ) != null ? AopUtils . getTargetClass ( org.springframework.transaction.interceptor.MethodInvocation . getThis ( ) ) : null ) ; return invokeWithinTransaction ( org.springframework.transaction.interceptor.MethodInvocation . getMethod ( ) , java.lang.Class<> , new InvocationCallback ( ) { @ java.lang.Override public java.lang.Object java.lang.Object ( ) java.lang.Throwable { return org.springframework.transaction.interceptor.MethodInvocation . proceed ( ) ; } } ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( ) java.lang.Throwable { return org.springframework.transaction.interceptor.MethodInvocation . proceed ( ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.io.ObjectOutputStream java.io.ObjectOutputStream ) throws java.io.IOException { java.io.ObjectOutputStream . void ( ) ; java.io.ObjectOutputStream . void ( getTransactionManagerBeanName ( ) ) ; java.io.ObjectOutputStream . void ( getTransactionManager ( ) ) ; java.io.ObjectOutputStream . void ( getTransactionAttributeSource ( ) ) ; java.io.ObjectOutputStream . void ( getBeanFactory ( ) ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.io.ObjectInputStream java.io.ObjectInputStream ) throws java.io.IOException , java.lang.ClassNotFoundException { java.io.ObjectInputStream . void ( ) ; setTransactionManagerBeanName ( ( java.lang.String ) java.io.ObjectInputStream . java.lang.Object ( ) ) ; setTransactionManager ( ( PlatformTransactionManager ) java.io.ObjectInputStream . java.lang.Object ( ) ) ; setTransactionAttributeSource ( ( TransactionAttributeSource ) java.io.ObjectInputStream . java.lang.Object ( ) ) ; setBeanFactory ( ( BeanFactory ) java.io.ObjectInputStream . java.lang.Object ( ) ) ; }  <METHOD_END>