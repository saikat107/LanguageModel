<METHOD_START> @ After public void void ( ) { if ( this . org.springframework.boot.autoconfigure.web.servlet.error.ConfigurableApplicationContext != null ) { this . org.springframework.boot.autoconfigure.web.servlet.error.ConfigurableApplicationContext . close ( ) ; } }  <METHOD_END>
<METHOD_START> @ BeforeClass @ AfterClass public static void void ( ) { ReflectionTestUtils . setField ( TomcatURLStreamHandlerFactory .class , STRING , null ) ; ReflectionTestUtils . setField ( java.net.URL .class , STRING , null ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.lang.Exception { void ( ) ; ResponseEntity < java.util.Map > org.springframework.boot.autoconfigure.web.servlet.error.ResponseEntity<java.util.Map> = new TestRestTemplate ( ) . getForEntity ( java.lang.String ( STRING ) , java.util.Map .class ) ; void ( org.springframework.boot.autoconfigure.web.servlet.error.ResponseEntity<java.util.Map> . getBody ( ) , STRING , STRING , java.lang.IllegalStateException .class , STRING , STRING ) ; assertThat ( org.springframework.boot.autoconfigure.web.servlet.error.ResponseEntity<java.util.Map> . getBody ( ) . containsKey ( STRING ) ) . isFalse ( ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.lang.Exception { void ( STRING ) ; ResponseEntity < java.util.Map > org.springframework.boot.autoconfigure.web.servlet.error.ResponseEntity<java.util.Map> = new TestRestTemplate ( ) . getForEntity ( java.lang.String ( STRING ) , java.util.Map .class ) ; void ( org.springframework.boot.autoconfigure.web.servlet.error.ResponseEntity<java.util.Map> . getBody ( ) , STRING , STRING , java.lang.IllegalStateException .class , STRING , STRING ) ; assertThat ( org.springframework.boot.autoconfigure.web.servlet.error.ResponseEntity<java.util.Map> . getBody ( ) . containsKey ( STRING ) ) . isTrue ( ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.lang.Exception { void ( STRING ) ; ResponseEntity < java.util.Map > org.springframework.boot.autoconfigure.web.servlet.error.ResponseEntity<java.util.Map> = new TestRestTemplate ( ) . getForEntity ( java.lang.String ( STRING ) , java.util.Map .class ) ; void ( org.springframework.boot.autoconfigure.web.servlet.error.ResponseEntity<java.util.Map> . getBody ( ) , STRING , STRING , java.lang.IllegalStateException .class , STRING , STRING ) ; assertThat ( org.springframework.boot.autoconfigure.web.servlet.error.ResponseEntity<java.util.Map> . getBody ( ) . containsKey ( STRING ) ) . isFalse ( ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.lang.Exception { void ( STRING ) ; ResponseEntity < java.util.Map > org.springframework.boot.autoconfigure.web.servlet.error.ResponseEntity<java.util.Map> = new TestRestTemplate ( ) . getForEntity ( java.lang.String ( STRING ) , java.util.Map .class ) ; void ( org.springframework.boot.autoconfigure.web.servlet.error.ResponseEntity<java.util.Map> . getBody ( ) , STRING , STRING , java.lang.IllegalStateException .class , STRING , STRING ) ; assertThat ( org.springframework.boot.autoconfigure.web.servlet.error.ResponseEntity<java.util.Map> . getBody ( ) . containsKey ( STRING ) ) . isTrue ( ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.lang.Exception { void ( ) ; ResponseEntity < java.util.Map > org.springframework.boot.autoconfigure.web.servlet.error.ResponseEntity<java.util.Map> = new TestRestTemplate ( ) . getForEntity ( java.lang.String ( STRING ) , java.util.Map .class ) ; void ( org.springframework.boot.autoconfigure.web.servlet.error.ResponseEntity<java.util.Map> . getBody ( ) , STRING , STRING , org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorControllerIntegrationTests.TestConfiguration . org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorControllerIntegrationTests.TestConfiguration.Errors . org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorControllerIntegrationTests.TestConfiguration.Errors.ExpectedException .class , STRING , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.lang.Exception { void ( ) ; ResponseEntity < java.util.Map > org.springframework.boot.autoconfigure.web.servlet.error.ResponseEntity<java.util.Map> = new TestRestTemplate ( ) . getForEntity ( java.lang.String ( STRING ) , java.util.Map .class ) ; void ( org.springframework.boot.autoconfigure.web.servlet.error.ResponseEntity<java.util.Map> . getBody ( ) , STRING , STRING , org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorControllerIntegrationTests.TestConfiguration . org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorControllerIntegrationTests.TestConfiguration.Errors . org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorControllerIntegrationTests.TestConfiguration.Errors.NoReasonExpectedException .class , STRING , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.lang.Exception { void ( ) ; RequestEntity org.springframework.boot.autoconfigure.web.servlet.error.RequestEntity = RequestEntity . get ( java.net.URI . java.net.URI ( java.lang.String ( STRING ) ) ) . accept ( MediaType . APPLICATION_JSON ) . build ( ) ; ResponseEntity < java.util.Map > org.springframework.boot.autoconfigure.web.servlet.error.ResponseEntity<java.util.Map> = new TestRestTemplate ( ) . exchange ( org.springframework.boot.autoconfigure.web.servlet.error.RequestEntity , java.util.Map .class ) ; java.lang.String java.lang.String = org.springframework.boot.autoconfigure.web.servlet.error.ResponseEntity<java.util.Map> . getBody ( ) . toString ( ) ; assertThat ( java.lang.String ) . contains ( STRING ) ; assertThat ( java.lang.String ) . contains ( STRING ) ; assertThat ( java.lang.String ) . contains ( STRING ) ; assertThat ( java.lang.String ) . contains ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.lang.Exception { void ( ) ; RequestEntity org.springframework.boot.autoconfigure.web.servlet.error.RequestEntity = RequestEntity . post ( java.net.URI . java.net.URI ( java.lang.String ( STRING ) ) ) . contentType ( MediaType . APPLICATION_JSON ) . body ( STRING ) ; ResponseEntity < java.util.Map > org.springframework.boot.autoconfigure.web.servlet.error.ResponseEntity<java.util.Map> = new TestRestTemplate ( ) . exchange ( org.springframework.boot.autoconfigure.web.servlet.error.RequestEntity , java.util.Map .class ) ; java.lang.String java.lang.String = org.springframework.boot.autoconfigure.web.servlet.error.ResponseEntity<java.util.Map> . getBody ( ) . toString ( ) ; assertThat ( java.lang.String ) . contains ( STRING ) ; assertThat ( java.lang.String ) . contains ( STRING ) ; assertThat ( java.lang.String ) . contains ( STRING ) ; assertThat ( java.lang.String ) . contains ( MethodArgumentNotValidException .class . java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( ) ; RequestEntity < ? > org.springframework.boot.autoconfigure.web.servlet.error.RequestEntity<?> = RequestEntity . get ( java.net.URI . java.net.URI ( java.lang.String ( STRING ) ) ) . accept ( MediaType . TEXT_HTML ) . build ( ) ; ResponseEntity < java.lang.String > org.springframework.boot.autoconfigure.web.servlet.error.ResponseEntity<java.lang.String> = new TestRestTemplate ( ) . exchange ( org.springframework.boot.autoconfigure.web.servlet.error.RequestEntity<> , java.lang.String .class ) ; java.lang.String java.lang.String = org.springframework.boot.autoconfigure.web.servlet.error.ResponseEntity<java.lang.String> . getBody ( ) ; assertThat ( java.lang.String ) . contains ( STRING ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.util.Map<?,?> < ? , ? > java.util.Map<?,?> , java.lang.String java.lang.String , java.lang.String java.lang.String , java.lang.Class<?> < ? > java.lang.Class<?> , java.lang.String java.lang.String , java.lang.String java.lang.String ) { assertThat ( java.util.Map<,> . get ( STRING ) ) . as ( STRING ) . isEqualTo ( java.lang.String ) ; assertThat ( java.util.Map<,> . get ( STRING ) ) . as ( STRING ) . isEqualTo ( java.lang.String ) ; assertThat ( java.util.Map<,> . get ( STRING ) ) . as ( STRING ) . isEqualTo ( java.lang.Class<> . java.lang.String ( ) ) ; assertThat ( java.util.Map<,> . get ( STRING ) ) . as ( STRING ) . isEqualTo ( java.lang.String ) ; assertThat ( java.util.Map<,> . get ( STRING ) ) . as ( STRING ) . isEqualTo ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> private java.lang.String java.lang.String ( java.lang.String java.lang.String ) { int int = this . org.springframework.boot.autoconfigure.web.servlet.error.ConfigurableApplicationContext . getEnvironment ( ) . getProperty ( STRING , int .class ) ; return STRING + int + java.lang.String ; }  <METHOD_END>
<METHOD_START> private void void ( java.lang.String ... java.lang.String[] ) { java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> = new java.util.ArrayList<java.lang.String> <> ( ) ; java.util.List<java.lang.String> . boolean ( STRING ) ; if ( java.lang.String[] != null ) { java.util.List<java.lang.String> . boolean ( java.util.Arrays . java.util.List<java.lang.String> ( java.lang.String[] ) ) ; } this . org.springframework.boot.autoconfigure.web.servlet.error.ConfigurableApplicationContext = SpringApplication . run ( org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorControllerIntegrationTests.TestConfiguration .class , java.util.List<java.lang.String> . java.lang.String[] ( new java.lang.String [ java.util.List<java.lang.String> . int ( ) ] ) ) ; }  <METHOD_END>
<METHOD_START> public static void void ( java.lang.String [] java.lang.String[] ) { SpringApplication . run ( org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorControllerIntegrationTests.TestConfiguration .class , java.lang.String[] ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.boot.autoconfigure.web.servlet.error.View org.springframework.boot.autoconfigure.web.servlet.error.View ( ) { return new AbstractView ( ) { @ java.lang.Override protected void void ( java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> , HttpServletRequest org.springframework.boot.autoconfigure.web.servlet.error.HttpServletRequest , HttpServletResponse org.springframework.boot.autoconfigure.web.servlet.error.HttpServletResponse )								throws java.lang.Exception { org.springframework.boot.autoconfigure.web.servlet.error.HttpServletResponse . getWriter ( ) . write ( STRING ) ; } } ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> , HttpServletRequest org.springframework.boot.autoconfigure.web.servlet.error.HttpServletRequest , HttpServletResponse org.springframework.boot.autoconfigure.web.servlet.error.HttpServletResponse )								throws java.lang.Exception { org.springframework.boot.autoconfigure.web.servlet.error.HttpServletResponse . getWriter ( ) . write ( STRING ) ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return STRING ; }  <METHOD_END>
<METHOD_START> @ RequestMapping ( STRING ) public java.lang.String java.lang.String ( ) { throw new java.lang.IllegalStateException ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ RequestMapping ( STRING ) public java.lang.String java.lang.String ( ) { throw new org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorControllerIntegrationTests.TestConfiguration.Errors.ExpectedException ( ) ; }  <METHOD_END>
<METHOD_START> @ RequestMapping ( STRING ) public java.lang.String java.lang.String ( ) { throw new org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorControllerIntegrationTests.TestConfiguration.Errors.NoReasonExpectedException ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ RequestMapping ( STRING ) public java.lang.String java.lang.String ( ) java.lang.Exception { BindException org.springframework.boot.autoconfigure.web.servlet.error.BindException = new BindException ( this , STRING ) ; org.springframework.boot.autoconfigure.web.servlet.error.BindException . rejectValue ( STRING , STRING ) ; throw org.springframework.boot.autoconfigure.web.servlet.error.BindException ; }  <METHOD_END>
<METHOD_START> @ PostMapping ( path = STRING , produces = STRING ) public java.lang.String java.lang.String ( @ Valid @ RequestBody org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorControllerIntegrationTests.TestConfiguration.Errors.DummyBody org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorControllerIntegrationTests.TestConfiguration.Errors.DummyBody ) { return org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorControllerIntegrationTests.TestConfiguration.Errors.DummyBody . java.lang.String ; }  <METHOD_END>
<METHOD_START> @ RequestMapping ( path = STRING ) public java.lang.String java.lang.String ( ) { throw new org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorControllerIntegrationTests.TestConfiguration.Errors.InsufficientStorageException ( ) ; }  <METHOD_END>
<METHOD_START> void ( java.lang.String java.lang.String ) { super( java.lang.String ); }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>