<METHOD_START> @ After public void void ( ) { org.springframework.test.context.ContextHierarchyDirtiesContextTests . org.springframework.test.context.ApplicationContext = null ; org.springframework.test.context.ContextHierarchyDirtiesContextTests . java.lang.String = null ; org.springframework.test.context.ContextHierarchyDirtiesContextTests . java.lang.String = null ; org.springframework.test.context.ContextHierarchyDirtiesContextTests . java.lang.String = null ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( org.springframework.test.context.ContextHierarchyDirtiesContextTests.ClassLevelDirtiesContextWithCurrentLevelModeTestCase .class , true , true , false ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( org.springframework.test.context.ContextHierarchyDirtiesContextTests.ClassLevelDirtiesContextWithExhaustiveModeTestCase .class , false , false , false ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( org.springframework.test.context.ContextHierarchyDirtiesContextTests.MethodLevelDirtiesContextWithCurrentLevelModeTestCase .class , true , true , false ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { void ( org.springframework.test.context.ContextHierarchyDirtiesContextTests.MethodLevelDirtiesContextWithExhaustiveModeTestCase .class , false , false , false ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.lang.Class<? extends org.springframework.test.context.ContextHierarchyDirtiesContextTests.FooTestCase> < ? extends org.springframework.test.context.ContextHierarchyDirtiesContextTests.FooTestCase > java.lang.Class<? extends org.springframework.test.context.ContextHierarchyDirtiesContextTests.FooTestCase> , boolean boolean , boolean boolean , boolean boolean ) { JUnitCore org.springframework.test.context.JUnitCore = new JUnitCore ( ) ; Result org.springframework.test.context.Result = org.springframework.test.context.JUnitCore . run ( java.lang.Class<> ) ; assertTrue ( STRING , org.springframework.test.context.Result . wasSuccessful ( ) ) ; assertThat ( org.springframework.test.context.ContextHierarchyDirtiesContextTests . org.springframework.test.context.ApplicationContext , notNullValue ( ) ) ; ConfigurableApplicationContext org.springframework.test.context.ConfigurableApplicationContext = ( ConfigurableApplicationContext ) org.springframework.test.context.ContextHierarchyDirtiesContextTests . org.springframework.test.context.ApplicationContext ; assertEquals ( STRING , org.springframework.test.context.ContextHierarchyDirtiesContextTests . java.lang.String ) ; assertThat ( STRING , org.springframework.test.context.ConfigurableApplicationContext . isActive ( ) , is ( boolean ) ) ; ConfigurableApplicationContext org.springframework.test.context.ConfigurableApplicationContext = ( ConfigurableApplicationContext ) org.springframework.test.context.ConfigurableApplicationContext . getParent ( ) ; assertThat ( org.springframework.test.context.ConfigurableApplicationContext , notNullValue ( ) ) ; assertEquals ( STRING , org.springframework.test.context.ContextHierarchyDirtiesContextTests . java.lang.String ) ; assertThat ( STRING , org.springframework.test.context.ConfigurableApplicationContext . isActive ( ) , is ( boolean ) ) ; ConfigurableApplicationContext org.springframework.test.context.ConfigurableApplicationContext = ( ConfigurableApplicationContext ) org.springframework.test.context.ConfigurableApplicationContext . getParent ( ) ; assertThat ( org.springframework.test.context.ConfigurableApplicationContext , notNullValue ( ) ) ; assertEquals ( STRING , org.springframework.test.context.ContextHierarchyDirtiesContextTests . java.lang.String ) ; assertThat ( STRING , org.springframework.test.context.ConfigurableApplicationContext . isActive ( ) , is ( boolean ) ) ; }  <METHOD_END>
<METHOD_START> @ Bean public java.lang.String java.lang.String ( ) { return STRING ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ApplicationContext org.springframework.test.context.ApplicationContext ) throws org.springframework.test.context.BeansException { org.springframework.test.context.ContextHierarchyDirtiesContextTests . org.springframework.test.context.ApplicationContext = org.springframework.test.context.ApplicationContext ; org.springframework.test.context.ContextHierarchyDirtiesContextTests . java.lang.String = org.springframework.test.context.ApplicationContext . getBean ( STRING , java.lang.String .class ) ; org.springframework.test.context.ContextHierarchyDirtiesContextTests . java.lang.String = org.springframework.test.context.ApplicationContext . getParent ( ) . getBean ( STRING , java.lang.String .class ) ; org.springframework.test.context.ContextHierarchyDirtiesContextTests . java.lang.String = org.springframework.test.context.ApplicationContext . getParent ( ) . getParent ( ) . getBean ( STRING , java.lang.String .class ) ; }  <METHOD_END>
<METHOD_START> @ Bean public java.lang.String java.lang.String ( ) { return STRING ; }  <METHOD_END>
<METHOD_START> @ Bean public java.lang.String java.lang.String ( ) { return STRING ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) {		}  <METHOD_END>
<METHOD_START> @ Test public void void ( ) {		}  <METHOD_END>
<METHOD_START> @ Test @ DirtiesContext public void void ( ) {		}  <METHOD_END>
<METHOD_START> @ Test @ DirtiesContext ( hierarchyMode = HierarchyMode . CURRENT_LEVEL ) public void void ( ) {		}  <METHOD_END>
