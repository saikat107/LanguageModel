<METHOD_START> @ java.lang.Override protected java.lang.Class<? extends java.lang.annotation.Annotation> < ? extends java.lang.annotation.Annotation > java.lang.Class<? extends java.lang.annotation.Annotation> ( ) { return EnableElasticsearchRepositories .class ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Class<?> < ? > java.lang.Class<?> ( ) { return org.springframework.boot.autoconfigure.data.elasticsearch.ElasticsearchRepositoriesRegistrar.EnableElasticsearchRepositoriesConfiguration .class ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.boot.autoconfigure.data.elasticsearch.RepositoryConfigurationExtension org.springframework.boot.autoconfigure.data.elasticsearch.RepositoryConfigurationExtension ( ) { return new ElasticsearchRepositoryConfigExtension ( ) ; }  <METHOD_END>