<METHOD_START> @ Test public void void ( ) { assertThat ( org.springframework.data.gemfire.support.BeanFactory . containsBean ( GemfireBeanFactoryLocator .class . java.lang.String ( ) ) ) . isTrue ( ) ; GemfireBeanFactoryLocator org.springframework.data.gemfire.support.GemfireBeanFactoryLocator = org.springframework.data.gemfire.support.BeanFactory . getBean ( GemfireBeanFactoryLocator .class . java.lang.String ( ) , GemfireBeanFactoryLocator .class ) ; assertThat ( org.springframework.data.gemfire.support.GemfireBeanFactoryLocator ) . isNotNull ( ) ; assertThat ( org.springframework.data.gemfire.support.GemfireBeanFactoryLocator . getBeanFactory ( ) ) . isSameAs ( org.springframework.data.gemfire.support.BeanFactory ) ; assertThat ( org.springframework.data.gemfire.support.GemfireBeanFactoryLocator . getAssociatedBeanName ( ) ) . startsWith ( GemfireBeanFactoryLocator .class . java.lang.String ( ) ) ; assertThat ( org.springframework.data.gemfire.support.GemfireBeanFactoryLocator . getAssociatedBeanNameWithAliases ( ) ) . isNotNull ( ) ; assertThat ( org.springframework.data.gemfire.support.GemfireBeanFactoryLocator . getAssociatedBeanNameWithAliases ( ) ) . containsAll ( asSet ( GemfireBeanFactoryLocator .class . java.lang.String ( ) ) ) ; assertThat ( org.springframework.data.gemfire.support.BeanFactory . getAliases ( GemfireBeanFactoryLocator .class . java.lang.String ( ) ) ) . containsAll ( asSet ( GemfireBeanFactoryLocator .class . java.lang.String ( ) . java.lang.String ( STRING ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( org.springframework.data.gemfire.support.BeanFactory . containsBean ( STRING ) ) . isTrue ( ) ; GemfireBeanFactoryLocator org.springframework.data.gemfire.support.GemfireBeanFactoryLocator = org.springframework.data.gemfire.support.BeanFactory . getBean ( STRING , GemfireBeanFactoryLocator .class ) ; assertThat ( org.springframework.data.gemfire.support.GemfireBeanFactoryLocator ) . isNotNull ( ) ; assertThat ( org.springframework.data.gemfire.support.GemfireBeanFactoryLocator . getBeanFactory ( ) ) . isSameAs ( org.springframework.data.gemfire.support.BeanFactory ) ; assertThat ( org.springframework.data.gemfire.support.GemfireBeanFactoryLocator . getAssociatedBeanName ( ) ) . isEqualTo ( STRING ) ; assertThat ( org.springframework.data.gemfire.support.GemfireBeanFactoryLocator . getAssociatedBeanNameWithAliases ( ) ) . isNotNull ( ) ; assertThat ( org.springframework.data.gemfire.support.GemfireBeanFactoryLocator . getAssociatedBeanNameWithAliases ( ) ) . containsAll ( asSet ( STRING , STRING , STRING ) ) ; assertThat ( org.springframework.data.gemfire.support.BeanFactory . getAliases ( STRING ) ) . containsAll ( asSet ( STRING , STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.util.Set<java.lang.String> < java.lang.String > java.util.Set<java.lang.String> = asSet ( STRING , STRING , STRING , STRING , STRING , GemfireBeanFactoryLocator .class . java.lang.String ( ) ) ; assertThat ( GemfireBeanFactoryLocator . BEAN_FACTORIES . keySet ( ) ) . containsAll ( java.util.Set<java.lang.String> ) ; for ( java.lang.String java.lang.String : java.util.Set<java.lang.String> ) { assertThat ( GemfireBeanFactoryLocator . BEAN_FACTORIES . get ( java.lang.String ) ) . isSameAs ( org.springframework.data.gemfire.support.BeanFactory ) ; } }  <METHOD_END>
