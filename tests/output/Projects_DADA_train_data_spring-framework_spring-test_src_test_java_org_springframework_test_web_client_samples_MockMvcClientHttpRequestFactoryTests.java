<METHOD_START> @ Before public void void ( ) { MockMvc org.springframework.test.web.client.samples.MockMvc = MockMvcBuilders . webAppContextSetup ( this . org.springframework.test.web.client.samples.WebApplicationContext ) . alwaysExpect ( status ( ) . isOk ( ) ) . build ( ) ; this . org.springframework.test.web.client.samples.RestTemplate = new RestTemplate ( new MockMvcClientHttpRequestFactory ( org.springframework.test.web.client.samples.MockMvc ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.String java.lang.String = this . org.springframework.test.web.client.samples.RestTemplate . getForObject ( STRING , java.lang.String .class ) ; assertEquals ( STRING , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ RequestMapping ( value = STRING , method = RequestMethod . GET ) @ ResponseBody public java.lang.String java.lang.String ( ) { return STRING ; }  <METHOD_END>