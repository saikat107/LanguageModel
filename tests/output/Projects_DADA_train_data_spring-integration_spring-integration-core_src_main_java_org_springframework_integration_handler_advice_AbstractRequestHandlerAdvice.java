<METHOD_START> @ java.lang.Override public final java.lang.Object java.lang.Object ( final MethodInvocation org.springframework.integration.handler.advice.MethodInvocation ) throws java.lang.Throwable { java.lang.reflect.Method java.lang.reflect.Method = org.springframework.integration.handler.advice.MethodInvocation . getMethod ( ) ; java.lang.Object [] java.lang.Object[] = org.springframework.integration.handler.advice.MethodInvocation . getArguments ( ) ; boolean boolean = ( java.lang.reflect.Method . java.lang.String ( ) . boolean ( STRING ) || java.lang.reflect.Method . java.lang.String ( ) . boolean ( STRING ) ) && ( java.lang.Object[] . int == NUMBER && java.lang.Object[] [ NUMBER ] instanceof Message ) ; java.lang.Object java.lang.Object = org.springframework.integration.handler.advice.MethodInvocation . getThis ( ) ; if ( ! boolean ) { boolean boolean = java.lang.Object != null && MessageHandler .class . boolean ( java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) ) ; if ( ! boolean && this . org.springframework.integration.handler.advice.Log . isWarnEnabled ( ) ) { java.lang.String java.lang.String = java.lang.Object == null ? java.lang.reflect.Method . java.lang.Class<?> ( ) . java.lang.String ( ) : java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) . java.lang.String ( ) ; this . org.springframework.integration.handler.advice.Log . warn ( STRING + this . java.lang.Class<? extends org.springframework.integration.handler.advice.AbstractRequestHandlerAdvice> ( ) . java.lang.String ( ) + STRING + java.lang.reflect.Method . java.lang.String ( ) + STRING + java.lang.String + STRING ) ; } return org.springframework.integration.handler.advice.MethodInvocation . proceed ( ) ; } else { Message < ? > org.springframework.integration.handler.advice.Message<?> = ( Message < ? > ) java.lang.Object[] [ NUMBER ] ; try { return java.lang.Object ( new org.springframework.integration.handler.advice.AbstractRequestHandlerAdvice.ExecutionCallback ( ) { @ java.lang.Override public java.lang.Object java.lang.Object ( ) java.lang.Exception { try { return org.springframework.integration.handler.advice.MethodInvocation . proceed ( ) ; } catch ( java.lang.Exception java.lang.Exception ) { throw java.lang.Exception ; } catch ( java.lang.Throwable java.lang.Throwable ) { throw new org.springframework.integration.handler.advice.AbstractRequestHandlerAdvice.ThrowableHolderException ( java.lang.Throwable ) ; } } @ java.lang.Override public java.lang.Object java.lang.Object ( ) java.lang.Exception { try { if ( org.springframework.integration.handler.advice.MethodInvocation instanceof ProxyMethodInvocation ) { return ( ( ProxyMethodInvocation ) org.springframework.integration.handler.advice.MethodInvocation ) . invocableClone ( ) . proceed ( ) ; } else { throw new java.lang.IllegalStateException ( STRING + STRING ) ; } } catch ( java.lang.Exception java.lang.Exception ) { throw java.lang.Exception ; } catch ( java.lang.Throwable java.lang.Throwable ) { throw new org.springframework.integration.handler.advice.AbstractRequestHandlerAdvice.ThrowableHolderException ( java.lang.Throwable ) ; } } } , java.lang.Object , org.springframework.integration.handler.advice.Message<> ) ; } catch ( java.lang.Exception java.lang.Exception ) { throw this . java.lang.Throwable ( java.lang.Exception ) ; } } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( ) java.lang.Exception { try { return org.springframework.integration.handler.advice.MethodInvocation . proceed ( ) ; } catch ( java.lang.Exception java.lang.Exception ) { throw java.lang.Exception ; } catch ( java.lang.Throwable java.lang.Throwable ) { throw new org.springframework.integration.handler.advice.AbstractRequestHandlerAdvice.ThrowableHolderException ( java.lang.Throwable ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( ) java.lang.Exception { try { if ( org.springframework.integration.handler.advice.MethodInvocation instanceof ProxyMethodInvocation ) { return ( ( ProxyMethodInvocation ) org.springframework.integration.handler.advice.MethodInvocation ) . invocableClone ( ) . proceed ( ) ; } else { throw new java.lang.IllegalStateException ( STRING + STRING ) ; } } catch ( java.lang.Exception java.lang.Exception ) { throw java.lang.Exception ; } catch ( java.lang.Throwable java.lang.Throwable ) { throw new org.springframework.integration.handler.advice.AbstractRequestHandlerAdvice.ThrowableHolderException ( java.lang.Throwable ) ; } }  <METHOD_END>
<METHOD_START> protected abstract java.lang.Object java.lang.Object ( org.springframework.integration.handler.advice.AbstractRequestHandlerAdvice.ExecutionCallback org.springframework.integration.handler.advice.AbstractRequestHandlerAdvice.ExecutionCallback , java.lang.Object java.lang.Object , Message < ? > org.springframework.integration.handler.advice.Message<?> ) throws java.lang.Exception ;  <METHOD_END>
<METHOD_START> protected java.lang.Exception java.lang.Exception ( java.lang.Exception java.lang.Exception ) { java.lang.Exception java.lang.Exception = java.lang.Exception ; if ( java.lang.Exception instanceof org.springframework.integration.handler.advice.AbstractRequestHandlerAdvice.ThrowableHolderException && java.lang.Exception . java.lang.Throwable ( ) instanceof java.lang.Exception ) { java.lang.Exception = ( java.lang.Exception ) java.lang.Exception . java.lang.Throwable ( ) ; } return java.lang.Exception ; }  <METHOD_END>
<METHOD_START> protected java.lang.Throwable java.lang.Throwable ( java.lang.Exception java.lang.Exception ) { java.lang.Throwable java.lang.Throwable = java.lang.Exception ; if ( java.lang.Exception instanceof org.springframework.integration.handler.advice.AbstractRequestHandlerAdvice.ThrowableHolderException ) { java.lang.Throwable = java.lang.Exception . java.lang.Throwable ( ) ; } return java.lang.Throwable ; }  <METHOD_END>
<METHOD_START> java.lang.Object java.lang.Object ( ) java.lang.Exception ;  <METHOD_END>
<METHOD_START> java.lang.Object java.lang.Object ( ) java.lang.Exception ;  <METHOD_END>
<METHOD_START> void ( java.lang.Throwable java.lang.Throwable ) { super( java.lang.Throwable ); }  <METHOD_END>
