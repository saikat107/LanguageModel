<METHOD_START> private void ( ) { throw new java.lang.AssertionError ( ) ; }  <METHOD_END>
<METHOD_START> public static java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ( java.util.Collection<org.springframework.integration.jpa.support.parametersource.JpaParameter> < JpaParameter > java.util.Collection<org.springframework.integration.jpa.support.parametersource.JpaParameter> ) { Assert . notNull ( java.util.Collection<org.springframework.integration.jpa.support.parametersource.JpaParameter> , STRING ) ; for ( JpaParameter org.springframework.integration.jpa.support.parametersource.JpaParameter : java.util.Collection<org.springframework.integration.jpa.support.parametersource.JpaParameter> ) { Assert . notNull ( org.springframework.integration.jpa.support.parametersource.JpaParameter , STRING ) ; } final java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = new java.util.HashMap<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > ( ) ; for ( JpaParameter org.springframework.integration.jpa.support.parametersource.JpaParameter : java.util.Collection<org.springframework.integration.jpa.support.parametersource.JpaParameter> ) { if ( org.springframework.integration.jpa.support.parametersource.JpaParameter . getValue ( ) != null ) { java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( org.springframework.integration.jpa.support.parametersource.JpaParameter . getName ( ) , org.springframework.integration.jpa.support.parametersource.JpaParameter . getValue ( ) ) ; } } return java.util.Map<java.lang.String,java.lang.Object> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.integration.jpa.support.parametersource.StandardEvaluationContext org.springframework.integration.jpa.support.parametersource.StandardEvaluationContext ( ) { return super. getEvaluationContext ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( Expression org.springframework.integration.jpa.support.parametersource.Expression , java.lang.Object java.lang.Object ) { return super. evaluateExpression ( org.springframework.integration.jpa.support.parametersource.Expression , java.lang.Object ) ; }  <METHOD_END>