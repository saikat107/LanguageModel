<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.context.annotation.configuration.AnnotationConfigApplicationContext . register ( org.springframework.context.annotation.configuration.ImportWithConditionTests.ConditionalThenUnconditional .class ) ; this . org.springframework.context.annotation.configuration.AnnotationConfigApplicationContext . refresh ( ) ; assertFalse ( this . org.springframework.context.annotation.configuration.AnnotationConfigApplicationContext . containsBean ( STRING ) ) ; assertTrue ( this . org.springframework.context.annotation.configuration.AnnotationConfigApplicationContext . containsBean ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.context.annotation.configuration.AnnotationConfigApplicationContext . register ( org.springframework.context.annotation.configuration.ImportWithConditionTests.UnconditionalThenConditional .class ) ; this . org.springframework.context.annotation.configuration.AnnotationConfigApplicationContext . refresh ( ) ; assertFalse ( this . org.springframework.context.annotation.configuration.AnnotationConfigApplicationContext . containsBean ( STRING ) ) ; assertTrue ( this . org.springframework.context.annotation.configuration.AnnotationConfigApplicationContext . containsBean ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Bean org.springframework.context.annotation.configuration.ImportWithConditionTests.BeanOne org.springframework.context.annotation.configuration.ImportWithConditionTests.BeanOne ( ) { return new org.springframework.context.annotation.configuration.ImportWithConditionTests.BeanOne ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ConditionContext org.springframework.context.annotation.configuration.ConditionContext , AnnotatedTypeMetadata org.springframework.context.annotation.configuration.AnnotatedTypeMetadata ) { return false ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.context.annotation.configuration.ConfigurationPhase org.springframework.context.annotation.configuration.ConfigurationPhase ( ) { return ConfigurationPhase . REGISTER_BEAN ; }  <METHOD_END>