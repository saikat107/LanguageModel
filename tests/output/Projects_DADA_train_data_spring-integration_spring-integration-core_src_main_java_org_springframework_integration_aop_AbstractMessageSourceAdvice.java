<METHOD_START> @ java.lang.Override public final java.lang.Object java.lang.Object ( MethodInvocation org.springframework.integration.aop.MethodInvocation ) throws java.lang.Throwable { java.lang.Object java.lang.Object = org.springframework.integration.aop.MethodInvocation . getThis ( ) ; if ( ! ( java.lang.Object instanceof MessageSource ) ) { return org.springframework.integration.aop.MethodInvocation . proceed ( ) ; } Message < ? > org.springframework.integration.aop.Message<?> = null ; if ( boolean ( ( MessageSource < ? > ) java.lang.Object ) ) { org.springframework.integration.aop.Message<?> = ( Message < ? > ) org.springframework.integration.aop.MethodInvocation . proceed ( ) ; } return org.springframework.integration.aop.Message<?> ( org.springframework.integration.aop.Message<> , ( MessageSource < ? > ) java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> public abstract boolean boolean ( MessageSource < ? > org.springframework.integration.aop.MessageSource<?> );  <METHOD_END>
<METHOD_START> public abstract org.springframework.integration.aop.Message<?> < ? > org.springframework.integration.aop.Message<?> ( Message < ? > org.springframework.integration.aop.Message<?> , MessageSource < ? > org.springframework.integration.aop.MessageSource<?> );  <METHOD_END>
