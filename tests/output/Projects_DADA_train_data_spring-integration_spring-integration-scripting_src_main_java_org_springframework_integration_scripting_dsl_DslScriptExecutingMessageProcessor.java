<METHOD_START> void ( Resource org.springframework.integration.scripting.dsl.Resource ) { this . org.springframework.integration.scripting.dsl.Resource = org.springframework.integration.scripting.dsl.Resource ; }  <METHOD_END>
<METHOD_START> void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.Long java.lang.Long ) { this . long = java.lang.Long ; }  <METHOD_END>
<METHOD_START> public void void ( ScriptVariableGenerator org.springframework.integration.scripting.dsl.ScriptVariableGenerator ) { this . org.springframework.integration.scripting.dsl.ScriptVariableGenerator = org.springframework.integration.scripting.dsl.ScriptVariableGenerator ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ApplicationContext org.springframework.integration.scripting.dsl.ApplicationContext ) throws org.springframework.integration.scripting.dsl.BeansException { this . org.springframework.integration.scripting.dsl.ApplicationContext = org.springframework.integration.scripting.dsl.ApplicationContext ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) java.lang.Exception { if ( StringUtils . hasText ( this . java.lang.String ) ) { this . org.springframework.integration.scripting.dsl.Resource = this . org.springframework.integration.scripting.dsl.ApplicationContext . getResource ( this . java.lang.String ) ; } ScriptSource org.springframework.integration.scripting.dsl.ScriptSource = new RefreshableResourceScriptSource ( this . org.springframework.integration.scripting.dsl.Resource , this . long ) ; if ( ! StringUtils . hasText ( this . java.lang.String ) ) { java.lang.String java.lang.String = this . org.springframework.integration.scripting.dsl.Resource . getFilename ( ) ; int int = java.lang.String . int ( STRING ) + NUMBER ; if ( int < NUMBER ) { throw new BeanCreationException ( STRING + STRING + this . org.springframework.integration.scripting.dsl.Resource ) ; } this . java.lang.String = java.lang.String . java.lang.String ( int ) ; } if ( this . org.springframework.integration.scripting.dsl.ApplicationContext . containsBean ( ScriptExecutingProcessorFactory . BEAN_NAME ) ) { ScriptExecutingProcessorFactory org.springframework.integration.scripting.dsl.ScriptExecutingProcessorFactory = this . org.springframework.integration.scripting.dsl.ApplicationContext . getBean ( ScriptExecutingProcessorFactory . BEAN_NAME , ScriptExecutingProcessorFactory .class ) ; this . org.springframework.integration.scripting.dsl.AbstractScriptExecutingMessageProcessor<?> = org.springframework.integration.scripting.dsl.ScriptExecutingProcessorFactory . createMessageProcessor ( this . java.lang.String , org.springframework.integration.scripting.dsl.ScriptSource , this . org.springframework.integration.scripting.dsl.ScriptVariableGenerator ) ; } else { this . org.springframework.integration.scripting.dsl.AbstractScriptExecutingMessageProcessor<?> = new ScriptExecutingMessageProcessor ( org.springframework.integration.scripting.dsl.ScriptSource , this . org.springframework.integration.scripting.dsl.ScriptVariableGenerator , ScriptExecutorFactory . getScriptExecutor ( this . java.lang.String ) ) ; } this . org.springframework.integration.scripting.dsl.AbstractScriptExecutingMessageProcessor<> . setBeanFactory ( this . org.springframework.integration.scripting.dsl.ApplicationContext ) ; this . org.springframework.integration.scripting.dsl.AbstractScriptExecutingMessageProcessor<> . setBeanClassLoader ( this . org.springframework.integration.scripting.dsl.ApplicationContext . getClassLoader ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( Message < ? > org.springframework.integration.scripting.dsl.Message<?> ) { return this . org.springframework.integration.scripting.dsl.AbstractScriptExecutingMessageProcessor<> . processMessage ( org.springframework.integration.scripting.dsl.Message<> ) ; }  <METHOD_END>