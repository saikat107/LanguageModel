<METHOD_START> @ Before public void void ( ) { org.springframework.integration.scripting.jsr223.ScriptExecutor = new PythonScriptExecutor ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.lang.Object java.lang.Object = org.springframework.integration.scripting.jsr223.ScriptExecutor . executeScript ( new StaticScriptSource ( STRING ) ) ; assertEquals ( NUMBER , java.lang.Object ) ; java.lang.Object = org.springframework.integration.scripting.jsr223.ScriptExecutor . executeScript ( new StaticScriptSource ( STRING ) ) ; assertEquals ( STRING , java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.lang.Object java.lang.Object = org.springframework.integration.scripting.jsr223.ScriptExecutor . executeScript ( new StaticScriptSource ( STRING ) ) ; assertEquals ( NUMBER , java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.lang.Object java.lang.Object = org.springframework.integration.scripting.jsr223.ScriptExecutor . executeScript ( new StaticScriptSource ( STRING ) ) ; assertEquals ( NUMBER , java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { ScriptSource org.springframework.integration.scripting.jsr223.ScriptSource = new ResourceScriptSource ( new ClassPathResource ( STRING ) ) ; java.lang.Object java.lang.Object = org.springframework.integration.scripting.jsr223.ScriptExecutor . executeScript ( org.springframework.integration.scripting.jsr223.ScriptSource ) ; PyTuple org.springframework.integration.scripting.jsr223.PyTuple = ( PyTuple ) java.lang.Object ; assertEquals ( NUMBER , org.springframework.integration.scripting.jsr223.PyTuple . get ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { ScriptSource org.springframework.integration.scripting.jsr223.ScriptSource = new ResourceScriptSource ( new ClassPathResource ( STRING ) ) ; java.util.HashMap<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.HashMap<java.lang.String,java.lang.Object> = new java.util.HashMap<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > ( ) ; java.util.HashMap<java.lang.String,java.lang.Object> . java.lang.Object ( STRING , STRING ) ; java.lang.Object java.lang.Object = org.springframework.integration.scripting.jsr223.ScriptExecutor . executeScript ( org.springframework.integration.scripting.jsr223.ScriptSource , java.util.HashMap<java.lang.String,java.lang.Object> ) ; PyTuple org.springframework.integration.scripting.jsr223.PyTuple = ( PyTuple ) java.lang.Object ; assertNotNull ( org.springframework.integration.scripting.jsr223.PyTuple ) ; assertEquals ( NUMBER , org.springframework.integration.scripting.jsr223.PyTuple . get ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = new java.util.HashMap<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > ( ) ; java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING , STRING ) ; java.lang.Object java.lang.Object = org.springframework.integration.scripting.jsr223.ScriptExecutor . executeScript ( new StaticScriptSource ( STRING ) , java.util.Map<java.lang.String,java.lang.Object> ) ; assertEquals ( STRING , java.lang.Object ) ; }  <METHOD_END>
