<METHOD_START> public void ( java.lang.Object java.lang.Object , java.lang.reflect.Method java.lang.reflect.Method ) { Assert . isTrue ( java.lang.reflect.Method . java.lang.Class<?> ( ) . boolean ( void .class ) , STRING ) ; this . org.springframework.integration.handler.MethodInvokingMessageProcessor<java.lang.Object> = new MethodInvokingMessageProcessor < java.lang.Object > ( java.lang.Object , java.lang.reflect.Method ) ; }  <METHOD_END>
<METHOD_START> public void ( java.lang.Object java.lang.Object , java.lang.String java.lang.String ) { this . org.springframework.integration.handler.MethodInvokingMessageProcessor<java.lang.Object> = new MethodInvokingMessageProcessor < java.lang.Object > ( java.lang.Object , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( BeanFactory org.springframework.integration.handler.BeanFactory ) { super. setBeanFactory ( org.springframework.integration.handler.BeanFactory ) ; this . org.springframework.integration.handler.MethodInvokingMessageProcessor<java.lang.Object> . setBeanFactory ( org.springframework.integration.handler.BeanFactory ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { this . org.springframework.integration.handler.MethodInvokingMessageProcessor<java.lang.Object> . start ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { this . org.springframework.integration.handler.MethodInvokingMessageProcessor<java.lang.Object> . stop ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return this . org.springframework.integration.handler.MethodInvokingMessageProcessor<java.lang.Object> . isRunning ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( Message < ? > org.springframework.integration.handler.Message<?> ) throws java.lang.Exception { java.lang.Object java.lang.Object = this . org.springframework.integration.handler.MethodInvokingMessageProcessor<java.lang.Object> . processMessage ( org.springframework.integration.handler.Message<> ) ; if ( java.lang.Object != null ) { throw new MessagingException ( org.springframework.integration.handler.Message<> , STRING + STRING + this + STRING + java.lang.Object + STRING ) ; } }  <METHOD_END>
