<METHOD_START> @ Test public void void ( ) java.lang.Exception { assertNotNull ( org.springframework.statemachine.config.common.annotation.ApplicationContext ) ; assertTrue ( org.springframework.statemachine.config.common.annotation.ApplicationContext . containsBean ( STRING ) ) ; SimpleTestConfig org.springframework.statemachine.config.common.annotation.SimpleTestConfig = org.springframework.statemachine.config.common.annotation.ApplicationContext . getBean ( STRING , SimpleTestConfig .class ) ; assertThat ( config . simpleData , notNullValue ( ) ) ; assertThat ( config . simpleData , is ( STRING ) ) ; assertThat ( config . simpleProperties , notNullValue ( ) ) ; assertThat ( config . simpleProperties . getProperty ( STRING ) , notNullValue ( ) ) ; assertThat ( config . simpleProperties . getProperty ( STRING ) , is ( STRING ) ) ; assertThat ( config . simpleBeanA , notNullValue ( ) ) ; assertThat ( config . simpleBeanA . dataA , notNullValue ( ) ) ; assertThat ( config . simpleBeanA . resources , notNullValue ( ) ) ; assertThat ( config . simpleBeanA . dataA , is ( STRING ) ) ; assertThat ( config . simpleBeanA . resources . size ( ) , is ( NUMBER ) ) ; java.util.Iterator<org.springframework.statemachine.config.common.annotation.Resource> < Resource > java.util.Iterator<org.springframework.statemachine.config.common.annotation.Resource> = config . simpleBeanA . resources . iterator ( ) ; java.lang.String java.lang.String = java.util.Iterator<org.springframework.statemachine.config.common.annotation.Resource> . next ( ) . getFilename ( ) ; java.lang.String java.lang.String = java.util.Iterator<org.springframework.statemachine.config.common.annotation.Resource> . next ( ) . getFilename ( ) ; java.lang.String [] java.lang.String[] = new java.lang.String [ NUMBER ] ; java.lang.String[] [ NUMBER ] = java.lang.String . boolean ( STRING ) ? java.lang.String : java.lang.String ; java.lang.String[] [ NUMBER ] = java.lang.String . boolean ( STRING ) ? java.lang.String : java.lang.String ; assertThat ( java.lang.String[] [ NUMBER ] , is ( STRING ) ) ; assertThat ( java.lang.String[] [ NUMBER ] , is ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( SimpleTestConfigBuilder org.springframework.statemachine.config.common.annotation.SimpleTestConfigBuilder ) throws java.lang.Exception { org.springframework.statemachine.config.common.annotation.SimpleTestConfigBuilder . withProperties ( ) . property ( STRING , STRING ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( SimpleTestConfigBeanABuilder org.springframework.statemachine.config.common.annotation.SimpleTestConfigBeanABuilder ) throws java.lang.Exception { org.springframework.statemachine.config.common.annotation.SimpleTestConfigBeanABuilder . withResources ( ) . resource ( STRING ) . resource ( STRING ) . and ( ) . setData ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( SimpleTestConfigBeanBConfigurer org.springframework.statemachine.config.common.annotation.SimpleTestConfigBeanBConfigurer ) throws java.lang.Exception { org.springframework.statemachine.config.common.annotation.SimpleTestConfigBeanBConfigurer . setData ( STRING ) . setDataBB ( STRING ) . withResources ( ) . and ( ) ; }  <METHOD_END>
