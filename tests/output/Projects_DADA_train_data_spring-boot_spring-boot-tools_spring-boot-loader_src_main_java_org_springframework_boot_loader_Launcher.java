<METHOD_START> protected void void ( java.lang.String [] java.lang.String[] ) throws java.lang.Exception { JarFile . registerUrlProtocolHandler ( ) ; java.lang.ClassLoader java.lang.ClassLoader = java.lang.ClassLoader ( java.util.List<org.springframework.boot.loader.Archive> ( ) ) ; void ( java.lang.String[] , java.lang.String ( ) , java.lang.ClassLoader ) ; }  <METHOD_END>
<METHOD_START> protected java.lang.ClassLoader java.lang.ClassLoader ( java.util.List<org.springframework.boot.loader.Archive> < Archive > java.util.List<org.springframework.boot.loader.Archive> ) throws java.lang.Exception { java.util.List<java.net.URL> < java.net.URL > java.util.List<java.net.URL> = new java.util.ArrayList <> ( java.util.List<org.springframework.boot.loader.Archive> . size ( ) ) ; for ( Archive org.springframework.boot.loader.Archive : java.util.List<org.springframework.boot.loader.Archive> ) { java.util.List<java.net.URL> . boolean ( org.springframework.boot.loader.Archive . getUrl ( ) ) ; } return java.lang.ClassLoader ( java.util.List<java.net.URL> . java.net.URL[] ( new java.net.URL [ java.util.List<java.net.URL> . int ( ) ] ) ) ; }  <METHOD_END>
<METHOD_START> protected java.lang.ClassLoader java.lang.ClassLoader ( java.net.URL [] java.net.URL[] ) throws java.lang.Exception { return new LaunchedURLClassLoader ( java.net.URL[] , java.lang.Class<? extends org.springframework.boot.loader.Launcher> ( ) . java.lang.ClassLoader ( ) ) ; }  <METHOD_END>
<METHOD_START> protected void void ( java.lang.String [] java.lang.String[] , java.lang.String java.lang.String , java.lang.ClassLoader java.lang.ClassLoader )			throws java.lang.Exception { java.lang.Thread . java.lang.Thread ( ) . void ( java.lang.ClassLoader ) ; org.springframework.boot.loader.MainMethodRunner ( java.lang.String , java.lang.String[] , java.lang.ClassLoader ) . run ( ) ; }  <METHOD_END>
<METHOD_START> protected org.springframework.boot.loader.MainMethodRunner org.springframework.boot.loader.MainMethodRunner ( java.lang.String java.lang.String , java.lang.String [] java.lang.String[] , java.lang.ClassLoader java.lang.ClassLoader ) { return new MainMethodRunner ( java.lang.String , java.lang.String[] ) ; }  <METHOD_END>
<METHOD_START> protected abstract java.lang.String java.lang.String ( ) java.lang.Exception ;  <METHOD_END>
<METHOD_START> protected abstract java.util.List<org.springframework.boot.loader.Archive> < Archive > java.util.List<org.springframework.boot.loader.Archive> ( ) java.lang.Exception ;  <METHOD_END>
<METHOD_START> protected final org.springframework.boot.loader.Archive org.springframework.boot.loader.Archive ( ) java.lang.Exception { java.security.ProtectionDomain java.security.ProtectionDomain = java.lang.Class<? extends org.springframework.boot.loader.Launcher> ( ) . java.security.ProtectionDomain ( ) ; java.security.CodeSource java.security.CodeSource = java.security.ProtectionDomain . java.security.CodeSource ( ) ; java.net.URI java.net.URI = ( java.security.CodeSource == null ? null : java.security.CodeSource . java.net.URL ( ) . java.net.URI ( ) ) ; java.lang.String java.lang.String = ( java.net.URI == null ? null : java.net.URI . java.lang.String ( ) ) ; if ( java.lang.String == null ) { throw new java.lang.IllegalStateException ( STRING ) ; } java.io.File java.io.File = new java.io.File ( java.lang.String ) ; if ( ! java.io.File . boolean ( ) ) { throw new java.lang.IllegalStateException ( STRING + java.io.File ) ; } return ( java.io.File . boolean ( ) ? new ExplodedArchive ( java.io.File ) : new JarFileArchive ( java.io.File ) ) ; }  <METHOD_END>
