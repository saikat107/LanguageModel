<METHOD_START> protected void ( java.lang.Class<? extends T> < ? extends T > java.lang.Class<? extends T> ) { Assert . notNull ( java.lang.Class<> , STRING ) ; this . java.lang.Class<? extends T> = java.lang.Class<> ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.Class<?> < ? > java.lang.Class<?> ) { this . java.util.Optional<java.lang.Class<?>> = java.util.Optional . java.util.Optional<java.lang.Class<?>> ( java.lang.Class<> ) ; }  <METHOD_END>
<METHOD_START> public void void ( Key org.springframework.data.repository.core.support.Key ) { this . org.springframework.data.repository.core.support.Key = org.springframework.data.repository.core.support.Key ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.Object java.lang.Object ) { this . java.util.Optional<java.lang.Object> = java.util.Optional . java.util.Optional<java.lang.Object> ( java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> public void void ( NamedQueries org.springframework.data.repository.core.support.NamedQueries ) { this . org.springframework.data.repository.core.support.NamedQueries = org.springframework.data.repository.core.support.NamedQueries ; }  <METHOD_END>
<METHOD_START> protected void void ( MappingContext < ? , ? > org.springframework.data.repository.core.support.MappingContext<?,?> ) { this . java.util.Optional<org.springframework.data.repository.core.support.MappingContext<?,?>> = java.util.Optional . java.util.Optional ( org.springframework.data.repository.core.support.MappingContext<,> ) ; }  <METHOD_END>
<METHOD_START> public void void ( EvaluationContextProvider org.springframework.data.repository.core.support.EvaluationContextProvider ) { this . org.springframework.data.repository.core.support.EvaluationContextProvider = org.springframework.data.repository.core.support.EvaluationContextProvider == null ? DefaultEvaluationContextProvider . INSTANCE : org.springframework.data.repository.core.support.EvaluationContextProvider ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.ClassLoader java.lang.ClassLoader ) { this . java.lang.ClassLoader = java.lang.ClassLoader ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( BeanFactory org.springframework.data.repository.core.support.BeanFactory ) throws org.springframework.data.repository.core.support.BeansException { this . org.springframework.data.repository.core.support.BeanFactory = org.springframework.data.repository.core.support.BeanFactory ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ApplicationEventPublisher org.springframework.data.repository.core.support.ApplicationEventPublisher ) { this . org.springframework.data.repository.core.support.ApplicationEventPublisher = org.springframework.data.repository.core.support.ApplicationEventPublisher ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) public org.springframework.data.repository.core.support.EntityInformation<S,ID> < S , ID > org.springframework.data.repository.core.support.EntityInformation<S,ID> ( ) { return ( EntityInformation < S , ID > ) org.springframework.data.repository.core.support.RepositoryFactorySupport . getEntityInformation ( org.springframework.data.repository.core.support.RepositoryMetadata . getDomainType ( ) ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.data.repository.core.support.RepositoryInformation org.springframework.data.repository.core.support.RepositoryInformation ( ) { return this . org.springframework.data.repository.core.support.RepositoryFactorySupport . getRepositoryInformation ( org.springframework.data.repository.core.support.RepositoryMetadata , java.util.Optional<java.lang.Object> . java.util.Optional<java.lang.Class<>> ( java.lang.Object :: java.lang.Class<? extends java.lang.Object> ) ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.data.repository.core.support.PersistentEntity<?,?> < ? , ? > org.springframework.data.repository.core.support.PersistentEntity<?,?> ( ) { return java.util.Optional<org.springframework.data.repository.core.support.MappingContext<?,?>> . orElseThrow ( ( ) new IllegalStateException ( STRING ) ) . getRequiredPersistentEntity ( org.springframework.data.repository.core.support.RepositoryMetadata . getDomainType ( ) ) ; }  <METHOD_END>
<METHOD_START> public java.util.List<org.springframework.data.repository.core.support.QueryMethod> < QueryMethod > java.util.List<org.springframework.data.repository.core.support.QueryMethod> ( ) { return org.springframework.data.repository.core.support.RepositoryFactorySupport . getQueryMethods ( ) ; }  <METHOD_END>
<METHOD_START> public T T ( ) { return this . org.springframework.data.repository.core.support.Lazy<T> . get ( ) ; }  <METHOD_END>
<METHOD_START> public java.lang.Class<? extends T> < ? extends T > java.lang.Class<? extends T> ( ) { return java.lang.Class<> ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( ) { return true ; }  <METHOD_END>
<METHOD_START> public void void ( ) { this . org.springframework.data.repository.core.support.RepositoryFactorySupport = org.springframework.data.repository.core.support.RepositoryFactorySupport ( ) ; this . org.springframework.data.repository.core.support.RepositoryFactorySupport . setQueryLookupStrategyKey ( org.springframework.data.repository.core.support.Key ) ; this . org.springframework.data.repository.core.support.RepositoryFactorySupport . setNamedQueries ( org.springframework.data.repository.core.support.NamedQueries ) ; this . org.springframework.data.repository.core.support.RepositoryFactorySupport . setEvaluationContextProvider ( org.springframework.data.repository.core.support.EvaluationContextProvider ) ; this . org.springframework.data.repository.core.support.RepositoryFactorySupport . setBeanClassLoader ( java.lang.ClassLoader ) ; this . org.springframework.data.repository.core.support.RepositoryFactorySupport . setBeanFactory ( org.springframework.data.repository.core.support.BeanFactory ) ; if ( org.springframework.data.repository.core.support.ApplicationEventPublisher != null ) { this . org.springframework.data.repository.core.support.RepositoryFactorySupport . addRepositoryProxyPostProcessor ( new EventPublishingRepositoryProxyPostProcessor ( org.springframework.data.repository.core.support.ApplicationEventPublisher ) ) ; } java.util.Optional<java.lang.Class<?>> . void ( java.lang.Class<?> -> this . org.springframework.data.repository.core.support.RepositoryFactorySupport . setRepositoryBaseClass ( java.lang.Class<> ) ) ; this . org.springframework.data.repository.core.support.RepositoryMetadata = this . org.springframework.data.repository.core.support.RepositoryFactorySupport . getRepositoryMetadata ( java.lang.Class<> ) ; this . org.springframework.data.repository.core.support.Lazy<T> = Lazy . of ( ( ) this . factory . getRepository ( repositoryInterface , customImplementation ) ) ; if ( ! boolean ) { this . org.springframework.data.repository.core.support.Lazy<T> . get ( ) ; } }  <METHOD_END>
<METHOD_START> protected abstract org.springframework.data.repository.core.support.RepositoryFactorySupport org.springframework.data.repository.core.support.RepositoryFactorySupport ( )  <METHOD_END>
