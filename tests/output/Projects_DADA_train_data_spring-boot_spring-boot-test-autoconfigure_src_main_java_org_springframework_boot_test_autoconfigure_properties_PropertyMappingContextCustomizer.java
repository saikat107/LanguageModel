<METHOD_START> void ( AnnotationsPropertySource org.springframework.boot.test.autoconfigure.properties.AnnotationsPropertySource ) { this . org.springframework.boot.test.autoconfigure.properties.AnnotationsPropertySource = org.springframework.boot.test.autoconfigure.properties.AnnotationsPropertySource ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ConfigurableApplicationContext org.springframework.boot.test.autoconfigure.properties.ConfigurableApplicationContext , MergedContextConfiguration org.springframework.boot.test.autoconfigure.properties.MergedContextConfiguration ) { if ( ! this . org.springframework.boot.test.autoconfigure.properties.AnnotationsPropertySource . isEmpty ( ) ) { org.springframework.boot.test.autoconfigure.properties.ConfigurableApplicationContext . getEnvironment ( ) . getPropertySources ( ) . addFirst ( this . org.springframework.boot.test.autoconfigure.properties.AnnotationsPropertySource ) ; } org.springframework.boot.test.autoconfigure.properties.ConfigurableApplicationContext . getBeanFactory ( ) . registerSingleton ( org.springframework.boot.test.autoconfigure.properties.PropertyMappingContextCustomizer.PropertyMappingCheckBeanPostProcessor .class . java.lang.String ( ) , new org.springframework.boot.test.autoconfigure.properties.PropertyMappingContextCustomizer.PropertyMappingCheckBeanPostProcessor ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { return this . org.springframework.boot.test.autoconfigure.properties.AnnotationsPropertySource . hashCode ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( java.lang.Object java.lang.Object ) { return ( java.lang.Object != null && java.lang.Class<? extends org.springframework.boot.test.autoconfigure.properties.PropertyMappingContextCustomizer> ( ) . boolean ( java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) ) && this . org.springframework.boot.test.autoconfigure.properties.AnnotationsPropertySource . equals ( ( ( org.springframework.boot.test.autoconfigure.properties.PropertyMappingContextCustomizer ) java.lang.Object ) . org.springframework.boot.test.autoconfigure.properties.AnnotationsPropertySource ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( java.lang.Object java.lang.Object , java.lang.String java.lang.String )				throws org.springframework.boot.test.autoconfigure.properties.BeansException { java.lang.Class<?> < ? > java.lang.Class<?> = java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) ; java.util.Set<java.lang.Class<?>> < java.lang.Class<?> < ? > > java.util.Set<java.lang.Class<?>> = new java.util.LinkedHashSet<java.lang.Class<?>> <> ( ) ; java.util.Set<java.lang.Class<?>> < java.lang.Class<?> < ? > > java.util.Set<java.lang.Class<?>> = new java.util.LinkedHashSet<java.lang.Class<?>> <> ( ) ; while ( java.lang.Class<> != null ) { for ( java.lang.annotation.Annotation java.lang.annotation.Annotation : AnnotationUtils . getAnnotations ( java.lang.Class<> ) ) { if ( boolean ( java.lang.annotation.Annotation , Component .class ) ) { java.util.Set<java.lang.Class<?>> . boolean ( java.lang.annotation.Annotation . java.lang.Class<? extends java.lang.annotation.Annotation> ( ) ) ; } if ( boolean ( java.lang.annotation.Annotation , PropertyMapping .class ) ) { java.util.Set<java.lang.Class<?>> . boolean ( java.lang.annotation.Annotation . java.lang.Class<? extends java.lang.annotation.Annotation> ( ) ) ; } } java.lang.Class<?> = java.lang.Class<> . java.lang.Class<? super > ( ) ; } if ( ! java.util.Set<java.lang.Class<?>> . boolean ( ) && ! java.util.Set<java.lang.Class<?>> . boolean ( ) ) { throw new java.lang.IllegalStateException ( STRING + java.lang.String ( java.util.Set<java.lang.Class<?>> ) + STRING + java.lang.String ( java.util.Set<java.lang.Class<?>> ) ) ; } return java.lang.Object ; }  <METHOD_END>
<METHOD_START> private boolean boolean ( java.lang.annotation.Annotation java.lang.annotation.Annotation , java.lang.Class<? extends java.lang.annotation.Annotation> < ? extends java.lang.annotation.Annotation > java.lang.Class<? extends java.lang.annotation.Annotation> ) { try { return java.lang.annotation.Annotation . java.lang.Class<? extends java.lang.annotation.Annotation> ( ) . boolean ( java.lang.Class<> ) || AnnotationUtils . findAnnotation ( java.lang.annotation.Annotation . java.lang.Class<? extends java.lang.annotation.Annotation> ( ) , java.lang.Class<> ) != null ; } catch ( java.lang.Throwable java.lang.Throwable ) { return false ; } }  <METHOD_END>
<METHOD_START> private java.lang.String java.lang.String ( java.util.Set<java.lang.Class<?>> < java.lang.Class<?> < ? > > java.util.Set<java.lang.Class<?>> ) { java.lang.StringBuilder java.lang.StringBuilder = new java.lang.StringBuilder ( ) ; for ( java.lang.Class<?> < ? > java.lang.Class<?> : java.util.Set<java.lang.Class<?>> ) { java.lang.StringBuilder . java.lang.StringBuilder ( java.lang.StringBuilder . int ( ) == NUMBER ? STRING : STRING ) ; java.lang.StringBuilder . java.lang.StringBuilder ( STRING + ClassUtils . getShortName ( java.lang.Class<> ) ) ; } java.lang.StringBuilder . java.lang.StringBuilder ( NUMBER , java.util.Set<java.lang.Class<?>> . int ( ) == NUMBER ? STRING : STRING ) ; return java.lang.StringBuilder . java.lang.String ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( java.lang.Object java.lang.Object , java.lang.String java.lang.String )				throws org.springframework.boot.test.autoconfigure.properties.BeansException { return java.lang.Object ; }  <METHOD_END>
