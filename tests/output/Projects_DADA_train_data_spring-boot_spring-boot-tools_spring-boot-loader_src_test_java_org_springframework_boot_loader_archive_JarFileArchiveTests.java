<METHOD_START> @ Before public void void ( ) java.lang.Exception { void ( false ) ; }  <METHOD_END>
<METHOD_START> private void void ( boolean boolean ) throws java.lang.Exception { this . java.io.File = this . org.springframework.boot.loader.archive.TemporaryFolder . newFile ( ) ; this . java.lang.String = this . java.io.File . java.net.URI ( ) . java.lang.String ( ) ; TestJarCreator . createTestJar ( this . java.io.File , boolean ) ; this . org.springframework.boot.loader.archive.JarFileArchive = new JarFileArchive ( this . java.io.File ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { assertThat ( this . org.springframework.boot.loader.archive.JarFileArchive . getManifest ( ) . getMainAttributes ( ) . getValue ( STRING ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.util.Map<java.lang.String,Archive.Entry> < java.lang.String , Archive . Archive > java.util.Map<java.lang.String,Archive.Entry> = java.util.Map<java.lang.String,Archive.Entry> ( this . org.springframework.boot.loader.archive.JarFileArchive ) ; assertThat ( java.util.Map<java.lang.String,Archive.Entry> . size ( ) ) . isEqualTo ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.net.URL java.net.URL = this . org.springframework.boot.loader.archive.JarFileArchive . getUrl ( ) ; assertThat ( java.net.URL . java.lang.String ( ) ) . isEqualTo ( STRING + this . java.lang.String + STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Entry org.springframework.boot.loader.archive.Entry = java.util.Map<java.lang.String,Archive.Entry> ( this . org.springframework.boot.loader.archive.JarFileArchive ) . get ( STRING ) ; Archive org.springframework.boot.loader.archive.Archive = this . org.springframework.boot.loader.archive.JarFileArchive . getNestedArchive ( org.springframework.boot.loader.archive.Entry ) ; assertThat ( org.springframework.boot.loader.archive.Archive . getUrl ( ) . toString ( ) ) . isEqualTo ( STRING + this . java.lang.String + STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( true ) ; Entry org.springframework.boot.loader.archive.Entry = java.util.Map<java.lang.String,Archive.Entry> ( this . org.springframework.boot.loader.archive.JarFileArchive ) . get ( STRING ) ; Archive org.springframework.boot.loader.archive.Archive = this . org.springframework.boot.loader.archive.JarFileArchive . getNestedArchive ( org.springframework.boot.loader.archive.Entry ) ; assertThat ( org.springframework.boot.loader.archive.Archive . getUrl ( ) . toString ( ) ) . startsWith ( STRING ) ; assertThat ( org.springframework.boot.loader.archive.Archive . getUrl ( ) . toString ( ) ) . endsWith ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( true ) ; Entry org.springframework.boot.loader.archive.Entry = java.util.Map<java.lang.String,Archive.Entry> ( this . org.springframework.boot.loader.archive.JarFileArchive ) . get ( STRING ) ; java.net.URL java.net.URL = this . org.springframework.boot.loader.archive.JarFileArchive . getNestedArchive ( org.springframework.boot.loader.archive.Entry ) . getUrl ( ) ; void ( true ) ; org.springframework.boot.loader.archive.Entry = java.util.Map<java.lang.String,Archive.Entry> ( this . org.springframework.boot.loader.archive.JarFileArchive ) . get ( STRING ) ; java.net.URL java.net.URL = this . org.springframework.boot.loader.archive.JarFileArchive . getNestedArchive ( org.springframework.boot.loader.archive.Entry ) . getUrl ( ) ; assertThat ( java.net.URL ) . isNotEqualTo ( java.net.URL ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { void ( true ) ; java.io.File java.io.File = new java.io.File ( this . org.springframework.boot.loader.archive.JarFileArchive . getNestedArchive ( java.util.Map<java.lang.String,Archive.Entry> ( this . org.springframework.boot.loader.archive.JarFileArchive ) . get ( STRING ) ) . getUrl ( ) . toURI ( ) ) ; java.io.File java.io.File = new java.io.File ( this . org.springframework.boot.loader.archive.JarFileArchive . getNestedArchive ( java.util.Map<java.lang.String,Archive.Entry> ( this . org.springframework.boot.loader.archive.JarFileArchive ) . get ( STRING ) ) . getUrl ( ) . toURI ( ) ) ; assertThat ( java.io.File . java.lang.String ( ) ) . isEqualTo ( java.io.File . java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.io.IOException { java.io.File java.io.File = this . org.springframework.boot.loader.archive.TemporaryFolder . newFile ( STRING ) ; FileCopyUtils . copy ( byte[] ( ) , java.io.File ) ; this . org.springframework.boot.loader.archive.ExpectedException . expectMessage ( equalTo ( STRING ) ) ; new JarFileArchive ( java.io.File ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.io.IOException { java.io.File java.io.File = this . org.springframework.boot.loader.archive.TemporaryFolder . newFile ( STRING ) ; java.util.jar.JarOutputStream java.util.jar.JarOutputStream = new java.util.jar.JarOutputStream ( new java.io.FileOutputStream ( java.io.File ) ) ; java.util.jar.JarEntry java.util.jar.JarEntry = new java.util.jar.JarEntry ( STRING ) ; java.util.jar.JarOutputStream . void ( java.util.jar.JarEntry ) ; byte [] byte[] = byte[] ( ) ; java.util.jar.JarEntry . void ( byte[] . int ) ; java.util.jar.JarEntry . void ( byte[] . int ) ; java.util.jar.JarEntry . void ( java.util.zip.ZipEntry . int ) ; java.util.zip.CRC32 java.util.zip.CRC32 = new java.util.zip.CRC32 ( ) ; java.util.zip.CRC32 . void ( byte[] ) ; java.util.jar.JarEntry . void ( java.util.zip.CRC32 . long ( ) ) ; java.util.jar.JarOutputStream . void ( byte[] ) ; java.util.jar.JarOutputStream . void ( ) ; java.util.jar.JarOutputStream . void ( ) ; JarFileArchive org.springframework.boot.loader.archive.JarFileArchive = new JarFileArchive ( java.io.File ) ; this . org.springframework.boot.loader.archive.ExpectedException . expectMessage ( equalTo ( STRING ) ) ; org.springframework.boot.loader.archive.JarFileArchive . getNestedArchive ( java.util.Map<java.lang.String,Archive.Entry> ( org.springframework.boot.loader.archive.JarFileArchive ) . get ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> private byte [] byte[] ( ) java.io.IOException { java.io.ByteArrayOutputStream java.io.ByteArrayOutputStream = new java.io.ByteArrayOutputStream ( ) ; java.util.jar.JarOutputStream java.util.jar.JarOutputStream = new java.util.jar.JarOutputStream ( java.io.ByteArrayOutputStream ) ; for ( int int = NUMBER ; int < NUMBER ; int ++ ) { java.util.jar.JarOutputStream . void ( new java.util.jar.JarEntry ( int + STRING ) ) ; java.util.jar.JarOutputStream . void ( ) ; } java.util.jar.JarOutputStream . void ( ) ; return java.io.ByteArrayOutputStream . byte[] ( ) ; }  <METHOD_END>
<METHOD_START> private java.util.Map<java.lang.String,Archive.Entry> < java.lang.String , Archive . Archive > java.util.Map<java.lang.String,Archive.Entry> ( Archive org.springframework.boot.loader.archive.Archive ) { java.util.Map<java.lang.String,Archive.Entry> < java.lang.String , Archive . Archive > java.util.Map<java.lang.String,Archive.Entry> = new java.util.HashMap<java.lang.String,Archive.Entry> <> ( ) ; for ( Archive . Archive Archive.Entry : org.springframework.boot.loader.archive.Archive ) { java.util.Map<java.lang.String,Archive.Entry> . put ( Archive.Entry . getName ( ) , Archive.Entry ) ; } return java.util.Map<java.lang.String,Archive.Entry> ; }  <METHOD_END>