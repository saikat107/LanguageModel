<METHOD_START> public void ( java.lang.Class<? extends T> < ? extends T > java.lang.Class<? extends T> ) { super( java.lang.Class<> ); }  <METHOD_END>
<METHOD_START> public void void ( KeyValueOperations org.springframework.data.keyvalue.repository.support.KeyValueOperations ) { Assert . notNull ( org.springframework.data.keyvalue.repository.support.KeyValueOperations , STRING ) ; this . org.springframework.data.keyvalue.repository.support.KeyValueOperations = org.springframework.data.keyvalue.repository.support.KeyValueOperations ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( MappingContext < ? , ? > org.springframework.data.keyvalue.repository.support.MappingContext<?,?> ) { super. setMappingContext ( org.springframework.data.keyvalue.repository.support.MappingContext<,> ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.Class<? extends org.springframework.data.keyvalue.repository.support.AbstractQueryCreator<?,?>> < ? extends AbstractQueryCreator < ? , ? > > java.lang.Class<? extends org.springframework.data.keyvalue.repository.support.AbstractQueryCreator<?,?>> ) { Assert . notNull ( java.lang.Class<> , STRING ) ; this . java.lang.Class<? extends org.springframework.data.keyvalue.repository.support.AbstractQueryCreator<?,?>> = java.lang.Class<> ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.Class<? extends org.springframework.data.keyvalue.repository.support.RepositoryQuery> < ? extends RepositoryQuery > java.lang.Class<? extends org.springframework.data.keyvalue.repository.support.RepositoryQuery> ) { Assert . notNull ( java.lang.Class<> , STRING ) ; this . java.lang.Class<? extends org.springframework.data.keyvalue.repository.support.RepositoryQuery> = java.lang.Class<> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected final org.springframework.data.keyvalue.repository.support.RepositoryFactorySupport org.springframework.data.keyvalue.repository.support.RepositoryFactorySupport ( ) { return org.springframework.data.keyvalue.repository.support.KeyValueRepositoryFactory ( org.springframework.data.keyvalue.repository.support.KeyValueOperations , java.lang.Class<> , java.lang.Class<> ) ; }  <METHOD_END>
<METHOD_START> protected org.springframework.data.keyvalue.repository.support.KeyValueRepositoryFactory org.springframework.data.keyvalue.repository.support.KeyValueRepositoryFactory ( KeyValueOperations org.springframework.data.keyvalue.repository.support.KeyValueOperations , java.lang.Class<? extends org.springframework.data.keyvalue.repository.support.AbstractQueryCreator<?,?>> < ? extends AbstractQueryCreator < ? , ? > > java.lang.Class<? extends org.springframework.data.keyvalue.repository.support.AbstractQueryCreator<?,?>> , java.lang.Class<? extends org.springframework.data.keyvalue.repository.support.RepositoryQuery> < ? extends RepositoryQuery > java.lang.Class<? extends org.springframework.data.keyvalue.repository.support.RepositoryQuery> ) { return new KeyValueRepositoryFactory ( org.springframework.data.keyvalue.repository.support.KeyValueOperations , java.lang.Class<> , java.lang.Class<> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { Assert . notNull ( org.springframework.data.keyvalue.repository.support.KeyValueOperations , STRING ) ; Assert . notNull ( java.lang.Class<> , STRING ) ; Assert . notNull ( java.lang.Class<> , STRING ) ; super. afterPropertiesSet ( ) ; }  <METHOD_END>
