<METHOD_START> @ Test public void void ( ) { java.lang.String java.lang.String = org.springframework.integration.aop.AnnotationConfigRegistrationTests.TestBean . java.lang.String ( STRING , STRING , NUMBER ) ; Assert . assertNotNull ( java.lang.String ) ; Message < ? > org.springframework.integration.aop.Message<?> = org.springframework.integration.aop.QueueChannel . receive ( NUMBER ) ; Assert . assertNotNull ( org.springframework.integration.aop.Message<> ) ; Assert . assertEquals ( STRING , org.springframework.integration.aop.Message<> . getPayload ( ) ) ; Assert . assertEquals ( NUMBER , org.springframework.integration.aop.Message<> . getHeaders ( ) . get ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.lang.String java.lang.String = org.springframework.integration.aop.AnnotationConfigRegistrationTests.TestBean . java.lang.String ( STRING ) ; Assert . assertNotNull ( java.lang.String ) ; Assert . assertEquals ( STRING , java.lang.String ) ; Message < ? > org.springframework.integration.aop.Message<?> = org.springframework.integration.aop.QueueChannel . receive ( NUMBER ) ; Assert . assertNotNull ( org.springframework.integration.aop.Message<> ) ; Assert . assertEquals ( STRING , org.springframework.integration.aop.Message<> . getPayload ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Publisher ( channel = STRING ) @ Payload ( STRING ) public java.lang.String java.lang.String ( java.lang.String java.lang.String , java.lang.String java.lang.String , @ Header ( STRING ) int int ) { return java.lang.String + STRING + java.lang.String ; }  <METHOD_END>
<METHOD_START> @ Publisher public java.lang.String java.lang.String ( java.lang.String java.lang.String ) { return java.lang.String . java.lang.String ( ) + STRING ; }  <METHOD_END>
