<METHOD_START> @ java.lang.Override protected org.springframework.integration.support.RequestResponseScenario org.springframework.integration.support.RequestResponseScenario ( ) { RequestResponseScenario org.springframework.integration.support.RequestResponseScenario = new RequestResponseScenario ( STRING , STRING ) . setPayload ( STRING ) . setResponseValidator ( new PayloadValidator < java.lang.String > ( ) { @ java.lang.Override protected void void ( java.lang.String java.lang.String ) { assertEquals ( STRING , java.lang.String ) ; } } ) ; return org.springframework.integration.support.RequestResponseScenario ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( java.lang.String java.lang.String ) { assertEquals ( STRING , java.lang.String ) ; }  <METHOD_END>
