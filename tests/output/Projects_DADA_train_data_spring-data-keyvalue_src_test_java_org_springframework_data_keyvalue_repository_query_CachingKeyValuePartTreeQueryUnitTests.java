<METHOD_START> @ Before @ java.lang.SuppressWarnings ( { STRING , STRING } ) public void void ( ) java.lang.Exception { when ( org.springframework.data.keyvalue.repository.query.RepositoryMetadata . getDomainType ( ) ) . thenReturn ( ( java.lang.Class ) Person .class ) ; when ( org.springframework.data.keyvalue.repository.query.RepositoryMetadata . getReturnedDomainClass ( any ( java.lang.reflect.Method .class ) ) ) . thenReturn ( ( java.lang.Class ) Person .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.NoSuchMethodException , java.lang.SecurityException { QueryMethod org.springframework.data.keyvalue.repository.query.QueryMethod = new QueryMethod ( org.springframework.data.keyvalue.repository.query.CachingKeyValuePartTreeQueryUnitTests.Repo .class . java.lang.reflect.Method ( STRING , java.lang.String .class ) , org.springframework.data.keyvalue.repository.query.RepositoryMetadata , org.springframework.data.keyvalue.repository.query.ProjectionFactory ) ; KeyValuePartTreeQuery org.springframework.data.keyvalue.repository.query.KeyValuePartTreeQuery = new CachingKeyValuePartTreeQuery ( org.springframework.data.keyvalue.repository.query.QueryMethod , DefaultEvaluationContextProvider . INSTANCE , org.springframework.data.keyvalue.repository.query.KeyValueOperations , SpelQueryCreator .class ) ; java.lang.Object [] java.lang.Object[] = new java.lang.Object [] { STRING } ; SpelCriteria org.springframework.data.keyvalue.repository.query.SpelCriteria = ( SpelCriteria ) org.springframework.data.keyvalue.repository.query.KeyValuePartTreeQuery . prepareQuery ( java.lang.Object[] ) . getCritieria ( ) ; SpelCriteria org.springframework.data.keyvalue.repository.query.SpelCriteria = ( SpelCriteria ) org.springframework.data.keyvalue.repository.query.KeyValuePartTreeQuery . prepareQuery ( java.lang.Object[] ) . getCritieria ( ) ; assertThat ( org.springframework.data.keyvalue.repository.query.SpelCriteria . getExpression ( ) , sameInstance ( org.springframework.data.keyvalue.repository.query.SpelCriteria . getExpression ( ) ) ) ; assertThat ( org.springframework.data.keyvalue.repository.query.SpelCriteria . getContext ( ) , not ( sameInstance ( org.springframework.data.keyvalue.repository.query.SpelCriteria . getContext ( ) ) ) ) ; }  <METHOD_END>
<METHOD_START> java.util.List<org.springframework.data.keyvalue.repository.query.Person> < Person > java.util.List<org.springframework.data.keyvalue.repository.query.Person> ( java.lang.String java.lang.String );  <METHOD_END>