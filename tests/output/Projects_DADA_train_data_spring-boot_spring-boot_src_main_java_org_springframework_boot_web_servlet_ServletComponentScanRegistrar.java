<METHOD_START> @ java.lang.Override public void void ( AnnotationMetadata org.springframework.boot.web.servlet.AnnotationMetadata , BeanDefinitionRegistry org.springframework.boot.web.servlet.BeanDefinitionRegistry ) { java.util.Set<java.lang.String> < java.lang.String > java.util.Set<java.lang.String> = java.util.Set<java.lang.String> ( org.springframework.boot.web.servlet.AnnotationMetadata ) ; if ( org.springframework.boot.web.servlet.BeanDefinitionRegistry . containsBeanDefinition ( java.lang.String ) ) { void ( org.springframework.boot.web.servlet.BeanDefinitionRegistry , java.util.Set<java.lang.String> ) ; } else { void ( org.springframework.boot.web.servlet.BeanDefinitionRegistry , java.util.Set<java.lang.String> ) ; } }  <METHOD_END>
<METHOD_START> private void void ( BeanDefinitionRegistry org.springframework.boot.web.servlet.BeanDefinitionRegistry , java.util.Set<java.lang.String> < java.lang.String > java.util.Set<java.lang.String> ) { BeanDefinition org.springframework.boot.web.servlet.BeanDefinition = org.springframework.boot.web.servlet.BeanDefinitionRegistry . getBeanDefinition ( java.lang.String ) ; ValueHolder org.springframework.boot.web.servlet.ValueHolder = org.springframework.boot.web.servlet.BeanDefinition . getConstructorArgumentValues ( ) . getGenericArgumentValue ( java.util.Set .class ) ; @ java.lang.SuppressWarnings ( STRING ) java.util.Set<java.lang.String> < java.lang.String > java.util.Set<java.lang.String> = ( java.util.Set<java.lang.String> < java.lang.String > ) org.springframework.boot.web.servlet.ValueHolder . getValue ( ) ; java.util.Set<java.lang.String> . boolean ( java.util.Set<java.lang.String> ) ; org.springframework.boot.web.servlet.ValueHolder . setValue ( java.util.Set<java.lang.String> ) ; }  <METHOD_END>
<METHOD_START> private void void ( BeanDefinitionRegistry org.springframework.boot.web.servlet.BeanDefinitionRegistry , java.util.Set<java.lang.String> < java.lang.String > java.util.Set<java.lang.String> ) { GenericBeanDefinition org.springframework.boot.web.servlet.GenericBeanDefinition = new GenericBeanDefinition ( ) ; org.springframework.boot.web.servlet.GenericBeanDefinition . setBeanClass ( ServletComponentRegisteringPostProcessor .class ) ; org.springframework.boot.web.servlet.GenericBeanDefinition . getConstructorArgumentValues ( ) . addGenericArgumentValue ( java.util.Set<java.lang.String> ) ; org.springframework.boot.web.servlet.GenericBeanDefinition . setRole ( BeanDefinition . ROLE_INFRASTRUCTURE ) ; org.springframework.boot.web.servlet.BeanDefinitionRegistry . registerBeanDefinition ( java.lang.String , org.springframework.boot.web.servlet.GenericBeanDefinition ) ; }  <METHOD_END>
<METHOD_START> private java.util.Set<java.lang.String> < java.lang.String > java.util.Set<java.lang.String> ( AnnotationMetadata org.springframework.boot.web.servlet.AnnotationMetadata ) { AnnotationAttributes org.springframework.boot.web.servlet.AnnotationAttributes = AnnotationAttributes . fromMap ( org.springframework.boot.web.servlet.AnnotationMetadata . getAnnotationAttributes ( ServletComponentScan .class . java.lang.String ( ) ) ) ; java.lang.String [] java.lang.String[] = org.springframework.boot.web.servlet.AnnotationAttributes . getStringArray ( STRING ) ; java.lang.Class<?> < ? > [] java.lang.Class<?>[] = org.springframework.boot.web.servlet.AnnotationAttributes . getClassArray ( STRING ) ; java.util.Set<java.lang.String> < java.lang.String > java.util.Set<java.lang.String> = new java.util.LinkedHashSet<java.lang.String> <> ( ) ; java.util.Set<java.lang.String> . boolean ( java.util.Arrays . java.util.List<java.lang.String> ( java.lang.String[] ) ) ; for ( java.lang.Class<?> < ? > java.lang.Class<?> : java.lang.Class<?>[] ) { java.util.Set<java.lang.String> . boolean ( ClassUtils . getPackageName ( java.lang.Class<> ) ) ; } if ( java.util.Set<java.lang.String> . boolean ( ) ) { return java.util.Collections . java.util.Set ( ClassUtils . getPackageName ( org.springframework.boot.web.servlet.AnnotationMetadata . getClassName ( ) ) ) ; } return java.util.Set<java.lang.String> ; }  <METHOD_END>