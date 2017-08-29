<METHOD_START> @ Before public void void ( ) { when ( org.springframework.data.gemfire.config.support.ContextRefreshedEvent . getApplicationContext ( ) ) . thenReturn ( org.springframework.data.gemfire.config.support.ApplicationContext ) ; }  <METHOD_END>
<METHOD_START> protected < K , V > java.util.HashMap<K,V> < K , V > java.util.HashMap<K,V> ( K K , V V ) { return new java.util.HashMap<K,V> < K , V > ( java.util.Collections . java.util.Map<K,V> ( K , V ) ) ; }  <METHOD_END>
<METHOD_START> protected org.springframework.data.gemfire.config.support.MultiIndexCreationException org.springframework.data.gemfire.config.support.MultiIndexCreationException ( java.lang.String java.lang.String , java.lang.Exception java.lang.Exception ) { return new MultiIndexCreationException ( java.util.HashMap<java.lang.String,java.lang.Exception> ( java.lang.String , java.lang.Exception ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { when ( org.springframework.data.gemfire.config.support.ApplicationContext . containsBean ( eq ( java.lang.String ) ) ) . thenReturn ( true ) ; when ( org.springframework.data.gemfire.config.support.ApplicationContext . getBean ( eq ( java.lang.String ) , eq ( QueryService .class ) ) ) . thenReturn ( org.springframework.data.gemfire.config.support.QueryService ) ; org.springframework.data.gemfire.config.support.DefinedIndexesApplicationListener . onApplicationEvent ( org.springframework.data.gemfire.config.support.ContextRefreshedEvent ) ; verify ( org.springframework.data.gemfire.config.support.ContextRefreshedEvent , times ( NUMBER ) ) . getApplicationContext ( ) ; verify ( org.springframework.data.gemfire.config.support.ApplicationContext , times ( NUMBER ) ) . containsBean ( eq ( java.lang.String ) ) ; verify ( org.springframework.data.gemfire.config.support.ApplicationContext , times ( NUMBER ) ) . getBean ( eq ( java.lang.String ) , eq ( QueryService .class ) ) ; verify ( org.springframework.data.gemfire.config.support.QueryService , times ( NUMBER ) ) . createDefinedIndexes ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { when ( org.springframework.data.gemfire.config.support.ApplicationContext . containsBean ( eq ( java.lang.String ) ) ) . thenReturn ( false ) ; org.springframework.data.gemfire.config.support.DefinedIndexesApplicationListener . onApplicationEvent ( org.springframework.data.gemfire.config.support.ContextRefreshedEvent ) ; verify ( org.springframework.data.gemfire.config.support.ContextRefreshedEvent , times ( NUMBER ) ) . getApplicationContext ( ) ; verify ( org.springframework.data.gemfire.config.support.ApplicationContext , times ( NUMBER ) ) . containsBean ( eq ( java.lang.String ) ) ; verify ( org.springframework.data.gemfire.config.support.ApplicationContext , never ( ) ) . getBean ( anyString ( ) , any ( QueryService .class ) ) ; verify ( org.springframework.data.gemfire.config.support.QueryService , never ( ) ) . createDefinedIndexes ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { when ( org.springframework.data.gemfire.config.support.ApplicationContext . containsBean ( eq ( java.lang.String ) ) ) . thenReturn ( true ) ; when ( org.springframework.data.gemfire.config.support.ApplicationContext . getBean ( eq ( java.lang.String ) , eq ( QueryService .class ) ) ) . thenReturn ( org.springframework.data.gemfire.config.support.QueryService ) ; when ( org.springframework.data.gemfire.config.support.QueryService . createDefinedIndexes ( ) ) . thenThrow ( org.springframework.data.gemfire.config.support.MultiIndexCreationException ( STRING , new java.lang.RuntimeException ( STRING ) ) ) ; final Log org.springframework.data.gemfire.config.support.Log = mock ( Log .class ) ; DefinedIndexesApplicationListener org.springframework.data.gemfire.config.support.DefinedIndexesApplicationListener = new DefinedIndexesApplicationListener ( ) { @ java.lang.Override org.springframework.data.gemfire.config.support.Log org.springframework.data.gemfire.config.support.Log ( ) { return org.springframework.data.gemfire.config.support.Log ; } } ; org.springframework.data.gemfire.config.support.DefinedIndexesApplicationListener . onApplicationEvent ( org.springframework.data.gemfire.config.support.ContextRefreshedEvent ) ; verify ( org.springframework.data.gemfire.config.support.ContextRefreshedEvent , times ( NUMBER ) ) . getApplicationContext ( ) ; verify ( org.springframework.data.gemfire.config.support.ApplicationContext , times ( NUMBER ) ) . containsBean ( eq ( java.lang.String ) ) ; verify ( org.springframework.data.gemfire.config.support.ApplicationContext , times ( NUMBER ) ) . getBean ( eq ( java.lang.String ) , eq ( QueryService .class ) ) ; verify ( org.springframework.data.gemfire.config.support.QueryService , times ( NUMBER ) ) . createDefinedIndexes ( ) ; verify ( org.springframework.data.gemfire.config.support.Log , times ( NUMBER ) ) . warn ( startsWith ( STRING ) , isA ( MultiIndexCreationException .class ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override org.springframework.data.gemfire.config.support.Log org.springframework.data.gemfire.config.support.Log ( ) { return org.springframework.data.gemfire.config.support.Log ; }  <METHOD_END>
