<METHOD_START> public void ( ) {	}  <METHOD_END>
<METHOD_START> public void ( MethodFilter org.springframework.integration.handler.MethodFilter ) { this( org.springframework.integration.handler.MethodFilter , null ); }  <METHOD_END>
<METHOD_START> public void ( MethodFilter org.springframework.integration.handler.MethodFilter , BeanFactory org.springframework.integration.handler.BeanFactory ) { if ( org.springframework.integration.handler.BeanFactory != null ) { this . setBeanFactory ( org.springframework.integration.handler.BeanFactory ) ; } if ( org.springframework.integration.handler.MethodFilter != null ) { MethodResolver org.springframework.integration.handler.MethodResolver = new org.springframework.integration.handler.ExpressionCommandMessageProcessor.ExpressionCommandMethodResolver ( org.springframework.integration.handler.MethodFilter ) ; this . getEvaluationContext ( false ) . setMethodResolvers ( java.util.Collections . java.util.List ( org.springframework.integration.handler.MethodResolver ) ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( Message < ? > org.springframework.integration.handler.Message<?> ) { java.lang.Object java.lang.Object = org.springframework.integration.handler.Message<> . getPayload ( ) ; if ( java.lang.Object instanceof Expression ) { return evaluateExpression ( ( Expression ) java.lang.Object , org.springframework.integration.handler.Message<> ) ; } if ( java.lang.Object instanceof java.lang.String ) { return evaluateExpression ( ( java.lang.String ) java.lang.Object , org.springframework.integration.handler.Message<> ) ; } throw new java.lang.IllegalArgumentException ( STRING ) ; }  <METHOD_END>
<METHOD_START> void ( MethodFilter org.springframework.integration.handler.MethodFilter ) { this . org.springframework.integration.handler.MethodFilter = org.springframework.integration.handler.MethodFilter ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.integration.handler.MethodExecutor org.springframework.integration.handler.MethodExecutor ( EvaluationContext org.springframework.integration.handler.EvaluationContext , java.lang.Object java.lang.Object , java.lang.String java.lang.String , java.util.List<org.springframework.integration.handler.TypeDescriptor> < TypeDescriptor > java.util.List<org.springframework.integration.handler.TypeDescriptor> ) throws org.springframework.integration.handler.AccessException { this . void ( java.lang.Object , java.lang.String , ( java.util.List<org.springframework.integration.handler.TypeDescriptor> != null ? java.util.List<org.springframework.integration.handler.TypeDescriptor> . size ( ) : NUMBER ) ) ; return super. resolve ( org.springframework.integration.handler.EvaluationContext , java.lang.Object , java.lang.String , java.util.List<org.springframework.integration.handler.TypeDescriptor> ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.lang.Object java.lang.Object , java.lang.String java.lang.String , int int ) { if ( this . org.springframework.integration.handler.MethodFilter == null ) { return; } java.lang.Class<?> < ? > java.lang.Class<?> = ( java.lang.Object instanceof java.lang.Class ? ( java.lang.Class<?> < ? > ) java.lang.Object : java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) ) ; java.lang.reflect.Method [] java.lang.reflect.Method[] = java.lang.Class<> . java.lang.reflect.Method[] ( ) ; java.util.List<java.lang.reflect.Method> < java.lang.reflect.Method > java.util.List<java.lang.reflect.Method> = new java.util.ArrayList<java.lang.reflect.Method> < java.lang.reflect.Method > ( ) ; for ( java.lang.reflect.Method java.lang.reflect.Method : java.lang.reflect.Method[] ) { if ( java.lang.reflect.Method . java.lang.String ( ) . boolean ( java.lang.String ) && java.lang.reflect.Method . java.lang.Class<?>[] ( ) . int == int ) { java.util.List<java.lang.reflect.Method> . boolean ( java.lang.reflect.Method ) ; } } java.util.List<java.lang.reflect.Method> < java.lang.reflect.Method > java.util.List<java.lang.reflect.Method> = this . org.springframework.integration.handler.MethodFilter . filter ( java.util.List<java.lang.reflect.Method> ) ; if ( java.util.List<java.lang.reflect.Method> . int ( ) == NUMBER ) { java.lang.String java.lang.String = ( java.util.List<java.lang.reflect.Method> . int ( ) > NUMBER ) ? java.util.List<java.lang.reflect.Method> . java.lang.reflect.Method ( NUMBER ) . java.lang.String ( ) : java.lang.String ; throw new EvaluationException ( STRING + java.lang.String + STRING + STRING ) ; } }  <METHOD_END>
