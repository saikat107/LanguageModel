<METHOD_START> @ Before public void void ( ) java.lang.Exception { this . org.springframework.web.servlet.view.MockHttpServletRequest = new MockHttpServletRequest ( ) ; this . org.springframework.web.servlet.view.MockHttpServletRequest . setContextPath ( STRING ) ; this . org.springframework.web.servlet.view.MockHttpServletRequest . setCharacterEncoding ( WebUtils . DEFAULT_CHARACTER_ENCODING ) ; this . org.springframework.web.servlet.view.MockHttpServletRequest . setAttribute ( DispatcherServlet . OUTPUT_FLASH_MAP_ATTRIBUTE , new FlashMap ( ) ) ; this . org.springframework.web.servlet.view.MockHttpServletRequest . setAttribute ( DispatcherServlet . FLASH_MAP_MANAGER_ATTRIBUTE , new SessionFlashMapManager ( ) ) ; this . org.springframework.web.servlet.view.MockHttpServletResponse = new MockHttpServletResponse ( ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) java.lang.Exception { RedirectView org.springframework.web.servlet.view.RedirectView = new RedirectView ( ) ; org.springframework.web.servlet.view.RedirectView . afterPropertiesSet ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { RedirectView org.springframework.web.servlet.view.RedirectView = new RedirectView ( ) ; org.springframework.web.servlet.view.RedirectView . setUrl ( STRING ) ; org.springframework.web.servlet.view.RedirectView . setHttp10Compatible ( false ) ; org.springframework.web.servlet.view.RedirectView . render ( new java.util.HashMap <> ( ) , org.springframework.web.servlet.view.MockHttpServletRequest , org.springframework.web.servlet.view.MockHttpServletResponse ) ; assertEquals ( NUMBER , org.springframework.web.servlet.view.MockHttpServletResponse . getStatus ( ) ) ; assertEquals ( STRING , org.springframework.web.servlet.view.MockHttpServletResponse . getHeader ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { RedirectView org.springframework.web.servlet.view.RedirectView = new RedirectView ( ) ; org.springframework.web.servlet.view.RedirectView . setUrl ( STRING ) ; org.springframework.web.servlet.view.RedirectView . setHttp10Compatible ( false ) ; org.springframework.web.servlet.view.RedirectView . setStatusCode ( HttpStatus . MOVED_PERMANENTLY ) ; org.springframework.web.servlet.view.RedirectView . render ( new java.util.HashMap <> ( ) , org.springframework.web.servlet.view.MockHttpServletRequest , org.springframework.web.servlet.view.MockHttpServletResponse ) ; assertEquals ( NUMBER , org.springframework.web.servlet.view.MockHttpServletResponse . getStatus ( ) ) ; assertEquals ( STRING , org.springframework.web.servlet.view.MockHttpServletResponse . getHeader ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { RedirectView org.springframework.web.servlet.view.RedirectView = new RedirectView ( ) ; org.springframework.web.servlet.view.RedirectView . setUrl ( STRING ) ; org.springframework.web.servlet.view.RedirectView . setStatusCode ( HttpStatus . MOVED_PERMANENTLY ) ; org.springframework.web.servlet.view.RedirectView . render ( new java.util.HashMap <> ( ) , org.springframework.web.servlet.view.MockHttpServletRequest , org.springframework.web.servlet.view.MockHttpServletResponse ) ; assertEquals ( NUMBER , org.springframework.web.servlet.view.MockHttpServletResponse . getStatus ( ) ) ; assertEquals ( STRING , org.springframework.web.servlet.view.MockHttpServletResponse . getHeader ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { RedirectView org.springframework.web.servlet.view.RedirectView = new RedirectView ( ) ; org.springframework.web.servlet.view.RedirectView . setUrl ( STRING ) ; org.springframework.web.servlet.view.MockHttpServletRequest . setAttribute ( View . RESPONSE_STATUS_ATTRIBUTE , HttpStatus . CREATED ) ; org.springframework.web.servlet.view.RedirectView . render ( new java.util.HashMap <> ( ) , org.springframework.web.servlet.view.MockHttpServletRequest , org.springframework.web.servlet.view.MockHttpServletResponse ) ; assertEquals ( NUMBER , org.springframework.web.servlet.view.MockHttpServletResponse . getStatus ( ) ) ; assertEquals ( STRING , org.springframework.web.servlet.view.MockHttpServletResponse . getHeader ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { RedirectView org.springframework.web.servlet.view.RedirectView = new RedirectView ( ) ; org.springframework.web.servlet.view.RedirectView . setUrl ( STRING ) ; org.springframework.web.servlet.view.RedirectView . setHttp10Compatible ( false ) ; org.springframework.web.servlet.view.MockHttpServletRequest . setAttribute ( View . RESPONSE_STATUS_ATTRIBUTE , HttpStatus . CREATED ) ; org.springframework.web.servlet.view.RedirectView . render ( new java.util.HashMap <> ( ) , org.springframework.web.servlet.view.MockHttpServletRequest , org.springframework.web.servlet.view.MockHttpServletResponse ) ; assertEquals ( NUMBER , org.springframework.web.servlet.view.MockHttpServletResponse . getStatus ( ) ) ; assertEquals ( STRING , org.springframework.web.servlet.view.MockHttpServletResponse . getHeader ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) @ Test public void void ( ) java.lang.Exception { RedirectView org.springframework.web.servlet.view.RedirectView = new RedirectView ( ) ; org.springframework.web.servlet.view.RedirectView . setUrl ( STRING ) ; org.springframework.web.servlet.view.RedirectView . setHttp10Compatible ( false ) ; FlashMap org.springframework.web.servlet.view.FlashMap = new FlashMap ( ) ; org.springframework.web.servlet.view.FlashMap . put ( STRING , STRING ) ; org.springframework.web.servlet.view.MockHttpServletRequest . setAttribute ( DispatcherServlet . OUTPUT_FLASH_MAP_ATTRIBUTE , org.springframework.web.servlet.view.FlashMap ) ; ModelMap org.springframework.web.servlet.view.ModelMap = new ModelMap ( STRING , STRING ) ; org.springframework.web.servlet.view.RedirectView . render ( org.springframework.web.servlet.view.ModelMap , org.springframework.web.servlet.view.MockHttpServletRequest , org.springframework.web.servlet.view.MockHttpServletResponse ) ; assertEquals ( NUMBER , org.springframework.web.servlet.view.MockHttpServletResponse . getStatus ( ) ) ; assertEquals ( STRING , org.springframework.web.servlet.view.MockHttpServletResponse . getHeader ( STRING ) ) ; assertEquals ( STRING , org.springframework.web.servlet.view.FlashMap . getTargetRequestPath ( ) ) ; assertEquals ( org.springframework.web.servlet.view.ModelMap , org.springframework.web.servlet.view.FlashMap . getTargetRequestParams ( ) . toSingleValueMap ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { StaticWebApplicationContext org.springframework.web.servlet.view.StaticWebApplicationContext = new StaticWebApplicationContext ( ) ; org.springframework.web.servlet.view.StaticWebApplicationContext . registerSingleton ( STRING , RequestDataValueProcessorWrapper .class ) ; org.springframework.web.servlet.view.StaticWebApplicationContext . setServletContext ( new MockServletContext ( ) ) ; org.springframework.web.servlet.view.StaticWebApplicationContext . refresh ( ) ; RequestDataValueProcessor org.springframework.web.servlet.view.RequestDataValueProcessor = mock ( RequestDataValueProcessor .class ) ; org.springframework.web.servlet.view.StaticWebApplicationContext . getBean ( RequestDataValueProcessorWrapper .class ) . setRequestDataValueProcessor ( org.springframework.web.servlet.view.RequestDataValueProcessor ) ; RedirectView org.springframework.web.servlet.view.RedirectView = new RedirectView ( ) ; org.springframework.web.servlet.view.RedirectView . setApplicationContext ( org.springframework.web.servlet.view.StaticWebApplicationContext ) ; org.springframework.web.servlet.view.RedirectView . setUrl ( STRING ) ; org.springframework.web.servlet.view.MockHttpServletRequest . setAttribute ( DispatcherServlet . WEB_APPLICATION_CONTEXT_ATTRIBUTE , org.springframework.web.servlet.view.StaticWebApplicationContext ) ; given ( org.springframework.web.servlet.view.RequestDataValueProcessor . processUrl ( org.springframework.web.servlet.view.MockHttpServletRequest , STRING ) ) . willReturn ( STRING ) ; org.springframework.web.servlet.view.RedirectView . render ( new ModelMap ( ) , org.springframework.web.servlet.view.MockHttpServletRequest , org.springframework.web.servlet.view.MockHttpServletResponse ) ; verify ( org.springframework.web.servlet.view.RequestDataValueProcessor ) . processUrl ( org.springframework.web.servlet.view.MockHttpServletRequest , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { StaticWebApplicationContext org.springframework.web.servlet.view.StaticWebApplicationContext = new StaticWebApplicationContext ( ) ; org.springframework.web.servlet.view.StaticWebApplicationContext . registerSingleton ( STRING , RequestDataValueProcessorWrapper .class ) ; MockServletContext org.springframework.web.servlet.view.MockServletContext = new MockServletContext ( ) ; ContextLoader org.springframework.web.servlet.view.ContextLoader = new ContextLoader ( org.springframework.web.servlet.view.StaticWebApplicationContext ) ; org.springframework.web.servlet.view.ContextLoader . initWebApplicationContext ( org.springframework.web.servlet.view.MockServletContext ) ; try { RequestDataValueProcessor org.springframework.web.servlet.view.RequestDataValueProcessor = mock ( RequestDataValueProcessor .class ) ; org.springframework.web.servlet.view.StaticWebApplicationContext . getBean ( RequestDataValueProcessorWrapper .class ) . setRequestDataValueProcessor ( org.springframework.web.servlet.view.RequestDataValueProcessor ) ; RedirectView org.springframework.web.servlet.view.RedirectView = new RedirectView ( ) ; org.springframework.web.servlet.view.RedirectView . setUrl ( STRING ) ; given ( org.springframework.web.servlet.view.RequestDataValueProcessor . processUrl ( org.springframework.web.servlet.view.MockHttpServletRequest , STRING ) ) . willReturn ( STRING ) ; org.springframework.web.servlet.view.RedirectView . render ( new ModelMap ( ) , org.springframework.web.servlet.view.MockHttpServletRequest , org.springframework.web.servlet.view.MockHttpServletResponse ) ; verify ( org.springframework.web.servlet.view.RequestDataValueProcessor ) . processUrl ( org.springframework.web.servlet.view.MockHttpServletRequest , STRING ) ; } finally { org.springframework.web.servlet.view.ContextLoader . closeWebApplicationContext ( org.springframework.web.servlet.view.MockServletContext ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { RedirectView org.springframework.web.servlet.view.RedirectView = new RedirectView ( ) ; assertFalse ( org.springframework.web.servlet.view.RedirectView . isRemoteHost ( STRING ) ) ; assertFalse ( org.springframework.web.servlet.view.RedirectView . isRemoteHost ( STRING ) ) ; assertFalse ( org.springframework.web.servlet.view.RedirectView . isRemoteHost ( STRING ) ) ; org.springframework.web.servlet.view.RedirectView . setHosts ( new java.lang.String [] { STRING } ) ; assertFalse ( org.springframework.web.servlet.view.RedirectView . isRemoteHost ( STRING ) ) ; assertFalse ( org.springframework.web.servlet.view.RedirectView . isRemoteHost ( STRING ) ) ; assertTrue ( org.springframework.web.servlet.view.RedirectView . isRemoteHost ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.String java.lang.String = STRING ; void ( new java.util.HashMap<java.lang.String,java.lang.Object> <> ( ) , java.lang.String , false , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.String java.lang.String = STRING ; void ( new java.util.HashMap<java.lang.String,java.lang.Object> <> ( ) , java.lang.String , true , STRING + java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.String java.lang.String = STRING ; java.lang.String java.lang.String = STRING ; java.lang.String java.lang.String = STRING ; java.util.Map<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > java.util.Map<java.lang.String,java.lang.String> = new java.util.HashMap<java.lang.String,java.lang.String> <> ( ) ; java.util.Map<java.lang.String,java.lang.String> . java.lang.String ( java.lang.String , java.lang.String ) ; java.lang.String java.lang.String = java.lang.String + STRING + java.lang.String + STRING + java.lang.String ; void ( java.util.Map<java.lang.String,java.lang.String> , java.lang.String , false , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.String java.lang.String = STRING ; java.util.Map<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > java.util.Map<java.lang.String,java.lang.String> = java.util.Collections . java.util.Map<java.lang.String,java.lang.String> ( STRING , STRING ) ; org.springframework.web.servlet.view.RedirectViewTests.TestRedirectView org.springframework.web.servlet.view.RedirectViewTests.TestRedirectView = new org.springframework.web.servlet.view.RedirectViewTests.TestRedirectView ( java.lang.String , false , java.util.Map<java.lang.String,java.lang.String> ) ; org.springframework.web.servlet.view.RedirectViewTests.TestRedirectView . setExposeModelAttributes ( false ) ; org.springframework.web.servlet.view.RedirectViewTests.TestRedirectView . render ( java.util.Map<java.lang.String,java.lang.String> , org.springframework.web.servlet.view.MockHttpServletRequest , org.springframework.web.servlet.view.MockHttpServletResponse ) ; assertEquals ( java.lang.String , this . org.springframework.web.servlet.view.MockHttpServletResponse . getRedirectedUrl ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.String java.lang.String = STRING ; java.lang.String java.lang.String = STRING ; java.lang.String java.lang.String = STRING ; java.util.Map<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > java.util.Map<java.lang.String,java.lang.String> = new java.util.HashMap<java.lang.String,java.lang.String> <> ( ) ; java.util.Map<java.lang.String,java.lang.String> . java.lang.String ( java.lang.String , java.lang.String ) ; java.lang.String java.lang.String = STRING + STRING + java.lang.String + STRING + java.lang.String + STRING ; void ( java.util.Map<java.lang.String,java.lang.String> , java.lang.String , false , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.String java.lang.String = STRING ; void ( new java.util.HashMap<java.lang.String,java.lang.Object> <> ( ) , java.lang.String , true , STRING + java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.String java.lang.String = STRING ; java.lang.String java.lang.String = STRING ; java.lang.String java.lang.String = STRING ; java.lang.String java.lang.String = STRING ; java.lang.String java.lang.String = STRING ; java.util.Map<java.lang.String,java.lang.String> < java.lang.String , java.lang.String > java.util.Map<java.lang.String,java.lang.String> = new java.util.HashMap<java.lang.String,java.lang.String> <> ( ) ; java.util.Map<java.lang.String,java.lang.String> . java.lang.String ( java.lang.String , java.lang.String ) ; java.util.Map<java.lang.String,java.lang.String> . java.lang.String ( java.lang.String , java.lang.String ) ; try { java.lang.String java.lang.String = java.lang.String + STRING + java.lang.String + STRING + java.lang.String + STRING + java.lang.String + STRING + java.lang.String ; void ( java.util.Map<java.lang.String,java.lang.String> , java.lang.String , false , java.lang.String ) ; } catch ( java.lang.AssertionError java.lang.AssertionError ) { java.lang.String java.lang.String = java.lang.String + STRING + java.lang.String + STRING + java.lang.String + STRING + java.lang.String + STRING + java.lang.String ; void ( java.util.Map<java.lang.String,java.lang.String> , java.lang.String , false , java.lang.String ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.String java.lang.String = STRING ; java.lang.String java.lang.String = STRING ; java.lang.String [] java.lang.String[] = new java.lang.String [] { STRING , STRING } ; java.util.Map<java.lang.String,java.lang.String[]> < java.lang.String , java.lang.String [] > java.util.Map<java.lang.String,java.lang.String[]> = new java.util.HashMap<java.lang.String,java.lang.String[]> <> ( ) ; java.util.Map<java.lang.String,java.lang.String[]> . java.lang.String[] ( java.lang.String , java.lang.String[] ) ; try { java.lang.String java.lang.String = java.lang.String + STRING + java.lang.String + STRING + java.lang.String[] [ NUMBER ] + STRING + java.lang.String + STRING + java.lang.String[] [ NUMBER ] ; void ( java.util.Map<java.lang.String,java.lang.String[]> , java.lang.String , false , java.lang.String ) ; } catch ( java.lang.AssertionError java.lang.AssertionError ) { java.lang.String java.lang.String = java.lang.String + STRING + java.lang.String + STRING + java.lang.String[] [ NUMBER ] + STRING + java.lang.String + STRING + java.lang.String[] [ NUMBER ] ; void ( java.util.Map<java.lang.String,java.lang.String[]> , java.lang.String , false , java.lang.String ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.String java.lang.String = STRING ; java.lang.String java.lang.String = STRING ; java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> = new java.util.ArrayList<java.lang.String> <> ( ) ; java.util.List<java.lang.String> . boolean ( STRING ) ; java.util.List<java.lang.String> . boolean ( STRING ) ; java.util.Map<java.lang.String,java.util.List<java.lang.String>> < java.lang.String , java.util.List<java.lang.String> < java.lang.String > > java.util.Map<java.lang.String,java.util.List<java.lang.String>> = new java.util.HashMap<java.lang.String,java.util.List<java.lang.String>> <> ( ) ; java.util.Map<java.lang.String,java.util.List<java.lang.String>> . java.util.List<java.lang.String> ( java.lang.String , java.util.List<java.lang.String> ) ; try { java.lang.String java.lang.String = java.lang.String + STRING + java.lang.String + STRING + java.util.List<java.lang.String> . java.lang.String ( NUMBER ) + STRING + java.lang.String + STRING + java.util.List<java.lang.String> . java.lang.String ( NUMBER ) ; void ( java.util.Map<java.lang.String,java.util.List<java.lang.String>> , java.lang.String , false , java.lang.String ) ; } catch ( java.lang.AssertionError java.lang.AssertionError ) { java.lang.String java.lang.String = java.lang.String + STRING + java.lang.String + STRING + java.util.List<java.lang.String> . java.lang.String ( NUMBER ) + STRING + java.lang.String + STRING + java.util.List<java.lang.String> . java.lang.String ( NUMBER ) ; void ( java.util.Map<java.lang.String,java.util.List<java.lang.String>> , java.lang.String , false , java.lang.String ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.String java.lang.String = STRING ; java.lang.String java.lang.String = STRING ; java.lang.String java.lang.String = STRING ; java.lang.String java.lang.String = STRING ; java.lang.Object java.lang.Object = NUMBER ; java.lang.String java.lang.String = STRING ; java.lang.Object java.lang.Object = new TestBean ( ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = new java.util.LinkedHashMap<java.lang.String,java.lang.Object> <> ( ) ; java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( java.lang.String , java.lang.String ) ; java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( java.lang.String , java.lang.Object ) ; java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( java.lang.String , java.lang.Object ) ; java.lang.String java.lang.String = java.lang.String + STRING + java.lang.String + STRING + java.lang.String + STRING + java.lang.String + STRING + java.lang.Object ; void ( java.util.Map<java.lang.String,java.lang.Object> , java.lang.String , false , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { RedirectView org.springframework.web.servlet.view.RedirectView = new RedirectView ( ) ; org.springframework.web.servlet.view.RedirectView . setPropagateQueryParams ( true ) ; org.springframework.web.servlet.view.RedirectView . setUrl ( STRING ) ; org.springframework.web.servlet.view.MockHttpServletRequest . setQueryString ( STRING ) ; org.springframework.web.servlet.view.RedirectView . render ( new java.util.HashMap <> ( ) , org.springframework.web.servlet.view.MockHttpServletRequest , org.springframework.web.servlet.view.MockHttpServletResponse ) ; assertEquals ( NUMBER , org.springframework.web.servlet.view.MockHttpServletResponse . getStatus ( ) ) ; assertEquals ( STRING , org.springframework.web.servlet.view.MockHttpServletResponse . getHeader ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.util.Map<java.lang.String,?> < java.lang.String , ? > java.util.Map<java.lang.String,?> , java.lang.String java.lang.String , boolean boolean , java.lang.String java.lang.String )			throws java.lang.Exception { org.springframework.web.servlet.view.RedirectViewTests.TestRedirectView org.springframework.web.servlet.view.RedirectViewTests.TestRedirectView = new org.springframework.web.servlet.view.RedirectViewTests.TestRedirectView ( java.lang.String , boolean , java.util.Map<java.lang.String,> ) ; org.springframework.web.servlet.view.RedirectViewTests.TestRedirectView . render ( java.util.Map<java.lang.String,> , org.springframework.web.servlet.view.MockHttpServletRequest , org.springframework.web.servlet.view.MockHttpServletResponse ) ; assertTrue ( STRING , org.springframework.web.servlet.view.RedirectViewTests.TestRedirectView . boolean ) ; assertEquals ( java.lang.String , this . org.springframework.web.servlet.view.MockHttpServletResponse . getRedirectedUrl ( ) ) ; }  <METHOD_END>
<METHOD_START> public void ( java.lang.String java.lang.String , boolean boolean , java.util.Map<java.lang.String,?> < java.lang.String , ? > java.util.Map<java.lang.String,?> ) { super( java.lang.String , boolean ); this . java.util.Map<java.lang.String,?> = java.util.Map<java.lang.String,> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ( java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ) { assertTrue ( STRING , this . java.util.Map<java.lang.String,> . boolean ( java.util.Map<java.lang.String,java.lang.Object> ) ) ; this . boolean = true ; return super. queryProperties ( java.util.Map<java.lang.String,java.lang.Object> ) ; }  <METHOD_END>