<METHOD_START> @ Test public void void ( ) { ScriptEvaluator org.springframework.scripting.bsh.ScriptEvaluator = new BshScriptEvaluator ( ) ; java.lang.Object java.lang.Object = org.springframework.scripting.bsh.ScriptEvaluator . evaluate ( new StaticScriptSource ( STRING ) ) ; assertEquals ( NUMBER , java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { ScriptEvaluator org.springframework.scripting.bsh.ScriptEvaluator = new BshScriptEvaluator ( ) ; java.lang.Object java.lang.Object = org.springframework.scripting.bsh.ScriptEvaluator . evaluate ( new ResourceScriptSource ( new ClassPathResource ( STRING , java.lang.Class<? extends org.springframework.scripting.bsh.BshScriptEvaluatorTests> ( ) ) ) ) ; assertEquals ( NUMBER , java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { ScriptEvaluator org.springframework.scripting.bsh.ScriptEvaluator = new BshScriptEvaluator ( ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = new java.util.HashMap<java.lang.String,java.lang.Object> <> ( ) ; java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING , NUMBER ) ; java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING , NUMBER ) ; java.lang.Object java.lang.Object = org.springframework.scripting.bsh.ScriptEvaluator . evaluate ( new StaticScriptSource ( STRING ) , java.util.Map<java.lang.String,java.lang.Object> ) ; assertEquals ( NUMBER , java.lang.Object ) ; }  <METHOD_END>