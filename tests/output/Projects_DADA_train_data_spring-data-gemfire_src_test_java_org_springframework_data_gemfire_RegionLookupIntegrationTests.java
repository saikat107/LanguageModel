<METHOD_START> protected void void ( final java.lang.String java.lang.String ) { ConfigurableApplicationContext org.springframework.data.gemfire.ConfigurableApplicationContext = null ; try { org.springframework.data.gemfire.ConfigurableApplicationContext = org.springframework.data.gemfire.ConfigurableApplicationContext ( java.lang.String ) ; fail ( STRING ) ; } catch ( BeanCreationException org.springframework.data.gemfire.BeanCreationException ) { assertTrue ( org.springframework.data.gemfire.BeanCreationException . getMessage ( ) , org.springframework.data.gemfire.BeanCreationException . getCause ( ) instanceof RegionExistsException ) ; throw ( RegionExistsException ) org.springframework.data.gemfire.BeanCreationException . getCause ( ) ; } finally { void ( org.springframework.data.gemfire.ConfigurableApplicationContext ) ; } }  <METHOD_END>
<METHOD_START> protected void void ( final ConfigurableApplicationContext org.springframework.data.gemfire.ConfigurableApplicationContext ) { if ( org.springframework.data.gemfire.ConfigurableApplicationContext != null ) { org.springframework.data.gemfire.ConfigurableApplicationContext . close ( ) ; } }  <METHOD_END>
<METHOD_START> protected org.springframework.data.gemfire.ConfigurableApplicationContext org.springframework.data.gemfire.ConfigurableApplicationContext ( final java.lang.String java.lang.String ) { return new ClassPathXmlApplicationContext ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { ConfigurableApplicationContext org.springframework.data.gemfire.ConfigurableApplicationContext = null ; try { org.springframework.data.gemfire.ConfigurableApplicationContext = org.springframework.data.gemfire.ConfigurableApplicationContext ( STRING ) ; assertNotNull ( org.springframework.data.gemfire.ConfigurableApplicationContext ) ; assertTrue ( org.springframework.data.gemfire.ConfigurableApplicationContext . containsBean ( STRING ) ) ; Region org.springframework.data.gemfire.Region = org.springframework.data.gemfire.ConfigurableApplicationContext . getBean ( STRING , Region .class ) ; assertNotNull ( org.springframework.data.gemfire.Region ) ; assertEquals ( STRING , org.springframework.data.gemfire.Region . getName ( ) ) ; assertEquals ( STRING , org.springframework.data.gemfire.Region . getFullPath ( ) ) ; assertNotNull ( org.springframework.data.gemfire.Region . getAttributes ( ) ) ; assertEquals ( DataPolicy . PERSISTENT_REPLICATE , org.springframework.data.gemfire.Region . getAttributes ( ) . getDataPolicy ( ) ) ; assertFalse ( org.springframework.data.gemfire.Region . getAttributes ( ) . getMulticastEnabled ( ) ) ; assertEquals ( Scope . DISTRIBUTED_ACK , org.springframework.data.gemfire.Region . getAttributes ( ) . getScope ( ) ) ; assertEquals ( NUMBER , org.springframework.data.gemfire.Region . getAttributes ( ) . getInitialCapacity ( ) ) ; assertEquals ( new java.lang.Float ( NUMBER ) , new java.lang.Float ( org.springframework.data.gemfire.Region . getAttributes ( ) . getLoadFactor ( ) ) ) ; assertTrue ( org.springframework.data.gemfire.Region . getAttributes ( ) . getCloningEnabled ( ) ) ; assertTrue ( org.springframework.data.gemfire.Region . getAttributes ( ) . getConcurrencyChecksEnabled ( ) ) ; assertEquals ( java.lang.Integer .class , org.springframework.data.gemfire.Region . getAttributes ( ) . getKeyConstraint ( ) ) ; assertEquals ( java.lang.String .class , org.springframework.data.gemfire.Region . getAttributes ( ) . getValueConstraint ( ) ) ; } finally { void ( org.springframework.data.gemfire.ConfigurableApplicationContext ) ; } }  <METHOD_END>
<METHOD_START> @ Test ( expected = RegionExistsException .class ) public void void ( ) { void ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = RegionExistsException .class ) public void void ( ) { void ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = RegionExistsException .class ) public void void ( ) { void ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = RegionExistsException .class ) public void void ( ) { void ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = RegionExistsException .class ) public void void ( ) { void ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = RegionExistsException .class ) public void void ( ) { void ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = RegionExistsException .class ) public void void ( ) { void ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { ConfigurableApplicationContext org.springframework.data.gemfire.ConfigurableApplicationContext = null ; try { org.springframework.data.gemfire.ConfigurableApplicationContext = org.springframework.data.gemfire.ConfigurableApplicationContext ( STRING ) ; assertNotNull ( org.springframework.data.gemfire.ConfigurableApplicationContext ) ; assertTrue ( org.springframework.data.gemfire.ConfigurableApplicationContext . containsBean ( STRING ) ) ; assertTrue ( org.springframework.data.gemfire.ConfigurableApplicationContext . containsBean ( STRING ) ) ; assertTrue ( org.springframework.data.gemfire.ConfigurableApplicationContext . containsBean ( STRING ) ) ; assertTrue ( org.springframework.data.gemfire.ConfigurableApplicationContext . containsBean ( STRING ) ) ; assertTrue ( org.springframework.data.gemfire.ConfigurableApplicationContext . containsBean ( STRING ) ) ; assertTrue ( org.springframework.data.gemfire.ConfigurableApplicationContext . containsBean ( STRING ) ) ; Region org.springframework.data.gemfire.Region = org.springframework.data.gemfire.ConfigurableApplicationContext . getBean ( STRING , Region .class ) ; assertNotNull ( org.springframework.data.gemfire.Region ) ; assertEquals ( STRING , org.springframework.data.gemfire.Region . getName ( ) ) ; assertEquals ( STRING , org.springframework.data.gemfire.Region . getFullPath ( ) ) ; assertNotNull ( org.springframework.data.gemfire.Region . getAttributes ( ) ) ; assertEquals ( DataPolicy . NORMAL , org.springframework.data.gemfire.Region . getAttributes ( ) . getDataPolicy ( ) ) ; assertFalse ( org.springframework.data.gemfire.Region . getAttributes ( ) . getCloningEnabled ( ) ) ; assertFalse ( org.springframework.data.gemfire.Region . getAttributes ( ) . getConcurrencyChecksEnabled ( ) ) ; assertEquals ( NUMBER , org.springframework.data.gemfire.Region . getAttributes ( ) . getConcurrencyLevel ( ) ) ; assertEquals ( NUMBER , org.springframework.data.gemfire.Region . getAttributes ( ) . getInitialCapacity ( ) ) ; assertEquals ( java.lang.Integer .class , org.springframework.data.gemfire.Region . getAttributes ( ) . getKeyConstraint ( ) ) ; assertEquals ( new java.lang.Float ( NUMBER ) , new java.lang.Float ( org.springframework.data.gemfire.Region . getAttributes ( ) . getLoadFactor ( ) ) ) ; assertEquals ( java.lang.String .class , org.springframework.data.gemfire.Region . getAttributes ( ) . getValueConstraint ( ) ) ; Region org.springframework.data.gemfire.Region = org.springframework.data.gemfire.ConfigurableApplicationContext . getBean ( STRING , Region .class ) ; assertNotNull ( org.springframework.data.gemfire.Region ) ; assertEquals ( STRING , org.springframework.data.gemfire.Region . getName ( ) ) ; assertEquals ( STRING , org.springframework.data.gemfire.Region . getFullPath ( ) ) ; assertNotNull ( org.springframework.data.gemfire.Region . getAttributes ( ) ) ; assertEquals ( DataPolicy . PERSISTENT_PARTITION , org.springframework.data.gemfire.Region . getAttributes ( ) . getDataPolicy ( ) ) ; assertTrue ( org.springframework.data.gemfire.Region . getAttributes ( ) . getCloningEnabled ( ) ) ; assertTrue ( org.springframework.data.gemfire.Region . getAttributes ( ) . getConcurrencyChecksEnabled ( ) ) ; assertEquals ( NUMBER , org.springframework.data.gemfire.Region . getAttributes ( ) . getConcurrencyLevel ( ) ) ; assertEquals ( NUMBER , org.springframework.data.gemfire.Region . getAttributes ( ) . getInitialCapacity ( ) ) ; assertEquals ( java.lang.Integer .class , org.springframework.data.gemfire.Region . getAttributes ( ) . getKeyConstraint ( ) ) ; assertEquals ( new java.lang.Float ( NUMBER ) , new java.lang.Float ( org.springframework.data.gemfire.Region . getAttributes ( ) . getLoadFactor ( ) ) ) ; assertFalse ( org.springframework.data.gemfire.Region . getAttributes ( ) . getMulticastEnabled ( ) ) ; assertEquals ( java.lang.String .class , org.springframework.data.gemfire.Region . getAttributes ( ) . getValueConstraint ( ) ) ; Region org.springframework.data.gemfire.Region = org.springframework.data.gemfire.ConfigurableApplicationContext . getBean ( STRING , Region .class ) ; assertNotNull ( org.springframework.data.gemfire.Region ) ; assertEquals ( STRING , org.springframework.data.gemfire.Region . getName ( ) ) ; assertEquals ( STRING , org.springframework.data.gemfire.Region . getFullPath ( ) ) ; assertNotNull ( org.springframework.data.gemfire.Region . getAttributes ( ) ) ; assertEquals ( DataPolicy . PERSISTENT_REPLICATE , org.springframework.data.gemfire.Region . getAttributes ( ) . getDataPolicy ( ) ) ; assertFalse ( org.springframework.data.gemfire.Region . getAttributes ( ) . getCloningEnabled ( ) ) ; assertTrue ( org.springframework.data.gemfire.Region . getAttributes ( ) . getConcurrencyChecksEnabled ( ) ) ; assertEquals ( NUMBER , org.springframework.data.gemfire.Region . getAttributes ( ) . getInitialCapacity ( ) ) ; assertEquals ( new java.lang.Float ( NUMBER ) , new java.lang.Float ( org.springframework.data.gemfire.Region . getAttributes ( ) . getLoadFactor ( ) ) ) ; assertEquals ( java.lang.Integer .class , org.springframework.data.gemfire.Region . getAttributes ( ) . getKeyConstraint ( ) ) ; assertFalse ( org.springframework.data.gemfire.Region . getAttributes ( ) . getMulticastEnabled ( ) ) ; assertEquals ( Scope . DISTRIBUTED_NO_ACK , org.springframework.data.gemfire.Region . getAttributes ( ) . getScope ( ) ) ; assertEquals ( java.lang.String .class , org.springframework.data.gemfire.Region . getAttributes ( ) . getValueConstraint ( ) ) ; Region org.springframework.data.gemfire.Region = org.springframework.data.gemfire.ConfigurableApplicationContext . getBean ( STRING , Region .class ) ; assertNotNull ( org.springframework.data.gemfire.Region ) ; assertEquals ( STRING , org.springframework.data.gemfire.Region . getName ( ) ) ; assertEquals ( STRING , org.springframework.data.gemfire.Region . getFullPath ( ) ) ; assertNotNull ( org.springframework.data.gemfire.Region . getAttributes ( ) ) ; assertEquals ( DataPolicy . REPLICATE , org.springframework.data.gemfire.Region . getAttributes ( ) . getDataPolicy ( ) ) ; Region org.springframework.data.gemfire.Region = org.springframework.data.gemfire.ConfigurableApplicationContext . getBean ( STRING , Region .class ) ; assertNotNull ( org.springframework.data.gemfire.Region ) ; assertEquals ( STRING , org.springframework.data.gemfire.Region . getName ( ) ) ; assertEquals ( STRING , org.springframework.data.gemfire.Region . getFullPath ( ) ) ; assertNotNull ( org.springframework.data.gemfire.Region . getAttributes ( ) ) ; assertEquals ( DataPolicy . REPLICATE , org.springframework.data.gemfire.Region . getAttributes ( ) . getDataPolicy ( ) ) ; } finally { void ( org.springframework.data.gemfire.ConfigurableApplicationContext ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { ConfigurableApplicationContext org.springframework.data.gemfire.ConfigurableApplicationContext = null ; try { org.springframework.data.gemfire.ConfigurableApplicationContext = org.springframework.data.gemfire.ConfigurableApplicationContext ( STRING ) ; assertNotNull ( org.springframework.data.gemfire.ConfigurableApplicationContext ) ; assertTrue ( org.springframework.data.gemfire.ConfigurableApplicationContext . containsBean ( STRING ) ) ; assertTrue ( org.springframework.data.gemfire.ConfigurableApplicationContext . containsBean ( STRING ) ) ; assertTrue ( org.springframework.data.gemfire.ConfigurableApplicationContext . containsBean ( STRING ) ) ; Region org.springframework.data.gemfire.Region = org.springframework.data.gemfire.ConfigurableApplicationContext . getBean ( STRING , Region .class ) ; assertNotNull ( org.springframework.data.gemfire.Region ) ; assertEquals ( STRING , org.springframework.data.gemfire.Region . getName ( ) ) ; assertEquals ( STRING , org.springframework.data.gemfire.Region . getFullPath ( ) ) ; assertNotNull ( org.springframework.data.gemfire.Region . getAttributes ( ) ) ; assertFalse ( org.springframework.data.gemfire.Region . getAttributes ( ) . getCloningEnabled ( ) ) ; assertEquals ( DataPolicy . NORMAL , org.springframework.data.gemfire.Region . getAttributes ( ) . getDataPolicy ( ) ) ; Region org.springframework.data.gemfire.Region = org.springframework.data.gemfire.ConfigurableApplicationContext . getBean ( STRING , Region .class ) ; assertNotNull ( org.springframework.data.gemfire.Region ) ; assertEquals ( STRING , org.springframework.data.gemfire.Region . getName ( ) ) ; assertEquals ( STRING , org.springframework.data.gemfire.Region . getFullPath ( ) ) ; assertNotNull ( org.springframework.data.gemfire.Region . getAttributes ( ) ) ; assertEquals ( DataPolicy . NORMAL , org.springframework.data.gemfire.Region . getAttributes ( ) . getDataPolicy ( ) ) ; } finally { void ( org.springframework.data.gemfire.ConfigurableApplicationContext ) ; } }  <METHOD_END>
