<METHOD_START> @ Test public void void ( ) { AnnotationConfigApplicationContext org.springframework.context.annotation.AnnotationConfigApplicationContext = new AnnotationConfigApplicationContext ( ) ; org.springframework.context.annotation.AnnotationConfigApplicationContext . register ( org.springframework.context.annotation.NestedConfigurationClassTests.L0Config . org.springframework.context.annotation.NestedConfigurationClassTests.L0Config.L1Config .class ) ; org.springframework.context.annotation.AnnotationConfigApplicationContext . refresh ( ) ; assertFalse ( org.springframework.context.annotation.AnnotationConfigApplicationContext . containsBean ( STRING ) ) ; org.springframework.context.annotation.AnnotationConfigApplicationContext . getBean ( org.springframework.context.annotation.NestedConfigurationClassTests.L0Config . org.springframework.context.annotation.NestedConfigurationClassTests.L0Config.L1Config .class ) ; org.springframework.context.annotation.AnnotationConfigApplicationContext . getBean ( STRING ) ; org.springframework.context.annotation.AnnotationConfigApplicationContext . getBean ( org.springframework.context.annotation.NestedConfigurationClassTests.L0Config . org.springframework.context.annotation.NestedConfigurationClassTests.L0Config.L1Config . org.springframework.context.annotation.NestedConfigurationClassTests.L0Config.L1Config.L2Config .class ) ; org.springframework.context.annotation.AnnotationConfigApplicationContext . getBean ( STRING ) ; assertThat ( org.springframework.context.annotation.AnnotationConfigApplicationContext . getBean ( STRING , TestBean .class ) . getName ( ) , is ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { AnnotationConfigApplicationContext org.springframework.context.annotation.AnnotationConfigApplicationContext = new AnnotationConfigApplicationContext ( ) ; org.springframework.context.annotation.AnnotationConfigApplicationContext . register ( org.springframework.context.annotation.NestedConfigurationClassTests.L0Config .class ) ; org.springframework.context.annotation.AnnotationConfigApplicationContext . refresh ( ) ; assertFalse ( org.springframework.context.annotation.AnnotationConfigApplicationContext . getBeanFactory ( ) . containsSingleton ( STRING ) ) ; org.springframework.context.annotation.AnnotationConfigApplicationContext . getBean ( org.springframework.context.annotation.NestedConfigurationClassTests.L0Config .class ) ; org.springframework.context.annotation.AnnotationConfigApplicationContext . getBean ( STRING ) ; assertTrue ( org.springframework.context.annotation.AnnotationConfigApplicationContext . getBeanFactory ( ) . containsSingleton ( org.springframework.context.annotation.NestedConfigurationClassTests.L0Config . org.springframework.context.annotation.NestedConfigurationClassTests.L0Config.L1Config .class . java.lang.String ( ) ) ) ; org.springframework.context.annotation.AnnotationConfigApplicationContext . getBean ( org.springframework.context.annotation.NestedConfigurationClassTests.L0Config . org.springframework.context.annotation.NestedConfigurationClassTests.L0Config.L1Config .class ) ; org.springframework.context.annotation.AnnotationConfigApplicationContext . getBean ( STRING ) ; assertFalse ( org.springframework.context.annotation.AnnotationConfigApplicationContext . getBeanFactory ( ) . containsSingleton ( org.springframework.context.annotation.NestedConfigurationClassTests.L0Config . org.springframework.context.annotation.NestedConfigurationClassTests.L0Config.L1Config . org.springframework.context.annotation.NestedConfigurationClassTests.L0Config.L1Config.L2Config .class . java.lang.String ( ) ) ) ; org.springframework.context.annotation.AnnotationConfigApplicationContext . getBean ( org.springframework.context.annotation.NestedConfigurationClassTests.L0Config . org.springframework.context.annotation.NestedConfigurationClassTests.L0Config.L1Config . org.springframework.context.annotation.NestedConfigurationClassTests.L0Config.L1Config.L2Config .class ) ; org.springframework.context.annotation.AnnotationConfigApplicationContext . getBean ( STRING ) ; assertThat ( org.springframework.context.annotation.AnnotationConfigApplicationContext . getBean ( STRING , TestBean .class ) . getName ( ) , is ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { AnnotationConfigApplicationContext org.springframework.context.annotation.AnnotationConfigApplicationContext = new AnnotationConfigApplicationContext ( ) ; org.springframework.context.annotation.AnnotationConfigApplicationContext . register ( org.springframework.context.annotation.NestedConfigurationClassTests.L0ConfigLight .class ) ; org.springframework.context.annotation.AnnotationConfigApplicationContext . refresh ( ) ; assertFalse ( org.springframework.context.annotation.AnnotationConfigApplicationContext . getBeanFactory ( ) . containsSingleton ( STRING ) ) ; org.springframework.context.annotation.AnnotationConfigApplicationContext . getBean ( org.springframework.context.annotation.NestedConfigurationClassTests.L0ConfigLight .class ) ; org.springframework.context.annotation.AnnotationConfigApplicationContext . getBean ( STRING ) ; assertTrue ( org.springframework.context.annotation.AnnotationConfigApplicationContext . getBeanFactory ( ) . containsSingleton ( org.springframework.context.annotation.NestedConfigurationClassTests.L0ConfigLight . org.springframework.context.annotation.NestedConfigurationClassTests.L0ConfigLight.L1ConfigLight .class . java.lang.String ( ) ) ) ; org.springframework.context.annotation.AnnotationConfigApplicationContext . getBean ( org.springframework.context.annotation.NestedConfigurationClassTests.L0ConfigLight . org.springframework.context.annotation.NestedConfigurationClassTests.L0ConfigLight.L1ConfigLight .class ) ; org.springframework.context.annotation.AnnotationConfigApplicationContext . getBean ( STRING ) ; assertFalse ( org.springframework.context.annotation.AnnotationConfigApplicationContext . getBeanFactory ( ) . containsSingleton ( org.springframework.context.annotation.NestedConfigurationClassTests.L0ConfigLight . org.springframework.context.annotation.NestedConfigurationClassTests.L0ConfigLight.L1ConfigLight . org.springframework.context.annotation.NestedConfigurationClassTests.L0ConfigLight.L1ConfigLight.L2ConfigLight .class . java.lang.String ( ) ) ) ; org.springframework.context.annotation.AnnotationConfigApplicationContext . getBean ( org.springframework.context.annotation.NestedConfigurationClassTests.L0ConfigLight . org.springframework.context.annotation.NestedConfigurationClassTests.L0ConfigLight.L1ConfigLight . org.springframework.context.annotation.NestedConfigurationClassTests.L0ConfigLight.L1ConfigLight.L2ConfigLight .class ) ; org.springframework.context.annotation.AnnotationConfigApplicationContext . getBean ( STRING ) ; assertThat ( org.springframework.context.annotation.AnnotationConfigApplicationContext . getBean ( STRING , TestBean .class ) . getName ( ) , is ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { AnnotationConfigApplicationContext org.springframework.context.annotation.AnnotationConfigApplicationContext = new AnnotationConfigApplicationContext ( ) ; org.springframework.context.annotation.AnnotationConfigApplicationContext . register ( org.springframework.context.annotation.NestedConfigurationClassTests.S1Config .class ) ; org.springframework.context.annotation.AnnotationConfigApplicationContext . refresh ( ) ; org.springframework.context.annotation.NestedConfigurationClassTests.S1Config org.springframework.context.annotation.NestedConfigurationClassTests.S1Config = org.springframework.context.annotation.AnnotationConfigApplicationContext . getBean ( org.springframework.context.annotation.NestedConfigurationClassTests.S1Config .class ) ; assertTrue ( org.springframework.context.annotation.NestedConfigurationClassTests.S1Config != org.springframework.context.annotation.AnnotationConfigApplicationContext . getBean ( org.springframework.context.annotation.NestedConfigurationClassTests.S1Config .class ) ) ; TestBean org.springframework.context.annotation.TestBean = org.springframework.context.annotation.AnnotationConfigApplicationContext . getBean ( STRING , TestBean .class ) ; assertTrue ( org.springframework.context.annotation.TestBean == org.springframework.context.annotation.AnnotationConfigApplicationContext . getBean ( STRING , TestBean .class ) ) ; org.springframework.context.annotation.AnnotationConfigApplicationContext . getBean ( org.springframework.context.annotation.NestedConfigurationClassTests.L0Config . org.springframework.context.annotation.NestedConfigurationClassTests.L0Config.L1Config .class ) ; org.springframework.context.annotation.AnnotationConfigApplicationContext . getBean ( STRING ) ; org.springframework.context.annotation.AnnotationConfigApplicationContext . getBean ( org.springframework.context.annotation.NestedConfigurationClassTests.L0Config . org.springframework.context.annotation.NestedConfigurationClassTests.L0Config.L1Config . org.springframework.context.annotation.NestedConfigurationClassTests.L0Config.L1Config.L2Config .class ) ; org.springframework.context.annotation.AnnotationConfigApplicationContext . getBean ( STRING ) ; TestBean org.springframework.context.annotation.TestBean = org.springframework.context.annotation.AnnotationConfigApplicationContext . getBean ( STRING , TestBean .class ) ; assertThat ( org.springframework.context.annotation.TestBean . getName ( ) , is ( STRING ) ) ; assertTrue ( org.springframework.context.annotation.TestBean == org.springframework.context.annotation.AnnotationConfigApplicationContext . getBean ( STRING , TestBean .class ) ) ; TestBean org.springframework.context.annotation.TestBean = org.springframework.context.annotation.AnnotationConfigApplicationContext . getBean ( STRING , TestBean .class ) ; TestBean org.springframework.context.annotation.TestBean = org.springframework.context.annotation.AnnotationConfigApplicationContext . getBean ( STRING , TestBean .class ) ; assertTrue ( org.springframework.context.annotation.TestBean != org.springframework.context.annotation.TestBean ) ; assertTrue ( org.springframework.context.annotation.TestBean . getFriends ( ) . iterator ( ) . next ( ) != org.springframework.context.annotation.TestBean . getFriends ( ) . iterator ( ) . next ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { AnnotationConfigApplicationContext org.springframework.context.annotation.AnnotationConfigApplicationContext = new AnnotationConfigApplicationContext ( ) ; org.springframework.context.annotation.AnnotationConfigApplicationContext . register ( org.springframework.context.annotation.NestedConfigurationClassTests.S1Importer .class ) ; org.springframework.context.annotation.AnnotationConfigApplicationContext . refresh ( ) ; org.springframework.context.annotation.NestedConfigurationClassTests.S1Config org.springframework.context.annotation.NestedConfigurationClassTests.S1Config = org.springframework.context.annotation.AnnotationConfigApplicationContext . getBean ( org.springframework.context.annotation.NestedConfigurationClassTests.S1Config .class ) ; assertTrue ( org.springframework.context.annotation.NestedConfigurationClassTests.S1Config != org.springframework.context.annotation.AnnotationConfigApplicationContext . getBean ( org.springframework.context.annotation.NestedConfigurationClassTests.S1Config .class ) ) ; TestBean org.springframework.context.annotation.TestBean = org.springframework.context.annotation.AnnotationConfigApplicationContext . getBean ( STRING , TestBean .class ) ; assertTrue ( org.springframework.context.annotation.TestBean == org.springframework.context.annotation.AnnotationConfigApplicationContext . getBean ( STRING , TestBean .class ) ) ; org.springframework.context.annotation.AnnotationConfigApplicationContext . getBean ( org.springframework.context.annotation.NestedConfigurationClassTests.L0Config . org.springframework.context.annotation.NestedConfigurationClassTests.L0Config.L1Config .class ) ; org.springframework.context.annotation.AnnotationConfigApplicationContext . getBean ( STRING ) ; org.springframework.context.annotation.AnnotationConfigApplicationContext . getBean ( org.springframework.context.annotation.NestedConfigurationClassTests.L0Config . org.springframework.context.annotation.NestedConfigurationClassTests.L0Config.L1Config . org.springframework.context.annotation.NestedConfigurationClassTests.L0Config.L1Config.L2Config .class ) ; org.springframework.context.annotation.AnnotationConfigApplicationContext . getBean ( STRING ) ; TestBean org.springframework.context.annotation.TestBean = org.springframework.context.annotation.AnnotationConfigApplicationContext . getBean ( STRING , TestBean .class ) ; assertThat ( org.springframework.context.annotation.TestBean . getName ( ) , is ( STRING ) ) ; assertTrue ( org.springframework.context.annotation.TestBean == org.springframework.context.annotation.AnnotationConfigApplicationContext . getBean ( STRING , TestBean .class ) ) ; TestBean org.springframework.context.annotation.TestBean = org.springframework.context.annotation.AnnotationConfigApplicationContext . getBean ( STRING , TestBean .class ) ; TestBean org.springframework.context.annotation.TestBean = org.springframework.context.annotation.AnnotationConfigApplicationContext . getBean ( STRING , TestBean .class ) ; assertTrue ( org.springframework.context.annotation.TestBean != org.springframework.context.annotation.TestBean ) ; assertTrue ( org.springframework.context.annotation.TestBean . getFriends ( ) . iterator ( ) . next ( ) != org.springframework.context.annotation.TestBean . getFriends ( ) . iterator ( ) . next ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { AnnotationConfigApplicationContext org.springframework.context.annotation.AnnotationConfigApplicationContext = new AnnotationConfigApplicationContext ( ) ; org.springframework.context.annotation.AnnotationConfigApplicationContext . register ( org.springframework.context.annotation.NestedConfigurationClassTests.S1ImporterWithProxy .class ) ; org.springframework.context.annotation.AnnotationConfigApplicationContext . refresh ( ) ; org.springframework.context.annotation.NestedConfigurationClassTests.S1ConfigWithProxy org.springframework.context.annotation.NestedConfigurationClassTests.S1ConfigWithProxy = org.springframework.context.annotation.AnnotationConfigApplicationContext . getBean ( org.springframework.context.annotation.NestedConfigurationClassTests.S1ConfigWithProxy .class ) ; assertTrue ( org.springframework.context.annotation.NestedConfigurationClassTests.S1ConfigWithProxy == org.springframework.context.annotation.AnnotationConfigApplicationContext . getBean ( org.springframework.context.annotation.NestedConfigurationClassTests.S1ConfigWithProxy .class ) ) ; TestBean org.springframework.context.annotation.TestBean = org.springframework.context.annotation.AnnotationConfigApplicationContext . getBean ( STRING , TestBean .class ) ; assertTrue ( org.springframework.context.annotation.TestBean == org.springframework.context.annotation.AnnotationConfigApplicationContext . getBean ( STRING , TestBean .class ) ) ; org.springframework.context.annotation.AnnotationConfigApplicationContext . getBean ( org.springframework.context.annotation.NestedConfigurationClassTests.L0Config . org.springframework.context.annotation.NestedConfigurationClassTests.L0Config.L1Config .class ) ; org.springframework.context.annotation.AnnotationConfigApplicationContext . getBean ( STRING ) ; org.springframework.context.annotation.AnnotationConfigApplicationContext . getBean ( org.springframework.context.annotation.NestedConfigurationClassTests.L0Config . org.springframework.context.annotation.NestedConfigurationClassTests.L0Config.L1Config . org.springframework.context.annotation.NestedConfigurationClassTests.L0Config.L1Config.L2Config .class ) ; org.springframework.context.annotation.AnnotationConfigApplicationContext . getBean ( STRING ) ; TestBean org.springframework.context.annotation.TestBean = org.springframework.context.annotation.AnnotationConfigApplicationContext . getBean ( STRING , TestBean .class ) ; assertThat ( org.springframework.context.annotation.TestBean . getName ( ) , is ( STRING ) ) ; assertTrue ( org.springframework.context.annotation.TestBean == org.springframework.context.annotation.AnnotationConfigApplicationContext . getBean ( STRING , TestBean .class ) ) ; TestBean org.springframework.context.annotation.TestBean = org.springframework.context.annotation.AnnotationConfigApplicationContext . getBean ( STRING , TestBean .class ) ; TestBean org.springframework.context.annotation.TestBean = org.springframework.context.annotation.AnnotationConfigApplicationContext . getBean ( STRING , TestBean .class ) ; assertTrue ( org.springframework.context.annotation.TestBean != org.springframework.context.annotation.TestBean ) ; assertTrue ( org.springframework.context.annotation.TestBean . getFriends ( ) . iterator ( ) . next ( ) != org.springframework.context.annotation.TestBean . getFriends ( ) . iterator ( ) . next ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { AnnotationConfigApplicationContext org.springframework.context.annotation.AnnotationConfigApplicationContext = new AnnotationConfigApplicationContext ( ) ; org.springframework.context.annotation.AnnotationConfigApplicationContext . register ( org.springframework.context.annotation.NestedConfigurationClassTests.L0ConfigEmpty .class ) ; org.springframework.context.annotation.AnnotationConfigApplicationContext . refresh ( ) ; assertFalse ( org.springframework.context.annotation.AnnotationConfigApplicationContext . getBeanFactory ( ) . containsSingleton ( STRING ) ) ; java.lang.Object java.lang.Object = org.springframework.context.annotation.AnnotationConfigApplicationContext . getBean ( org.springframework.context.annotation.NestedConfigurationClassTests.L0ConfigEmpty .class ) ; java.lang.Object java.lang.Object = org.springframework.context.annotation.AnnotationConfigApplicationContext . getBean ( org.springframework.context.annotation.NestedConfigurationClassTests.L0ConfigEmpty .class ) ; assertTrue ( java.lang.Object == java.lang.Object ) ; java.lang.Object java.lang.Object = org.springframework.context.annotation.AnnotationConfigApplicationContext . getBean ( org.springframework.context.annotation.NestedConfigurationClassTests.L0ConfigEmpty . org.springframework.context.annotation.NestedConfigurationClassTests.L0ConfigEmpty.L1ConfigEmpty .class ) ; java.lang.Object java.lang.Object = org.springframework.context.annotation.AnnotationConfigApplicationContext . getBean ( org.springframework.context.annotation.NestedConfigurationClassTests.L0ConfigEmpty . org.springframework.context.annotation.NestedConfigurationClassTests.L0ConfigEmpty.L1ConfigEmpty .class ) ; assertTrue ( java.lang.Object != java.lang.Object ) ; java.lang.Object java.lang.Object = org.springframework.context.annotation.AnnotationConfigApplicationContext . getBean ( org.springframework.context.annotation.NestedConfigurationClassTests.L0ConfigEmpty . org.springframework.context.annotation.NestedConfigurationClassTests.L0ConfigEmpty.L1ConfigEmpty . org.springframework.context.annotation.NestedConfigurationClassTests.L0ConfigEmpty.L1ConfigEmpty.L2ConfigEmpty .class ) ; java.lang.Object java.lang.Object = org.springframework.context.annotation.AnnotationConfigApplicationContext . getBean ( org.springframework.context.annotation.NestedConfigurationClassTests.L0ConfigEmpty . org.springframework.context.annotation.NestedConfigurationClassTests.L0ConfigEmpty.L1ConfigEmpty . org.springframework.context.annotation.NestedConfigurationClassTests.L0ConfigEmpty.L1ConfigEmpty.L2ConfigEmpty .class ) ; assertTrue ( java.lang.Object == java.lang.Object ) ; assertNotEquals ( java.lang.Object . java.lang.String ( ) , java.lang.Object . java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Bean @ Lazy public org.springframework.context.annotation.TestBean org.springframework.context.annotation.TestBean ( ) { return new TestBean ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Bean @ Lazy public org.springframework.context.annotation.TestBean org.springframework.context.annotation.TestBean ( ) { return new TestBean ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.context.annotation.TestBean org.springframework.context.annotation.TestBean ( ) { return new TestBean ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.context.annotation.TestBean org.springframework.context.annotation.TestBean ( ) { return new TestBean ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Bean @ Lazy public org.springframework.context.annotation.TestBean org.springframework.context.annotation.TestBean ( ) { return new TestBean ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Bean @ Lazy public org.springframework.context.annotation.TestBean org.springframework.context.annotation.TestBean ( ) { return new TestBean ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Bean @ Lazy public org.springframework.context.annotation.TestBean org.springframework.context.annotation.TestBean ( ) { return new TestBean ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Bean @ Lazy public org.springframework.context.annotation.TestBean org.springframework.context.annotation.TestBean ( ) { return new TestBean ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.context.annotation.TestBean org.springframework.context.annotation.TestBean ( ) { return new TestBean ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.context.annotation.TestBean org.springframework.context.annotation.TestBean ( ) { return new TestBean ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Bean @ Lazy public org.springframework.context.annotation.TestBean org.springframework.context.annotation.TestBean ( ) { return new TestBean ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Bean @ Lazy public org.springframework.context.annotation.TestBean org.springframework.context.annotation.TestBean ( ) { return new TestBean ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override @ Bean public org.springframework.context.annotation.TestBean org.springframework.context.annotation.TestBean ( ) { return new TestBean ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Bean @ Scope ( STRING ) public org.springframework.context.annotation.TestBean org.springframework.context.annotation.TestBean ( ) { TestBean org.springframework.context.annotation.TestBean = new TestBean ( STRING ) ; org.springframework.context.annotation.TestBean . getFriends ( ) . add ( this ) ; return org.springframework.context.annotation.TestBean ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override @ Bean public org.springframework.context.annotation.TestBean org.springframework.context.annotation.TestBean ( ) { return new TestBean ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Bean @ Scope ( STRING ) public org.springframework.context.annotation.TestBean org.springframework.context.annotation.TestBean ( ) { TestBean org.springframework.context.annotation.TestBean = new TestBean ( STRING ) ; org.springframework.context.annotation.TestBean . getFriends ( ) . add ( this ) ; return org.springframework.context.annotation.TestBean ; }  <METHOD_END>