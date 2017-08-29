<METHOD_START> @ java.lang.Override public org.springframework.cache.config.BeanDefinition org.springframework.cache.config.BeanDefinition ( org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.cache.config.ParserContext ) { java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; if ( STRING . boolean ( java.lang.String ) ) { void ( org.w3c.dom.Element , org.springframework.cache.config.ParserContext ) ; } else { void ( org.w3c.dom.Element , org.springframework.cache.config.ParserContext ) ; } return null ; }  <METHOD_END>
<METHOD_START> private void void ( org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.cache.config.ParserContext ) { org.springframework.cache.config.AnnotationDrivenCacheBeanDefinitionParser.SpringCachingConfigurer . void ( org.w3c.dom.Element , org.springframework.cache.config.ParserContext ) ; if ( boolean && boolean ) { org.springframework.cache.config.AnnotationDrivenCacheBeanDefinitionParser.JCacheCachingConfigurer . void ( org.w3c.dom.Element , org.springframework.cache.config.ParserContext ) ; } }  <METHOD_END>
<METHOD_START> private void void ( org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.cache.config.ParserContext ) { AopNamespaceUtils . registerAutoProxyCreatorIfNecessary ( org.springframework.cache.config.ParserContext , org.w3c.dom.Element ) ; org.springframework.cache.config.AnnotationDrivenCacheBeanDefinitionParser.SpringCachingConfigurer . void ( org.w3c.dom.Element , org.springframework.cache.config.ParserContext ) ; if ( boolean && boolean ) { org.springframework.cache.config.AnnotationDrivenCacheBeanDefinitionParser.JCacheCachingConfigurer . void ( org.w3c.dom.Element , org.springframework.cache.config.ParserContext ) ; } }  <METHOD_END>
<METHOD_START> private static void void ( org.w3c.dom.Element org.w3c.dom.Element , BeanDefinition org.springframework.cache.config.BeanDefinition , boolean boolean ) { java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; if ( StringUtils . hasText ( java.lang.String ) ) { org.springframework.cache.config.BeanDefinition . getPropertyValues ( ) . add ( STRING , new RuntimeBeanReference ( java.lang.String . java.lang.String ( ) ) ) ; } if ( ! StringUtils . hasText ( java.lang.String ) || boolean ) { org.springframework.cache.config.BeanDefinition . getPropertyValues ( ) . add ( STRING , new RuntimeBeanReference ( CacheNamespaceHandler . extractCacheManager ( org.w3c.dom.Element ) ) ) ; } }  <METHOD_END>
<METHOD_START> private static org.springframework.cache.config.BeanDefinition org.springframework.cache.config.BeanDefinition ( org.w3c.dom.Element org.w3c.dom.Element , BeanDefinition org.springframework.cache.config.BeanDefinition ) { java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( STRING ) ; if ( StringUtils . hasText ( java.lang.String ) ) { org.springframework.cache.config.BeanDefinition . getPropertyValues ( ) . add ( STRING , new RuntimeBeanReference ( java.lang.String . java.lang.String ( ) ) ) ; } return org.springframework.cache.config.BeanDefinition ; }  <METHOD_END>
<METHOD_START> private static void void ( org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.cache.config.ParserContext ) { if ( ! org.springframework.cache.config.ParserContext . getRegistry ( ) . containsBeanDefinition ( CacheManagementConfigUtils . CACHE_ADVISOR_BEAN_NAME ) ) { java.lang.Object java.lang.Object = org.springframework.cache.config.ParserContext . extractSource ( org.w3c.dom.Element ) ; RootBeanDefinition org.springframework.cache.config.RootBeanDefinition = new RootBeanDefinition ( STRING ) ; org.springframework.cache.config.RootBeanDefinition . setSource ( java.lang.Object ) ; org.springframework.cache.config.RootBeanDefinition . setRole ( BeanDefinition . ROLE_INFRASTRUCTURE ) ; java.lang.String java.lang.String = org.springframework.cache.config.ParserContext . getReaderContext ( ) . registerWithGeneratedName ( org.springframework.cache.config.RootBeanDefinition ) ; RootBeanDefinition org.springframework.cache.config.RootBeanDefinition = new RootBeanDefinition ( CacheInterceptor .class ) ; org.springframework.cache.config.RootBeanDefinition . setSource ( java.lang.Object ) ; org.springframework.cache.config.RootBeanDefinition . setRole ( BeanDefinition . ROLE_INFRASTRUCTURE ) ; void ( org.w3c.dom.Element , org.springframework.cache.config.RootBeanDefinition , false ) ; org.springframework.cache.config.BeanDefinition ( org.w3c.dom.Element , org.springframework.cache.config.RootBeanDefinition ) ; CacheNamespaceHandler . parseKeyGenerator ( org.w3c.dom.Element , org.springframework.cache.config.RootBeanDefinition ) ; org.springframework.cache.config.RootBeanDefinition . getPropertyValues ( ) . add ( STRING , new RuntimeBeanReference ( java.lang.String ) ) ; java.lang.String java.lang.String = org.springframework.cache.config.ParserContext . getReaderContext ( ) . registerWithGeneratedName ( org.springframework.cache.config.RootBeanDefinition ) ; RootBeanDefinition org.springframework.cache.config.RootBeanDefinition = new RootBeanDefinition ( BeanFactoryCacheOperationSourceAdvisor .class ) ; org.springframework.cache.config.RootBeanDefinition . setSource ( java.lang.Object ) ; org.springframework.cache.config.RootBeanDefinition . setRole ( BeanDefinition . ROLE_INFRASTRUCTURE ) ; org.springframework.cache.config.RootBeanDefinition . getPropertyValues ( ) . add ( STRING , new RuntimeBeanReference ( java.lang.String ) ) ; org.springframework.cache.config.RootBeanDefinition . getPropertyValues ( ) . add ( STRING , java.lang.String ) ; if ( org.w3c.dom.Element . boolean ( STRING ) ) { org.springframework.cache.config.RootBeanDefinition . getPropertyValues ( ) . add ( STRING , org.w3c.dom.Element . java.lang.String ( STRING ) ) ; } org.springframework.cache.config.ParserContext . getRegistry ( ) . registerBeanDefinition ( CacheManagementConfigUtils . CACHE_ADVISOR_BEAN_NAME , org.springframework.cache.config.RootBeanDefinition ) ; CompositeComponentDefinition org.springframework.cache.config.CompositeComponentDefinition = new CompositeComponentDefinition ( org.w3c.dom.Element . java.lang.String ( ) , java.lang.Object ) ; org.springframework.cache.config.CompositeComponentDefinition . addNestedComponent ( new BeanComponentDefinition ( org.springframework.cache.config.RootBeanDefinition , java.lang.String ) ) ; org.springframework.cache.config.CompositeComponentDefinition . addNestedComponent ( new BeanComponentDefinition ( org.springframework.cache.config.RootBeanDefinition , java.lang.String ) ) ; org.springframework.cache.config.CompositeComponentDefinition . addNestedComponent ( new BeanComponentDefinition ( org.springframework.cache.config.RootBeanDefinition , CacheManagementConfigUtils . CACHE_ADVISOR_BEAN_NAME ) ) ; org.springframework.cache.config.ParserContext . registerComponent ( org.springframework.cache.config.CompositeComponentDefinition ) ; } }  <METHOD_END>
<METHOD_START> private static void void ( org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.cache.config.ParserContext ) { if ( ! org.springframework.cache.config.ParserContext . getRegistry ( ) . containsBeanDefinition ( CacheManagementConfigUtils . CACHE_ASPECT_BEAN_NAME ) ) { RootBeanDefinition org.springframework.cache.config.RootBeanDefinition = new RootBeanDefinition ( ) ; org.springframework.cache.config.RootBeanDefinition . setBeanClassName ( java.lang.String ) ; org.springframework.cache.config.RootBeanDefinition . setFactoryMethodName ( STRING ) ; void ( org.w3c.dom.Element , org.springframework.cache.config.RootBeanDefinition , false ) ; CacheNamespaceHandler . parseKeyGenerator ( org.w3c.dom.Element , org.springframework.cache.config.RootBeanDefinition ) ; org.springframework.cache.config.ParserContext . registerBeanComponent ( new BeanComponentDefinition ( org.springframework.cache.config.RootBeanDefinition , CacheManagementConfigUtils . CACHE_ASPECT_BEAN_NAME ) ) ; } }  <METHOD_END>
<METHOD_START> private static void void ( org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.cache.config.ParserContext ) { if ( ! org.springframework.cache.config.ParserContext . getRegistry ( ) . containsBeanDefinition ( CacheManagementConfigUtils . JCACHE_ADVISOR_BEAN_NAME ) ) { java.lang.Object java.lang.Object = org.springframework.cache.config.ParserContext . extractSource ( org.w3c.dom.Element ) ; BeanDefinition org.springframework.cache.config.BeanDefinition = org.springframework.cache.config.RootBeanDefinition ( org.w3c.dom.Element , java.lang.Object ) ; java.lang.String java.lang.String = org.springframework.cache.config.ParserContext . getReaderContext ( ) . registerWithGeneratedName ( org.springframework.cache.config.BeanDefinition ) ; RootBeanDefinition org.springframework.cache.config.RootBeanDefinition = new RootBeanDefinition ( STRING ) ; org.springframework.cache.config.RootBeanDefinition . setSource ( java.lang.Object ) ; org.springframework.cache.config.RootBeanDefinition . setRole ( BeanDefinition . ROLE_INFRASTRUCTURE ) ; org.springframework.cache.config.RootBeanDefinition . getPropertyValues ( ) . add ( STRING , new RuntimeBeanReference ( java.lang.String ) ) ; org.springframework.cache.config.BeanDefinition ( org.w3c.dom.Element , org.springframework.cache.config.RootBeanDefinition ) ; java.lang.String java.lang.String = org.springframework.cache.config.ParserContext . getReaderContext ( ) . registerWithGeneratedName ( org.springframework.cache.config.RootBeanDefinition ) ; RootBeanDefinition org.springframework.cache.config.RootBeanDefinition = new RootBeanDefinition ( STRING ) ; org.springframework.cache.config.RootBeanDefinition . setSource ( java.lang.Object ) ; org.springframework.cache.config.RootBeanDefinition . setRole ( BeanDefinition . ROLE_INFRASTRUCTURE ) ; org.springframework.cache.config.RootBeanDefinition . getPropertyValues ( ) . add ( STRING , new RuntimeBeanReference ( java.lang.String ) ) ; org.springframework.cache.config.RootBeanDefinition . getPropertyValues ( ) . add ( STRING , java.lang.String ) ; if ( org.w3c.dom.Element . boolean ( STRING ) ) { org.springframework.cache.config.RootBeanDefinition . getPropertyValues ( ) . add ( STRING , org.w3c.dom.Element . java.lang.String ( STRING ) ) ; } org.springframework.cache.config.ParserContext . getRegistry ( ) . registerBeanDefinition ( CacheManagementConfigUtils . JCACHE_ADVISOR_BEAN_NAME , org.springframework.cache.config.RootBeanDefinition ) ; CompositeComponentDefinition org.springframework.cache.config.CompositeComponentDefinition = new CompositeComponentDefinition ( org.w3c.dom.Element . java.lang.String ( ) , java.lang.Object ) ; org.springframework.cache.config.CompositeComponentDefinition . addNestedComponent ( new BeanComponentDefinition ( org.springframework.cache.config.BeanDefinition , java.lang.String ) ) ; org.springframework.cache.config.CompositeComponentDefinition . addNestedComponent ( new BeanComponentDefinition ( org.springframework.cache.config.RootBeanDefinition , java.lang.String ) ) ; org.springframework.cache.config.CompositeComponentDefinition . addNestedComponent ( new BeanComponentDefinition ( org.springframework.cache.config.RootBeanDefinition , CacheManagementConfigUtils . JCACHE_ADVISOR_BEAN_NAME ) ) ; org.springframework.cache.config.ParserContext . registerComponent ( org.springframework.cache.config.CompositeComponentDefinition ) ; } }  <METHOD_END>
<METHOD_START> private static void void ( org.w3c.dom.Element org.w3c.dom.Element , ParserContext org.springframework.cache.config.ParserContext ) { if ( ! org.springframework.cache.config.ParserContext . getRegistry ( ) . containsBeanDefinition ( CacheManagementConfigUtils . JCACHE_ASPECT_BEAN_NAME ) ) { java.lang.Object java.lang.Object = org.springframework.cache.config.ParserContext . extractSource ( org.w3c.dom.Element ) ; RootBeanDefinition org.springframework.cache.config.RootBeanDefinition = new RootBeanDefinition ( ) ; org.springframework.cache.config.RootBeanDefinition . setBeanClassName ( java.lang.String ) ; org.springframework.cache.config.RootBeanDefinition . setFactoryMethodName ( STRING ) ; BeanDefinition org.springframework.cache.config.BeanDefinition = org.springframework.cache.config.RootBeanDefinition ( org.w3c.dom.Element , java.lang.Object ) ; java.lang.String java.lang.String = org.springframework.cache.config.ParserContext . getReaderContext ( ) . registerWithGeneratedName ( org.springframework.cache.config.BeanDefinition ) ; org.springframework.cache.config.RootBeanDefinition . getPropertyValues ( ) . add ( STRING , new RuntimeBeanReference ( java.lang.String ) ) ; org.springframework.cache.config.ParserContext . registerBeanComponent ( new BeanComponentDefinition ( org.springframework.cache.config.BeanDefinition , java.lang.String ) ) ; org.springframework.cache.config.ParserContext . registerBeanComponent ( new BeanComponentDefinition ( org.springframework.cache.config.RootBeanDefinition , CacheManagementConfigUtils . JCACHE_ASPECT_BEAN_NAME ) ) ; } }  <METHOD_END>
<METHOD_START> private static org.springframework.cache.config.RootBeanDefinition org.springframework.cache.config.RootBeanDefinition ( org.w3c.dom.Element org.w3c.dom.Element , java.lang.Object java.lang.Object ) { RootBeanDefinition org.springframework.cache.config.RootBeanDefinition = new RootBeanDefinition ( STRING ) ; org.springframework.cache.config.RootBeanDefinition . setSource ( java.lang.Object ) ; org.springframework.cache.config.RootBeanDefinition . setRole ( BeanDefinition . ROLE_INFRASTRUCTURE ) ; void ( org.w3c.dom.Element , org.springframework.cache.config.RootBeanDefinition , true ) ; CacheNamespaceHandler . parseKeyGenerator ( org.w3c.dom.Element , org.springframework.cache.config.RootBeanDefinition ) ; return org.springframework.cache.config.RootBeanDefinition ; }  <METHOD_END>
