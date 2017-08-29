<METHOD_START> public static boolean boolean ( BeanFactory org.springframework.boot.autoconfigure.BeanFactory ) { return org.springframework.boot.autoconfigure.BeanFactory . containsBean ( java.lang.String ) && ! java.util.List<java.lang.String> ( org.springframework.boot.autoconfigure.BeanFactory ) . isEmpty ( ) ; }  <METHOD_END>
<METHOD_START> public static java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> ( BeanFactory org.springframework.boot.autoconfigure.BeanFactory ) { try { return org.springframework.boot.autoconfigure.BeanFactory . getBean ( java.lang.String , org.springframework.boot.autoconfigure.AutoConfigurationPackages.BasePackages .class ) . get ( ) ; } catch ( NoSuchBeanDefinitionException org.springframework.boot.autoconfigure.NoSuchBeanDefinitionException ) { throw new java.lang.IllegalStateException ( STRING ) ; } }  <METHOD_END>
<METHOD_START> public static void void ( BeanDefinitionRegistry org.springframework.boot.autoconfigure.BeanDefinitionRegistry , java.lang.String ... java.lang.String[] ) { if ( org.springframework.boot.autoconfigure.BeanDefinitionRegistry . containsBeanDefinition ( java.lang.String ) ) { BeanDefinition org.springframework.boot.autoconfigure.BeanDefinition = org.springframework.boot.autoconfigure.BeanDefinitionRegistry . getBeanDefinition ( java.lang.String ) ; ConstructorArgumentValues org.springframework.boot.autoconfigure.ConstructorArgumentValues = org.springframework.boot.autoconfigure.BeanDefinition . getConstructorArgumentValues ( ) ; org.springframework.boot.autoconfigure.ConstructorArgumentValues . addIndexedArgumentValue ( NUMBER , java.lang.String[] ( org.springframework.boot.autoconfigure.ConstructorArgumentValues , java.lang.String[] ) ) ; } else { GenericBeanDefinition org.springframework.boot.autoconfigure.GenericBeanDefinition = new GenericBeanDefinition ( ) ; org.springframework.boot.autoconfigure.GenericBeanDefinition . setBeanClass ( org.springframework.boot.autoconfigure.AutoConfigurationPackages.BasePackages .class ) ; org.springframework.boot.autoconfigure.GenericBeanDefinition . getConstructorArgumentValues ( ) . addIndexedArgumentValue ( NUMBER , java.lang.String[] ) ; org.springframework.boot.autoconfigure.GenericBeanDefinition . setRole ( BeanDefinition . ROLE_INFRASTRUCTURE ) ; org.springframework.boot.autoconfigure.BeanDefinitionRegistry . registerBeanDefinition ( java.lang.String , org.springframework.boot.autoconfigure.GenericBeanDefinition ) ; } }  <METHOD_END>
<METHOD_START> private static java.lang.String [] java.lang.String[] ( ConstructorArgumentValues org.springframework.boot.autoconfigure.ConstructorArgumentValues , java.lang.String [] java.lang.String[] ) { java.lang.String [] java.lang.String[] = ( java.lang.String [] ) org.springframework.boot.autoconfigure.ConstructorArgumentValues . getIndexedArgumentValue ( NUMBER , java.lang.String [] .class ) . getValue ( ) ; java.util.Set<java.lang.String> < java.lang.String > java.util.Set<java.lang.String> = new java.util.LinkedHashSet<java.lang.String> <> ( ) ; java.util.Set<java.lang.String> . boolean ( java.util.Arrays . java.util.List<java.lang.String> ( java.lang.String[] ) ) ; java.util.Set<java.lang.String> . boolean ( java.util.Arrays . java.util.List<java.lang.String> ( java.lang.String[] ) ) ; return java.util.Set<java.lang.String> . java.lang.String[] ( new java.lang.String [ java.util.Set<java.lang.String> . int ( ) ] ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( AnnotationMetadata org.springframework.boot.autoconfigure.AnnotationMetadata , BeanDefinitionRegistry org.springframework.boot.autoconfigure.BeanDefinitionRegistry ) { void ( org.springframework.boot.autoconfigure.BeanDefinitionRegistry , new org.springframework.boot.autoconfigure.AutoConfigurationPackages.PackageImport ( org.springframework.boot.autoconfigure.AnnotationMetadata ) . java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Set<java.lang.Object> < java.lang.Object > java.util.Set<java.lang.Object> ( AnnotationMetadata org.springframework.boot.autoconfigure.AnnotationMetadata ) { return java.util.Collections .< java.lang.Object > java.util.Set<java.lang.Object> ( new org.springframework.boot.autoconfigure.AutoConfigurationPackages.PackageImport ( org.springframework.boot.autoconfigure.AnnotationMetadata ) ) ; }  <METHOD_END>
<METHOD_START> void ( AnnotationMetadata org.springframework.boot.autoconfigure.AnnotationMetadata ) { this . java.lang.String = ClassUtils . getPackageName ( org.springframework.boot.autoconfigure.AnnotationMetadata . getClassName ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { return this . java.lang.String . int ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( java.lang.Object java.lang.Object ) { if ( java.lang.Object == null || java.lang.Class<? extends org.springframework.boot.autoconfigure.AutoConfigurationPackages.PackageImport> ( ) != java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) ) { return false ; } return this . java.lang.String . boolean ( ( ( org.springframework.boot.autoconfigure.AutoConfigurationPackages.PackageImport ) java.lang.Object ) . java.lang.String ) ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return STRING + this . java.lang.String ; }  <METHOD_END>
<METHOD_START> void ( java.lang.String ... java.lang.String[] ) { java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> = new java.util.ArrayList<java.lang.String> <> ( ) ; for ( java.lang.String java.lang.String : java.lang.String[] ) { if ( StringUtils . hasText ( java.lang.String ) ) { java.util.List<java.lang.String> . boolean ( java.lang.String ) ; } } this . java.util.List<java.lang.String> = java.util.List<java.lang.String> ; }  <METHOD_END>
<METHOD_START> public java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> ( ) { if ( ! this . boolean ) { if ( this . java.util.List<java.lang.String> . boolean ( ) ) { if ( org.springframework.boot.autoconfigure.Log . isWarnEnabled ( ) ) { org.springframework.boot.autoconfigure.Log . warn ( STRING + STRING + STRING ) ; } } else { if ( org.springframework.boot.autoconfigure.Log . isDebugEnabled ( ) ) { java.lang.String java.lang.String = StringUtils . collectionToCommaDelimitedString ( this . java.util.List<java.lang.String> ) ; org.springframework.boot.autoconfigure.Log . debug ( STRING + STRING + java.lang.String + STRING + STRING ) ; } } this . boolean = true ; } return this . java.util.List<java.lang.String> ; }  <METHOD_END>