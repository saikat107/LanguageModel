<METHOD_START> public void ( BeanFactory org.springframework.scripting.support.BeanFactory , java.lang.String java.lang.String , ScriptFactory org.springframework.scripting.support.ScriptFactory , ScriptSource org.springframework.scripting.support.ScriptSource , boolean boolean ) { super( org.springframework.scripting.support.BeanFactory , java.lang.String ); Assert . notNull ( org.springframework.scripting.support.ScriptFactory , STRING ) ; Assert . notNull ( org.springframework.scripting.support.ScriptSource , STRING ) ; this . org.springframework.scripting.support.ScriptFactory = org.springframework.scripting.support.ScriptFactory ; this . org.springframework.scripting.support.ScriptSource = org.springframework.scripting.support.ScriptSource ; this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected boolean boolean ( ) { return this . org.springframework.scripting.support.ScriptFactory . requiresScriptedObjectRefresh ( this . org.springframework.scripting.support.ScriptSource ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Object java.lang.Object ( BeanFactory org.springframework.scripting.support.BeanFactory , java.lang.String java.lang.String ) { return super. obtainFreshBean ( org.springframework.scripting.support.BeanFactory , ( this . boolean ? BeanFactory . FACTORY_BEAN_PREFIX + java.lang.String : java.lang.String ) ) ; }  <METHOD_END>
