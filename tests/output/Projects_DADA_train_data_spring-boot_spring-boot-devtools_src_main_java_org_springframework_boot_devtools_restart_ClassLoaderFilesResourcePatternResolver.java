<METHOD_START> void ( ApplicationContext org.springframework.boot.devtools.restart.ApplicationContext , ClassLoaderFiles org.springframework.boot.devtools.restart.ClassLoaderFiles ) { this . org.springframework.boot.devtools.restart.ClassLoaderFiles = org.springframework.boot.devtools.restart.ClassLoaderFiles ; this . org.springframework.boot.devtools.restart.ResourcePatternResolver = org.springframework.boot.devtools.restart.ClassLoaderFilesResourcePatternResolver.ResourcePatternResolverFactory ( ) . org.springframework.boot.devtools.restart.ResourcePatternResolver ( org.springframework.boot.devtools.restart.ApplicationContext , org.springframework.boot.devtools.restart.ResourceLoader ( org.springframework.boot.devtools.restart.ApplicationContext ) ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.boot.devtools.restart.ResourceLoader org.springframework.boot.devtools.restart.ResourceLoader ( ApplicationContext org.springframework.boot.devtools.restart.ApplicationContext ) { java.lang.reflect.Field java.lang.reflect.Field = ReflectionUtils . findField ( org.springframework.boot.devtools.restart.ApplicationContext . getClass ( ) , STRING , ResourceLoader .class ) ; if ( java.lang.reflect.Field == null ) { return null ; } ReflectionUtils . makeAccessible ( java.lang.reflect.Field ) ; return ( ResourceLoader ) ReflectionUtils . getField ( java.lang.reflect.Field , org.springframework.boot.devtools.restart.ApplicationContext ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.boot.devtools.restart.ClassLoaderFilesResourcePatternResolver.ResourcePatternResolverFactory org.springframework.boot.devtools.restart.ClassLoaderFilesResourcePatternResolver.ResourcePatternResolverFactory ( ) { if ( ClassUtils . isPresent ( java.lang.String , null ) ) { return new org.springframework.boot.devtools.restart.ClassLoaderFilesResourcePatternResolver.WebResourcePatternResolverFactory ( ) ; } return new org.springframework.boot.devtools.restart.ClassLoaderFilesResourcePatternResolver.ResourcePatternResolverFactory ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.ClassLoader java.lang.ClassLoader ( ) { return this . org.springframework.boot.devtools.restart.ResourcePatternResolver . getClassLoader ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.boot.devtools.restart.Resource org.springframework.boot.devtools.restart.Resource ( java.lang.String java.lang.String ) { Resource org.springframework.boot.devtools.restart.Resource = this . org.springframework.boot.devtools.restart.ResourcePatternResolver . getResource ( java.lang.String ) ; if ( boolean ( org.springframework.boot.devtools.restart.Resource ) ) { return new org.springframework.boot.devtools.restart.ClassLoaderFilesResourcePatternResolver.DeletedClassLoaderFileResource ( java.lang.String ) ; } return org.springframework.boot.devtools.restart.Resource ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.boot.devtools.restart.Resource [] org.springframework.boot.devtools.restart.Resource[] ( java.lang.String java.lang.String ) throws java.io.IOException { java.util.List<org.springframework.boot.devtools.restart.Resource> < Resource > java.util.List<org.springframework.boot.devtools.restart.Resource> = new java.util.ArrayList<org.springframework.boot.devtools.restart.Resource> <> ( ) ; Resource [] org.springframework.boot.devtools.restart.Resource[] = this . org.springframework.boot.devtools.restart.ResourcePatternResolver . getResources ( java.lang.String ) ; for ( Resource org.springframework.boot.devtools.restart.Resource : org.springframework.boot.devtools.restart.Resource[] ) { if ( ! boolean ( org.springframework.boot.devtools.restart.Resource ) ) { java.util.List<org.springframework.boot.devtools.restart.Resource> . add ( org.springframework.boot.devtools.restart.Resource ) ; } } java.util.List<org.springframework.boot.devtools.restart.Resource> . addAll ( java.util.List<org.springframework.boot.devtools.restart.Resource> ( java.lang.String ) ) ; return java.util.List<org.springframework.boot.devtools.restart.Resource> . toArray ( new Resource [ java.util.List<org.springframework.boot.devtools.restart.Resource> . size ( ) ] ) ; }  <METHOD_END>
<METHOD_START> private java.util.List<org.springframework.boot.devtools.restart.Resource> < Resource > java.util.List<org.springframework.boot.devtools.restart.Resource> ( java.lang.String java.lang.String )			throws java.net.MalformedURLException { java.util.List<org.springframework.boot.devtools.restart.Resource> < Resource > java.util.List<org.springframework.boot.devtools.restart.Resource> = new java.util.ArrayList<org.springframework.boot.devtools.restart.Resource> <> ( ) ; java.lang.String java.lang.String = java.lang.String ( java.lang.String ) ; for ( SourceFolder org.springframework.boot.devtools.restart.SourceFolder : this . org.springframework.boot.devtools.restart.ClassLoaderFiles . getSourceFolders ( ) ) { for ( java.util.Map.Entry<java.lang.String,org.springframework.boot.devtools.restart.ClassLoaderFile> < java.lang.String , ClassLoaderFile > java.util.Map.Entry<java.lang.String,org.springframework.boot.devtools.restart.ClassLoaderFile> : org.springframework.boot.devtools.restart.SourceFolder . getFilesEntrySet ( ) ) { java.lang.String java.lang.String = java.util.Map.Entry<java.lang.String,org.springframework.boot.devtools.restart.ClassLoaderFile> . getKey ( ) ; ClassLoaderFile org.springframework.boot.devtools.restart.ClassLoaderFile = java.util.Map.Entry<java.lang.String,org.springframework.boot.devtools.restart.ClassLoaderFile> . getValue ( ) ; if ( org.springframework.boot.devtools.restart.ClassLoaderFile . getKind ( ) == Kind . ADDED && this . org.springframework.boot.devtools.restart.PathMatcher . match ( java.lang.String , java.lang.String ) ) { java.net.URL java.net.URL = new java.net.URL ( STRING , null , - NUMBER , STRING + java.lang.String , new ClassLoaderFileURLStreamHandler ( org.springframework.boot.devtools.restart.ClassLoaderFile ) ) ; UrlResource org.springframework.boot.devtools.restart.UrlResource = new UrlResource ( java.net.URL ) ; java.util.List<org.springframework.boot.devtools.restart.Resource> . add ( org.springframework.boot.devtools.restart.UrlResource ) ; } } } return java.util.List<org.springframework.boot.devtools.restart.Resource> ; }  <METHOD_END>
<METHOD_START> private java.lang.String java.lang.String ( java.lang.String java.lang.String ) { for ( java.lang.String java.lang.String : java.lang.String[] ) { if ( java.lang.String . boolean ( java.lang.String ) ) { return java.lang.String . java.lang.String ( java.lang.String . int ( ) ) ; } } return java.lang.String ; }  <METHOD_END>
<METHOD_START> private boolean boolean ( Resource org.springframework.boot.devtools.restart.Resource ) { for ( SourceFolder org.springframework.boot.devtools.restart.SourceFolder : this . org.springframework.boot.devtools.restart.ClassLoaderFiles . getSourceFolders ( ) ) { for ( java.util.Map.Entry<java.lang.String,org.springframework.boot.devtools.restart.ClassLoaderFile> < java.lang.String , ClassLoaderFile > java.util.Map.Entry<java.lang.String,org.springframework.boot.devtools.restart.ClassLoaderFile> : org.springframework.boot.devtools.restart.SourceFolder . getFilesEntrySet ( ) ) { try { java.lang.String java.lang.String = java.util.Map.Entry<java.lang.String,org.springframework.boot.devtools.restart.ClassLoaderFile> . getKey ( ) ; ClassLoaderFile org.springframework.boot.devtools.restart.ClassLoaderFile = java.util.Map.Entry<java.lang.String,org.springframework.boot.devtools.restart.ClassLoaderFile> . getValue ( ) ; if ( org.springframework.boot.devtools.restart.ClassLoaderFile . getKind ( ) == Kind . DELETED && org.springframework.boot.devtools.restart.Resource . exists ( ) && org.springframework.boot.devtools.restart.Resource . getURI ( ) . toString ( ) . endsWith ( java.lang.String ) ) { return true ; } } catch ( java.io.IOException java.io.IOException ) { throw new java.lang.IllegalStateException ( STRING + org.springframework.boot.devtools.restart.Resource + STRING , java.io.IOException ) ; } } } return false ; }  <METHOD_END>
<METHOD_START> private void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return false ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return STRING + this . java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.io.InputStream java.io.InputStream ( ) java.io.IOException { throw new java.io.IOException ( this . java.lang.String + STRING ) ; }  <METHOD_END>
<METHOD_START> public org.springframework.boot.devtools.restart.ResourcePatternResolver org.springframework.boot.devtools.restart.ResourcePatternResolver ( ApplicationContext org.springframework.boot.devtools.restart.ApplicationContext , ResourceLoader org.springframework.boot.devtools.restart.ResourceLoader ) { return new PathMatchingResourcePatternResolver ( org.springframework.boot.devtools.restart.ResourceLoader == null ? new DefaultResourceLoader ( ) : org.springframework.boot.devtools.restart.ResourceLoader ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.boot.devtools.restart.ResourcePatternResolver org.springframework.boot.devtools.restart.ResourcePatternResolver ( ApplicationContext org.springframework.boot.devtools.restart.ApplicationContext , ResourceLoader org.springframework.boot.devtools.restart.ResourceLoader ) { if ( org.springframework.boot.devtools.restart.ApplicationContext instanceof WebApplicationContext ) { return new ServletContextResourcePatternResolver ( org.springframework.boot.devtools.restart.ResourceLoader == null ? new org.springframework.boot.devtools.restart.ClassLoaderFilesResourcePatternResolver.WebApplicationContextResourceLoader ( ( WebApplicationContext ) org.springframework.boot.devtools.restart.ApplicationContext ) : org.springframework.boot.devtools.restart.ResourceLoader ) ; } return super. org.springframework.boot.devtools.restart.ResourcePatternResolver ( org.springframework.boot.devtools.restart.ApplicationContext , org.springframework.boot.devtools.restart.ResourceLoader ) ; }  <METHOD_END>
<METHOD_START> void ( WebApplicationContext org.springframework.boot.devtools.restart.WebApplicationContext ) { this . org.springframework.boot.devtools.restart.WebApplicationContext = org.springframework.boot.devtools.restart.WebApplicationContext ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.boot.devtools.restart.Resource org.springframework.boot.devtools.restart.Resource ( java.lang.String java.lang.String ) { if ( this . org.springframework.boot.devtools.restart.WebApplicationContext . getServletContext ( ) != null ) { return new ServletContextResource ( this . org.springframework.boot.devtools.restart.WebApplicationContext . getServletContext ( ) , java.lang.String ) ; } return super. getResourceByPath ( java.lang.String ) ; }  <METHOD_END>