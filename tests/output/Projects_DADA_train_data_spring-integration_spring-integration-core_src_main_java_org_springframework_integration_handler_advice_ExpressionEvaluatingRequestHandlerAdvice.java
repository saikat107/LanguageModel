<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . org.springframework.integration.handler.advice.Expression = new SpelExpressionParser ( ) . parseExpression ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> public void void ( Expression org.springframework.integration.handler.advice.Expression ) { this . org.springframework.integration.handler.advice.Expression = org.springframework.integration.handler.advice.Expression ; }  <METHOD_END>
<METHOD_START> @ java.lang.Deprecated public void void ( Expression org.springframework.integration.handler.advice.Expression ) { this . org.springframework.integration.handler.advice.Expression = org.springframework.integration.handler.advice.Expression ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . org.springframework.integration.handler.advice.Expression = new SpelExpressionParser ( ) . parseExpression ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> public void void ( Expression org.springframework.integration.handler.advice.Expression ) { this . org.springframework.integration.handler.advice.Expression = org.springframework.integration.handler.advice.Expression ; }  <METHOD_END>
<METHOD_START> @ java.lang.Deprecated public void void ( Expression org.springframework.integration.handler.advice.Expression ) { this . org.springframework.integration.handler.advice.Expression = org.springframework.integration.handler.advice.Expression ; }  <METHOD_END>
<METHOD_START> public void void ( MessageChannel org.springframework.integration.handler.advice.MessageChannel ) { this . org.springframework.integration.handler.advice.MessageChannel = org.springframework.integration.handler.advice.MessageChannel ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( MessageChannel org.springframework.integration.handler.advice.MessageChannel ) { this . org.springframework.integration.handler.advice.MessageChannel = org.springframework.integration.handler.advice.MessageChannel ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( ) java.lang.Exception { super. onInit ( ) ; if ( this . getBeanFactory ( ) != null ) { this . org.springframework.integration.handler.advice.MessagingTemplate . setBeanFactory ( this . getBeanFactory ( ) ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Object java.lang.Object ( ExecutionCallback org.springframework.integration.handler.advice.ExecutionCallback , java.lang.Object java.lang.Object , Message < ? > org.springframework.integration.handler.advice.Message<?> ) throws java.lang.Exception { try { java.lang.Object java.lang.Object = org.springframework.integration.handler.advice.ExecutionCallback . execute ( ) ; if ( this . org.springframework.integration.handler.advice.Expression != null ) { this . void ( org.springframework.integration.handler.advice.Message<> ) ; } return java.lang.Object ; } catch ( java.lang.Exception java.lang.Exception ) { java.lang.Exception java.lang.Exception = this . unwrapExceptionIfNecessary ( java.lang.Exception ) ; if ( this . org.springframework.integration.handler.advice.Expression != null ) { java.lang.Object java.lang.Object = this . java.lang.Object ( org.springframework.integration.handler.advice.Message<> , java.lang.Exception ) ; if ( this . boolean ) { return java.lang.Object ; } } if ( ! this . boolean ) { throw java.lang.Exception ; } return null ; } }  <METHOD_END>
<METHOD_START> private void void ( Message < ? > org.springframework.integration.handler.advice.Message<?> ) throws java.lang.Exception { java.lang.Object java.lang.Object ; boolean boolean = false ; try { java.lang.Object = this . org.springframework.integration.handler.advice.Expression . getValue ( this . org.springframework.integration.handler.advice.EvaluationContext ( null ) , org.springframework.integration.handler.advice.Message<> ) ; } catch ( java.lang.Exception java.lang.Exception ) { java.lang.Object = java.lang.Exception ; boolean = true ; } if ( this . org.springframework.integration.handler.advice.MessageChannel == null && this . java.lang.String != null && getChannelResolver ( ) != null ) { this . org.springframework.integration.handler.advice.MessageChannel = getChannelResolver ( ) . resolveDestination ( this . java.lang.String ) ; } if ( java.lang.Object != null && this . org.springframework.integration.handler.advice.MessageChannel != null ) { AdviceMessage < ? > org.springframework.integration.handler.advice.AdviceMessage<?> = new AdviceMessage < java.lang.Object > ( java.lang.Object , org.springframework.integration.handler.advice.Message<> ) ; this . org.springframework.integration.handler.advice.MessagingTemplate . send ( this . org.springframework.integration.handler.advice.MessageChannel , org.springframework.integration.handler.advice.AdviceMessage<> ) ; } if ( boolean && this . boolean ) { throw ( java.lang.Exception ) java.lang.Object ; } }  <METHOD_END>
<METHOD_START> private java.lang.Object java.lang.Object ( Message < ? > org.springframework.integration.handler.advice.Message<?> , java.lang.Exception java.lang.Exception ) throws java.lang.Exception { java.lang.Object java.lang.Object ; try { java.lang.Object = this . org.springframework.integration.handler.advice.Expression . getValue ( this . org.springframework.integration.handler.advice.EvaluationContext ( java.lang.Exception ) , org.springframework.integration.handler.advice.Message<> ) ; } catch ( java.lang.Exception java.lang.Exception ) { java.lang.Object = java.lang.Exception ; logger . error ( STRING + org.springframework.integration.handler.advice.Message<> + STRING + java.lang.Exception . java.lang.String ( ) ) ; } if ( this . org.springframework.integration.handler.advice.MessageChannel == null && this . java.lang.String != null && getChannelResolver ( ) != null ) { this . org.springframework.integration.handler.advice.MessageChannel = getChannelResolver ( ) . resolveDestination ( this . java.lang.String ) ; } if ( java.lang.Object != null && this . org.springframework.integration.handler.advice.MessageChannel != null ) { MessagingException org.springframework.integration.handler.advice.MessagingException = new org.springframework.integration.handler.advice.ExpressionEvaluatingRequestHandlerAdvice.MessageHandlingExpressionEvaluatingAdviceException ( org.springframework.integration.handler.advice.Message<> , STRING , this . unwrapThrowableIfNecessary ( java.lang.Exception ) , java.lang.Object ) ; ErrorMessage org.springframework.integration.handler.advice.ErrorMessage = new ErrorMessage ( org.springframework.integration.handler.advice.MessagingException ) ; this . org.springframework.integration.handler.advice.MessagingTemplate . send ( this . org.springframework.integration.handler.advice.MessageChannel , org.springframework.integration.handler.advice.ErrorMessage ) ; } return java.lang.Object ; }  <METHOD_END>
<METHOD_START> protected org.springframework.integration.handler.advice.StandardEvaluationContext org.springframework.integration.handler.advice.StandardEvaluationContext ( ) { return ExpressionUtils . createStandardEvaluationContext ( this . getBeanFactory ( ) ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.integration.handler.advice.EvaluationContext org.springframework.integration.handler.advice.EvaluationContext ( java.lang.Exception java.lang.Exception ) { EvaluationContext org.springframework.integration.handler.advice.EvaluationContext ; if ( java.lang.Exception != null ) { org.springframework.integration.handler.advice.EvaluationContext = this . org.springframework.integration.handler.advice.StandardEvaluationContext ( ) ; org.springframework.integration.handler.advice.EvaluationContext . setVariable ( STRING , java.lang.Exception ) ; } else { if ( this . org.springframework.integration.handler.advice.EvaluationContext == null ) { this . org.springframework.integration.handler.advice.EvaluationContext = this . org.springframework.integration.handler.advice.StandardEvaluationContext ( ) ; } org.springframework.integration.handler.advice.EvaluationContext = this . org.springframework.integration.handler.advice.EvaluationContext ; } return org.springframework.integration.handler.advice.EvaluationContext ; }  <METHOD_END>
<METHOD_START> public void ( Message < ? > org.springframework.integration.handler.advice.Message<?> , java.lang.String java.lang.String , java.lang.Throwable java.lang.Throwable , java.lang.Object java.lang.Object ) { super( org.springframework.integration.handler.advice.Message<> , java.lang.String , java.lang.Throwable ); this . java.lang.Object = java.lang.Object ; }  <METHOD_END>
<METHOD_START> public java.lang.Object java.lang.Object ( ) { return this . java.lang.Object ; }  <METHOD_END>
