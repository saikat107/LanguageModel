<METHOD_START> @ Before public void void ( ) { this . org.springframework.test.web.servlet.samples.context.MockMvc = MockMvcBuilders . webAppContextSetup ( this . org.springframework.test.web.servlet.samples.context.WebApplicationContext ) . build ( ) ; given ( this . org.springframework.test.web.servlet.samples.context.PersonDao . getPerson ( NUMBER ) ) . willReturn ( new Person ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.test.web.servlet.samples.context.MockMvc . perform ( get ( STRING ) . accept ( MediaType . APPLICATION_JSON ) ) . andDo ( print ( ) ) . andExpect ( status ( ) . isOk ( ) ) . andExpect ( content ( ) . string ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.test.web.servlet.samples.context.MockMvc . perform ( get ( STRING ) ) . andExpect ( status ( ) . isOk ( ) ) . andExpect ( forwardedUrl ( STRING ) ) ; }  <METHOD_END>