<METHOD_START> @ Before public void void ( ) { assertThat ( GemfireBeanFactoryLocator . BEAN_FACTORIES . isEmpty ( ) ) . isTrue ( ) ; }  <METHOD_END>
<METHOD_START> @ After public void void ( ) { GemfireBeanFactoryLocator . BEAN_FACTORIES . clear ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { GemfireBeanFactoryLocator org.springframework.data.gemfire.support.GemfireBeanFactoryLocator = newBeanFactoryLocator ( ) ; assertThat ( org.springframework.data.gemfire.support.GemfireBeanFactoryLocator ) . isNotNull ( ) ; assertThat ( org.springframework.data.gemfire.support.GemfireBeanFactoryLocator . getBeanFactory ( ) ) . isNull ( ) ; assertThat ( org.springframework.data.gemfire.support.GemfireBeanFactoryLocator . getAssociatedBeanName ( ) ) . isNull ( ) ; assertThat ( org.springframework.data.gemfire.support.GemfireBeanFactoryLocator . getAssociatedBeanNameWithAliases ( ) ) . isNotNull ( ) ; assertThat ( org.springframework.data.gemfire.support.GemfireBeanFactoryLocator . getAssociatedBeanNameWithAliases ( ) ) . isEmpty ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { when ( org.springframework.data.gemfire.support.BeanFactory . getAliases ( anyString ( ) ) ) . thenReturn ( new java.lang.String [ NUMBER ] ) ; GemfireBeanFactoryLocator org.springframework.data.gemfire.support.GemfireBeanFactoryLocator = newBeanFactoryLocator ( org.springframework.data.gemfire.support.BeanFactory , STRING ) ; assertThat ( org.springframework.data.gemfire.support.GemfireBeanFactoryLocator ) . isNotNull ( ) ; assertThat ( org.springframework.data.gemfire.support.GemfireBeanFactoryLocator . getBeanFactory ( ) ) . isSameAs ( org.springframework.data.gemfire.support.BeanFactory ) ; assertThat ( org.springframework.data.gemfire.support.GemfireBeanFactoryLocator . getAssociatedBeanName ( ) ) . isEqualTo ( STRING ) ; assertThat ( org.springframework.data.gemfire.support.GemfireBeanFactoryLocator . getAssociatedBeanNameWithAliases ( ) ) . isNotNull ( ) ; assertThat ( org.springframework.data.gemfire.support.GemfireBeanFactoryLocator . getAssociatedBeanNameWithAliases ( ) ) . hasSize ( NUMBER ) ; assertThat ( org.springframework.data.gemfire.support.GemfireBeanFactoryLocator . getAssociatedBeanNameWithAliases ( ) ) . containsAll ( asSet ( STRING ) ) ; verify ( org.springframework.data.gemfire.support.BeanFactory , times ( NUMBER ) ) . getAliases ( eq ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { GemfireBeanFactoryLocator org.springframework.data.gemfire.support.GemfireBeanFactoryLocator = newBeanFactoryLocator ( null , STRING ) ; assertThat ( org.springframework.data.gemfire.support.GemfireBeanFactoryLocator ) . isNotNull ( ) ; assertThat ( org.springframework.data.gemfire.support.GemfireBeanFactoryLocator . getBeanFactory ( ) ) . isNull ( ) ; assertThat ( org.springframework.data.gemfire.support.GemfireBeanFactoryLocator . getAssociatedBeanName ( ) ) . isEqualTo ( STRING ) ; assertThat ( org.springframework.data.gemfire.support.GemfireBeanFactoryLocator . getAssociatedBeanNameWithAliases ( ) ) . isNotNull ( ) ; assertThat ( org.springframework.data.gemfire.support.GemfireBeanFactoryLocator . getAssociatedBeanNameWithAliases ( ) ) . isEmpty ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.gemfire.support.ExpectedException . expect ( java.lang.IllegalArgumentException .class ) ; org.springframework.data.gemfire.support.ExpectedException . expectCause ( is ( nullValue ( java.lang.Throwable .class ) ) ) ; org.springframework.data.gemfire.support.ExpectedException . expectMessage ( STRING ) ; newBeanFactoryLocator ( org.springframework.data.gemfire.support.BeanFactory , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { GemfireBeanFactoryLocator . BEAN_FACTORIES . put ( STRING , org.springframework.data.gemfire.support.BeanFactory ) ; assertThat ( GemfireBeanFactoryLocator . BEAN_FACTORIES ) . hasSize ( NUMBER ) ; assertThat ( GemfireBeanFactoryLocator . resolveBeanFactory ( STRING ) ) . isSameAs ( org.springframework.data.gemfire.support.BeanFactory ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( GemfireBeanFactoryLocator . BEAN_FACTORIES ) . isEmpty ( ) ; assertThat ( GemfireBeanFactoryLocator . resolveBeanFactory ( STRING ) ) . isNull ( ) ; assertThat ( GemfireBeanFactoryLocator . resolveBeanFactory ( STRING ) ) . isNull ( ) ; assertThat ( GemfireBeanFactoryLocator . resolveBeanFactory ( STRING ) ) . isNull ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { GemfireBeanFactoryLocator . BEAN_FACTORIES . put ( STRING , org.springframework.data.gemfire.support.BeanFactory ) ; assertThat ( GemfireBeanFactoryLocator . BEAN_FACTORIES ) . hasSize ( NUMBER ) ; org.springframework.data.gemfire.support.ExpectedException . expect ( java.lang.IllegalArgumentException .class ) ; org.springframework.data.gemfire.support.ExpectedException . expectCause ( is ( nullValue ( java.lang.Throwable .class ) ) ) ; org.springframework.data.gemfire.support.ExpectedException . expectMessage ( STRING ) ; GemfireBeanFactoryLocator . resolveBeanFactory ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( GemfireBeanFactoryLocator . BEAN_FACTORIES . isEmpty ( ) ) . isTrue ( ) ; assertThat ( GemfireBeanFactoryLocator . resolveSingleBeanFactory ( ) ) . isNull ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { GemfireBeanFactoryLocator . BEAN_FACTORIES . put ( STRING , org.springframework.data.gemfire.support.BeanFactory ) ; assertThat ( GemfireBeanFactoryLocator . BEAN_FACTORIES . size ( ) ) . isEqualTo ( NUMBER ) ; assertThat ( GemfireBeanFactoryLocator . resolveSingleBeanFactory ( ) ) . isSameAs ( org.springframework.data.gemfire.support.BeanFactory ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { GemfireBeanFactoryLocator . BEAN_FACTORIES . put ( STRING , org.springframework.data.gemfire.support.BeanFactory ) ; GemfireBeanFactoryLocator . BEAN_FACTORIES . put ( STRING , org.springframework.data.gemfire.support.BeanFactory ) ; assertThat ( GemfireBeanFactoryLocator . BEAN_FACTORIES . size ( ) ) . isEqualTo ( NUMBER ) ; assertThat ( GemfireBeanFactoryLocator . resolveSingleBeanFactory ( ) ) . isSameAs ( org.springframework.data.gemfire.support.BeanFactory ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { GemfireBeanFactoryLocator . BEAN_FACTORIES . put ( STRING , org.springframework.data.gemfire.support.BeanFactory ) ; GemfireBeanFactoryLocator . BEAN_FACTORIES . put ( STRING , mock ( BeanFactory .class ) ) ; assertThat ( GemfireBeanFactoryLocator . BEAN_FACTORIES . size ( ) ) . isEqualTo ( NUMBER ) ; org.springframework.data.gemfire.support.ExpectedException . expect ( java.lang.IllegalStateException .class ) ; org.springframework.data.gemfire.support.ExpectedException . expectCause ( is ( nullValue ( java.lang.Throwable .class ) ) ) ; org.springframework.data.gemfire.support.ExpectedException . expectMessage ( STRING + STRING ) ; GemfireBeanFactoryLocator . resolveSingleBeanFactory ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.util.Set<java.lang.String> < java.lang.String > java.util.Set<java.lang.String> = asSet ( STRING , STRING , STRING ) ; GemfireBeanFactoryLocator . registerAliases ( java.util.Set<java.lang.String> , org.springframework.data.gemfire.support.BeanFactory ) ; assertThat ( GemfireBeanFactoryLocator . BEAN_FACTORIES . size ( ) ) . isEqualTo ( NUMBER ) ; assertThat ( GemfireBeanFactoryLocator . BEAN_FACTORIES . keySet ( ) ) . containsAll ( java.util.Set<java.lang.String> ) ; java.util.Set<org.springframework.data.gemfire.support.BeanFactory> < BeanFactory > java.util.Set<org.springframework.data.gemfire.support.BeanFactory> = new java.util.HashSet <> ( GemfireBeanFactoryLocator . BEAN_FACTORIES . values ( ) ) ; assertThat ( java.util.Set<org.springframework.data.gemfire.support.BeanFactory> ) . hasSize ( NUMBER ) ; assertThat ( java.util.Set<org.springframework.data.gemfire.support.BeanFactory> ) . containsAll ( asSet ( org.springframework.data.gemfire.support.BeanFactory ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { GemfireBeanFactoryLocator . registerAliases ( java.util.Collections . java.util.Set<java.lang.Object> ( ) , org.springframework.data.gemfire.support.BeanFactory ) ; assertThat ( GemfireBeanFactoryLocator . BEAN_FACTORIES . isEmpty ( ) ) . isTrue ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { GemfireBeanFactoryLocator . registerAliases ( java.util.Collections . java.util.Set<java.lang.Object> ( ) , null ) ; assertThat ( GemfireBeanFactoryLocator . BEAN_FACTORIES . isEmpty ( ) ) . isTrue ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.gemfire.support.ExpectedException . expect ( java.lang.IllegalArgumentException .class ) ; org.springframework.data.gemfire.support.ExpectedException . expectCause ( is ( nullValue ( java.lang.Throwable .class ) ) ) ; org.springframework.data.gemfire.support.ExpectedException . expectMessage ( STRING ) ; GemfireBeanFactoryLocator . registerAliases ( asSet ( STRING , STRING ) , null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { GemfireBeanFactoryLocator . registerAliases ( null , null ) ; assertThat ( GemfireBeanFactoryLocator . BEAN_FACTORIES . isEmpty ( ) ) . isTrue ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { GemfireBeanFactoryLocator . BEAN_FACTORIES . put ( STRING , org.springframework.data.gemfire.support.BeanFactory ) ; assertThat ( GemfireBeanFactoryLocator . BEAN_FACTORIES . size ( ) ) . isEqualTo ( NUMBER ) ; assertThat ( GemfireBeanFactoryLocator . BEAN_FACTORIES . get ( STRING ) ) . isSameAs ( org.springframework.data.gemfire.support.BeanFactory ) ; GemfireBeanFactoryLocator . registerAliases ( asSet ( STRING , STRING ) , org.springframework.data.gemfire.support.BeanFactory ) ; assertThat ( GemfireBeanFactoryLocator . BEAN_FACTORIES . size ( ) ) . isEqualTo ( NUMBER ) ; assertThat ( GemfireBeanFactoryLocator . BEAN_FACTORIES . get ( STRING ) ) . isSameAs ( org.springframework.data.gemfire.support.BeanFactory ) ; assertThat ( GemfireBeanFactoryLocator . BEAN_FACTORIES . get ( STRING ) ) . isSameAs ( org.springframework.data.gemfire.support.BeanFactory ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { GemfireBeanFactoryLocator . BEAN_FACTORIES . put ( STRING , org.springframework.data.gemfire.support.BeanFactory ) ; assertThat ( GemfireBeanFactoryLocator . BEAN_FACTORIES . size ( ) ) . isEqualTo ( NUMBER ) ; assertThat ( GemfireBeanFactoryLocator . BEAN_FACTORIES . get ( STRING ) ) . isSameAs ( org.springframework.data.gemfire.support.BeanFactory ) ; org.springframework.data.gemfire.support.ExpectedException . expect ( java.lang.IllegalArgumentException .class ) ; org.springframework.data.gemfire.support.ExpectedException . expectCause ( is ( nullValue ( java.lang.Throwable .class ) ) ) ; org.springframework.data.gemfire.support.ExpectedException . expectMessage ( STRING ) ; GemfireBeanFactoryLocator . registerAliases ( asSet ( STRING , STRING ) , mock ( BeanFactory .class ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { GemfireBeanFactoryLocator . BEAN_FACTORIES . put ( STRING , org.springframework.data.gemfire.support.BeanFactory ) ; GemfireBeanFactoryLocator . BEAN_FACTORIES . put ( STRING , org.springframework.data.gemfire.support.BeanFactory ) ; assertThat ( GemfireBeanFactoryLocator . BEAN_FACTORIES . size ( ) ) . isEqualTo ( NUMBER ) ; GemfireBeanFactoryLocator . unregisterAliases ( asSet ( STRING , STRING ) ) ; assertThat ( GemfireBeanFactoryLocator . BEAN_FACTORIES . isEmpty ( ) ) . isTrue ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { GemfireBeanFactoryLocator . BEAN_FACTORIES . put ( STRING , org.springframework.data.gemfire.support.BeanFactory ) ; GemfireBeanFactoryLocator . BEAN_FACTORIES . put ( STRING , org.springframework.data.gemfire.support.BeanFactory ) ; assertThat ( GemfireBeanFactoryLocator . BEAN_FACTORIES . size ( ) ) . isEqualTo ( NUMBER ) ; GemfireBeanFactoryLocator . unregisterAliases ( asSet ( STRING ) ) ; assertThat ( GemfireBeanFactoryLocator . BEAN_FACTORIES . size ( ) ) . isEqualTo ( NUMBER ) ; assertThat ( GemfireBeanFactoryLocator . BEAN_FACTORIES . containsKey ( STRING ) ) . isTrue ( ) ; assertThat ( GemfireBeanFactoryLocator . BEAN_FACTORIES . containsKey ( STRING ) ) . isFalse ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { GemfireBeanFactoryLocator . BEAN_FACTORIES . put ( STRING , org.springframework.data.gemfire.support.BeanFactory ) ; GemfireBeanFactoryLocator . BEAN_FACTORIES . put ( STRING , org.springframework.data.gemfire.support.BeanFactory ) ; assertThat ( GemfireBeanFactoryLocator . BEAN_FACTORIES . size ( ) ) . isEqualTo ( NUMBER ) ; GemfireBeanFactoryLocator . unregisterAliases ( asSet ( STRING , STRING ) ) ; assertThat ( GemfireBeanFactoryLocator . BEAN_FACTORIES . size ( ) ) . isEqualTo ( NUMBER ) ; assertThat ( GemfireBeanFactoryLocator . BEAN_FACTORIES . containsKey ( STRING ) ) . isTrue ( ) ; assertThat ( GemfireBeanFactoryLocator . BEAN_FACTORIES . containsKey ( STRING ) ) . isTrue ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { when ( org.springframework.data.gemfire.support.BeanFactory . getAliases ( eq ( STRING ) ) ) . thenReturn ( new java.lang.String [] { STRING , STRING } ) ; GemfireBeanFactoryLocator org.springframework.data.gemfire.support.GemfireBeanFactoryLocator = newBeanFactoryLocator ( org.springframework.data.gemfire.support.BeanFactory , STRING ) ; assertThat ( org.springframework.data.gemfire.support.GemfireBeanFactoryLocator ) . isNotNull ( ) ; assertThat ( org.springframework.data.gemfire.support.GemfireBeanFactoryLocator . getBeanFactory ( ) ) . isSameAs ( org.springframework.data.gemfire.support.BeanFactory ) ; assertThat ( org.springframework.data.gemfire.support.GemfireBeanFactoryLocator . getAssociatedBeanName ( ) ) . isEqualTo ( STRING ) ; assertThat ( org.springframework.data.gemfire.support.GemfireBeanFactoryLocator . getAssociatedBeanNameWithAliases ( ) ) . isNotNull ( ) ; assertThat ( org.springframework.data.gemfire.support.GemfireBeanFactoryLocator . getAssociatedBeanNameWithAliases ( ) ) . hasSize ( NUMBER ) ; assertThat ( org.springframework.data.gemfire.support.GemfireBeanFactoryLocator . getAssociatedBeanNameWithAliases ( ) ) . containsAll ( asSet ( STRING , STRING , STRING ) ) ; assertThat ( GemfireBeanFactoryLocator . BEAN_FACTORIES ) . hasSize ( NUMBER ) ; assertThat ( GemfireBeanFactoryLocator . BEAN_FACTORIES . keySet ( ) ) . containsAll ( asSet ( STRING , STRING , STRING ) ) ; assertThat ( GemfireBeanFactoryLocator . BEAN_FACTORIES . get ( STRING ) ) . isSameAs ( org.springframework.data.gemfire.support.BeanFactory ) ; assertThat ( GemfireBeanFactoryLocator . BEAN_FACTORIES . get ( STRING ) ) . isSameAs ( org.springframework.data.gemfire.support.BeanFactory ) ; assertThat ( GemfireBeanFactoryLocator . BEAN_FACTORIES . get ( STRING ) ) . isSameAs ( org.springframework.data.gemfire.support.BeanFactory ) ; verify ( org.springframework.data.gemfire.support.BeanFactory , times ( NUMBER ) ) . getAliases ( eq ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { GemfireBeanFactoryLocator org.springframework.data.gemfire.support.GemfireBeanFactoryLocator = newBeanFactoryLocator ( null , STRING ) ; assertThat ( org.springframework.data.gemfire.support.GemfireBeanFactoryLocator ) . isNotNull ( ) ; assertThat ( org.springframework.data.gemfire.support.GemfireBeanFactoryLocator . getBeanFactory ( ) ) . isNull ( ) ; assertThat ( org.springframework.data.gemfire.support.GemfireBeanFactoryLocator . getAssociatedBeanName ( ) ) . isEqualTo ( STRING ) ; assertThat ( org.springframework.data.gemfire.support.GemfireBeanFactoryLocator . getAssociatedBeanNameWithAliases ( ) ) . isNotNull ( ) ; assertThat ( org.springframework.data.gemfire.support.GemfireBeanFactoryLocator . getAssociatedBeanNameWithAliases ( ) ) . isEmpty ( ) ; assertThat ( GemfireBeanFactoryLocator . BEAN_FACTORIES ) . isEmpty ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { BeanFactory org.springframework.data.gemfire.support.BeanFactory = mock ( BeanFactory .class , STRING ) ; when ( org.springframework.data.gemfire.support.BeanFactory . getAliases ( eq ( STRING ) ) ) . thenReturn ( new java.lang.String [] { STRING , STRING } ) ; GemfireBeanFactoryLocator . BEAN_FACTORIES . put ( STRING , org.springframework.data.gemfire.support.BeanFactory ) ; GemfireBeanFactoryLocator . BEAN_FACTORIES . put ( STRING , org.springframework.data.gemfire.support.BeanFactory ) ; assertThat ( GemfireBeanFactoryLocator . BEAN_FACTORIES ) . hasSize ( NUMBER ) ; assertThat ( GemfireBeanFactoryLocator . BEAN_FACTORIES . keySet ( ) ) . containsAll ( asSet ( STRING , STRING ) ) ; GemfireBeanFactoryLocator org.springframework.data.gemfire.support.GemfireBeanFactoryLocator = newBeanFactoryLocator ( org.springframework.data.gemfire.support.BeanFactory , STRING ) ; assertThat ( org.springframework.data.gemfire.support.GemfireBeanFactoryLocator ) . isNotNull ( ) ; assertThat ( org.springframework.data.gemfire.support.GemfireBeanFactoryLocator . getBeanFactory ( ) ) . isSameAs ( org.springframework.data.gemfire.support.BeanFactory ) ; assertThat ( org.springframework.data.gemfire.support.GemfireBeanFactoryLocator . getAssociatedBeanName ( ) ) . isEqualTo ( STRING ) ; assertThat ( org.springframework.data.gemfire.support.GemfireBeanFactoryLocator . getAssociatedBeanNameWithAliases ( ) ) . isNotNull ( ) ; assertThat ( org.springframework.data.gemfire.support.GemfireBeanFactoryLocator . getAssociatedBeanNameWithAliases ( ) ) . hasSize ( NUMBER ) ; assertThat ( org.springframework.data.gemfire.support.GemfireBeanFactoryLocator . getAssociatedBeanNameWithAliases ( ) ) . containsAll ( asSet ( STRING , STRING , STRING ) ) ; assertThat ( GemfireBeanFactoryLocator . BEAN_FACTORIES ) . hasSize ( NUMBER ) ; assertThat ( GemfireBeanFactoryLocator . BEAN_FACTORIES . keySet ( ) ) . containsAll ( asSet ( STRING , STRING , STRING , STRING , STRING ) ) ; org.springframework.data.gemfire.support.GemfireBeanFactoryLocator . destroy ( ) ; assertThat ( GemfireBeanFactoryLocator . BEAN_FACTORIES ) . hasSize ( NUMBER ) ; assertThat ( GemfireBeanFactoryLocator . BEAN_FACTORIES . keySet ( ) ) . containsAll ( asSet ( STRING , STRING ) ) ; verify ( org.springframework.data.gemfire.support.BeanFactory , times ( NUMBER ) ) . getAliases ( eq ( STRING ) ) ; verifyZeroInteractions ( org.springframework.data.gemfire.support.BeanFactory ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.gemfire.support.ExpectedException . expect ( java.lang.IllegalStateException .class ) ; org.springframework.data.gemfire.support.ExpectedException . expectCause ( is ( nullValue ( java.lang.Throwable .class ) ) ) ; org.springframework.data.gemfire.support.ExpectedException . expectMessage ( UNINITIALIZED_BEAN_FACTORY_REFERENCE_MESSAGE ) ; newBeanFactoryLocator ( ) . useBeanFactory ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { GemfireBeanFactoryLocator . BEAN_FACTORIES . put ( STRING , org.springframework.data.gemfire.support.BeanFactory ) ; GemfireBeanFactoryLocator . BEAN_FACTORIES . put ( STRING , org.springframework.data.gemfire.support.BeanFactory ) ; assertThat ( GemfireBeanFactoryLocator . BEAN_FACTORIES . size ( ) ) . isEqualTo ( NUMBER ) ; assertThat ( newBeanFactoryLocator ( ) . useBeanFactory ( ) ) . isSameAs ( org.springframework.data.gemfire.support.BeanFactory ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { GemfireBeanFactoryLocator . BEAN_FACTORIES . put ( STRING , org.springframework.data.gemfire.support.BeanFactory ) ; GemfireBeanFactoryLocator . BEAN_FACTORIES . put ( STRING , mock ( BeanFactory .class , STRING ) ) ; assertThat ( GemfireBeanFactoryLocator . BEAN_FACTORIES ) . hasSize ( NUMBER ) ; org.springframework.data.gemfire.support.ExpectedException . expect ( java.lang.IllegalStateException .class ) ; org.springframework.data.gemfire.support.ExpectedException . expectCause ( is ( nullValue ( java.lang.Throwable .class ) ) ) ; org.springframework.data.gemfire.support.ExpectedException . expectMessage ( STRING + STRING ) ; newBeanFactoryLocator ( ) . useBeanFactory ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { BeanFactory org.springframework.data.gemfire.support.BeanFactory = mock ( BeanFactory .class , STRING ) ; GemfireBeanFactoryLocator . BEAN_FACTORIES . put ( STRING , org.springframework.data.gemfire.support.BeanFactory ) ; GemfireBeanFactoryLocator . BEAN_FACTORIES . put ( STRING , org.springframework.data.gemfire.support.BeanFactory ) ; assertThat ( GemfireBeanFactoryLocator . BEAN_FACTORIES ) . hasSize ( NUMBER ) ; assertThat ( newBeanFactoryLocator ( null , STRING ) . useBeanFactory ( ) ) . isSameAs ( org.springframework.data.gemfire.support.BeanFactory ) ; assertThat ( newBeanFactoryLocator ( ) . withBeanName ( STRING ) . useBeanFactory ( ) ) . isSameAs ( org.springframework.data.gemfire.support.BeanFactory ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { GemfireBeanFactoryLocator . BEAN_FACTORIES . put ( STRING , org.springframework.data.gemfire.support.BeanFactory ) ; GemfireBeanFactoryLocator . BEAN_FACTORIES . put ( STRING , mock ( BeanFactory .class , STRING ) ) ; assertThat ( GemfireBeanFactoryLocator . BEAN_FACTORIES ) . hasSize ( NUMBER ) ; assertThat ( newBeanFactoryLocator ( ) . useBeanFactory ( STRING ) ) . isSameAs ( org.springframework.data.gemfire.support.BeanFactory ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { GemfireBeanFactoryLocator . BEAN_FACTORIES . put ( STRING , org.springframework.data.gemfire.support.BeanFactory ) ; GemfireBeanFactoryLocator . BEAN_FACTORIES . put ( STRING , mock ( BeanFactory .class , STRING ) ) ; assertThat ( GemfireBeanFactoryLocator . BEAN_FACTORIES . size ( ) ) . isEqualTo ( NUMBER ) ; org.springframework.data.gemfire.support.ExpectedException . expect ( java.lang.IllegalArgumentException .class ) ; org.springframework.data.gemfire.support.ExpectedException . expectCause ( is ( nullValue ( java.lang.Throwable .class ) ) ) ; org.springframework.data.gemfire.support.ExpectedException . expectMessage ( STRING ) ; newBeanFactoryLocator ( ) . useBeanFactory ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { GemfireBeanFactoryLocator org.springframework.data.gemfire.support.GemfireBeanFactoryLocator = newBeanFactoryLocator ( ) ; assertThat ( org.springframework.data.gemfire.support.GemfireBeanFactoryLocator ) . isNotNull ( ) ; assertThat ( org.springframework.data.gemfire.support.GemfireBeanFactoryLocator . getBeanFactory ( ) ) . isNull ( ) ; org.springframework.data.gemfire.support.GemfireBeanFactoryLocator . setBeanFactory ( org.springframework.data.gemfire.support.BeanFactory ) ; assertThat ( org.springframework.data.gemfire.support.GemfireBeanFactoryLocator . getBeanFactory ( ) ) . isSameAs ( org.springframework.data.gemfire.support.BeanFactory ) ; org.springframework.data.gemfire.support.GemfireBeanFactoryLocator . setBeanFactory ( null ) ; assertThat ( org.springframework.data.gemfire.support.GemfireBeanFactoryLocator . getBeanFactory ( ) ) . isNull ( ) ; verifyZeroInteractions ( org.springframework.data.gemfire.support.BeanFactory ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { GemfireBeanFactoryLocator org.springframework.data.gemfire.support.GemfireBeanFactoryLocator = newBeanFactoryLocator ( null , STRING ) ; assertThat ( org.springframework.data.gemfire.support.GemfireBeanFactoryLocator ) . isNotNull ( ) ; assertThat ( org.springframework.data.gemfire.support.GemfireBeanFactoryLocator . getAssociatedBeanName ( ) ) . isEqualTo ( STRING ) ; assertThat ( org.springframework.data.gemfire.support.GemfireBeanFactoryLocator . getAssociatedBeanNameWithAliases ( ) ) . isNotNull ( ) ; assertThat ( org.springframework.data.gemfire.support.GemfireBeanFactoryLocator . getAssociatedBeanNameWithAliases ( ) ) . isEmpty ( ) ; org.springframework.data.gemfire.support.GemfireBeanFactoryLocator . setBeanName ( STRING ) ; assertThat ( org.springframework.data.gemfire.support.GemfireBeanFactoryLocator . getAssociatedBeanName ( ) ) . isEqualTo ( STRING ) ; assertThat ( org.springframework.data.gemfire.support.GemfireBeanFactoryLocator . getAssociatedBeanNameWithAliases ( ) ) . isNotNull ( ) ; assertThat ( org.springframework.data.gemfire.support.GemfireBeanFactoryLocator . getAssociatedBeanNameWithAliases ( ) ) . isEmpty ( ) ; org.springframework.data.gemfire.support.GemfireBeanFactoryLocator . setBeanName ( null ) ; assertThat ( org.springframework.data.gemfire.support.GemfireBeanFactoryLocator . getAssociatedBeanName ( ) ) . isNull ( ) ; assertThat ( org.springframework.data.gemfire.support.GemfireBeanFactoryLocator . getAssociatedBeanNameWithAliases ( ) ) . isNotNull ( ) ; assertThat ( org.springframework.data.gemfire.support.GemfireBeanFactoryLocator . getAssociatedBeanNameWithAliases ( ) ) . isEmpty ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { GemfireBeanFactoryLocator org.springframework.data.gemfire.support.GemfireBeanFactoryLocator = newBeanFactoryLocator ( ) ; assertThat ( org.springframework.data.gemfire.support.GemfireBeanFactoryLocator ) . isNotNull ( ) ; assertThat ( org.springframework.data.gemfire.support.GemfireBeanFactoryLocator . getAssociatedBeanName ( ) ) . isNull ( ) ; assertThat ( org.springframework.data.gemfire.support.GemfireBeanFactoryLocator . withBeanName ( STRING ) ) . isSameAs ( org.springframework.data.gemfire.support.GemfireBeanFactoryLocator ) ; assertThat ( org.springframework.data.gemfire.support.GemfireBeanFactoryLocator . getAssociatedBeanName ( ) ) . isEqualTo ( STRING ) ; assertThat ( org.springframework.data.gemfire.support.GemfireBeanFactoryLocator . withBeanName ( null ) ) . isSameAs ( org.springframework.data.gemfire.support.GemfireBeanFactoryLocator ) ; assertThat ( org.springframework.data.gemfire.support.GemfireBeanFactoryLocator . getAssociatedBeanName ( ) ) . isNull ( ) ; }  <METHOD_END>
