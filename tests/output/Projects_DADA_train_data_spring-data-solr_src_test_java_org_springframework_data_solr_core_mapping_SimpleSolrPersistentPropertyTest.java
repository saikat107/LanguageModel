<METHOD_START> @ Test @ java.lang.SuppressWarnings ( { STRING , STRING } ) public void void ( ) java.lang.NoSuchFieldException , java.lang.SecurityException , java.beans.IntrospectionException { java.lang.reflect.Field java.lang.reflect.Field = org.springframework.data.solr.core.mapping.SimpleSolrPersistentPropertyTest.BeanWithScore .class . java.lang.reflect.Field ( STRING ) ; java.beans.PropertyDescriptor java.beans.PropertyDescriptor = new java.beans.PropertyDescriptor ( STRING , org.springframework.data.solr.core.mapping.SimpleSolrPersistentPropertyTest.BeanWithScore .class , null , null ) ; when ( org.springframework.data.solr.core.mapping.PersistentEntity<org.springframework.data.solr.core.mapping.SimpleSolrPersistentPropertyTest.BeanWithScore,org.springframework.data.solr.core.mapping.SolrPersistentProperty> . getType ( ) ) . thenReturn ( ( java.lang.Class ) org.springframework.data.solr.core.mapping.SimpleSolrPersistentPropertyTest.BeanWithScore .class ) ; when ( org.springframework.data.solr.core.mapping.PersistentEntity<org.springframework.data.solr.core.mapping.SimpleSolrPersistentPropertyTest.BeanWithScore,org.springframework.data.solr.core.mapping.SolrPersistentProperty> . getTypeInformation ( ) ) . thenReturn ( org.springframework.data.solr.core.mapping.TypeInformation<org.springframework.data.solr.core.mapping.SimpleSolrPersistentPropertyTest.BeanWithScore> ) ; when ( org.springframework.data.solr.core.mapping.TypeInformation<org.springframework.data.solr.core.mapping.SimpleSolrPersistentPropertyTest.BeanWithScore> . getProperty ( STRING ) ) . thenReturn ( java.util.Optional . java.util.Optional ( org.springframework.data.solr.core.mapping.TypeInformation<org.springframework.data.solr.core.mapping.SimpleSolrPersistentPropertyTest.BeanWithScore> ) ) ; SimpleSolrPersistentProperty org.springframework.data.solr.core.mapping.SimpleSolrPersistentProperty = new SimpleSolrPersistentProperty ( Property . of ( java.lang.reflect.Field , java.beans.PropertyDescriptor ) , org.springframework.data.solr.core.mapping.PersistentEntity<org.springframework.data.solr.core.mapping.SimpleSolrPersistentPropertyTest.BeanWithScore,org.springframework.data.solr.core.mapping.SolrPersistentProperty> , org.springframework.data.solr.core.mapping.SimpleTypeHolder ) ; assertTrue ( org.springframework.data.solr.core.mapping.SimpleSolrPersistentProperty . isScoreProperty ( ) ) ; assertFalse ( org.springframework.data.solr.core.mapping.SimpleSolrPersistentProperty . isWritable ( ) ) ; }  <METHOD_END>
<METHOD_START> public java.lang.Float java.lang.Float ( ) { return java.lang.Float ; }  <METHOD_END>
