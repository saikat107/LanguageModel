<METHOD_START> public void void ( java.lang.String java.lang.String ) { Assert . hasText ( java.lang.String , STRING ) ; this . org.springframework.integration.file.Expression = EXPRESSION_PARSER . parseExpression ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { Assert . notNull ( java.lang.String , STRING ) ; this . org.springframework.integration.file.Expression = EXPRESSION_PARSER . parseExpression ( STRING + java.lang.String + STRING ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( Message < ? > org.springframework.integration.file.Message<?> ) { java.lang.Object java.lang.Object = this . evaluateExpression ( this . org.springframework.integration.file.Expression , org.springframework.integration.file.Message<> ) ; if ( java.lang.Object instanceof java.lang.String && StringUtils . hasText ( ( java.lang.String ) java.lang.Object ) ) { return ( java.lang.String ) java.lang.Object ; } if ( org.springframework.integration.file.Message<> . getPayload ( ) instanceof java.io.File ) { return ( ( java.io.File ) org.springframework.integration.file.Message<> . getPayload ( ) ) . java.lang.String ( ) ; } return org.springframework.integration.file.Message<> . getHeaders ( ) . getId ( ) + STRING ; }  <METHOD_END>
