<METHOD_START> @ Test public void void ( ) java.lang.Exception { byte [] byte[] = STRING . byte[] ( java.nio.charset.StandardCharsets . java.nio.charset.Charset ) ; MockMultipartFile org.springframework.test.web.servlet.samples.standalone.MockMultipartFile = new MockMultipartFile ( STRING , STRING , null , byte[] ) ; byte [] byte[] = STRING . byte[] ( java.nio.charset.StandardCharsets . java.nio.charset.Charset ) ; MockMultipartFile org.springframework.test.web.servlet.samples.standalone.MockMultipartFile = new MockMultipartFile ( STRING , STRING , STRING , byte[] ) ; standaloneSetup ( new org.springframework.test.web.servlet.samples.standalone.MultipartControllerTests.MultipartController ( ) ) . build ( ) . perform ( multipart ( STRING ) . file ( org.springframework.test.web.servlet.samples.standalone.MockMultipartFile ) . file ( org.springframework.test.web.servlet.samples.standalone.MockMultipartFile ) ) . andExpect ( status ( ) . isFound ( ) ) . andExpect ( model ( ) . attribute ( STRING , byte[] ) ) . andExpect ( model ( ) . attribute ( STRING , java.util.Collections . java.util.Map<java.lang.String,java.lang.String> ( STRING , STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { byte [] byte[] = STRING . byte[] ( java.nio.charset.StandardCharsets . java.nio.charset.Charset ) ; MockPart org.springframework.test.web.servlet.samples.standalone.MockPart = new MockPart ( STRING , STRING , new java.io.ByteArrayInputStream ( byte[] ) ) ; byte [] byte[] = STRING . byte[] ( java.nio.charset.StandardCharsets . java.nio.charset.Charset ) ; MockPart org.springframework.test.web.servlet.samples.standalone.MockPart = new MockPart ( STRING , STRING , new java.io.ByteArrayInputStream ( byte[] ) ) ; org.springframework.test.web.servlet.samples.standalone.MockPart . getHeaders ( ) . setContentType ( MediaType . APPLICATION_JSON ) ; standaloneSetup ( new org.springframework.test.web.servlet.samples.standalone.MultipartControllerTests.MultipartController ( ) ) . build ( ) . perform ( multipart ( STRING ) . part ( org.springframework.test.web.servlet.samples.standalone.MockPart ) . part ( org.springframework.test.web.servlet.samples.standalone.MockPart ) ) . andExpect ( status ( ) . isFound ( ) ) . andExpect ( model ( ) . attribute ( STRING , byte[] ) ) . andExpect ( model ( ) . attribute ( STRING , java.util.Collections . java.util.Map<java.lang.String,java.lang.String> ( STRING , STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { byte [] byte[] = STRING . byte[] ( java.nio.charset.StandardCharsets . java.nio.charset.Charset ) ; MockMultipartFile org.springframework.test.web.servlet.samples.standalone.MockMultipartFile = new MockMultipartFile ( STRING , STRING , STRING , byte[] ) ; Filter org.springframework.test.web.servlet.samples.standalone.Filter = new org.springframework.test.web.servlet.samples.standalone.MultipartControllerTests.RequestWrappingFilter ( ) ; MockMvc org.springframework.test.web.servlet.samples.standalone.MockMvc = standaloneSetup ( new org.springframework.test.web.servlet.samples.standalone.MultipartControllerTests.MultipartController ( ) ) . addFilter ( org.springframework.test.web.servlet.samples.standalone.Filter ) . build ( ) ; java.util.Map<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > java.util.Map<java.lang.String,java.lang.String> = java.util.Collections . java.util.Map<java.lang.String,java.lang.String> ( STRING , STRING ) ; org.springframework.test.web.servlet.samples.standalone.MockMvc . perform ( multipart ( STRING ) . file ( org.springframework.test.web.servlet.samples.standalone.MockMultipartFile ) ) . andExpect ( model ( ) . attribute ( STRING , java.util.Map<java.lang.String,java.lang.String> ) ) ; }  <METHOD_END>
<METHOD_START> @ RequestMapping ( value = STRING , method = RequestMethod . POST ) public java.lang.String java.lang.String ( @ RequestParam MultipartFile org.springframework.test.web.servlet.samples.standalone.MultipartFile , @ RequestPart java.util.Map<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > java.util.Map<java.lang.String,java.lang.String> , Model org.springframework.test.web.servlet.samples.standalone.Model ) throws java.io.IOException { org.springframework.test.web.servlet.samples.standalone.Model . addAttribute ( STRING , java.util.Map<java.lang.String,java.lang.String> ) ; org.springframework.test.web.servlet.samples.standalone.Model . addAttribute ( STRING , org.springframework.test.web.servlet.samples.standalone.MultipartFile . getBytes ( ) ) ; return STRING ; }  <METHOD_END>
<METHOD_START> @ RequestMapping ( value = STRING , method = RequestMethod . POST ) public java.lang.String java.lang.String ( @ RequestParam Part org.springframework.test.web.servlet.samples.standalone.Part , @ RequestPart java.util.Map<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > java.util.Map<java.lang.String,java.lang.String> , Model org.springframework.test.web.servlet.samples.standalone.Model ) throws java.io.IOException { org.springframework.test.web.servlet.samples.standalone.Model . addAttribute ( STRING , java.util.Map<java.lang.String,java.lang.String> ) ; org.springframework.test.web.servlet.samples.standalone.Model . addAttribute ( STRING , org.springframework.test.web.servlet.samples.standalone.Part . getInputStream ( ) ) ; return STRING ; }  <METHOD_END>
<METHOD_START> @ RequestMapping ( value = STRING , method = RequestMethod . POST ) public java.lang.String java.lang.String ( @ RequestPart java.util.Map<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > java.util.Map<java.lang.String,java.lang.String> , Model org.springframework.test.web.servlet.samples.standalone.Model ) { org.springframework.test.web.servlet.samples.standalone.Model . addAttribute ( STRING , java.util.Map<java.lang.String,java.lang.String> ) ; return STRING ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( HttpServletRequest org.springframework.test.web.servlet.samples.standalone.HttpServletRequest , HttpServletResponse org.springframework.test.web.servlet.samples.standalone.HttpServletResponse , FilterChain org.springframework.test.web.servlet.samples.standalone.FilterChain ) throws java.io.IOException , org.springframework.test.web.servlet.samples.standalone.ServletException { org.springframework.test.web.servlet.samples.standalone.HttpServletRequest = new HttpServletRequestWrapper ( org.springframework.test.web.servlet.samples.standalone.HttpServletRequest ) ; org.springframework.test.web.servlet.samples.standalone.FilterChain . doFilter ( org.springframework.test.web.servlet.samples.standalone.HttpServletRequest , org.springframework.test.web.servlet.samples.standalone.HttpServletResponse ) ; }  <METHOD_END>
