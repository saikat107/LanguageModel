<METHOD_START> @ Before public void void ( ) { this . org.springframework.boot.autoconfigure.EnableAutoConfigurationImportSelector . setBeanFactory ( this . org.springframework.boot.autoconfigure.ConfigurableListableBeanFactory ) ; this . org.springframework.boot.autoconfigure.EnableAutoConfigurationImportSelector . setEnvironment ( this . org.springframework.boot.autoconfigure.MockEnvironment ) ; this . org.springframework.boot.autoconfigure.EnableAutoConfigurationImportSelector . setResourceLoader ( new DefaultResourceLoader ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.autoconfigure.MockEnvironment . setProperty ( EnableAutoConfiguration . ENABLED_OVERRIDE_PROPERTY , STRING ) ; java.lang.String [] java.lang.String[] = java.lang.String[] ( org.springframework.boot.autoconfigure.EnableAutoConfigurationImportSelectorTests.BasicEnableAutoConfiguration .class ) ; assertThat ( java.lang.String[] ) . isNotEmpty ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.autoconfigure.MockEnvironment . setProperty ( EnableAutoConfiguration . ENABLED_OVERRIDE_PROPERTY , STRING ) ; java.lang.String [] java.lang.String[] = java.lang.String[] ( org.springframework.boot.autoconfigure.EnableAutoConfigurationImportSelectorTests.BasicEnableAutoConfiguration .class ) ; assertThat ( java.lang.String[] ) . isEmpty ( ) ; }  <METHOD_END>
<METHOD_START> private java.lang.String [] java.lang.String[] ( java.lang.Class<?> < ? > java.lang.Class<?> ) { return this . org.springframework.boot.autoconfigure.EnableAutoConfigurationImportSelector . selectImports ( new StandardAnnotationMetadata ( java.lang.Class<> ) ) ; }  <METHOD_END>
