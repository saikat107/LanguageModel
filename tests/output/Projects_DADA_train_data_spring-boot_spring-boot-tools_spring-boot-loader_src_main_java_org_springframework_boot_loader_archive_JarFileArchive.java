<METHOD_START> public void ( java.io.File java.io.File ) throws java.io.IOException { this( java.io.File , null ); }  <METHOD_END>
<METHOD_START> public void ( java.io.File java.io.File , java.net.URL java.net.URL ) throws java.io.IOException { this( new JarFile ( java.io.File ) ); this . java.net.URL = java.net.URL ; }  <METHOD_END>
<METHOD_START> public void ( JarFile org.springframework.boot.loader.archive.JarFile ) { this . org.springframework.boot.loader.archive.JarFile = org.springframework.boot.loader.archive.JarFile ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.net.URL java.net.URL ( ) java.net.MalformedURLException { if ( this . java.net.URL != null ) { return this . java.net.URL ; } return this . org.springframework.boot.loader.archive.JarFile . getUrl ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.jar.Manifest java.util.jar.Manifest ( ) java.io.IOException { return this . org.springframework.boot.loader.archive.JarFile . getManifest ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.List<org.springframework.boot.loader.archive.Archive> < Archive > java.util.List<org.springframework.boot.loader.archive.Archive> ( EntryFilter org.springframework.boot.loader.archive.EntryFilter ) throws java.io.IOException { java.util.List<org.springframework.boot.loader.archive.Archive> < Archive > java.util.List<org.springframework.boot.loader.archive.Archive> = new java.util.ArrayList<org.springframework.boot.loader.archive.Archive> <> ( ) ; for ( Entry org.springframework.boot.loader.archive.Entry : this ) { if ( org.springframework.boot.loader.archive.EntryFilter . matches ( org.springframework.boot.loader.archive.Entry ) ) { java.util.List<org.springframework.boot.loader.archive.Archive> . add ( org.springframework.boot.loader.archive.Archive ( org.springframework.boot.loader.archive.Entry ) ) ; } } return java.util.Collections . java.util.List<org.springframework.boot.loader.archive.Archive> ( java.util.List<org.springframework.boot.loader.archive.Archive> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Iterator<org.springframework.boot.loader.archive.Entry> < Entry > java.util.Iterator<org.springframework.boot.loader.archive.Entry> ( ) { return new org.springframework.boot.loader.archive.JarFileArchive.EntryIterator ( this . org.springframework.boot.loader.archive.JarFile . entries ( ) ) ; }  <METHOD_END>
<METHOD_START> protected org.springframework.boot.loader.archive.Archive org.springframework.boot.loader.archive.Archive ( Entry org.springframework.boot.loader.archive.Entry ) throws java.io.IOException { java.util.jar.JarEntry java.util.jar.JarEntry = ( ( org.springframework.boot.loader.archive.JarFileArchive.JarFileEntry ) org.springframework.boot.loader.archive.Entry ) . java.util.jar.JarEntry ( ) ; if ( java.util.jar.JarEntry . java.lang.String ( ) . boolean ( java.lang.String ) ) { return org.springframework.boot.loader.archive.Archive ( java.util.jar.JarEntry ) ; } try { JarFile org.springframework.boot.loader.archive.JarFile = this . org.springframework.boot.loader.archive.JarFile . getNestedJarFile ( java.util.jar.JarEntry ) ; return new org.springframework.boot.loader.archive.JarFileArchive ( org.springframework.boot.loader.archive.JarFile ) ; } catch ( java.lang.Exception java.lang.Exception ) { throw new java.lang.IllegalStateException ( STRING + org.springframework.boot.loader.archive.Entry . getName ( ) , java.lang.Exception ) ; } }  <METHOD_END>
<METHOD_START> private org.springframework.boot.loader.archive.Archive org.springframework.boot.loader.archive.Archive ( java.util.jar.JarEntry java.util.jar.JarEntry ) throws java.io.IOException { java.lang.String java.lang.String = java.util.jar.JarEntry . java.lang.String ( ) ; if ( java.lang.String . int ( STRING ) != - NUMBER ) { java.lang.String = java.lang.String . java.lang.String ( java.lang.String . int ( STRING ) + NUMBER ) ; } java.io.File java.io.File = new java.io.File ( java.io.File ( ) , java.lang.String ) ; if ( ! java.io.File . boolean ( ) || java.io.File . long ( ) != java.util.jar.JarEntry . long ( ) ) { void ( java.util.jar.JarEntry , java.io.File ) ; } return new org.springframework.boot.loader.archive.JarFileArchive ( java.io.File , java.io.File . java.net.URI ( ) . java.net.URL ( ) ) ; }  <METHOD_END>
<METHOD_START> private java.io.File java.io.File ( ) { if ( this . java.io.File == null ) { java.io.File java.io.File = new java.io.File ( java.lang.System . java.lang.String ( STRING ) ) ; this . java.io.File = java.io.File ( java.io.File ) ; } return this . java.io.File ; }  <METHOD_END>
<METHOD_START> private java.io.File java.io.File ( java.io.File java.io.File ) { int int = NUMBER ; while ( int ++ < NUMBER ) { java.lang.String java.lang.String = new java.io.File ( this . org.springframework.boot.loader.archive.JarFile . getName ( ) ) . java.lang.String ( ) ; java.io.File java.io.File = new java.io.File ( java.io.File , java.lang.String + STRING + java.util.UUID . java.util.UUID ( ) ) ; if ( java.io.File . boolean ( ) ) { return java.io.File ; } } throw new java.lang.IllegalStateException ( STRING + java.io.File + STRING ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.util.jar.JarEntry java.util.jar.JarEntry , java.io.File java.io.File ) throws java.io.IOException { java.io.InputStream java.io.InputStream = this . org.springframework.boot.loader.archive.JarFile . getInputStream ( java.util.jar.JarEntry , ResourceAccess . ONCE ) ; try { java.io.OutputStream java.io.OutputStream = new java.io.FileOutputStream ( java.io.File ) ; try { byte [] byte[] = new byte [ int ] ; int int = - NUMBER ; while ( ( int = java.io.InputStream . int ( byte[] ) ) != - NUMBER ) { java.io.OutputStream . void ( byte[] , NUMBER , int ) ; } java.io.OutputStream . void ( ) ; } finally { java.io.OutputStream . void ( ) ; } } finally { java.io.InputStream . void ( ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { try { return java.net.URL ( ) . java.lang.String ( ) ; } catch ( java.lang.Exception java.lang.Exception ) { return STRING ; } }  <METHOD_END>
<METHOD_START> void ( java.util.Enumeration<java.util.jar.JarEntry> < java.util.jar.JarEntry > java.util.Enumeration<java.util.jar.JarEntry> ) { this . java.util.Enumeration<java.util.jar.JarEntry> = java.util.Enumeration<java.util.jar.JarEntry> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return this . java.util.Enumeration<java.util.jar.JarEntry> . boolean ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.boot.loader.archive.Entry org.springframework.boot.loader.archive.Entry ( ) { return new org.springframework.boot.loader.archive.JarFileArchive.JarFileEntry ( this . java.util.Enumeration<java.util.jar.JarEntry> . java.util.jar.JarEntry ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { throw new java.lang.UnsupportedOperationException ( STRING ) ; }  <METHOD_END>
<METHOD_START> void ( java.util.jar.JarEntry java.util.jar.JarEntry ) { this . java.util.jar.JarEntry = java.util.jar.JarEntry ; }  <METHOD_END>
<METHOD_START> public java.util.jar.JarEntry java.util.jar.JarEntry ( ) { return this . java.util.jar.JarEntry ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return this . java.util.jar.JarEntry . boolean ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return this . java.util.jar.JarEntry . java.lang.String ( ) ; }  <METHOD_END>
