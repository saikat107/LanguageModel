<METHOD_START> @ Test public void void ( ) java.io.IOException , java.lang.ClassNotFoundException { java.util.Set<java.lang.String> < java.lang.String > java.util.Set<java.lang.String> = new java.util.HashSet<java.lang.String> <> ( ) ; for ( AnnotationMetadata org.springframework.boot.test.testutil.AnnotationMetadata : java.util.Set<org.springframework.boot.test.testutil.AnnotationMetadata> ( ) ) { java.util.Set<org.springframework.boot.test.testutil.MethodMetadata> < MethodMetadata > java.util.Set<org.springframework.boot.test.testutil.MethodMetadata> = org.springframework.boot.test.testutil.AnnotationMetadata . getAnnotatedMethods ( Bean .class . java.lang.String ( ) ) ; for ( MethodMetadata org.springframework.boot.test.testutil.MethodMetadata : java.util.Set<org.springframework.boot.test.testutil.MethodMetadata> ) { if ( ! boolean ( org.springframework.boot.test.testutil.MethodMetadata ) ) { java.util.Set<java.lang.String> . boolean ( org.springframework.boot.test.testutil.MethodMetadata . getDeclaringClassName ( ) + STRING + org.springframework.boot.test.testutil.MethodMetadata . getMethodName ( ) ) ; } } } assertThat ( java.util.Set<java.lang.String> ) . as ( STRING ) . isEmpty ( ) ; }  <METHOD_END>
<METHOD_START> private java.util.Set<org.springframework.boot.test.testutil.AnnotationMetadata> < AnnotationMetadata > java.util.Set<org.springframework.boot.test.testutil.AnnotationMetadata> ( ) java.io.IOException { java.util.Set<org.springframework.boot.test.testutil.AnnotationMetadata> < AnnotationMetadata > java.util.Set<org.springframework.boot.test.testutil.AnnotationMetadata> = new java.util.HashSet<org.springframework.boot.test.testutil.AnnotationMetadata> <> ( ) ; Resource [] org.springframework.boot.test.testutil.Resource[] = this . org.springframework.boot.test.testutil.ResourcePatternResolver . getResources ( STRING + java.lang.Class<? extends org.springframework.boot.test.testutil.AbstractConfigurationClassTests> ( ) . java.lang.Package ( ) . java.lang.String ( ) . java.lang.String ( '.' , '/' ) + STRING STRING ) ; for ( Resource org.springframework.boot.test.testutil.Resource : org.springframework.boot.test.testutil.Resource[] ) { if ( ! boolean ( org.springframework.boot.test.testutil.Resource ) ) { MetadataReader org.springframework.boot.test.testutil.MetadataReader = new SimpleMetadataReaderFactory ( ) . getMetadataReader ( org.springframework.boot.test.testutil.Resource ) ; AnnotationMetadata org.springframework.boot.test.testutil.AnnotationMetadata = org.springframework.boot.test.testutil.MetadataReader . getAnnotationMetadata ( ) ; if ( org.springframework.boot.test.testutil.AnnotationMetadata . getAnnotationTypes ( ) . contains ( Configuration .class . java.lang.String ( ) ) ) { java.util.Set<org.springframework.boot.test.testutil.AnnotationMetadata> . add ( org.springframework.boot.test.testutil.AnnotationMetadata ) ; } } } return java.util.Set<org.springframework.boot.test.testutil.AnnotationMetadata> ; }  <METHOD_END>
<METHOD_START> private boolean boolean ( Resource org.springframework.boot.test.testutil.Resource ) throws java.io.IOException { return org.springframework.boot.test.testutil.Resource . getFile ( ) . getAbsolutePath ( ) . contains ( STRING + java.io.File . java.lang.String + STRING ) ; }  <METHOD_END>
<METHOD_START> private boolean boolean ( MethodMetadata org.springframework.boot.test.testutil.MethodMetadata ) { int int = ( java.lang.Integer ) new DirectFieldAccessor ( org.springframework.boot.test.testutil.MethodMetadata ) . getPropertyValue ( STRING ) ; return ( int & Opcodes . ACC_PUBLIC ) != NUMBER ; }  <METHOD_END>