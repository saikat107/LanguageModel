<METHOD_START> @ Before public void void ( ) { Assume . group ( TestGroup . PERFORMANCE ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { assertNull ( new ScriptFactoryPostProcessor ( ) . postProcessBeforeInstantiation ( java.lang.Class<? extends org.springframework.scripting.support.ScriptFactoryPostProcessorTests> ( ) , STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { try { new ScriptFactoryPostProcessor ( ) . setBeanFactory ( mock ( BeanFactory .class ) ) ; fail ( STRING ) ; } catch ( java.lang.IllegalStateException java.lang.IllegalStateException ) {		} }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { BeanDefinition org.springframework.scripting.support.BeanDefinition = org.springframework.scripting.support.BeanDefinition ( true ) ; BeanDefinition org.springframework.scripting.support.BeanDefinition = org.springframework.scripting.support.BeanDefinition ( ) ; GenericApplicationContext org.springframework.scripting.support.GenericApplicationContext = new GenericApplicationContext ( ) ; org.springframework.scripting.support.GenericApplicationContext . registerBeanDefinition ( java.lang.String , org.springframework.scripting.support.BeanDefinition ) ; org.springframework.scripting.support.GenericApplicationContext . registerBeanDefinition ( java.lang.String , org.springframework.scripting.support.BeanDefinition ) ; org.springframework.scripting.support.GenericApplicationContext . refresh ( ) ; Messenger org.springframework.scripting.support.Messenger = ( Messenger ) org.springframework.scripting.support.GenericApplicationContext . getBean ( java.lang.String ) ; assertEquals ( java.lang.String , org.springframework.scripting.support.Messenger . getMessage ( ) ) ; void ( int ) ; StaticScriptSource org.springframework.scripting.support.StaticScriptSource = org.springframework.scripting.support.StaticScriptSource ( org.springframework.scripting.support.GenericApplicationContext ) ; org.springframework.scripting.support.StaticScriptSource . setScript ( java.lang.String ) ; Messenger org.springframework.scripting.support.Messenger = ( Messenger ) org.springframework.scripting.support.GenericApplicationContext . getBean ( java.lang.String ) ; assertEquals ( java.lang.String , org.springframework.scripting.support.Messenger . getMessage ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { BeanDefinition org.springframework.scripting.support.BeanDefinition = org.springframework.scripting.support.BeanDefinition ( false ) ; BeanDefinition org.springframework.scripting.support.BeanDefinition = org.springframework.scripting.support.BeanDefinition ( ) ; GenericApplicationContext org.springframework.scripting.support.GenericApplicationContext = new GenericApplicationContext ( ) ; org.springframework.scripting.support.GenericApplicationContext . registerBeanDefinition ( java.lang.String , org.springframework.scripting.support.BeanDefinition ) ; org.springframework.scripting.support.GenericApplicationContext . registerBeanDefinition ( java.lang.String , org.springframework.scripting.support.BeanDefinition ) ; org.springframework.scripting.support.GenericApplicationContext . refresh ( ) ; Messenger org.springframework.scripting.support.Messenger = ( Messenger ) org.springframework.scripting.support.GenericApplicationContext . getBean ( java.lang.String ) ; assertEquals ( java.lang.String , org.springframework.scripting.support.Messenger . getMessage ( ) ) ; void ( int ) ; StaticScriptSource org.springframework.scripting.support.StaticScriptSource = org.springframework.scripting.support.StaticScriptSource ( org.springframework.scripting.support.GenericApplicationContext ) ; org.springframework.scripting.support.StaticScriptSource . setScript ( java.lang.String ) ; Messenger org.springframework.scripting.support.Messenger = ( Messenger ) org.springframework.scripting.support.GenericApplicationContext . getBean ( java.lang.String ) ; assertEquals ( STRING , java.lang.String , org.springframework.scripting.support.Messenger . getMessage ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { BeanDefinition org.springframework.scripting.support.BeanDefinition = org.springframework.scripting.support.BeanDefinition ( true ) ; BeanDefinition org.springframework.scripting.support.BeanDefinition = org.springframework.scripting.support.BeanDefinition ( ) ; BeanDefinitionBuilder org.springframework.scripting.support.BeanDefinitionBuilder = BeanDefinitionBuilder . rootBeanDefinition ( org.springframework.scripting.support.ScriptFactoryPostProcessorTests.DefaultMessengerService .class ) ; org.springframework.scripting.support.BeanDefinitionBuilder . addPropertyReference ( java.lang.String , java.lang.String ) ; GenericApplicationContext org.springframework.scripting.support.GenericApplicationContext = new GenericApplicationContext ( ) ; org.springframework.scripting.support.GenericApplicationContext . registerBeanDefinition ( java.lang.String , org.springframework.scripting.support.BeanDefinition ) ; org.springframework.scripting.support.GenericApplicationContext . registerBeanDefinition ( java.lang.String , org.springframework.scripting.support.BeanDefinition ) ; final java.lang.String java.lang.String = STRING ; org.springframework.scripting.support.GenericApplicationContext . registerBeanDefinition ( java.lang.String , org.springframework.scripting.support.BeanDefinitionBuilder . getBeanDefinition ( ) ) ; org.springframework.scripting.support.GenericApplicationContext . refresh ( ) ; Messenger org.springframework.scripting.support.Messenger = ( Messenger ) org.springframework.scripting.support.GenericApplicationContext . getBean ( java.lang.String ) ; assertEquals ( java.lang.String , org.springframework.scripting.support.Messenger . getMessage ( ) ) ; void ( int ) ; StaticScriptSource org.springframework.scripting.support.StaticScriptSource = org.springframework.scripting.support.StaticScriptSource ( org.springframework.scripting.support.GenericApplicationContext ) ; org.springframework.scripting.support.StaticScriptSource . setScript ( java.lang.String ) ; Messenger org.springframework.scripting.support.Messenger = ( Messenger ) org.springframework.scripting.support.GenericApplicationContext . getBean ( java.lang.String ) ; assertEquals ( java.lang.String , org.springframework.scripting.support.Messenger . getMessage ( ) ) ; org.springframework.scripting.support.ScriptFactoryPostProcessorTests.DefaultMessengerService org.springframework.scripting.support.ScriptFactoryPostProcessorTests.DefaultMessengerService = ( org.springframework.scripting.support.ScriptFactoryPostProcessorTests.DefaultMessengerService ) org.springframework.scripting.support.GenericApplicationContext . getBean ( java.lang.String ) ; assertEquals ( java.lang.String , org.springframework.scripting.support.ScriptFactoryPostProcessorTests.DefaultMessengerService . java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { GenericApplicationContext org.springframework.scripting.support.GenericApplicationContext = new GenericApplicationContext ( ) ; org.springframework.scripting.support.GenericApplicationContext . registerBeanDefinition ( STRING , BeanDefinitionBuilder . rootBeanDefinition ( StubMessenger .class ) . getBeanDefinition ( ) ) ; org.springframework.scripting.support.GenericApplicationContext . refresh ( ) ; BeanDefinitionBuilder org.springframework.scripting.support.BeanDefinitionBuilder = BeanDefinitionBuilder . rootBeanDefinition ( GroovyScriptFactory .class ) ; org.springframework.scripting.support.BeanDefinitionBuilder . addConstructorArgValue ( java.lang.String ) ; org.springframework.scripting.support.BeanDefinitionBuilder . addPropertyReference ( STRING , STRING ) ; GenericApplicationContext org.springframework.scripting.support.GenericApplicationContext = new GenericApplicationContext ( org.springframework.scripting.support.GenericApplicationContext ) ; org.springframework.scripting.support.GenericApplicationContext . registerBeanDefinition ( STRING , org.springframework.scripting.support.BeanDefinitionBuilder . getBeanDefinition ( ) ) ; org.springframework.scripting.support.GenericApplicationContext . registerBeanDefinition ( STRING , org.springframework.scripting.support.BeanDefinition ( true ) ) ; org.springframework.scripting.support.GenericApplicationContext . refresh ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { new ClassPathXmlApplicationContext ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { BeanDefinition org.springframework.scripting.support.BeanDefinition = org.springframework.scripting.support.BeanDefinition ( true ) ; BeanDefinition org.springframework.scripting.support.BeanDefinition = org.springframework.scripting.support.BeanDefinition ( ) ; BeanDefinitionBuilder org.springframework.scripting.support.BeanDefinitionBuilder = BeanDefinitionBuilder . rootBeanDefinition ( org.springframework.scripting.support.ScriptFactoryPostProcessorTests.DefaultMessengerService .class ) ; org.springframework.scripting.support.BeanDefinitionBuilder . addPropertyReference ( java.lang.String , java.lang.String ) ; GenericApplicationContext org.springframework.scripting.support.GenericApplicationContext = new GenericApplicationContext ( ) ; org.springframework.scripting.support.GenericApplicationContext . registerBeanDefinition ( java.lang.String , org.springframework.scripting.support.BeanDefinition ) ; org.springframework.scripting.support.GenericApplicationContext . registerBeanDefinition ( java.lang.String , org.springframework.scripting.support.BeanDefinition ) ; final java.lang.String java.lang.String = STRING ; org.springframework.scripting.support.GenericApplicationContext . registerBeanDefinition ( java.lang.String , org.springframework.scripting.support.BeanDefinitionBuilder . getBeanDefinition ( ) ) ; org.springframework.scripting.support.GenericApplicationContext . refresh ( ) ; Messenger org.springframework.scripting.support.Messenger = ( Messenger ) org.springframework.scripting.support.GenericApplicationContext . getBean ( java.lang.String ) ; assertEquals ( java.lang.String , org.springframework.scripting.support.Messenger . getMessage ( ) ) ; void ( int ) ; StaticScriptSource org.springframework.scripting.support.StaticScriptSource = org.springframework.scripting.support.StaticScriptSource ( org.springframework.scripting.support.GenericApplicationContext ) ; org.springframework.scripting.support.StaticScriptSource . setScript ( STRING ) ; Messenger org.springframework.scripting.support.Messenger = ( Messenger ) org.springframework.scripting.support.GenericApplicationContext . getBean ( java.lang.String ) ; try { org.springframework.scripting.support.Messenger . getMessage ( ) ; fail ( STRING ) ; } catch ( FatalBeanException org.springframework.scripting.support.FatalBeanException ) { assertTrue ( org.springframework.scripting.support.FatalBeanException . contains ( ScriptCompilationException .class ) ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { GenericApplicationContext org.springframework.scripting.support.GenericApplicationContext = new GenericApplicationContext ( ) ; org.springframework.scripting.support.GenericApplicationContext . registerBeanDefinition ( STRING , BeanDefinitionBuilder . rootBeanDefinition ( StubMessenger .class ) . getBeanDefinition ( ) ) ; BeanDefinitionBuilder org.springframework.scripting.support.BeanDefinitionBuilder = BeanDefinitionBuilder . rootBeanDefinition ( GroovyScriptFactory .class ) ; org.springframework.scripting.support.BeanDefinitionBuilder . setScope ( BeanDefinition . SCOPE_PROTOTYPE ) ; org.springframework.scripting.support.BeanDefinitionBuilder . addConstructorArgValue ( java.lang.String ) ; org.springframework.scripting.support.BeanDefinitionBuilder . addPropertyReference ( STRING , STRING ) ; final java.lang.String java.lang.String = STRING ; org.springframework.scripting.support.GenericApplicationContext . registerBeanDefinition ( java.lang.String , org.springframework.scripting.support.BeanDefinitionBuilder . getBeanDefinition ( ) ) ; org.springframework.scripting.support.GenericApplicationContext . registerBeanDefinition ( STRING , org.springframework.scripting.support.BeanDefinition ( true ) ) ; org.springframework.scripting.support.GenericApplicationContext . refresh ( ) ; Messenger org.springframework.scripting.support.Messenger = ( Messenger ) org.springframework.scripting.support.GenericApplicationContext . getBean ( java.lang.String ) ; Messenger org.springframework.scripting.support.Messenger = ( Messenger ) org.springframework.scripting.support.GenericApplicationContext . getBean ( java.lang.String ) ; assertNotSame ( org.springframework.scripting.support.Messenger , org.springframework.scripting.support.Messenger ) ; }  <METHOD_END>
<METHOD_START> private static org.springframework.scripting.support.StaticScriptSource org.springframework.scripting.support.StaticScriptSource ( GenericApplicationContext org.springframework.scripting.support.GenericApplicationContext ) throws java.lang.Exception { ScriptFactoryPostProcessor org.springframework.scripting.support.ScriptFactoryPostProcessor = ( ScriptFactoryPostProcessor ) org.springframework.scripting.support.GenericApplicationContext . getBean ( java.lang.String ) ; BeanDefinition org.springframework.scripting.support.BeanDefinition = processor . scriptBeanFactory . getBeanDefinition ( STRING ) ; return ( StaticScriptSource ) org.springframework.scripting.support.BeanDefinition . getConstructorArgumentValues ( ) . getIndexedArgumentValue ( NUMBER , StaticScriptSource .class ) . getValue ( ) ; }  <METHOD_END>
<METHOD_START> private static org.springframework.scripting.support.BeanDefinition org.springframework.scripting.support.BeanDefinition ( boolean boolean ) { BeanDefinitionBuilder org.springframework.scripting.support.BeanDefinitionBuilder = BeanDefinitionBuilder . rootBeanDefinition ( ScriptFactoryPostProcessor .class ) ; if ( boolean ) { org.springframework.scripting.support.BeanDefinitionBuilder . addPropertyValue ( STRING , new java.lang.Long ( NUMBER ) ) ; } return org.springframework.scripting.support.BeanDefinitionBuilder . getBeanDefinition ( ) ; }  <METHOD_END>
<METHOD_START> private static org.springframework.scripting.support.BeanDefinition org.springframework.scripting.support.BeanDefinition ( ) { BeanDefinitionBuilder org.springframework.scripting.support.BeanDefinitionBuilder = BeanDefinitionBuilder . rootBeanDefinition ( GroovyScriptFactory .class ) ; org.springframework.scripting.support.BeanDefinitionBuilder . addConstructorArgValue ( STRING + STRING + STRING + STRING + STRING + STRING + STRING + STRING + STRING + STRING ) ; org.springframework.scripting.support.BeanDefinitionBuilder . addPropertyValue ( STRING , java.lang.String ) ; return org.springframework.scripting.support.BeanDefinitionBuilder . getBeanDefinition ( ) ; }  <METHOD_END>
<METHOD_START> private static void void ( int int ) { try { java.lang.Thread . void ( int * NUMBER ) ; } catch ( java.lang.InterruptedException java.lang.InterruptedException ) {		} }  <METHOD_END>
<METHOD_START> public void void ( Messenger org.springframework.scripting.support.Messenger ) { this . org.springframework.scripting.support.Messenger = org.springframework.scripting.support.Messenger ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return this . org.springframework.scripting.support.Messenger . getMessage ( ) ; }  <METHOD_END>