<METHOD_START> @ Before public void void ( ) { org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean = spy ( new LuceneIndexFactoryBean ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { doReturn ( org.springframework.data.gemfire.search.lucene.GemFireCache ) . when ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean ) . resolveCache ( ) ; doReturn ( org.springframework.data.gemfire.search.lucene.LuceneService ) . when ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean ) . resolveLuceneService ( ) ; doReturn ( STRING ) . when ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean ) . resolveRegionPath ( ) ; doReturn ( org.springframework.data.gemfire.search.lucene.LuceneIndex ) . when ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean ) . createIndex ( eq ( STRING ) , eq ( STRING ) ) ; org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . setIndexName ( STRING ) ; assertThat ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . getIndexName ( ) ) . isEqualTo ( STRING ) ; org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . afterPropertiesSet ( ) ; assertThat ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . getObject ( ) ) . isEqualTo ( org.springframework.data.gemfire.search.lucene.LuceneIndex ) ; verify ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean , times ( NUMBER ) ) . resolveCache ( ) ; verify ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean , times ( NUMBER ) ) . resolveLuceneService ( ) ; verify ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean , times ( NUMBER ) ) . resolveRegionPath ( ) ; verify ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean , times ( NUMBER ) ) . createIndex ( eq ( STRING ) , eq ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.data.gemfire.search.lucene.ExpectedException . expect ( java.lang.IllegalStateException .class ) ; org.springframework.data.gemfire.search.lucene.ExpectedException . expectCause ( is ( nullValue ( java.lang.Throwable .class ) ) ) ; org.springframework.data.gemfire.search.lucene.ExpectedException . expectMessage ( STRING ) ; org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . afterPropertiesSet ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . setLuceneService ( org.springframework.data.gemfire.search.lucene.LuceneService ) ; when ( org.springframework.data.gemfire.search.lucene.LuceneService . getIndex ( eq ( STRING ) , eq ( STRING ) ) ) . thenReturn ( org.springframework.data.gemfire.search.lucene.LuceneIndex ) ; assertThat ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . getFieldAnalyzers ( ) ) . isEmpty ( ) ; assertThat ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . getFields ( ) ) . isEmpty ( ) ; assertThat ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . getLuceneService ( ) ) . isSameAs ( org.springframework.data.gemfire.search.lucene.LuceneService ) ; assertThat ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . createIndex ( STRING , STRING ) ) . isEqualTo ( org.springframework.data.gemfire.search.lucene.LuceneIndex ) ; verify ( org.springframework.data.gemfire.search.lucene.LuceneService , times ( NUMBER ) ) . createIndex ( eq ( STRING ) , eq ( STRING ) , eq ( LuceneService . REGION_VALUE_FIELD ) ) ; verify ( org.springframework.data.gemfire.search.lucene.LuceneService , times ( NUMBER ) ) . getIndex ( eq ( STRING ) , eq ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.util.Map<java.lang.String,org.springframework.data.gemfire.search.lucene.Analyzer> < java.lang.String , Analyzer > java.util.Map<java.lang.String,org.springframework.data.gemfire.search.lucene.Analyzer> = java.util.Collections . java.util.Map ( STRING , org.springframework.data.gemfire.search.lucene.Analyzer ) ; org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . setFieldAnalyzers ( java.util.Map<java.lang.String,org.springframework.data.gemfire.search.lucene.Analyzer> ) ; org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . setLuceneService ( org.springframework.data.gemfire.search.lucene.LuceneService ) ; when ( org.springframework.data.gemfire.search.lucene.LuceneService . getIndex ( eq ( STRING ) , eq ( STRING ) ) ) . thenReturn ( org.springframework.data.gemfire.search.lucene.LuceneIndex ) ; assertThat ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . getFieldAnalyzers ( ) ) . isEqualTo ( java.util.Map<java.lang.String,org.springframework.data.gemfire.search.lucene.Analyzer> ) ; assertThat ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . getFields ( ) ) . isEmpty ( ) ; assertThat ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . getLuceneService ( ) ) . isSameAs ( org.springframework.data.gemfire.search.lucene.LuceneService ) ; assertThat ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . createIndex ( STRING , STRING ) ) . isEqualTo ( org.springframework.data.gemfire.search.lucene.LuceneIndex ) ; verify ( org.springframework.data.gemfire.search.lucene.LuceneService , times ( NUMBER ) ) . createIndex ( eq ( STRING ) , eq ( STRING ) , eq ( java.util.Map<java.lang.String,org.springframework.data.gemfire.search.lucene.Analyzer> ) ) ; verify ( org.springframework.data.gemfire.search.lucene.LuceneService , times ( NUMBER ) ) . getIndex ( eq ( STRING ) , eq ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . setFields ( STRING , STRING ) ; org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . setLuceneService ( org.springframework.data.gemfire.search.lucene.LuceneService ) ; when ( org.springframework.data.gemfire.search.lucene.LuceneService . getIndex ( eq ( STRING ) , eq ( STRING ) ) ) . thenReturn ( org.springframework.data.gemfire.search.lucene.LuceneIndex ) ; assertThat ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . getFieldAnalyzers ( ) ) . isEmpty ( ) ; assertThat ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . getFields ( ) ) . containsAll ( java.util.Arrays . java.util.List<java.lang.String> ( STRING , STRING ) ) ; assertThat ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . getLuceneService ( ) ) . isSameAs ( org.springframework.data.gemfire.search.lucene.LuceneService ) ; assertThat ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . createIndex ( STRING , STRING ) ) . isEqualTo ( org.springframework.data.gemfire.search.lucene.LuceneIndex ) ; verify ( org.springframework.data.gemfire.search.lucene.LuceneService , times ( NUMBER ) ) . createIndex ( eq ( STRING ) , eq ( STRING ) , eq ( STRING ) , eq ( STRING ) ) ; verify ( org.springframework.data.gemfire.search.lucene.LuceneService , times ( NUMBER ) ) . getIndex ( eq ( STRING ) , eq ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.lang.Exception { org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . setDestroy ( true ) ; org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . setLuceneService ( org.springframework.data.gemfire.search.lucene.LuceneService ) ; assertThat ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . isDestroy ( ) ) . isTrue ( ) ; assertThat ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . getLuceneService ( ) ) . isSameAs ( org.springframework.data.gemfire.search.lucene.LuceneService ) ; doReturn ( org.springframework.data.gemfire.search.lucene.LuceneIndex ) . when ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean ) . getObject ( ) ; org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . destroy ( ) ; verify ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean , times ( NUMBER ) ) . getObject ( ) ; verify ( org.springframework.data.gemfire.search.lucene.LuceneService , times ( NUMBER ) ) . destroyIndex ( eq ( org.springframework.data.gemfire.search.lucene.LuceneIndex ) ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.lang.Exception { org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . setDestroy ( false ) ; org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . setLuceneService ( org.springframework.data.gemfire.search.lucene.LuceneService ) ; assertThat ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . isDestroy ( ) ) . isFalse ( ) ; assertThat ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . getLuceneService ( ) ) . isSameAs ( org.springframework.data.gemfire.search.lucene.LuceneService ) ; doReturn ( org.springframework.data.gemfire.search.lucene.LuceneIndex ) . when ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean ) . getObject ( ) ; org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . destroy ( ) ; verify ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean , times ( NUMBER ) ) . getObject ( ) ; verify ( org.springframework.data.gemfire.search.lucene.LuceneService , never ( ) ) . destroyIndex ( any ( LuceneIndex .class ) ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) java.lang.Exception { org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . setDestroy ( true ) ; org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . setLuceneService ( org.springframework.data.gemfire.search.lucene.LuceneService ) ; assertThat ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . isDestroy ( ) ) . isTrue ( ) ; assertThat ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . getLuceneService ( ) ) . isSameAs ( org.springframework.data.gemfire.search.lucene.LuceneService ) ; doReturn ( null ) . when ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean ) . getObject ( ) ; org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . destroy ( ) ; verify ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean , times ( NUMBER ) ) . getObject ( ) ; verify ( org.springframework.data.gemfire.search.lucene.LuceneService , never ( ) ) . destroyIndex ( isNull ( LuceneIndex .class ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . setDestroy ( true ) ; assertThat ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . isDestroy ( ) ) . isTrue ( ) ; assertThat ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . isLuceneIndexDestroyable ( org.springframework.data.gemfire.search.lucene.LuceneIndex ) ) . isTrue ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . setDestroy ( false ) ; assertThat ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . isDestroy ( ) ) . isFalse ( ) ; assertThat ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . isLuceneIndexDestroyable ( org.springframework.data.gemfire.search.lucene.LuceneIndex ) ) . isFalse ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . setDestroy ( true ) ; assertThat ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . isDestroy ( ) ) . isTrue ( ) ; assertThat ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . isLuceneIndexDestroyable ( null ) ) . isFalse ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . setCache ( org.springframework.data.gemfire.search.lucene.GemFireCache ) ; org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . setIndexName ( STRING ) ; org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . setLuceneService ( org.springframework.data.gemfire.search.lucene.LuceneService ) ; org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . setRegionPath ( STRING ) ; when ( org.springframework.data.gemfire.search.lucene.LuceneService . getIndex ( eq ( STRING ) , eq ( STRING ) ) ) . thenReturn ( org.springframework.data.gemfire.search.lucene.LuceneIndex ) ; assertThat ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . getCache ( ) ) . isSameAs ( org.springframework.data.gemfire.search.lucene.GemFireCache ) ; assertThat ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . getIndexName ( ) ) . isEqualTo ( STRING ) ; assertThat ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . getLuceneService ( ) ) . isSameAs ( org.springframework.data.gemfire.search.lucene.LuceneService ) ; assertThat ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . getRegionPath ( ) ) . isEqualTo ( STRING ) ; assertThat ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . getObject ( ) ) . isEqualTo ( org.springframework.data.gemfire.search.lucene.LuceneIndex ) ; verify ( org.springframework.data.gemfire.search.lucene.LuceneService , times ( NUMBER ) ) . getIndex ( eq ( STRING ) , eq ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . setLuceneIndex ( org.springframework.data.gemfire.search.lucene.LuceneIndex ) ; org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . setLuceneService ( org.springframework.data.gemfire.search.lucene.LuceneService ) ; assertThat ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . getObject ( ) ) . isSameAs ( org.springframework.data.gemfire.search.lucene.LuceneIndex ) ; verify ( org.springframework.data.gemfire.search.lucene.LuceneService , never ( ) ) . getIndex ( anyString ( ) , anyString ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . setCache ( org.springframework.data.gemfire.search.lucene.GemFireCache ) ; org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . setRegionPath ( STRING ) ; doReturn ( null ) . when ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean ) . resolveLuceneService ( eq ( org.springframework.data.gemfire.search.lucene.GemFireCache ) ) ; assertThat ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . getCache ( ) ) . isSameAs ( org.springframework.data.gemfire.search.lucene.GemFireCache ) ; assertThat ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . getLuceneService ( ) ) . isNull ( ) ; assertThat ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . getRegionPath ( ) ) . isEqualTo ( STRING ) ; assertThat ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . getObject ( ) ) . isNull ( ) ; verify ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean , times ( NUMBER ) ) . resolveLuceneService ( ) ; verify ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean , times ( NUMBER ) ) . resolveLuceneService ( eq ( org.springframework.data.gemfire.search.lucene.GemFireCache ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . getObjectType ( ) ) . isEqualTo ( LuceneIndex .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . setLuceneIndex ( org.springframework.data.gemfire.search.lucene.LuceneIndex ) . getObjectType ( ) ) . isEqualTo ( org.springframework.data.gemfire.search.lucene.LuceneIndex . getClass ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . isSingleton ( ) ) . isTrue ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . setCache ( org.springframework.data.gemfire.search.lucene.GemFireCache ) ; assertThat ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . getCache ( ) ) . isSameAs ( org.springframework.data.gemfire.search.lucene.GemFireCache ) ; assertThat ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . resolveCache ( ) ) . isSameAs ( org.springframework.data.gemfire.search.lucene.GemFireCache ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> = java.util.Arrays . java.util.List<java.lang.String> ( STRING , STRING ) ; assertThat ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . resolveFields ( java.util.List<java.lang.String> ) ) . isSameAs ( java.util.List<java.lang.String> ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . resolveFields ( java.util.Collections . java.util.List<java.lang.Object> ( ) ) ) . isEqualTo ( java.util.Collections . java.util.List ( LuceneService . REGION_VALUE_FIELD ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . resolveFields ( null ) ) . isEqualTo ( java.util.Collections . java.util.List ( LuceneService . REGION_VALUE_FIELD ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . setBeanFactory ( org.springframework.data.gemfire.search.lucene.BeanFactory ) ; org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . setCache ( org.springframework.data.gemfire.search.lucene.GemFireCache ) ; org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . setLuceneService ( org.springframework.data.gemfire.search.lucene.LuceneService ) ; assertThat ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . getBeanFactory ( ) ) . isSameAs ( org.springframework.data.gemfire.search.lucene.BeanFactory ) ; assertThat ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . getCache ( ) ) . isSameAs ( org.springframework.data.gemfire.search.lucene.GemFireCache ) ; assertThat ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . getLuceneService ( ) ) . isSameAs ( org.springframework.data.gemfire.search.lucene.LuceneService ) ; assertThat ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . resolveLuceneService ( ) ) . isSameAs ( org.springframework.data.gemfire.search.lucene.LuceneService ) ; verifyZeroInteractions ( org.springframework.data.gemfire.search.lucene.BeanFactory ) ; verifyZeroInteractions ( org.springframework.data.gemfire.search.lucene.GemFireCache ) ; verify ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean , never ( ) ) . resolveLuceneService ( any ( GemFireCache .class ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . setBeanFactory ( org.springframework.data.gemfire.search.lucene.BeanFactory ) ; org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . setCache ( org.springframework.data.gemfire.search.lucene.GemFireCache ) ; when ( org.springframework.data.gemfire.search.lucene.BeanFactory . getBean ( eq ( LuceneService .class ) ) ) . thenReturn ( org.springframework.data.gemfire.search.lucene.LuceneService ) ; assertThat ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . getBeanFactory ( ) ) . isSameAs ( org.springframework.data.gemfire.search.lucene.BeanFactory ) ; assertThat ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . getCache ( ) ) . isSameAs ( org.springframework.data.gemfire.search.lucene.GemFireCache ) ; assertThat ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . getLuceneService ( ) ) . isNull ( ) ; assertThat ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . resolveLuceneService ( ) ) . isSameAs ( org.springframework.data.gemfire.search.lucene.LuceneService ) ; verify ( org.springframework.data.gemfire.search.lucene.BeanFactory , times ( NUMBER ) ) . getBean ( eq ( LuceneService .class ) ) ; verifyZeroInteractions ( org.springframework.data.gemfire.search.lucene.GemFireCache ) ; verify ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean , never ( ) ) . resolveLuceneService ( any ( GemFireCache .class ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . setCache ( org.springframework.data.gemfire.search.lucene.GemFireCache ) ; doReturn ( org.springframework.data.gemfire.search.lucene.LuceneService ) . when ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean ) . resolveLuceneService ( eq ( org.springframework.data.gemfire.search.lucene.GemFireCache ) ) ; assertThat ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . getBeanFactory ( ) ) . isNull ( ) ; assertThat ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . getCache ( ) ) . isSameAs ( org.springframework.data.gemfire.search.lucene.GemFireCache ) ; assertThat ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . getLuceneService ( ) ) . isNull ( ) ; assertThat ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . resolveLuceneService ( ) ) . isSameAs ( org.springframework.data.gemfire.search.lucene.LuceneService ) ; verifyZeroInteractions ( org.springframework.data.gemfire.search.lucene.GemFireCache ) ; verify ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean , times ( NUMBER ) ) . resolveLuceneService ( eq ( org.springframework.data.gemfire.search.lucene.GemFireCache ) ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) { org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . setBeanFactory ( org.springframework.data.gemfire.search.lucene.BeanFactory ) ; org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . setCache ( org.springframework.data.gemfire.search.lucene.GemFireCache ) ; when ( org.springframework.data.gemfire.search.lucene.BeanFactory . getBean ( any ( java.lang.Class .class ) ) ) . thenThrow ( new NoSuchBeanDefinitionException ( STRING ) ) ; doReturn ( org.springframework.data.gemfire.search.lucene.LuceneService ) . when ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean ) . resolveLuceneService ( eq ( org.springframework.data.gemfire.search.lucene.GemFireCache ) ) ; assertThat ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . getBeanFactory ( ) ) . isSameAs ( org.springframework.data.gemfire.search.lucene.BeanFactory ) ; assertThat ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . getCache ( ) ) . isSameAs ( org.springframework.data.gemfire.search.lucene.GemFireCache ) ; assertThat ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . getLuceneService ( ) ) . isNull ( ) ; assertThat ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . resolveLuceneService ( ) ) . isSameAs ( org.springframework.data.gemfire.search.lucene.LuceneService ) ; verify ( org.springframework.data.gemfire.search.lucene.BeanFactory , times ( NUMBER ) ) . getBean ( eq ( LuceneService .class ) ) ; verifyZeroInteractions ( org.springframework.data.gemfire.search.lucene.GemFireCache ) ; verify ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean , times ( NUMBER ) ) . resolveLuceneService ( eq ( org.springframework.data.gemfire.search.lucene.GemFireCache ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.gemfire.search.lucene.ExpectedException . expect ( java.lang.IllegalArgumentException .class ) ; org.springframework.data.gemfire.search.lucene.ExpectedException . expectCause ( is ( nullValue ( java.lang.Throwable .class ) ) ) ; org.springframework.data.gemfire.search.lucene.ExpectedException . expectMessage ( STRING ) ; org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . resolveLuceneService ( null ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) { org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . setRegion ( org.springframework.data.gemfire.search.lucene.Region<java.lang.Object,java.lang.Object> ) ; assertThat ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . resolveRegion ( ) ) . isSameAs ( org.springframework.data.gemfire.search.lucene.Region<java.lang.Object,java.lang.Object> ) ; verify ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean , times ( NUMBER ) ) . getRegion ( ) ; verify ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean , never ( ) ) . resolveCache ( ) ; verify ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean , never ( ) ) . getRegionPath ( ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) { org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . setRegionPath ( STRING ) ; doReturn ( org.springframework.data.gemfire.search.lucene.GemFireCache ) . when ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean ) . resolveCache ( ) ; when ( org.springframework.data.gemfire.search.lucene.GemFireCache . getRegion ( eq ( STRING ) ) ) . thenReturn ( org.springframework.data.gemfire.search.lucene.Region<java.lang.Object,java.lang.Object> ) ; assertThat ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . resolveRegion ( ) ) . isEqualTo ( org.springframework.data.gemfire.search.lucene.Region<java.lang.Object,java.lang.Object> ) ; verify ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean , times ( NUMBER ) ) . getRegion ( ) ; verify ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean , times ( NUMBER ) ) . resolveCache ( ) ; verify ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean , times ( NUMBER ) ) . getRegionPath ( ) ; verify ( org.springframework.data.gemfire.search.lucene.GemFireCache , times ( NUMBER ) ) . getRegion ( eq ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) { org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . setRegionPath ( STRING ) ; doReturn ( null ) . when ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean ) . resolveCache ( ) ; assertThat ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . resolveRegion ( ) ) . isNull ( ) ; verify ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean , times ( NUMBER ) ) . getRegion ( ) ; verify ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean , times ( NUMBER ) ) . resolveCache ( ) ; verify ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean , times ( NUMBER ) ) . getRegionPath ( ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) { org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . setCache ( org.springframework.data.gemfire.search.lucene.GemFireCache ) ; org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . setRegionPath ( STRING ) ; assertThat ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . resolveRegion ( ) ) . isNull ( ) ; verify ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean , times ( NUMBER ) ) . getRegion ( ) ; verify ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean , times ( NUMBER ) ) . resolveCache ( ) ; verify ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean , times ( NUMBER ) ) . getRegionPath ( ) ; verify ( org.springframework.data.gemfire.search.lucene.GemFireCache , never ( ) ) . getRegion ( anyString ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) { org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . setRegionPath ( STRING ) ; doReturn ( null ) . when ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean ) . resolveRegion ( ) ; assertThat ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . resolveRegionPath ( ) ) . isEqualTo ( STRING ) ; verify ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean , times ( NUMBER ) ) . resolveRegion ( ) ; verify ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean , times ( NUMBER ) ) . getRegionPath ( ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) { doReturn ( org.springframework.data.gemfire.search.lucene.Region<java.lang.Object,java.lang.Object> ) . when ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean ) . resolveRegion ( ) ; when ( org.springframework.data.gemfire.search.lucene.Region<java.lang.Object,java.lang.Object> . getFullPath ( ) ) . thenReturn ( STRING ) ; assertThat ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . resolveRegionPath ( ) ) . isEqualTo ( STRING ) ; verify ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean , times ( NUMBER ) ) . resolveRegion ( ) ; verify ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean , never ( ) ) . getRegionPath ( ) ; verify ( org.springframework.data.gemfire.search.lucene.Region<java.lang.Object,java.lang.Object> , times ( NUMBER ) ) . getFullPath ( ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) { doReturn ( null ) . when ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean ) . resolveRegion ( ) ; org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . setRegionPath ( null ) ; try { org.springframework.data.gemfire.search.lucene.ExpectedException . expect ( java.lang.IllegalStateException .class ) ; org.springframework.data.gemfire.search.lucene.ExpectedException . expectCause ( is ( nullValue ( java.lang.Throwable .class ) ) ) ; org.springframework.data.gemfire.search.lucene.ExpectedException . expectMessage ( STRING ) ; org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . resolveRegionPath ( ) ; } finally { verify ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean , times ( NUMBER ) ) . resolveRegion ( ) ; verify ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean , times ( NUMBER ) ) . getRegionPath ( ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.util.Map<java.lang.String,org.springframework.data.gemfire.search.lucene.Analyzer> < java.lang.String , Analyzer > java.util.Map<java.lang.String,org.springframework.data.gemfire.search.lucene.Analyzer> = org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . getFieldAnalyzers ( ) ; assertThat ( java.util.Map<java.lang.String,org.springframework.data.gemfire.search.lucene.Analyzer> ) . isNotNull ( ) ; assertThat ( java.util.Map<java.lang.String,org.springframework.data.gemfire.search.lucene.Analyzer> ) . isEmpty ( ) ; java.util.Map<java.lang.String,org.springframework.data.gemfire.search.lucene.Analyzer> = java.util.Collections . java.util.Map ( STRING , org.springframework.data.gemfire.search.lucene.Analyzer ) ; org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . setFieldAnalyzers ( java.util.Map<java.lang.String,org.springframework.data.gemfire.search.lucene.Analyzer> ) ; assertThat ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . getFieldAnalyzers ( ) ) . isEqualTo ( java.util.Map<java.lang.String,org.springframework.data.gemfire.search.lucene.Analyzer> ) ; org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . setFieldAnalyzers ( null ) ; java.util.Map<java.lang.String,org.springframework.data.gemfire.search.lucene.Analyzer> = org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . getFieldAnalyzers ( ) ; assertThat ( java.util.Map<java.lang.String,org.springframework.data.gemfire.search.lucene.Analyzer> ) . isNotNull ( ) ; assertThat ( java.util.Map<java.lang.String,org.springframework.data.gemfire.search.lucene.Analyzer> ) . isEmpty ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> = org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . getFields ( ) ; assertThat ( java.util.List<java.lang.String> ) . isNotNull ( ) ; assertThat ( java.util.List<java.lang.String> ) . isEmpty ( ) ; org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . setFields ( java.util.Arrays . java.util.List<java.lang.String> ( STRING , STRING ) ) ; assertThat ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . getFields ( ) ) . containsAll ( java.util.Arrays . java.util.List<java.lang.String> ( STRING , STRING ) ) ; org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . setFields ( ( java.lang.String [] ) null ) ; java.util.List<java.lang.String> = org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . getFields ( ) ; assertThat ( java.util.List<java.lang.String> ) . isNotNull ( ) ; assertThat ( java.util.List<java.lang.String> ) . isEmpty ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . setBeanName ( STRING ) ; assertThat ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . getIndexName ( ) ) . isEqualTo ( STRING ) ; org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . setIndexName ( STRING ) ; assertThat ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . getIndexName ( ) ) . isEqualTo ( STRING ) ; org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . setIndexName ( null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.gemfire.search.lucene.ExpectedException . expect ( java.lang.IllegalStateException .class ) ; org.springframework.data.gemfire.search.lucene.ExpectedException . expectCause ( is ( nullValue ( java.lang.Throwable .class ) ) ) ; org.springframework.data.gemfire.search.lucene.ExpectedException . expectMessage ( STRING ) ; org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . getIndexName ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . setCache ( org.springframework.data.gemfire.search.lucene.GemFireCache ) ; org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . setDestroy ( true ) ; org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . setFieldAnalyzers ( java.util.Collections . java.util.Map ( STRING , org.springframework.data.gemfire.search.lucene.Analyzer ) ) ; org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . setFields ( STRING , STRING ) ; org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . setIndexName ( STRING ) ; org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . setLuceneService ( org.springframework.data.gemfire.search.lucene.LuceneService ) ; org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . setRegion ( org.springframework.data.gemfire.search.lucene.Region<java.lang.Object,java.lang.Object> ) ; org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . setRegionPath ( STRING ) ; assertThat ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . getCache ( ) ) . isSameAs ( org.springframework.data.gemfire.search.lucene.GemFireCache ) ; assertThat ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . isDestroy ( ) ) . isTrue ( ) ; assertThat ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . getFieldAnalyzers ( ) ) . isEqualTo ( java.util.Collections . java.util.Map ( STRING , org.springframework.data.gemfire.search.lucene.Analyzer ) ) ; assertThat ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . getFields ( ) ) . containsAll ( java.util.Arrays . java.util.List<java.lang.String> ( STRING , STRING ) ) ; assertThat ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . getIndexName ( ) ) . isEqualTo ( STRING ) ; assertThat ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . getLuceneService ( ) ) . isSameAs ( org.springframework.data.gemfire.search.lucene.LuceneService ) ; assertThat ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . getRegion ( ) ) . isSameAs ( org.springframework.data.gemfire.search.lucene.Region<java.lang.Object,java.lang.Object> ) ; assertThat ( org.springframework.data.gemfire.search.lucene.LuceneIndexFactoryBean . getRegionPath ( ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
