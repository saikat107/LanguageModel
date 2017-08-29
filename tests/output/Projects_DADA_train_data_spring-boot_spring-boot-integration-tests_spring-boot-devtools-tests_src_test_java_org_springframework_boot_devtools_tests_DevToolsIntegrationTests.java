<METHOD_START> @ Parameters ( name = STRING ) public static java.lang.Object [] java.lang.Object[] ( ) { return new java.lang.Object [] { new java.lang.Object [] { new LocalApplicationLauncher ( ) } , new java.lang.Object [] { new ExplodedRemoteApplicationLauncher ( ) } , new java.lang.Object [] { new JarFileRemoteApplicationLauncher ( ) } } ; }  <METHOD_END>
<METHOD_START> public void ( ApplicationLauncher org.springframework.boot.devtools.tests.ApplicationLauncher ) { this . org.springframework.boot.devtools.tests.ApplicationLauncher = org.springframework.boot.devtools.tests.ApplicationLauncher ; }  <METHOD_END>
<METHOD_START> @ Before public void void ( ) java.lang.Exception { this . java.io.File . boolean ( ) ; this . org.springframework.boot.devtools.tests.LaunchedApplication = this . org.springframework.boot.devtools.tests.ApplicationLauncher . launchApplication ( this . org.springframework.boot.devtools.tests.JvmLauncher ) ; }  <METHOD_END>
<METHOD_START> @ After public void void ( ) { this . org.springframework.boot.devtools.tests.LaunchedApplication . stop ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { TestRestTemplate org.springframework.boot.devtools.tests.TestRestTemplate = new TestRestTemplate ( ) ; java.lang.String java.lang.String = STRING + int ( ) ; assertThat ( org.springframework.boot.devtools.tests.TestRestTemplate . getForObject ( java.lang.String + STRING , java.lang.String .class ) ) . isEqualTo ( STRING ) ; assertThat ( org.springframework.boot.devtools.tests.TestRestTemplate . getForEntity ( java.lang.String + STRING , java.lang.String .class ) . getStatusCode ( ) ) . isEqualTo ( HttpStatus . NOT_FOUND ) ; org.springframework.boot.devtools.tests.DevToolsIntegrationTests.ControllerBuilder ( STRING ) . org.springframework.boot.devtools.tests.DevToolsIntegrationTests.ControllerBuilder ( STRING ) . org.springframework.boot.devtools.tests.DevToolsIntegrationTests.ControllerBuilder ( STRING ) . void ( ) ; assertThat ( org.springframework.boot.devtools.tests.TestRestTemplate . getForObject ( java.lang.String + STRING , java.lang.String .class ) ) . isEqualTo ( STRING ) ; assertThat ( org.springframework.boot.devtools.tests.TestRestTemplate . getForObject ( STRING + int ( ) + STRING , java.lang.String .class ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { TestRestTemplate org.springframework.boot.devtools.tests.TestRestTemplate = new TestRestTemplate ( ) ; assertThat ( org.springframework.boot.devtools.tests.TestRestTemplate . getForObject ( STRING + int ( ) + STRING , java.lang.String .class ) ) . isEqualTo ( STRING ) ; org.springframework.boot.devtools.tests.DevToolsIntegrationTests.ControllerBuilder ( STRING ) . void ( ) ; assertThat ( org.springframework.boot.devtools.tests.TestRestTemplate . getForEntity ( STRING + int ( ) + STRING , java.lang.String .class ) . getStatusCode ( ) ) . isEqualTo ( HttpStatus . NOT_FOUND ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { TestRestTemplate org.springframework.boot.devtools.tests.TestRestTemplate = new TestRestTemplate ( ) ; java.lang.String java.lang.String = STRING + int ( ) ; assertThat ( org.springframework.boot.devtools.tests.TestRestTemplate . getForObject ( java.lang.String + STRING , java.lang.String .class ) ) . isEqualTo ( STRING ) ; assertThat ( org.springframework.boot.devtools.tests.TestRestTemplate . getForEntity ( java.lang.String + STRING , java.lang.String .class ) . getStatusCode ( ) ) . isEqualTo ( HttpStatus . NOT_FOUND ) ; org.springframework.boot.devtools.tests.DevToolsIntegrationTests.ControllerBuilder ( STRING ) . org.springframework.boot.devtools.tests.DevToolsIntegrationTests.ControllerBuilder ( STRING ) . void ( ) ; assertThat ( org.springframework.boot.devtools.tests.TestRestTemplate . getForObject ( java.lang.String + STRING , java.lang.String .class ) ) . isEqualTo ( STRING ) ; assertThat ( org.springframework.boot.devtools.tests.TestRestTemplate . getForObject ( STRING + int ( ) + STRING , java.lang.String .class ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { TestRestTemplate org.springframework.boot.devtools.tests.TestRestTemplate = new TestRestTemplate ( ) ; assertThat ( org.springframework.boot.devtools.tests.TestRestTemplate . getForObject ( STRING + int ( ) + STRING , java.lang.String .class ) ) . isEqualTo ( STRING ) ; assertThat ( new java.io.File ( this . org.springframework.boot.devtools.tests.LaunchedApplication . getClassesDirectory ( ) , STRING ) . boolean ( ) ) . isTrue ( ) ; assertThat ( org.springframework.boot.devtools.tests.TestRestTemplate . getForEntity ( STRING + int ( ) + STRING , java.lang.String .class ) . getStatusCode ( ) ) . isEqualTo ( HttpStatus . NOT_FOUND ) ; }  <METHOD_END>
<METHOD_START> private int int ( ) java.lang.Exception { long long = java.lang.System . long ( ) + NUMBER ; while ( this . java.io.File . long ( ) == NUMBER ) { if ( java.lang.System . long ( ) > long ) { throw new java.lang.IllegalStateException ( java.lang.String . java.lang.String ( STRING + STRING , FileCopyUtils . copyToString ( new java.io.FileReader ( this . org.springframework.boot.devtools.tests.LaunchedApplication . getStandardOut ( ) ) ) ) ) ; } java.lang.Thread . void ( NUMBER ) ; } java.io.FileReader java.io.FileReader = new java.io.FileReader ( this . java.io.File ) ; int int = java.lang.Integer . java.lang.Integer ( FileCopyUtils . copyToString ( java.io.FileReader ) ) ; this . java.io.File . boolean ( ) ; return int ; }  <METHOD_END>
<METHOD_START> private org.springframework.boot.devtools.tests.DevToolsIntegrationTests.ControllerBuilder org.springframework.boot.devtools.tests.DevToolsIntegrationTests.ControllerBuilder ( java.lang.String java.lang.String ) { return new org.springframework.boot.devtools.tests.DevToolsIntegrationTests.ControllerBuilder ( java.lang.String , this . org.springframework.boot.devtools.tests.LaunchedApplication . getClassesDirectory ( ) ) ; }  <METHOD_END>
<METHOD_START> private void ( java.lang.String java.lang.String , java.io.File java.io.File ) { this . java.lang.String = java.lang.String ; this . java.io.File = java.io.File ; }  <METHOD_END>
<METHOD_START> public org.springframework.boot.devtools.tests.DevToolsIntegrationTests.ControllerBuilder org.springframework.boot.devtools.tests.DevToolsIntegrationTests.ControllerBuilder ( java.lang.String java.lang.String ) { this . java.util.List<java.lang.String> . boolean ( java.lang.String ) ; return this ; }  <METHOD_END>
<METHOD_START> public void void ( ) java.lang.Exception { Builder < java.lang.Object > org.springframework.boot.devtools.tests.Builder<java.lang.Object> = new ByteBuddy ( ) . subclass ( java.lang.Object .class ) . name ( this . java.lang.String ) . annotateType ( AnnotationDescription . Builder . ofType ( RestController .class ) . build ( ) ) ; for ( java.lang.String java.lang.String : this . java.util.List<java.lang.String> ) { org.springframework.boot.devtools.tests.Builder<java.lang.Object> = org.springframework.boot.devtools.tests.Builder<java.lang.Object> . defineMethod ( java.lang.String , java.lang.String .class , Visibility . PUBLIC ) . intercept ( FixedValue . value ( java.lang.String ) ) . annotateMethod ( AnnotationDescription . Builder . ofType ( RequestMapping .class ) . defineArray ( STRING , java.lang.String ) . build ( ) ) ; } org.springframework.boot.devtools.tests.Builder<java.lang.Object> . make ( ) . saveIn ( this . java.io.File ) ; }  <METHOD_END>