<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return STRING ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.String java.lang.String ( ) { return STRING ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return LdapRepositoryFactoryBean .class . java.lang.String ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.util.Collection<java.lang.Class<? extends java.lang.annotation.Annotation>> < java.lang.Class<? extends java.lang.annotation.Annotation> < ? extends java.lang.annotation.Annotation > > java.util.Collection<java.lang.Class<? extends java.lang.annotation.Annotation>> ( ) { return java.util.Collections . java.util.Set<java.lang.Class<org.springframework.data.ldap.repository.config.Entry>> ( Entry .class ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.util.Collection<java.lang.Class<?>> < java.lang.Class<?> < ? > > java.util.Collection<java.lang.Class<?>> ( ) { return java.util.Collections . java.util.Set<java.lang.Class<?>> ( LdapRepository .class ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( BeanDefinitionBuilder org.springframework.data.ldap.repository.config.BeanDefinitionBuilder , XmlRepositoryConfigurationSource org.springframework.data.ldap.repository.config.XmlRepositoryConfigurationSource ) { org.w3c.dom.Element org.w3c.dom.Element = org.springframework.data.ldap.repository.config.XmlRepositoryConfigurationSource . getElement ( ) ; java.lang.String java.lang.String = org.w3c.dom.Element . java.lang.String ( java.lang.String ) ; if ( ! StringUtils . hasText ( java.lang.String ) ) { java.lang.String = STRING ; } org.springframework.data.ldap.repository.config.BeanDefinitionBuilder . addPropertyReference ( STRING , java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( BeanDefinitionBuilder org.springframework.data.ldap.repository.config.BeanDefinitionBuilder , AnnotationRepositoryConfigurationSource org.springframework.data.ldap.repository.config.AnnotationRepositoryConfigurationSource ) { AnnotationAttributes org.springframework.data.ldap.repository.config.AnnotationAttributes = org.springframework.data.ldap.repository.config.AnnotationRepositoryConfigurationSource . getAttributes ( ) ; org.springframework.data.ldap.repository.config.BeanDefinitionBuilder . addPropertyReference ( STRING , org.springframework.data.ldap.repository.config.AnnotationAttributes . getString ( STRING ) ) ; }  <METHOD_END>
