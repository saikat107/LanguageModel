<METHOD_START> @ Test public void void ( ) { java.lang.String [] java.lang.String[] = { STRING , STRING , STRING , STRING } ; java.lang.Class<?> < ? > [] java.lang.Class<?>[] = { RubyScriptExecutor .class , DefaultScriptExecutor .class , DefaultScriptExecutor .class , PythonScriptExecutor .class } ; java.util.Map<java.lang.String,org.springframework.integration.scripting.jsr223.ScriptExecutingMessageProcessor> < java.lang.String , ScriptExecutingMessageProcessor > java.util.Map<java.lang.String,org.springframework.integration.scripting.jsr223.ScriptExecutingMessageProcessor> = org.springframework.integration.scripting.jsr223.ApplicationContext . getBeansOfType ( ScriptExecutingMessageProcessor .class ) ; assertEquals ( NUMBER , java.util.Map<java.lang.String,org.springframework.integration.scripting.jsr223.ScriptExecutingMessageProcessor> . size ( ) ) ; for ( int int = NUMBER ; int < NUMBER ; int ++ ) { ScriptExecutingMessageProcessor org.springframework.integration.scripting.jsr223.ScriptExecutingMessageProcessor = org.springframework.integration.scripting.jsr223.ApplicationContext . getBean ( STRING + int , ScriptExecutingMessageProcessor .class ) ; AbstractScriptExecutor org.springframework.integration.scripting.jsr223.AbstractScriptExecutor = ( AbstractScriptExecutor ) TestUtils . getPropertyValue ( org.springframework.integration.scripting.jsr223.ScriptExecutingMessageProcessor , STRING ) ; assertEquals ( java.lang.String[] [ int ] , executor . language ) ; assertEquals ( java.lang.Class<?>[] [ int ] , org.springframework.integration.scripting.jsr223.AbstractScriptExecutor . getClass ( ) ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { try { new ClassPathXmlApplicationContext ( this . java.lang.Class<? extends org.springframework.integration.scripting.jsr223.DeriveLanguageFromExtensionTests> ( ) . java.lang.String ( ) + STRING , this . java.lang.Class<? extends org.springframework.integration.scripting.jsr223.DeriveLanguageFromExtensionTests> ( ) ) . close ( ) ; } catch ( java.lang.Exception java.lang.Exception ) { assertTrue ( java.lang.Exception . java.lang.String ( ) . boolean ( STRING ) ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { try { new ClassPathXmlApplicationContext ( this . java.lang.Class<? extends org.springframework.integration.scripting.jsr223.DeriveLanguageFromExtensionTests> ( ) . java.lang.String ( ) + STRING , this . java.lang.Class<? extends org.springframework.integration.scripting.jsr223.DeriveLanguageFromExtensionTests> ( ) ) . close ( ) ; } catch ( java.lang.Exception java.lang.Exception ) { assertTrue ( java.lang.Exception . java.lang.String ( ) . boolean ( STRING ) ) ; } }  <METHOD_END>
