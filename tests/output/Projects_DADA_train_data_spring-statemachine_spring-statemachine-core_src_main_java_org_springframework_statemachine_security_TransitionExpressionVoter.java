<METHOD_START> @ java.lang.Override public boolean boolean ( ConfigAttribute org.springframework.statemachine.security.ConfigAttribute ) { return org.springframework.statemachine.security.ConfigAttribute instanceof TransitionExpressionConfigAttribute ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( java.lang.Class<?> < ? > java.lang.Class<?> ) { return Transition .class . boolean ( java.lang.Class<> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( Authentication org.springframework.statemachine.security.Authentication , Transition < ? , ? > org.springframework.statemachine.security.Transition<?,?> , java.util.Collection<org.springframework.statemachine.security.ConfigAttribute> < ConfigAttribute > java.util.Collection<org.springframework.statemachine.security.ConfigAttribute> ) { TransitionExpressionConfigAttribute org.springframework.statemachine.security.TransitionExpressionConfigAttribute = org.springframework.statemachine.security.TransitionExpressionConfigAttribute ( java.util.Collection<org.springframework.statemachine.security.ConfigAttribute> ) ; if ( org.springframework.statemachine.security.TransitionExpressionConfigAttribute == null ) { return ACCESS_ABSTAIN ; } EvaluationContext org.springframework.statemachine.security.EvaluationContext = org.springframework.statemachine.security.SecurityExpressionHandler<org.springframework.statemachine.security.Transition<?,?>> . createEvaluationContext ( org.springframework.statemachine.security.Authentication , org.springframework.statemachine.security.Transition<,> ) ; return ExpressionUtils . evaluateAsBoolean ( org.springframework.statemachine.security.TransitionExpressionConfigAttribute . getAuthorizeExpression ( ) , org.springframework.statemachine.security.EvaluationContext ) ? ACCESS_GRANTED : ACCESS_DENIED ; }  <METHOD_END>
<METHOD_START> private org.springframework.statemachine.security.TransitionExpressionConfigAttribute org.springframework.statemachine.security.TransitionExpressionConfigAttribute ( java.util.Collection<org.springframework.statemachine.security.ConfigAttribute> < ConfigAttribute > java.util.Collection<org.springframework.statemachine.security.ConfigAttribute> ) { for ( ConfigAttribute org.springframework.statemachine.security.ConfigAttribute : java.util.Collection<org.springframework.statemachine.security.ConfigAttribute> ) { if ( org.springframework.statemachine.security.ConfigAttribute instanceof TransitionExpressionConfigAttribute ) { return ( TransitionExpressionConfigAttribute ) org.springframework.statemachine.security.ConfigAttribute ; } } return null ; }  <METHOD_END>
