<METHOD_START> public void ( ) { this . org.springframework.core.type.classreading.ResourceLoader = new DefaultResourceLoader ( ) ; }  <METHOD_END>
<METHOD_START> public void ( ResourceLoader org.springframework.core.type.classreading.ResourceLoader ) { this . org.springframework.core.type.classreading.ResourceLoader = ( org.springframework.core.type.classreading.ResourceLoader != null ? org.springframework.core.type.classreading.ResourceLoader : new DefaultResourceLoader ( ) ) ; }  <METHOD_END>
<METHOD_START> public void ( java.lang.ClassLoader java.lang.ClassLoader ) { this . org.springframework.core.type.classreading.ResourceLoader = ( java.lang.ClassLoader != null ? new DefaultResourceLoader ( java.lang.ClassLoader ) : new DefaultResourceLoader ( ) ) ; }  <METHOD_END>
<METHOD_START> public final org.springframework.core.type.classreading.ResourceLoader org.springframework.core.type.classreading.ResourceLoader ( ) { return this . org.springframework.core.type.classreading.ResourceLoader ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.core.type.classreading.MetadataReader org.springframework.core.type.classreading.MetadataReader ( java.lang.String java.lang.String ) throws java.io.IOException { java.lang.String java.lang.String = ResourceLoader . CLASSPATH_URL_PREFIX + ClassUtils . convertClassNameToResourcePath ( java.lang.String ) + ClassUtils . CLASS_FILE_SUFFIX ; Resource org.springframework.core.type.classreading.Resource = this . org.springframework.core.type.classreading.ResourceLoader . getResource ( java.lang.String ) ; if ( ! org.springframework.core.type.classreading.Resource . exists ( ) ) { int int = java.lang.String . int ( '.' ) ; if ( int != - NUMBER ) { java.lang.String java.lang.String = java.lang.String . java.lang.String ( NUMBER , int ) + '$' + java.lang.String . java.lang.String ( int + NUMBER ) ; java.lang.String java.lang.String = ResourceLoader . CLASSPATH_URL_PREFIX + ClassUtils . convertClassNameToResourcePath ( java.lang.String ) + ClassUtils . CLASS_FILE_SUFFIX ; Resource org.springframework.core.type.classreading.Resource = this . org.springframework.core.type.classreading.ResourceLoader . getResource ( java.lang.String ) ; if ( org.springframework.core.type.classreading.Resource . exists ( ) ) { org.springframework.core.type.classreading.Resource = org.springframework.core.type.classreading.Resource ; } } } return org.springframework.core.type.classreading.MetadataReader ( org.springframework.core.type.classreading.Resource ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.core.type.classreading.MetadataReader org.springframework.core.type.classreading.MetadataReader ( Resource org.springframework.core.type.classreading.Resource ) throws java.io.IOException { return new SimpleMetadataReader ( org.springframework.core.type.classreading.Resource , this . org.springframework.core.type.classreading.ResourceLoader . getClassLoader ( ) ) ; }  <METHOD_END>