<METHOD_START> @ java.lang.SafeVarargs public void ( java.lang.Class<? extends java.lang.annotation.Annotation> < ? extends java.lang.annotation.Annotation > ... java.lang.Class<? extends java.lang.annotation.Annotation>[] ) { this( true , java.lang.Class<? extends java.lang.annotation.Annotation>[] ); }  <METHOD_END>
<METHOD_START> @ java.lang.SafeVarargs public void ( boolean boolean , java.lang.Class<? extends java.lang.annotation.Annotation> < ? extends java.lang.annotation.Annotation > ... java.lang.Class<? extends java.lang.annotation.Annotation>[] ) { this . java.lang.Iterable<java.lang.Class<? extends java.lang.annotation.Annotation>> = java.util.Arrays . java.util.List<java.lang.Class<? extends java.lang.annotation.Annotation>> ( java.lang.Class<? extends java.lang.annotation.Annotation>[] ) ; this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ResourceLoader org.springframework.data.util.ResourceLoader ) { this . org.springframework.data.util.ResourceLoader = org.springframework.data.util.ResourceLoader ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( Environment org.springframework.data.util.Environment ) { this . org.springframework.data.util.Environment = org.springframework.data.util.Environment ; }  <METHOD_END>
<METHOD_START> public java.util.Set<java.lang.Class<?>> < java.lang.Class<?> < ? > > java.util.Set<java.lang.Class<?>> ( java.lang.String ... java.lang.String[] ) { return java.util.Set<java.lang.Class<?>> ( java.util.Arrays . java.util.List<java.lang.String> ( java.lang.String[] ) ) ; }  <METHOD_END>
<METHOD_START> public java.util.Set<java.lang.Class<?>> < java.lang.Class<?> < ? > > java.util.Set<java.lang.Class<?>> ( java.lang.Iterable<java.lang.String> < java.lang.String > java.lang.Iterable<java.lang.String> ) { ClassPathScanningCandidateComponentProvider org.springframework.data.util.ClassPathScanningCandidateComponentProvider = new org.springframework.data.util.AnnotatedTypeScanner.InterfaceAwareScanner ( boolean ) ; if ( org.springframework.data.util.ResourceLoader != null ) { org.springframework.data.util.ClassPathScanningCandidateComponentProvider . setResourceLoader ( org.springframework.data.util.ResourceLoader ) ; } if ( org.springframework.data.util.Environment != null ) { org.springframework.data.util.ClassPathScanningCandidateComponentProvider . setEnvironment ( org.springframework.data.util.Environment ) ; } for ( java.lang.Class<? extends java.lang.annotation.Annotation> < ? extends java.lang.annotation.Annotation > java.lang.Class<? extends java.lang.annotation.Annotation> : java.lang.Iterable<java.lang.Class<? extends java.lang.annotation.Annotation>> ) { org.springframework.data.util.ClassPathScanningCandidateComponentProvider . addIncludeFilter ( new AnnotationTypeFilter ( java.lang.Class<> , true , boolean ) ) ; } java.util.Set<java.lang.Class<?>> < java.lang.Class<?> < ? > > java.util.Set<java.lang.Class<?>> = new java.util.HashSet<java.lang.Class<?>> <> ( ) ; for ( java.lang.String java.lang.String : java.lang.Iterable<java.lang.String> ) { for ( BeanDefinition org.springframework.data.util.BeanDefinition : org.springframework.data.util.ClassPathScanningCandidateComponentProvider . findCandidateComponents ( java.lang.String ) ) { try { java.util.Set<java.lang.Class<?>> . boolean ( ClassUtils . forName ( org.springframework.data.util.BeanDefinition . getBeanClassName ( ) , org.springframework.data.util.ResourceLoader == null ? null : org.springframework.data.util.ResourceLoader . getClassLoader ( ) ) ) ; } catch ( java.lang.ClassNotFoundException java.lang.ClassNotFoundException ) { throw new java.lang.IllegalStateException ( java.lang.ClassNotFoundException ) ; } } } return java.util.Set<java.lang.Class<?>> ; }  <METHOD_END>
<METHOD_START> public void ( boolean boolean ) { super( false ); this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected boolean boolean ( AnnotatedBeanDefinition org.springframework.data.util.AnnotatedBeanDefinition ) { return super. isCandidateComponent ( org.springframework.data.util.AnnotatedBeanDefinition ) || boolean && org.springframework.data.util.AnnotatedBeanDefinition . getMetadata ( ) . isInterface ( ) ; }  <METHOD_END>
