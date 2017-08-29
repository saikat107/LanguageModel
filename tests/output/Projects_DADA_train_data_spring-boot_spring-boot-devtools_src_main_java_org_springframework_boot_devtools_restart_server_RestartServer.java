<METHOD_START> public void ( SourceFolderUrlFilter org.springframework.boot.devtools.restart.server.SourceFolderUrlFilter ) { this( org.springframework.boot.devtools.restart.server.SourceFolderUrlFilter , java.lang.Thread . java.lang.Thread ( ) . java.lang.ClassLoader ( ) ); }  <METHOD_END>
<METHOD_START> public void ( SourceFolderUrlFilter org.springframework.boot.devtools.restart.server.SourceFolderUrlFilter , java.lang.ClassLoader java.lang.ClassLoader ) { Assert . notNull ( org.springframework.boot.devtools.restart.server.SourceFolderUrlFilter , STRING ) ; Assert . notNull ( java.lang.ClassLoader , STRING ) ; this . org.springframework.boot.devtools.restart.server.SourceFolderUrlFilter = org.springframework.boot.devtools.restart.server.SourceFolderUrlFilter ; this . java.lang.ClassLoader = java.lang.ClassLoader ; }  <METHOD_END>
<METHOD_START> public void void ( ClassLoaderFiles org.springframework.boot.devtools.restart.server.ClassLoaderFiles ) { java.util.Set<java.net.URL> < java.net.URL > java.util.Set<java.net.URL> = new java.util.LinkedHashSet<java.net.URL> <> ( ) ; java.util.Set<java.net.URL> < java.net.URL > java.util.Set<java.net.URL> = java.util.Set<java.net.URL> ( ) ; for ( SourceFolder org.springframework.boot.devtools.restart.server.SourceFolder : org.springframework.boot.devtools.restart.server.ClassLoaderFiles . getSourceFolders ( ) ) { for ( java.util.Map.Entry<java.lang.String,org.springframework.boot.devtools.restart.server.ClassLoaderFile> < java.lang.String , ClassLoaderFile > java.util.Map.Entry<java.lang.String,org.springframework.boot.devtools.restart.server.ClassLoaderFile> : org.springframework.boot.devtools.restart.server.SourceFolder . getFilesEntrySet ( ) ) { for ( java.net.URL java.net.URL : java.util.Set<java.net.URL> ) { if ( boolean ( java.net.URL , java.util.Map.Entry<java.lang.String,org.springframework.boot.devtools.restart.server.ClassLoaderFile> . getKey ( ) , java.util.Map.Entry<java.lang.String,org.springframework.boot.devtools.restart.server.ClassLoaderFile> . getValue ( ) ) ) { java.util.Set<java.net.URL> . boolean ( java.net.URL ) ; } } } java.util.Set<java.net.URL> . boolean ( java.util.Set<java.net.URL> ( java.util.Set<java.net.URL> , org.springframework.boot.devtools.restart.server.SourceFolder . getName ( ) ) ) ; } void ( java.util.Set<java.net.URL> ) ; void ( java.util.Set<java.net.URL> , org.springframework.boot.devtools.restart.server.ClassLoaderFiles ) ; }  <METHOD_END>
<METHOD_START> private boolean boolean ( java.net.URL java.net.URL , java.lang.String java.lang.String , ClassLoaderFile org.springframework.boot.devtools.restart.server.ClassLoaderFile ) { if ( ! boolean ( java.net.URL . java.lang.String ( ) ) ) { return false ; } try { java.io.File java.io.File = ResourceUtils . getFile ( java.net.URL ) ; java.io.File java.io.File = new java.io.File ( java.io.File , java.lang.String ) ; if ( java.io.File . boolean ( ) && java.io.File . boolean ( ) ) { if ( org.springframework.boot.devtools.restart.server.ClassLoaderFile . getKind ( ) == Kind . DELETED ) { return java.io.File . boolean ( ) ; } FileCopyUtils . copy ( org.springframework.boot.devtools.restart.server.ClassLoaderFile . getContents ( ) , java.io.File ) ; return true ; } } catch ( java.io.IOException java.io.IOException ) { } return false ; }  <METHOD_END>
<METHOD_START> private boolean boolean ( java.lang.String java.lang.String ) { return java.lang.String . boolean ( STRING ) && java.lang.String . boolean ( STRING ) ; }  <METHOD_END>
<METHOD_START> private java.util.Set<java.net.URL> < java.net.URL > java.util.Set<java.net.URL> ( java.util.Set<java.net.URL> < java.net.URL > java.util.Set<java.net.URL> , java.lang.String java.lang.String ) { java.util.Set<java.net.URL> < java.net.URL > java.util.Set<java.net.URL> = new java.util.LinkedHashSet<java.net.URL> <> ( ) ; for ( java.net.URL java.net.URL : java.util.Set<java.net.URL> ) { if ( this . org.springframework.boot.devtools.restart.server.SourceFolderUrlFilter . isMatch ( java.lang.String , java.net.URL ) ) { if ( org.springframework.boot.devtools.restart.server.Log . isDebugEnabled ( ) ) { org.springframework.boot.devtools.restart.server.Log . debug ( STRING + java.net.URL + STRING + java.lang.String ) ; } java.util.Set<java.net.URL> . boolean ( java.net.URL ) ; } } return java.util.Set<java.net.URL> ; }  <METHOD_END>
<METHOD_START> private java.util.Set<java.net.URL> < java.net.URL > java.util.Set<java.net.URL> ( ) { java.util.Set<java.net.URL> < java.net.URL > java.util.Set<java.net.URL> = new java.util.LinkedHashSet<java.net.URL> <> ( ) ; java.lang.ClassLoader java.lang.ClassLoader = this . java.lang.ClassLoader ; while ( java.lang.ClassLoader != null ) { if ( java.lang.ClassLoader instanceof java.net.URLClassLoader ) { java.util.Collections . boolean ( java.util.Set<java.net.URL> , ( ( java.net.URLClassLoader ) java.lang.ClassLoader ) . java.net.URL[] ( ) ) ; } java.lang.ClassLoader = java.lang.ClassLoader . java.lang.ClassLoader ( ) ; } return java.util.Set<java.net.URL> ; }  <METHOD_END>
<METHOD_START> private void void ( java.lang.Iterable<java.net.URL> < java.net.URL > java.lang.Iterable<java.net.URL> ) { for ( java.net.URL java.net.URL : java.lang.Iterable<java.net.URL> ) { void ( java.net.URL ) ; } }  <METHOD_END>
<METHOD_START> private void void ( java.net.URL java.net.URL ) { try { java.net.URL java.net.URL = ResourceUtils . extractJarFileURL ( java.net.URL ) ; java.io.File java.io.File = ResourceUtils . getFile ( java.net.URL , STRING ) ; java.io.File . boolean ( java.lang.System . long ( ) ) ; } catch ( java.lang.Exception java.lang.Exception ) { } }  <METHOD_END>
<METHOD_START> protected void void ( java.util.Set<java.net.URL> < java.net.URL > java.util.Set<java.net.URL> , ClassLoaderFiles org.springframework.boot.devtools.restart.server.ClassLoaderFiles ) { Restarter org.springframework.boot.devtools.restart.server.Restarter = Restarter . getInstance ( ) ; org.springframework.boot.devtools.restart.server.Restarter . addUrls ( java.util.Set<java.net.URL> ) ; org.springframework.boot.devtools.restart.server.Restarter . addClassLoaderFiles ( org.springframework.boot.devtools.restart.server.ClassLoaderFiles ) ; org.springframework.boot.devtools.restart.server.Restarter . restart ( ) ; }  <METHOD_END>
