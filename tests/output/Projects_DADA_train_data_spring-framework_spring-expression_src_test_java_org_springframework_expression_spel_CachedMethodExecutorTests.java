<METHOD_START> @ Before public void void ( ) java.lang.Exception { this . org.springframework.expression.spel.StandardEvaluationContext = new StandardEvaluationContext ( new org.springframework.expression.spel.CachedMethodExecutorTests.RootObject ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Expression org.springframework.expression.spel.Expression = this . org.springframework.expression.spel.ExpressionParser . parseExpression ( STRING ) ; void ( org.springframework.expression.spel.Expression , NUMBER , STRING ) ; void ( org.springframework.expression.spel.Expression , NUMBER , STRING ) ; void ( org.springframework.expression.spel.Expression , STRING , STRING ) ; void ( org.springframework.expression.spel.Expression , NUMBER , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Expression org.springframework.expression.spel.Expression = this . org.springframework.expression.spel.ExpressionParser . parseExpression ( STRING ) ; void ( org.springframework.expression.spel.Expression , new org.springframework.expression.spel.CachedMethodExecutorTests.RootObject ( ) , STRING ) ; void ( org.springframework.expression.spel.Expression , new org.springframework.expression.spel.CachedMethodExecutorTests.RootObject ( ) , STRING ) ; void ( org.springframework.expression.spel.Expression , new org.springframework.expression.spel.CachedMethodExecutorTests.BaseObject ( ) , STRING ) ; void ( org.springframework.expression.spel.Expression , new org.springframework.expression.spel.CachedMethodExecutorTests.RootObject ( ) , STRING ) ; }  <METHOD_END>
<METHOD_START> private void void ( Expression org.springframework.expression.spel.Expression , java.lang.Object java.lang.Object , java.lang.String java.lang.String ) { this . org.springframework.expression.spel.StandardEvaluationContext . setVariable ( STRING , java.lang.Object ) ; assertEquals ( java.lang.String , org.springframework.expression.spel.Expression . getValue ( this . org.springframework.expression.spel.StandardEvaluationContext ) ) ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( java.lang.String java.lang.String ) { return STRING + java.lang.String ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( int int ) { return STRING + int ; }  <METHOD_END>
