<METHOD_START> public void ( ResourceProperties org.springframework.boot.autoconfigure.web.reactive.ResourceProperties , WebFluxProperties org.springframework.boot.autoconfigure.web.reactive.WebFluxProperties , ListableBeanFactory org.springframework.boot.autoconfigure.web.reactive.ListableBeanFactory , ObjectProvider < java.util.List<org.springframework.boot.autoconfigure.web.reactive.HandlerMethodArgumentResolver> < HandlerMethodArgumentResolver > > org.springframework.boot.autoconfigure.web.reactive.ObjectProvider<java.util.List<org.springframework.boot.autoconfigure.web.reactive.HandlerMethodArgumentResolver>> , ObjectProvider < org.springframework.boot.autoconfigure.web.reactive.WebFluxAnnotationAutoConfiguration.ResourceHandlerRegistrationCustomizer > org.springframework.boot.autoconfigure.web.reactive.ObjectProvider<org.springframework.boot.autoconfigure.web.reactive.WebFluxAnnotationAutoConfiguration.ResourceHandlerRegistrationCustomizer> , ObjectProvider < java.util.List<org.springframework.boot.autoconfigure.web.reactive.ViewResolver> < ViewResolver > > org.springframework.boot.autoconfigure.web.reactive.ObjectProvider<java.util.List<org.springframework.boot.autoconfigure.web.reactive.ViewResolver>> ) { this . org.springframework.boot.autoconfigure.web.reactive.ResourceProperties = org.springframework.boot.autoconfigure.web.reactive.ResourceProperties ; this . org.springframework.boot.autoconfigure.web.reactive.WebFluxProperties = org.springframework.boot.autoconfigure.web.reactive.WebFluxProperties ; this . org.springframework.boot.autoconfigure.web.reactive.ListableBeanFactory = org.springframework.boot.autoconfigure.web.reactive.ListableBeanFactory ; this . java.util.List<org.springframework.boot.autoconfigure.web.reactive.HandlerMethodArgumentResolver> = org.springframework.boot.autoconfigure.web.reactive.ObjectProvider<java.util.List<org.springframework.boot.autoconfigure.web.reactive.HandlerMethodArgumentResolver>> . getIfAvailable ( ) ; this . org.springframework.boot.autoconfigure.web.reactive.WebFluxAnnotationAutoConfiguration.ResourceHandlerRegistrationCustomizer = org.springframework.boot.autoconfigure.web.reactive.ObjectProvider<org.springframework.boot.autoconfigure.web.reactive.WebFluxAnnotationAutoConfiguration.ResourceHandlerRegistrationCustomizer> . getIfAvailable ( ) ; this . java.util.List<org.springframework.boot.autoconfigure.web.reactive.ViewResolver> = org.springframework.boot.autoconfigure.web.reactive.ObjectProvider<java.util.List<org.springframework.boot.autoconfigure.web.reactive.ViewResolver>> . getIfAvailable ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ArgumentResolverConfigurer org.springframework.boot.autoconfigure.web.reactive.ArgumentResolverConfigurer ) { if ( this . java.util.List<org.springframework.boot.autoconfigure.web.reactive.HandlerMethodArgumentResolver> != null ) { this . java.util.List<org.springframework.boot.autoconfigure.web.reactive.HandlerMethodArgumentResolver> . stream ( ) . forEach ( org.springframework.boot.autoconfigure.web.reactive.ArgumentResolverConfigurer :: addCustomResolver ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ResourceHandlerRegistry org.springframework.boot.autoconfigure.web.reactive.ResourceHandlerRegistry ) { if ( ! this . org.springframework.boot.autoconfigure.web.reactive.ResourceProperties . isAddMappings ( ) ) { org.springframework.boot.autoconfigure.web.reactive.Log . debug ( STRING ) ; return; } java.lang.Integer java.lang.Integer = this . org.springframework.boot.autoconfigure.web.reactive.ResourceProperties . getCachePeriod ( ) ; if ( ! org.springframework.boot.autoconfigure.web.reactive.ResourceHandlerRegistry . hasMappingForPattern ( STRING ) ) { ResourceHandlerRegistration org.springframework.boot.autoconfigure.web.reactive.ResourceHandlerRegistration = org.springframework.boot.autoconfigure.web.reactive.ResourceHandlerRegistry . addResourceHandler ( STRING ) . addResourceLocations ( STRING ) ; if ( java.lang.Integer != null ) { org.springframework.boot.autoconfigure.web.reactive.ResourceHandlerRegistration . setCacheControl ( CacheControl . maxAge ( java.lang.Integer , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ) ; } void ( org.springframework.boot.autoconfigure.web.reactive.ResourceHandlerRegistration ) ; } java.lang.String java.lang.String = this . org.springframework.boot.autoconfigure.web.reactive.WebFluxProperties . getStaticPathPattern ( ) ; if ( ! org.springframework.boot.autoconfigure.web.reactive.ResourceHandlerRegistry . hasMappingForPattern ( java.lang.String ) ) { ResourceHandlerRegistration org.springframework.boot.autoconfigure.web.reactive.ResourceHandlerRegistration = org.springframework.boot.autoconfigure.web.reactive.ResourceHandlerRegistry . addResourceHandler ( java.lang.String ) . addResourceLocations ( this . org.springframework.boot.autoconfigure.web.reactive.ResourceProperties . getStaticLocations ( ) ) ; if ( java.lang.Integer != null ) { org.springframework.boot.autoconfigure.web.reactive.ResourceHandlerRegistration . setCacheControl ( CacheControl . maxAge ( java.lang.Integer , java.util.concurrent.TimeUnit . java.util.concurrent.TimeUnit ) ) ; } void ( org.springframework.boot.autoconfigure.web.reactive.ResourceHandlerRegistration ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ViewResolverRegistry org.springframework.boot.autoconfigure.web.reactive.ViewResolverRegistry ) { if ( this . java.util.List<org.springframework.boot.autoconfigure.web.reactive.ViewResolver> != null ) { AnnotationAwareOrderComparator . sort ( this . java.util.List<org.springframework.boot.autoconfigure.web.reactive.ViewResolver> ) ; this . java.util.List<org.springframework.boot.autoconfigure.web.reactive.ViewResolver> . forEach ( resolver -> registry . viewResolver ( resolver ) ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( final FormatterRegistry org.springframework.boot.autoconfigure.web.reactive.FormatterRegistry ) { for ( Converter < ? , ? > org.springframework.boot.autoconfigure.web.reactive.Converter<?,?> : java.util.Collection<org.springframework.boot.autoconfigure.web.reactive.Converter> ( Converter .class ) ) { org.springframework.boot.autoconfigure.web.reactive.FormatterRegistry . addConverter ( org.springframework.boot.autoconfigure.web.reactive.Converter<,> ) ; } for ( GenericConverter org.springframework.boot.autoconfigure.web.reactive.GenericConverter : java.util.Collection<org.springframework.boot.autoconfigure.web.reactive.GenericConverter> ( GenericConverter .class ) ) { org.springframework.boot.autoconfigure.web.reactive.FormatterRegistry . addConverter ( org.springframework.boot.autoconfigure.web.reactive.GenericConverter ) ; } for ( Formatter < ? > org.springframework.boot.autoconfigure.web.reactive.Formatter<?> : java.util.Collection<org.springframework.boot.autoconfigure.web.reactive.Formatter> ( Formatter .class ) ) { org.springframework.boot.autoconfigure.web.reactive.FormatterRegistry . addFormatter ( org.springframework.boot.autoconfigure.web.reactive.Formatter<> ) ; } }  <METHOD_END>
<METHOD_START> private < T > java.util.Collection<T> < T > java.util.Collection<T> ( java.lang.Class<T> < T > java.lang.Class<T> ) { return this . org.springframework.boot.autoconfigure.web.reactive.ListableBeanFactory . getBeansOfType ( java.lang.Class<T> ) . values ( ) ; }  <METHOD_END>
<METHOD_START> private void void ( ResourceHandlerRegistration org.springframework.boot.autoconfigure.web.reactive.ResourceHandlerRegistration ) { if ( this . org.springframework.boot.autoconfigure.web.reactive.WebFluxAnnotationAutoConfiguration.ResourceHandlerRegistrationCustomizer != null ) { this . org.springframework.boot.autoconfigure.web.reactive.WebFluxAnnotationAutoConfiguration.ResourceHandlerRegistrationCustomizer . void ( org.springframework.boot.autoconfigure.web.reactive.ResourceHandlerRegistration ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override @ Bean public org.springframework.boot.autoconfigure.web.reactive.Validator org.springframework.boot.autoconfigure.web.reactive.Validator ( ) { if ( ! ClassUtils . isPresent ( STRING , java.lang.Class<? extends org.springframework.boot.autoconfigure.web.reactive.WebFluxAnnotationAutoConfiguration.EnableWebFluxConfiguration> ( ) . java.lang.ClassLoader ( ) ) ) { return super. webFluxValidator ( ) ; } return SpringValidator . get ( getApplicationContext ( ) , getValidator ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.boot.autoconfigure.web.reactive.WebFluxAnnotationAutoConfiguration.ResourceChainResourceHandlerRegistrationCustomizer org.springframework.boot.autoconfigure.web.reactive.WebFluxAnnotationAutoConfiguration.ResourceChainResourceHandlerRegistrationCustomizer ( ) { return new org.springframework.boot.autoconfigure.web.reactive.WebFluxAnnotationAutoConfiguration.ResourceChainResourceHandlerRegistrationCustomizer ( ) ; }  <METHOD_END>
<METHOD_START> void void ( ResourceHandlerRegistration org.springframework.boot.autoconfigure.web.reactive.ResourceHandlerRegistration );  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ResourceHandlerRegistration org.springframework.boot.autoconfigure.web.reactive.ResourceHandlerRegistration ) { ResourceProperties . ResourceProperties ResourceProperties.Chain = this . org.springframework.boot.autoconfigure.web.reactive.ResourceProperties . getChain ( ) ; void ( ResourceProperties.Chain , org.springframework.boot.autoconfigure.web.reactive.ResourceHandlerRegistration . resourceChain ( ResourceProperties.Chain . isCache ( ) ) ) ; }  <METHOD_END>
<METHOD_START> private void void ( ResourceProperties . ResourceProperties ResourceProperties.Chain , ResourceChainRegistration org.springframework.boot.autoconfigure.web.reactive.ResourceChainRegistration ) { ResourceProperties . ResourceProperties ResourceProperties.Strategy = ResourceProperties.Chain . getStrategy ( ) ; if ( ResourceProperties.Strategy . getFixed ( ) . isEnabled ( ) || ResourceProperties.Strategy . getContent ( ) . isEnabled ( ) ) { org.springframework.boot.autoconfigure.web.reactive.ResourceChainRegistration . addResolver ( org.springframework.boot.autoconfigure.web.reactive.ResourceResolver ( ResourceProperties.Strategy ) ) ; } if ( ResourceProperties.Chain . isGzipped ( ) ) { org.springframework.boot.autoconfigure.web.reactive.ResourceChainRegistration . addResolver ( new GzipResourceResolver ( ) ) ; } if ( ResourceProperties.Chain . isHtmlApplicationCache ( ) ) { org.springframework.boot.autoconfigure.web.reactive.ResourceChainRegistration . addTransformer ( new AppCacheManifestTransformer ( ) ) ; } }  <METHOD_END>
<METHOD_START> private org.springframework.boot.autoconfigure.web.reactive.ResourceResolver org.springframework.boot.autoconfigure.web.reactive.ResourceResolver ( ResourceProperties . ResourceProperties ResourceProperties.Strategy ) { VersionResourceResolver org.springframework.boot.autoconfigure.web.reactive.VersionResourceResolver = new VersionResourceResolver ( ) ; if ( ResourceProperties.Strategy . getFixed ( ) . isEnabled ( ) ) { java.lang.String java.lang.String = ResourceProperties.Strategy . getFixed ( ) . getVersion ( ) ; java.lang.String [] java.lang.String[] = ResourceProperties.Strategy . getFixed ( ) . getPaths ( ) ; org.springframework.boot.autoconfigure.web.reactive.VersionResourceResolver . addFixedVersionStrategy ( java.lang.String , java.lang.String[] ) ; } if ( ResourceProperties.Strategy . getContent ( ) . isEnabled ( ) ) { java.lang.String [] java.lang.String[] = ResourceProperties.Strategy . getContent ( ) . getPaths ( ) ; org.springframework.boot.autoconfigure.web.reactive.VersionResourceResolver . addContentVersionStrategy ( java.lang.String[] ) ; } return org.springframework.boot.autoconfigure.web.reactive.VersionResourceResolver ; }  <METHOD_END>
