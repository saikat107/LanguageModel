<METHOD_START> @ After public void void ( ) { org.springframework.data.gemfire.support.DeclarableSupport . setBeanFactoryKey ( null ) ; GemfireBeanFactoryLocator . BEAN_FACTORIES . clear ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( org.springframework.data.gemfire.support.DeclarableSupport . getBeanFactoryKey ( ) ) . isNull ( ) ; org.springframework.data.gemfire.support.DeclarableSupport . setBeanFactoryKey ( STRING ) ; assertThat ( org.springframework.data.gemfire.support.DeclarableSupport . getBeanFactoryKey ( ) ) . isEqualTo ( STRING ) ; org.springframework.data.gemfire.support.DeclarableSupport . setBeanFactoryKey ( null ) ; assertThat ( org.springframework.data.gemfire.support.DeclarableSupport . getBeanFactoryKey ( ) ) . isNull ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { GemfireBeanFactoryLocator . BEAN_FACTORIES . put ( STRING , org.springframework.data.gemfire.support.BeanFactory ) ; GemfireBeanFactoryLocator . BEAN_FACTORIES . put ( STRING , org.springframework.data.gemfire.support.BeanFactory ) ; org.springframework.data.gemfire.support.DeclarableSupport . setBeanFactoryKey ( STRING ) ; assertThat ( org.springframework.data.gemfire.support.DeclarableSupport . getBeanFactoryKey ( ) ) . isEqualTo ( STRING ) ; assertThat ( org.springframework.data.gemfire.support.DeclarableSupport . locateBeanFactory ( ) ) . isSameAs ( org.springframework.data.gemfire.support.BeanFactory ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { GemfireBeanFactoryLocator . BEAN_FACTORIES . put ( STRING , org.springframework.data.gemfire.support.BeanFactory ) ; GemfireBeanFactoryLocator . BEAN_FACTORIES . put ( STRING , org.springframework.data.gemfire.support.BeanFactory ) ; assertThat ( org.springframework.data.gemfire.support.DeclarableSupport . getBeanFactoryKey ( ) ) . isNull ( ) ; assertThat ( org.springframework.data.gemfire.support.DeclarableSupport . locateBeanFactory ( STRING ) ) . isSameAs ( org.springframework.data.gemfire.support.BeanFactory ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { GemfireBeanFactoryLocator . BEAN_FACTORIES . put ( STRING , org.springframework.data.gemfire.support.BeanFactory ) ; GemfireBeanFactoryLocator . BEAN_FACTORIES . put ( STRING , org.springframework.data.gemfire.support.BeanFactory ) ; assertThat ( org.springframework.data.gemfire.support.DeclarableSupport . getBeanFactoryKey ( ) ) . isNull ( ) ; assertThat ( org.springframework.data.gemfire.support.DeclarableSupport . locateBeanFactory ( ) ) . isSameAs ( org.springframework.data.gemfire.support.BeanFactory ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { GemfireBeanFactoryLocator . BEAN_FACTORIES . put ( STRING , org.springframework.data.gemfire.support.BeanFactory ) ; GemfireBeanFactoryLocator . BEAN_FACTORIES . put ( STRING , org.springframework.data.gemfire.support.BeanFactory ) ; org.springframework.data.gemfire.support.DeclarableSupport . setBeanFactoryKey ( STRING ) ; assertThat ( org.springframework.data.gemfire.support.DeclarableSupport . getBeanFactoryKey ( ) ) . isEqualTo ( STRING ) ; org.springframework.data.gemfire.support.ExpectedException . expect ( java.lang.IllegalArgumentException .class ) ; org.springframework.data.gemfire.support.ExpectedException . expectCause ( is ( nullValue ( java.lang.Throwable .class ) ) ) ; org.springframework.data.gemfire.support.ExpectedException . expectMessage ( STRING ) ; org.springframework.data.gemfire.support.DeclarableSupport . locateBeanFactory ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { GemfireBeanFactoryLocator . BEAN_FACTORIES . put ( STRING , org.springframework.data.gemfire.support.BeanFactory ) ; GemfireBeanFactoryLocator . BEAN_FACTORIES . put ( STRING , org.springframework.data.gemfire.support.BeanFactory ) ; assertThat ( org.springframework.data.gemfire.support.DeclarableSupport . getBeanFactoryKey ( ) ) . isNull ( ) ; org.springframework.data.gemfire.support.ExpectedException . expect ( java.lang.IllegalStateException .class ) ; org.springframework.data.gemfire.support.ExpectedException . expectCause ( is ( nullValue ( java.lang.Throwable .class ) ) ) ; org.springframework.data.gemfire.support.ExpectedException . expectMessage ( STRING + STRING ) ; org.springframework.data.gemfire.support.DeclarableSupport . locateBeanFactory ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( GemfireBeanFactoryLocator . BEAN_FACTORIES ) . isEmpty ( ) ; org.springframework.data.gemfire.support.ExpectedException . expect ( java.lang.IllegalStateException .class ) ; org.springframework.data.gemfire.support.ExpectedException . expectCause ( is ( nullValue ( java.lang.Throwable .class ) ) ) ; org.springframework.data.gemfire.support.ExpectedException . expectMessage ( STRING + STRING ) ; org.springframework.data.gemfire.support.DeclarableSupport . locateBeanFactory ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( GemfireBeanFactoryLocator . BEAN_FACTORIES ) . isEmpty ( ) ; org.springframework.data.gemfire.support.ExpectedException . expect ( java.lang.IllegalStateException .class ) ; org.springframework.data.gemfire.support.ExpectedException . expectCause ( is ( nullValue ( java.lang.Throwable .class ) ) ) ; org.springframework.data.gemfire.support.ExpectedException . expectMessage ( STRING + STRING ) ; org.springframework.data.gemfire.support.DeclarableSupport . locateBeanFactory ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { GemfireBeanFactoryLocator . BEAN_FACTORIES . put ( STRING , org.springframework.data.gemfire.support.BeanFactory ) ; GemfireBeanFactoryLocator . BEAN_FACTORIES . put ( STRING , org.springframework.data.gemfire.support.BeanFactory ) ; org.springframework.data.gemfire.support.DeclarableSupport . setBeanFactoryKey ( STRING ) ; assertThat ( org.springframework.data.gemfire.support.DeclarableSupport . getBeanFactoryKey ( ) ) . isEqualTo ( STRING ) ; assertThat ( org.springframework.data.gemfire.support.DeclarableSupport . getBeanFactory ( ) ) . isSameAs ( org.springframework.data.gemfire.support.BeanFactory ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.gemfire.support.DeclarableSupport . close ( ) ; verify ( org.springframework.data.gemfire.support.DeclarableSupport , times ( NUMBER ) ) . close ( ) ; }  <METHOD_END>