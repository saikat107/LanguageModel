<METHOD_START> public void ( ) {	}  <METHOD_END>
<METHOD_START> public void ( java.lang.String java.lang.String ) { super( java.lang.String ); }  <METHOD_END>
<METHOD_START> public void void ( javax.script.ScriptEngine javax.script.ScriptEngine ) { Assert . isInstanceOf ( javax.script.Invocable .class , javax.script.ScriptEngine , STRING ) ; this . javax.script.ScriptEngine = javax.script.ScriptEngine ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( java.util.Locale java.util.Locale ) { this . java.util.Locale = java.util.Locale ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.Boolean java.lang.Boolean ) { this . java.lang.Boolean = java.lang.Boolean ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String ... java.lang.String[] ) { this . java.lang.String[] = java.lang.String[] ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { java.lang.String [] java.lang.String[] = StringUtils . commaDelimitedListToStringArray ( java.lang.String ) ; this . java.lang.String[] = new java.lang.String [ java.lang.String[] . int + NUMBER ] ; this . java.lang.String[] [ NUMBER ] = STRING ; for ( int int = NUMBER ; int < java.lang.String[] . int ; int ++ ) { java.lang.String java.lang.String = java.lang.String[] [ int ] ; if ( ! java.lang.String . boolean ( STRING ) && ! java.lang.String . boolean ( STRING ) ) { java.lang.String = java.lang.String + STRING ; } this . java.lang.String[] [ int + NUMBER ] = java.lang.String ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ApplicationContext org.springframework.web.reactive.result.view.script.ApplicationContext ) { super. setApplicationContext ( org.springframework.web.reactive.result.view.script.ApplicationContext ) ; ScriptTemplateConfig org.springframework.web.reactive.result.view.script.ScriptTemplateConfig = org.springframework.web.reactive.result.view.script.ScriptTemplateConfig ( ) ; if ( this . javax.script.ScriptEngine == null && org.springframework.web.reactive.result.view.script.ScriptTemplateConfig . getEngine ( ) != null ) { void ( org.springframework.web.reactive.result.view.script.ScriptTemplateConfig . getEngine ( ) ) ; } if ( this . java.lang.String == null && org.springframework.web.reactive.result.view.script.ScriptTemplateConfig . getEngineName ( ) != null ) { this . java.lang.String = org.springframework.web.reactive.result.view.script.ScriptTemplateConfig . getEngineName ( ) ; } if ( this . java.lang.String[] == null && org.springframework.web.reactive.result.view.script.ScriptTemplateConfig . getScripts ( ) != null ) { this . java.lang.String[] = org.springframework.web.reactive.result.view.script.ScriptTemplateConfig . getScripts ( ) ; } if ( this . java.lang.String == null && org.springframework.web.reactive.result.view.script.ScriptTemplateConfig . getRenderObject ( ) != null ) { this . java.lang.String = org.springframework.web.reactive.result.view.script.ScriptTemplateConfig . getRenderObject ( ) ; } if ( this . java.lang.String == null && org.springframework.web.reactive.result.view.script.ScriptTemplateConfig . getRenderFunction ( ) != null ) { this . java.lang.String = org.springframework.web.reactive.result.view.script.ScriptTemplateConfig . getRenderFunction ( ) ; } if ( org.springframework.web.reactive.result.view.script.ScriptTemplateConfig . getCharset ( ) != null ) { setDefaultCharset ( org.springframework.web.reactive.result.view.script.ScriptTemplateConfig . getCharset ( ) ) ; } if ( this . java.lang.String[] == null ) { java.lang.String java.lang.String = org.springframework.web.reactive.result.view.script.ScriptTemplateConfig . getResourceLoaderPath ( ) ; void ( java.lang.String == null ? java.lang.String : java.lang.String ) ; } if ( this . org.springframework.web.reactive.result.view.script.ResourceLoader == null ) { this . org.springframework.web.reactive.result.view.script.ResourceLoader = getApplicationContext ( ) ; } if ( this . java.lang.Boolean == null && org.springframework.web.reactive.result.view.script.ScriptTemplateConfig . isSharedEngine ( ) != null ) { this . java.lang.Boolean = org.springframework.web.reactive.result.view.script.ScriptTemplateConfig . isSharedEngine ( ) ; } Assert . isTrue ( ! ( this . javax.script.ScriptEngine != null && this . java.lang.String != null ) , STRING ) ; Assert . isTrue ( ! ( this . javax.script.ScriptEngine == null && this . java.lang.String == null ) , STRING ) ; if ( java.lang.Boolean . java.lang.Boolean . boolean ( this . java.lang.Boolean ) ) { Assert . isTrue ( this . java.lang.String != null , STRING + STRING ) ; } else if ( this . javax.script.ScriptEngine != null ) { void ( this . javax.script.ScriptEngine ) ; } else { void ( javax.script.ScriptEngine ( ) ) ; } Assert . isTrue ( this . java.lang.String != null , STRING ) ; }  <METHOD_END>
<METHOD_START> protected javax.script.ScriptEngine javax.script.ScriptEngine ( ) { return java.lang.Boolean . java.lang.Boolean . boolean ( this . java.lang.Boolean ) ? javax.script.ScriptEngine ( ) : this . javax.script.ScriptEngine ; }  <METHOD_END>
<METHOD_START> protected javax.script.ScriptEngine javax.script.ScriptEngine ( ) { if ( this . javax.script.ScriptEngineManager == null ) { this . javax.script.ScriptEngineManager = new javax.script.ScriptEngineManager ( getApplicationContext ( ) . getClassLoader ( ) ) ; } javax.script.ScriptEngine javax.script.ScriptEngine = StandardScriptUtils . retrieveEngineByName ( this . javax.script.ScriptEngineManager , this . java.lang.String ) ; void ( javax.script.ScriptEngine ) ; return javax.script.ScriptEngine ; }  <METHOD_END>
<METHOD_START> protected void void ( javax.script.ScriptEngine javax.script.ScriptEngine ) { if ( ! ObjectUtils . isEmpty ( this . java.lang.String[] ) ) { for ( java.lang.String java.lang.String : this . java.lang.String[] ) { Resource org.springframework.web.reactive.result.view.script.Resource = org.springframework.web.reactive.result.view.script.Resource ( java.lang.String ) ; if ( org.springframework.web.reactive.result.view.script.Resource == null ) { throw new java.lang.IllegalStateException ( STRING + java.lang.String + STRING ) ; } try { javax.script.ScriptEngine . java.lang.Object ( new java.io.InputStreamReader ( org.springframework.web.reactive.result.view.script.Resource . getInputStream ( ) ) ) ; } catch ( java.lang.Throwable java.lang.Throwable ) { throw new java.lang.IllegalStateException ( STRING + java.lang.String + STRING , java.lang.Throwable ) ; } } } }  <METHOD_END>
<METHOD_START> protected org.springframework.web.reactive.result.view.script.Resource org.springframework.web.reactive.result.view.script.Resource ( java.lang.String java.lang.String ) { for ( java.lang.String java.lang.String : this . java.lang.String[] ) { Resource org.springframework.web.reactive.result.view.script.Resource = this . org.springframework.web.reactive.result.view.script.ResourceLoader . getResource ( java.lang.String + java.lang.String ) ; if ( org.springframework.web.reactive.result.view.script.Resource . exists ( ) ) { return org.springframework.web.reactive.result.view.script.Resource ; } } return null ; }  <METHOD_END>
<METHOD_START> protected org.springframework.web.reactive.result.view.script.ScriptTemplateConfig org.springframework.web.reactive.result.view.script.ScriptTemplateConfig ( ) org.springframework.web.reactive.result.view.script.BeansException { try { return BeanFactoryUtils . beanOfTypeIncludingAncestors ( getApplicationContext ( ) , ScriptTemplateConfig .class , true , false ) ; } catch ( NoSuchBeanDefinitionException org.springframework.web.reactive.result.view.script.NoSuchBeanDefinitionException ) { throw new ApplicationContextException ( STRING + STRING + STRING , org.springframework.web.reactive.result.view.script.NoSuchBeanDefinitionException ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( java.util.Locale java.util.Locale ) throws java.lang.Exception { return ( org.springframework.web.reactive.result.view.script.Resource ( getUrl ( ) ) != null ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.web.reactive.result.view.script.Mono<java.lang.Void> < java.lang.Void > org.springframework.web.reactive.result.view.script.Mono<java.lang.Void> ( java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> , MediaType org.springframework.web.reactive.result.view.script.MediaType , ServerWebExchange org.springframework.web.reactive.result.view.script.ServerWebExchange ) { return Mono . defer ( ( ) { ServerHttpResponse response = exchange . getResponse ( ) ; try { ScriptEngine engine = getEngine ( ) ; Invocable invocable = ( Invocable ) engine ; String url = getUrl ( ) ; String template = getTemplate ( url ) ; Function < String , String > templateLoader = path -> { try { return getTemplate ( path ) ; } catch ( IOException ex ) { throw new IllegalStateException ( ex ) ; } } ; RenderingContext context = new RenderingContext ( this . getApplicationContext ( ) , this . locale , templateLoader , url ) ; Object html ; if ( this . renderObject != null ) { Object thiz = engine . eval ( this . renderObject ) ; html = invocable . invokeMethod ( thiz , this . renderFunction , template , model , context ) ; } else { html = invocable . invokeFunction ( this . renderFunction , template , model , context ) ; } byte [] bytes = String . valueOf ( html ) . getBytes ( StandardCharsets . UTF_8 ) ; DataBuffer buffer = response . bufferFactory ( ) . allocateBuffer ( bytes . length ) . write ( bytes ) ; return response . writeWith ( Mono . just ( buffer ) ) ; } catch ( ScriptException ex ) { throw new IllegalStateException ( STRING , new StandardScriptEvalException ( ex ) ) ; } catch ( Exception ex ) { throw new IllegalStateException ( STRING , ex ) ; } } ) ; }  <METHOD_END>
<METHOD_START> protected java.lang.String java.lang.String ( java.lang.String java.lang.String ) throws java.io.IOException { Resource org.springframework.web.reactive.result.view.script.Resource = org.springframework.web.reactive.result.view.script.Resource ( java.lang.String ) ; if ( org.springframework.web.reactive.result.view.script.Resource == null ) { throw new java.lang.IllegalStateException ( STRING + java.lang.String + STRING ) ; } java.io.InputStreamReader java.io.InputStreamReader = new java.io.InputStreamReader ( org.springframework.web.reactive.result.view.script.Resource . getInputStream ( ) , getDefaultCharset ( ) ) ; return FileCopyUtils . copyToString ( java.io.InputStreamReader ) ; }  <METHOD_END>
