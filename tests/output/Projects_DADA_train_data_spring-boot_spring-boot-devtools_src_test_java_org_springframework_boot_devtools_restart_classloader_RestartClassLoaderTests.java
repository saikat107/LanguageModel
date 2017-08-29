<METHOD_START> @ Before public void void ( ) java.lang.Exception { this . java.io.File = java.io.File ( ) ; java.net.URL java.net.URL = this . java.io.File . java.net.URI ( ) . java.net.URL ( ) ; java.lang.ClassLoader java.lang.ClassLoader = java.lang.Class<? extends org.springframework.boot.devtools.restart.classloader.RestartClassLoaderTests> ( ) . java.lang.ClassLoader ( ) ; java.net.URL [] java.net.URL[] = new java.net.URL [] { java.net.URL } ; this . java.net.URLClassLoader = new java.net.URLClassLoader ( java.net.URL[] , java.lang.ClassLoader ) ; this . org.springframework.boot.devtools.restart.classloader.ClassLoaderFiles = new ClassLoaderFiles ( ) ; this . org.springframework.boot.devtools.restart.classloader.RestartClassLoader = new RestartClassLoader ( this . java.net.URLClassLoader , java.net.URL[] , this . org.springframework.boot.devtools.restart.classloader.ClassLoaderFiles ) ; }  <METHOD_END>
<METHOD_START> private java.io.File java.io.File ( ) java.io.IOException { java.io.File java.io.File = this . org.springframework.boot.devtools.restart.classloader.TemporaryFolder . newFile ( STRING ) ; java.util.jar.JarOutputStream java.util.jar.JarOutputStream = new java.util.jar.JarOutputStream ( new java.io.FileOutputStream ( java.io.File ) ) ; java.util.jar.JarOutputStream . void ( new java.util.zip.ZipEntry ( java.lang.String + STRING ) ) ; StreamUtils . copy ( java.lang.Class<? extends org.springframework.boot.devtools.restart.classloader.RestartClassLoaderTests> ( ) . java.io.InputStream ( STRING ) , java.util.jar.JarOutputStream ) ; java.util.jar.JarOutputStream . void ( ) ; java.util.jar.JarOutputStream . void ( new java.util.zip.ZipEntry ( java.lang.String + STRING ) ) ; StreamUtils . copy ( STRING , java.nio.charset.Charset , java.util.jar.JarOutputStream ) ; java.util.jar.JarOutputStream . void ( ) ; java.util.jar.JarOutputStream . void ( ) ; return java.io.File ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.devtools.restart.classloader.ExpectedException . expect ( java.lang.IllegalArgumentException .class ) ; this . org.springframework.boot.devtools.restart.classloader.ExpectedException . expectMessage ( STRING ) ; new RestartClassLoader ( null , new java.net.URL [] {} ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.devtools.restart.classloader.ExpectedException . expect ( java.lang.IllegalArgumentException .class ) ; this . org.springframework.boot.devtools.restart.classloader.ExpectedException . expectMessage ( STRING ) ; new RestartClassLoader ( this . java.net.URLClassLoader , new java.net.URL [] {} , null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.String java.lang.String = java.lang.String ( this . org.springframework.boot.devtools.restart.classloader.RestartClassLoader . getResourceAsStream ( java.lang.String + STRING ) ) ; assertThat ( java.lang.String ) . startsWith ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.String java.lang.String = java.lang.String ( this . org.springframework.boot.devtools.restart.classloader.RestartClassLoader . getResourceAsStream ( java.lang.String + STRING ) ) ; assertThat ( java.lang.String ) . startsWith ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.util.List<java.net.URL> < java.net.URL > java.util.List<java.net.URL> = java.util.List ( this . org.springframework.boot.devtools.restart.classloader.RestartClassLoader . getResources ( java.lang.String + STRING ) ) ; assertThat ( java.util.List<java.net.URL> . int ( ) ) . isEqualTo ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.Class<?> < ? > java.lang.Class<?> = this . org.springframework.boot.devtools.restart.classloader.RestartClassLoader . loadClass ( java.lang.String + STRING ) ; assertThat ( java.lang.Class<> . java.lang.ClassLoader ( ) ) . isEqualTo ( this . org.springframework.boot.devtools.restart.classloader.RestartClassLoader ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.Class<?> < ? > java.lang.Class<?> = this . org.springframework.boot.devtools.restart.classloader.RestartClassLoader . loadClass ( java.lang.String + STRING ) ; assertThat ( java.lang.Class<> . java.lang.ClassLoader ( ) ) . isEqualTo ( java.lang.Class<? extends org.springframework.boot.devtools.restart.classloader.RestartClassLoaderTests> ( ) . java.lang.ClassLoader ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.String java.lang.String = java.lang.String + STRING ; this . org.springframework.boot.devtools.restart.classloader.ClassLoaderFiles . addFile ( java.lang.String , new ClassLoaderFile ( Kind . DELETED , null ) ) ; assertThat ( this . org.springframework.boot.devtools.restart.classloader.RestartClassLoader . getResource ( java.lang.String ) ) . isEqualTo ( null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.String java.lang.String = java.lang.String + STRING ; this . org.springframework.boot.devtools.restart.classloader.ClassLoaderFiles . addFile ( java.lang.String , new ClassLoaderFile ( Kind . DELETED , null ) ) ; assertThat ( this . org.springframework.boot.devtools.restart.classloader.RestartClassLoader . getResourceAsStream ( java.lang.String ) ) . isEqualTo ( null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.String java.lang.String = java.lang.String + STRING ; byte [] byte[] = STRING . byte[] ( ) ; this . org.springframework.boot.devtools.restart.classloader.ClassLoaderFiles . addFile ( java.lang.String , new ClassLoaderFile ( Kind . MODIFIED , byte[] ) ) ; java.net.URL java.net.URL = this . org.springframework.boot.devtools.restart.classloader.RestartClassLoader . getResource ( java.lang.String ) ; assertThat ( FileCopyUtils . copyToByteArray ( java.net.URL . java.io.InputStream ( ) ) ) . isEqualTo ( byte[] ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.String java.lang.String = java.lang.String + STRING ; this . org.springframework.boot.devtools.restart.classloader.ClassLoaderFiles . addFile ( java.lang.String , new ClassLoaderFile ( Kind . DELETED , null ) ) ; java.util.List<java.net.URL> < java.net.URL > java.util.List<java.net.URL> = java.util.List ( this . org.springframework.boot.devtools.restart.classloader.RestartClassLoader . getResources ( java.lang.String ) ) ; assertThat ( java.util.List<java.net.URL> . int ( ) ) . isEqualTo ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.String java.lang.String = java.lang.String + STRING ; byte [] byte[] = STRING . byte[] ( ) ; this . org.springframework.boot.devtools.restart.classloader.ClassLoaderFiles . addFile ( java.lang.String , new ClassLoaderFile ( Kind . MODIFIED , byte[] ) ) ; java.util.List<java.net.URL> < java.net.URL > java.util.List<java.net.URL> = java.util.List ( this . org.springframework.boot.devtools.restart.classloader.RestartClassLoader . getResources ( java.lang.String ) ) ; assertThat ( FileCopyUtils . copyToByteArray ( java.util.List<java.net.URL> . java.net.URL ( NUMBER ) . java.io.InputStream ( ) ) ) . isEqualTo ( byte[] ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.String java.lang.String = java.lang.String + STRING ; this . org.springframework.boot.devtools.restart.classloader.ClassLoaderFiles . addFile ( java.lang.String , new ClassLoaderFile ( Kind . DELETED , null ) ) ; this . org.springframework.boot.devtools.restart.classloader.ExpectedException . expect ( java.lang.ClassNotFoundException .class ) ; this . org.springframework.boot.devtools.restart.classloader.RestartClassLoader . loadClass ( java.lang.String + STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.String java.lang.String = java.lang.String + STRING ; this . org.springframework.boot.devtools.restart.classloader.ClassLoaderFiles . addFile ( java.lang.String , new ClassLoaderFile ( Kind . MODIFIED , new byte [ NUMBER ] ) ) ; this . org.springframework.boot.devtools.restart.classloader.ExpectedException . expect ( java.lang.ClassFormatError .class ) ; this . org.springframework.boot.devtools.restart.classloader.RestartClassLoader . loadClass ( java.lang.String + STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.String java.lang.String = java.lang.String + STRING ; byte [] byte[] = FileCopyUtils . copyToByteArray ( java.lang.Class<? extends org.springframework.boot.devtools.restart.classloader.RestartClassLoaderTests> ( ) . java.io.InputStream ( STRING ) ) ; this . org.springframework.boot.devtools.restart.classloader.ClassLoaderFiles . addFile ( java.lang.String , new ClassLoaderFile ( Kind . ADDED , byte[] ) ) ; java.lang.Class<?> < ? > java.lang.Class<?> = this . org.springframework.boot.devtools.restart.classloader.RestartClassLoader . loadClass ( java.lang.String + STRING ) ; assertThat ( java.lang.Class<> . java.lang.ClassLoader ( ) ) . isEqualTo ( this . org.springframework.boot.devtools.restart.classloader.RestartClassLoader ) ; }  <METHOD_END>
<METHOD_START> private java.lang.String java.lang.String ( java.io.InputStream java.io.InputStream ) throws java.io.IOException { return new java.lang.String ( FileCopyUtils . copyToByteArray ( java.io.InputStream ) ) ; }  <METHOD_END>
<METHOD_START> private < T > java.util.List<T> < T > java.util.List<T> ( java.util.Enumeration<T> < T > java.util.Enumeration<T> ) { java.util.List<T> < T > java.util.List<T> = new java.util.ArrayList<T> <> ( ) ; if ( java.util.Enumeration<T> != null ) { while ( java.util.Enumeration<T> . boolean ( ) ) { java.util.List<T> . boolean ( java.util.Enumeration<T> . T ( ) ) ; } } return java.util.List<T> ; }  <METHOD_END>
