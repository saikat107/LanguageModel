<METHOD_START> @ Test public void void ( ) { ScriptExecutor org.springframework.integration.scripting.jsr223.ScriptExecutor = ScriptExecutorFactory . getScriptExecutor ( STRING ) ; org.springframework.integration.scripting.jsr223.ScriptExecutor . executeScript ( new StaticScriptSource ( STRING ) ) ; org.springframework.integration.scripting.jsr223.ScriptExecutor . executeScript ( new StaticScriptSource ( STRING ) ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = new java.util.HashMap<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > ( ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = new java.util.HashMap<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > ( ) ; java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING , NUMBER ) ; java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING , STRING ) ; java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING , NUMBER ) ; java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING , STRING ) ; java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING , java.util.Map<java.lang.String,java.lang.Object> ) ; Resource org.springframework.integration.scripting.jsr223.Resource = new ClassPathResource ( STRING ) ; java.lang.String java.lang.String = ( java.lang.String ) org.springframework.integration.scripting.jsr223.ScriptExecutor . executeScript ( new ResourceScriptSource ( org.springframework.integration.scripting.jsr223.Resource ) , java.util.Map<java.lang.String,java.lang.Object> ) ; assertEquals ( STRING , java.lang.String . java.lang.String ( NUMBER , STRING . int ( ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { ScriptExecutor org.springframework.integration.scripting.jsr223.ScriptExecutor = ScriptExecutorFactory . getScriptExecutor ( STRING ) ; java.lang.Object java.lang.Object = org.springframework.integration.scripting.jsr223.ScriptExecutor . executeScript ( new StaticScriptSource ( STRING ) ) ; assertEquals ( STRING , java.lang.Object . java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { ScriptExecutor org.springframework.integration.scripting.jsr223.ScriptExecutor = ScriptExecutorFactory . getScriptExecutor ( STRING ) ; java.lang.Object java.lang.Object = org.springframework.integration.scripting.jsr223.ScriptExecutor . executeScript ( new StaticScriptSource ( STRING ) ) ; assertEquals ( NUMBER , java.lang.Object ) ; java.lang.Object = org.springframework.integration.scripting.jsr223.ScriptExecutor . executeScript ( new StaticScriptSource ( STRING ) ) ; assertEquals ( NUMBER , java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { ScriptExecutorFactory . getScriptExecutor ( STRING ) ; }  <METHOD_END>
