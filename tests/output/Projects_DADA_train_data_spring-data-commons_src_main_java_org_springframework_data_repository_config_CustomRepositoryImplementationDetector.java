<METHOD_START> public java.util.Optional<org.springframework.data.repository.config.AbstractBeanDefinition> < AbstractBeanDefinition > java.util.Optional<org.springframework.data.repository.config.AbstractBeanDefinition> ( RepositoryConfiguration < ? > org.springframework.data.repository.config.RepositoryConfiguration<?> ) { return java.util.Optional<org.springframework.data.repository.config.AbstractBeanDefinition> ( org.springframework.data.repository.config.RepositoryConfiguration<> . getImplementationClassName ( ) , org.springframework.data.repository.config.RepositoryConfiguration<> . getBasePackages ( ) , org.springframework.data.repository.config.RepositoryConfiguration<> . getExcludeFilters ( ) ) ; }  <METHOD_END>
<METHOD_START> public java.util.Optional<org.springframework.data.repository.config.AbstractBeanDefinition> < AbstractBeanDefinition > java.util.Optional<org.springframework.data.repository.config.AbstractBeanDefinition> ( java.lang.String java.lang.String , java.lang.Iterable<java.lang.String> < java.lang.String > java.lang.Iterable<java.lang.String> , java.lang.Iterable<org.springframework.data.repository.config.TypeFilter> < TypeFilter > java.lang.Iterable<org.springframework.data.repository.config.TypeFilter> ) { Assert . notNull ( java.lang.String , STRING ) ; Assert . notNull ( java.lang.Iterable<java.lang.String> , STRING ) ; java.util.regex.Pattern java.util.regex.Pattern = java.util.regex.Pattern . java.util.regex.Pattern ( STRING + java.lang.String ) ; ClassPathScanningCandidateComponentProvider org.springframework.data.repository.config.ClassPathScanningCandidateComponentProvider = new ClassPathScanningCandidateComponentProvider ( false ) ; org.springframework.data.repository.config.ClassPathScanningCandidateComponentProvider . setEnvironment ( org.springframework.data.repository.config.Environment ) ; org.springframework.data.repository.config.ClassPathScanningCandidateComponentProvider . setResourceLoader ( org.springframework.data.repository.config.ResourceLoader ) ; org.springframework.data.repository.config.ClassPathScanningCandidateComponentProvider . setResourcePattern ( java.lang.String . java.lang.String ( java.lang.String , java.lang.String ) ) ; org.springframework.data.repository.config.ClassPathScanningCandidateComponentProvider . setMetadataReaderFactory ( org.springframework.data.repository.config.MetadataReaderFactory ) ; org.springframework.data.repository.config.ClassPathScanningCandidateComponentProvider . addIncludeFilter ( new RegexPatternTypeFilter ( java.util.regex.Pattern ) ) ; for ( TypeFilter org.springframework.data.repository.config.TypeFilter : java.lang.Iterable<org.springframework.data.repository.config.TypeFilter> ) { org.springframework.data.repository.config.ClassPathScanningCandidateComponentProvider . addExcludeFilter ( org.springframework.data.repository.config.TypeFilter ) ; } java.util.Set<org.springframework.data.repository.config.BeanDefinition> < BeanDefinition > java.util.Set<org.springframework.data.repository.config.BeanDefinition> = new java.util.HashSet<org.springframework.data.repository.config.BeanDefinition> <> ( ) ; for ( java.lang.String java.lang.String : java.lang.Iterable<java.lang.String> ) { java.util.Set<org.springframework.data.repository.config.BeanDefinition> . addAll ( org.springframework.data.repository.config.ClassPathScanningCandidateComponentProvider . findCandidateComponents ( java.lang.String ) ) ; } if ( java.util.Set<org.springframework.data.repository.config.BeanDefinition> . isEmpty ( ) ) { return java.util.Optional . java.util.Optional<org.springframework.data.repository.config.AbstractBeanDefinition> ( ) ; } if ( java.util.Set<org.springframework.data.repository.config.BeanDefinition> . size ( ) == NUMBER ) { return java.util.Optional . java.util.Optional<T> ( ( AbstractBeanDefinition ) java.util.Set<org.springframework.data.repository.config.BeanDefinition> . iterator ( ) . next ( ) ) ; } throw new java.lang.IllegalStateException ( java.lang.String . java.lang.String ( STRING , java.util.Set<org.springframework.data.repository.config.BeanDefinition> . stream ( ) . map ( BeanDefinition :: getBeanClassName ) . collect ( java.util.stream.Collectors . java.util.stream.Collector<java.lang.CharSequence,?,java.lang.String> ( STRING ) ) ) ) ; }  <METHOD_END>
