<METHOD_START> public void ( java.lang.String java.lang.String ) { this( org.springframework.integration.routingslip.ExpressionParser . parseExpression ( java.lang.String ) ); }  <METHOD_END>
<METHOD_START> public void ( Expression org.springframework.integration.routingslip.Expression ) { this . org.springframework.integration.routingslip.Expression = org.springframework.integration.routingslip.Expression ; }  <METHOD_END>
<METHOD_START> public void void ( EvaluationContext org.springframework.integration.routingslip.EvaluationContext ) { this . org.springframework.integration.routingslip.EvaluationContext = org.springframework.integration.routingslip.EvaluationContext ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( BeanFactory org.springframework.integration.routingslip.BeanFactory ) throws org.springframework.integration.routingslip.BeansException { this . org.springframework.integration.routingslip.BeanFactory = org.springframework.integration.routingslip.BeanFactory ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) java.lang.Exception { if ( this . org.springframework.integration.routingslip.EvaluationContext == null ) { this . org.springframework.integration.routingslip.EvaluationContext = ExpressionUtils . createStandardEvaluationContext ( this . org.springframework.integration.routingslip.BeanFactory ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( Message < ? > org.springframework.integration.routingslip.Message<?> , java.lang.Object java.lang.Object ) { return this . org.springframework.integration.routingslip.Expression . getValue ( this . org.springframework.integration.routingslip.EvaluationContext , new org.springframework.integration.routingslip.ExpressionEvaluatingRoutingSlipRouteStrategy.RequestAndReply ( org.springframework.integration.routingslip.Message<> , java.lang.Object ) , java.lang.String .class ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return STRING + this . org.springframework.integration.routingslip.Expression . getExpressionString ( ) + STRING ; }  <METHOD_END>
<METHOD_START> void ( Message < ? > org.springframework.integration.routingslip.Message<?> , java.lang.Object java.lang.Object ) { this . org.springframework.integration.routingslip.Message<?> = org.springframework.integration.routingslip.Message<> ; this . java.lang.Object = java.lang.Object ; }  <METHOD_END>
<METHOD_START> public org.springframework.integration.routingslip.Message<?> < ? > org.springframework.integration.routingslip.Message<?> ( ) { return this . org.springframework.integration.routingslip.Message<> ; }  <METHOD_END>
<METHOD_START> public java.lang.Object java.lang.Object ( ) { return this . java.lang.Object ; }  <METHOD_END>
