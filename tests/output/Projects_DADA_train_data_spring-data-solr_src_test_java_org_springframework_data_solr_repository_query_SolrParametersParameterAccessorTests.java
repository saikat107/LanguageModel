<METHOD_START> @ Test public void void ( ) java.lang.Exception { SolrQueryMethod org.springframework.data.solr.repository.query.SolrQueryMethod = org.springframework.data.solr.repository.query.SolrQueryMethod ( org.springframework.data.solr.repository.query.SolrParametersParameterAccessorTests.Repo1 .class , STRING , java.lang.String .class ) ; SolrParametersParameterAccessor org.springframework.data.solr.repository.query.SolrParametersParameterAccessor = new SolrParametersParameterAccessor ( org.springframework.data.solr.repository.query.SolrQueryMethod , new java.lang.Object [] { STRING } ) ; Assert . assertEquals ( STRING , org.springframework.data.solr.repository.query.SolrParametersParameterAccessor . getBindableValue ( NUMBER ) ) ; Assert . assertEquals ( NUMBER , org.springframework.data.solr.repository.query.SolrParametersParameterAccessor . getBoost ( NUMBER ) , NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { SolrQueryMethod org.springframework.data.solr.repository.query.SolrQueryMethod = org.springframework.data.solr.repository.query.SolrQueryMethod ( org.springframework.data.solr.repository.query.SolrParametersParameterAccessorTests.Repo1 .class , STRING , java.lang.String .class , java.lang.Integer .class ) ; SolrParametersParameterAccessor org.springframework.data.solr.repository.query.SolrParametersParameterAccessor = new SolrParametersParameterAccessor ( org.springframework.data.solr.repository.query.SolrQueryMethod , new java.lang.Object [] { STRING , java.lang.Integer . java.lang.Integer ( NUMBER ) } ) ; Assert . assertEquals ( STRING , org.springframework.data.solr.repository.query.SolrParametersParameterAccessor . getBindableValue ( NUMBER ) ) ; Assert . assertEquals ( NUMBER , org.springframework.data.solr.repository.query.SolrParametersParameterAccessor . getBoost ( NUMBER ) , NUMBER ) ; Assert . assertEquals ( NUMBER , org.springframework.data.solr.repository.query.SolrParametersParameterAccessor . getBindableValue ( NUMBER ) ) ; Assert . assertEquals ( NUMBER , org.springframework.data.solr.repository.query.SolrParametersParameterAccessor . getBoost ( NUMBER ) , NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { SolrQueryMethod org.springframework.data.solr.repository.query.SolrQueryMethod = org.springframework.data.solr.repository.query.SolrQueryMethod ( org.springframework.data.solr.repository.query.SolrParametersParameterAccessorTests.Repo1 .class , STRING , java.lang.String .class , java.lang.Integer .class ) ; SolrParametersParameterAccessor org.springframework.data.solr.repository.query.SolrParametersParameterAccessor = new SolrParametersParameterAccessor ( org.springframework.data.solr.repository.query.SolrQueryMethod , new java.lang.Object [] { STRING , java.lang.Integer . java.lang.Integer ( NUMBER ) } ) ; Assert . assertEquals ( STRING , org.springframework.data.solr.repository.query.SolrParametersParameterAccessor . getBindableValue ( NUMBER ) ) ; Assert . assertEquals ( java.lang.Float . float , org.springframework.data.solr.repository.query.SolrParametersParameterAccessor . getBoost ( NUMBER ) , NUMBER ) ; Assert . assertEquals ( NUMBER , org.springframework.data.solr.repository.query.SolrParametersParameterAccessor . getBindableValue ( NUMBER ) ) ; Assert . assertEquals ( NUMBER , org.springframework.data.solr.repository.query.SolrParametersParameterAccessor . getBoost ( NUMBER ) , NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { SolrQueryMethod org.springframework.data.solr.repository.query.SolrQueryMethod = org.springframework.data.solr.repository.query.SolrQueryMethod ( org.springframework.data.solr.repository.query.SolrParametersParameterAccessorTests.Repo1 .class , STRING , java.lang.String .class , java.lang.Integer .class ) ; SolrParametersParameterAccessor org.springframework.data.solr.repository.query.SolrParametersParameterAccessor = new SolrParametersParameterAccessor ( org.springframework.data.solr.repository.query.SolrQueryMethod , new java.lang.Object [] { STRING , java.lang.Integer . java.lang.Integer ( NUMBER ) } ) ; for ( java.lang.Object java.lang.Object : org.springframework.data.solr.repository.query.SolrParametersParameterAccessor ) { Assert . assertThat ( java.lang.Object , IsInstanceOf . instanceOf ( BindableSolrParameter .class ) ) ; } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { SolrQueryMethod org.springframework.data.solr.repository.query.SolrQueryMethod = org.springframework.data.solr.repository.query.SolrQueryMethod ( org.springframework.data.solr.repository.query.SolrParametersParameterAccessorTests.Repo1 .class , STRING ) ; SolrParametersParameterAccessor org.springframework.data.solr.repository.query.SolrParametersParameterAccessor = new SolrParametersParameterAccessor ( org.springframework.data.solr.repository.query.SolrQueryMethod , new java.lang.Object [] {} ) ; Assert . assertFalse ( org.springframework.data.solr.repository.query.SolrParametersParameterAccessor . iterator ( ) . hasNext ( ) ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.data.solr.repository.query.SolrQueryMethod org.springframework.data.solr.repository.query.SolrQueryMethod ( java.lang.Class<?> < ? > java.lang.Class<?> , java.lang.String java.lang.String , java.lang.Class<?> < ? > ... java.lang.Class<?>[] )			throws java.lang.SecurityException , java.lang.NoSuchMethodException { java.lang.reflect.Method java.lang.reflect.Method = java.lang.Class<> . java.lang.reflect.Method ( java.lang.String , java.lang.Class<?>[] ) ; return new SolrQueryMethod ( java.lang.reflect.Method , org.springframework.data.solr.repository.query.RepositoryMetadata , new SpelAwareProxyProjectionFactory ( ) , org.springframework.data.solr.repository.query.SolrEntityInformationCreator ) ; }  <METHOD_END>
<METHOD_START> java.util.List<org.springframework.data.solr.repository.query.ProductBean> < ProductBean > java.util.List<org.springframework.data.solr.repository.query.ProductBean> ( @ Boost ( NUMBER ) java.lang.String java.lang.String );  <METHOD_END>
<METHOD_START> java.util.List<org.springframework.data.solr.repository.query.ProductBean> < ProductBean > java.util.List<org.springframework.data.solr.repository.query.ProductBean> ( @ Boost ( NUMBER ) java.lang.String java.lang.String , @ Boost ( NUMBER ) java.lang.Integer java.lang.Integer );  <METHOD_END>
<METHOD_START> java.util.List<org.springframework.data.solr.repository.query.ProductBean> < ProductBean > java.util.List<org.springframework.data.solr.repository.query.ProductBean> ( java.lang.String java.lang.String , @ Boost ( NUMBER ) java.lang.Integer java.lang.Integer );  <METHOD_END>
<METHOD_START> java.util.List<org.springframework.data.solr.repository.query.ProductBean> < ProductBean > java.util.List<org.springframework.data.solr.repository.query.ProductBean> ( )  <METHOD_END>