<METHOD_START> @ Before public void void ( ) { CookieLocaleResolver org.springframework.test.web.servlet.samples.standalone.resultmatchers.CookieLocaleResolver = new CookieLocaleResolver ( ) ; org.springframework.test.web.servlet.samples.standalone.resultmatchers.CookieLocaleResolver . setCookieDomain ( STRING ) ; this . org.springframework.test.web.servlet.samples.standalone.resultmatchers.MockMvc = standaloneSetup ( new org.springframework.test.web.servlet.samples.standalone.resultmatchers.CookieAssertionTests.SimpleController ( ) ) . addInterceptors ( new LocaleChangeInterceptor ( ) ) . setLocaleResolver ( org.springframework.test.web.servlet.samples.standalone.resultmatchers.CookieLocaleResolver ) . defaultRequest ( get ( STRING ) . param ( STRING , STRING ) ) . alwaysExpect ( status ( ) . isOk ( ) ) . build ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.test.web.servlet.samples.standalone.resultmatchers.MockMvc . perform ( get ( STRING ) ) . andExpect ( cookie ( ) . exists ( java.lang.String ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.test.web.servlet.samples.standalone.resultmatchers.MockMvc . perform ( get ( STRING ) ) . andExpect ( cookie ( ) . doesNotExist ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.test.web.servlet.samples.standalone.resultmatchers.MockMvc . perform ( get ( STRING ) ) . andExpect ( cookie ( ) . value ( java.lang.String , STRING ) ) ; this . org.springframework.test.web.servlet.samples.standalone.resultmatchers.MockMvc . perform ( get ( STRING ) ) . andExpect ( cookie ( ) . value ( java.lang.String , equalTo ( STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.test.web.servlet.samples.standalone.resultmatchers.MockMvc . perform ( get ( STRING ) ) . andExpect ( cookie ( ) . value ( java.lang.String , startsWith ( STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.test.web.servlet.samples.standalone.resultmatchers.MockMvc . perform ( get ( STRING ) ) . andExpect ( cookie ( ) . maxAge ( java.lang.String , - NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.test.web.servlet.samples.standalone.resultmatchers.MockMvc . perform ( get ( STRING ) ) . andExpect ( cookie ( ) . domain ( java.lang.String , STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.test.web.servlet.samples.standalone.resultmatchers.MockMvc . perform ( get ( STRING ) ) . andExpect ( cookie ( ) . version ( java.lang.String , NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.test.web.servlet.samples.standalone.resultmatchers.MockMvc . perform ( get ( STRING ) ) . andExpect ( cookie ( ) . path ( java.lang.String , STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.test.web.servlet.samples.standalone.resultmatchers.MockMvc . perform ( get ( STRING ) ) . andExpect ( cookie ( ) . secure ( java.lang.String , false ) ) ; }  <METHOD_END>
<METHOD_START> @ RequestMapping ( STRING ) public java.lang.String java.lang.String ( ) { return STRING ; }  <METHOD_END>
