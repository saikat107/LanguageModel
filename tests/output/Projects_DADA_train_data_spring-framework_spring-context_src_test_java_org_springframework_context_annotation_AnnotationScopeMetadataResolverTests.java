<METHOD_START> @ Test public void void ( ) { AnnotatedBeanDefinition org.springframework.context.annotation.AnnotatedBeanDefinition = new AnnotatedGenericBeanDefinition ( org.springframework.context.annotation.AnnotationScopeMetadataResolverTests.AnnotatedWithSingletonScope .class ) ; ScopeMetadata org.springframework.context.annotation.ScopeMetadata = this . org.springframework.context.annotation.AnnotationScopeMetadataResolver . resolveScopeMetadata ( org.springframework.context.annotation.AnnotatedBeanDefinition ) ; assertNotNull ( STRING , org.springframework.context.annotation.ScopeMetadata ) ; assertEquals ( BeanDefinition . SCOPE_SINGLETON , org.springframework.context.annotation.ScopeMetadata . getScopeName ( ) ) ; assertEquals ( NO , org.springframework.context.annotation.ScopeMetadata . getScopedProxyMode ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { this . org.springframework.context.annotation.AnnotationScopeMetadataResolver = new AnnotationScopeMetadataResolver ( INTERFACES ) ; AnnotatedBeanDefinition org.springframework.context.annotation.AnnotatedBeanDefinition = new AnnotatedGenericBeanDefinition ( org.springframework.context.annotation.AnnotationScopeMetadataResolverTests.AnnotatedWithPrototypeScope .class ) ; ScopeMetadata org.springframework.context.annotation.ScopeMetadata = this . org.springframework.context.annotation.AnnotationScopeMetadataResolver . resolveScopeMetadata ( org.springframework.context.annotation.AnnotatedBeanDefinition ) ; assertNotNull ( STRING , org.springframework.context.annotation.ScopeMetadata ) ; assertEquals ( BeanDefinition . SCOPE_PROTOTYPE , org.springframework.context.annotation.ScopeMetadata . getScopeName ( ) ) ; assertEquals ( INTERFACES , org.springframework.context.annotation.ScopeMetadata . getScopedProxyMode ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { AnnotatedBeanDefinition org.springframework.context.annotation.AnnotatedBeanDefinition = new AnnotatedGenericBeanDefinition ( org.springframework.context.annotation.AnnotationScopeMetadataResolverTests.AnnotatedWithScopedProxy .class ) ; ScopeMetadata org.springframework.context.annotation.ScopeMetadata = this . org.springframework.context.annotation.AnnotationScopeMetadataResolver . resolveScopeMetadata ( org.springframework.context.annotation.AnnotatedBeanDefinition ) ; assertNotNull ( STRING , org.springframework.context.annotation.ScopeMetadata ) ; assertEquals ( STRING , org.springframework.context.annotation.ScopeMetadata . getScopeName ( ) ) ; assertEquals ( TARGET_CLASS , org.springframework.context.annotation.ScopeMetadata . getScopedProxyMode ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { AnnotatedBeanDefinition org.springframework.context.annotation.AnnotatedBeanDefinition = new AnnotatedGenericBeanDefinition ( org.springframework.context.annotation.AnnotationScopeMetadataResolverTests.AnnotatedWithCustomRequestScope .class ) ; ScopeMetadata org.springframework.context.annotation.ScopeMetadata = this . org.springframework.context.annotation.AnnotationScopeMetadataResolver . resolveScopeMetadata ( org.springframework.context.annotation.AnnotatedBeanDefinition ) ; assertNotNull ( STRING , org.springframework.context.annotation.ScopeMetadata ) ; assertEquals ( STRING , org.springframework.context.annotation.ScopeMetadata . getScopeName ( ) ) ; assertEquals ( NO , org.springframework.context.annotation.ScopeMetadata . getScopedProxyMode ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.io.IOException { MetadataReaderFactory org.springframework.context.annotation.MetadataReaderFactory = new SimpleMetadataReaderFactory ( ) ; MetadataReader org.springframework.context.annotation.MetadataReader = org.springframework.context.annotation.MetadataReaderFactory . getMetadataReader ( org.springframework.context.annotation.AnnotationScopeMetadataResolverTests.AnnotatedWithCustomRequestScope .class . java.lang.String ( ) ) ; AnnotatedBeanDefinition org.springframework.context.annotation.AnnotatedBeanDefinition = new AnnotatedGenericBeanDefinition ( org.springframework.context.annotation.MetadataReader . getAnnotationMetadata ( ) ) ; ScopeMetadata org.springframework.context.annotation.ScopeMetadata = this . org.springframework.context.annotation.AnnotationScopeMetadataResolver . resolveScopeMetadata ( org.springframework.context.annotation.AnnotatedBeanDefinition ) ; assertNotNull ( STRING , org.springframework.context.annotation.ScopeMetadata ) ; assertEquals ( STRING , org.springframework.context.annotation.ScopeMetadata . getScopeName ( ) ) ; assertEquals ( NO , org.springframework.context.annotation.ScopeMetadata . getScopedProxyMode ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { AnnotatedBeanDefinition org.springframework.context.annotation.AnnotatedBeanDefinition = new AnnotatedGenericBeanDefinition ( org.springframework.context.annotation.AnnotationScopeMetadataResolverTests.AnnotatedWithCustomRequestScopeWithAttributeOverride .class ) ; ScopeMetadata org.springframework.context.annotation.ScopeMetadata = this . org.springframework.context.annotation.AnnotationScopeMetadataResolver . resolveScopeMetadata ( org.springframework.context.annotation.AnnotatedBeanDefinition ) ; assertNotNull ( STRING , org.springframework.context.annotation.ScopeMetadata ) ; assertEquals ( STRING , org.springframework.context.annotation.ScopeMetadata . getScopeName ( ) ) ; assertEquals ( TARGET_CLASS , org.springframework.context.annotation.ScopeMetadata . getScopedProxyMode ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.io.IOException { MetadataReaderFactory org.springframework.context.annotation.MetadataReaderFactory = new SimpleMetadataReaderFactory ( ) ; MetadataReader org.springframework.context.annotation.MetadataReader = org.springframework.context.annotation.MetadataReaderFactory . getMetadataReader ( org.springframework.context.annotation.AnnotationScopeMetadataResolverTests.AnnotatedWithCustomRequestScopeWithAttributeOverride .class . java.lang.String ( ) ) ; AnnotatedBeanDefinition org.springframework.context.annotation.AnnotatedBeanDefinition = new AnnotatedGenericBeanDefinition ( org.springframework.context.annotation.MetadataReader . getAnnotationMetadata ( ) ) ; ScopeMetadata org.springframework.context.annotation.ScopeMetadata = this . org.springframework.context.annotation.AnnotationScopeMetadataResolver . resolveScopeMetadata ( org.springframework.context.annotation.AnnotatedBeanDefinition ) ; assertNotNull ( STRING , org.springframework.context.annotation.ScopeMetadata ) ; assertEquals ( STRING , org.springframework.context.annotation.ScopeMetadata . getScopeName ( ) ) ; assertEquals ( TARGET_CLASS , org.springframework.context.annotation.ScopeMetadata . getScopedProxyMode ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { new AnnotationScopeMetadataResolver ( null ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { org.springframework.context.annotation.AnnotationScopeMetadataResolver . setScopeAnnotationType ( null ) ; }  <METHOD_END>
