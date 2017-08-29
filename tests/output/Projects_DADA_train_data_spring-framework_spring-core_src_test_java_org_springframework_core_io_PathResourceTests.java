<METHOD_START> private static java.lang.String java.lang.String ( java.lang.String java.lang.String ) { return java.lang.String . java.lang.String ( '/' , java.io.File . char ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.core.io.ExpectedException . expect ( java.lang.IllegalArgumentException .class ) ; org.springframework.core.io.ExpectedException . expectMessage ( STRING ) ; new PathResource ( ( java.nio.file.Path ) null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.core.io.ExpectedException . expect ( java.lang.IllegalArgumentException .class ) ; org.springframework.core.io.ExpectedException . expectMessage ( STRING ) ; new PathResource ( ( java.lang.String ) null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.core.io.ExpectedException . expect ( java.lang.IllegalArgumentException .class ) ; org.springframework.core.io.ExpectedException . expectMessage ( STRING ) ; new PathResource ( ( java.net.URI ) null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.nio.file.Path java.nio.file.Path = java.nio.file.Paths . java.nio.file.Path ( java.lang.String ) ; PathResource org.springframework.core.io.PathResource = new PathResource ( java.nio.file.Path ) ; assertThat ( org.springframework.core.io.PathResource . getPath ( ) , equalTo ( java.lang.String ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { PathResource org.springframework.core.io.PathResource = new PathResource ( java.lang.String ) ; assertThat ( org.springframework.core.io.PathResource . getPath ( ) , equalTo ( java.lang.String ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.io.File java.io.File = new java.io.File ( java.lang.String ) ; PathResource org.springframework.core.io.PathResource = new PathResource ( java.io.File . java.net.URI ( ) ) ; assertThat ( org.springframework.core.io.PathResource . getPath ( ) , equalTo ( java.io.File . java.io.File ( ) . java.lang.String ( ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { PathResource org.springframework.core.io.PathResource = new PathResource ( java.lang.String ) ; assertThat ( org.springframework.core.io.PathResource . getPath ( ) , equalTo ( java.lang.String ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { PathResource org.springframework.core.io.PathResource = new PathResource ( java.lang.String ) ; assertThat ( org.springframework.core.io.PathResource . getPath ( ) , equalTo ( java.lang.String ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { PathResource org.springframework.core.io.PathResource = new PathResource ( java.lang.String ) ; assertThat ( org.springframework.core.io.PathResource . exists ( ) , equalTo ( true ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { PathResource org.springframework.core.io.PathResource = new PathResource ( java.lang.String ) ; assertThat ( org.springframework.core.io.PathResource . exists ( ) , equalTo ( true ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { PathResource org.springframework.core.io.PathResource = new PathResource ( java.lang.String ) ; assertThat ( org.springframework.core.io.PathResource . exists ( ) , equalTo ( false ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { PathResource org.springframework.core.io.PathResource = new PathResource ( java.lang.String ) ; assertThat ( org.springframework.core.io.PathResource . isReadable ( ) , equalTo ( true ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { PathResource org.springframework.core.io.PathResource = new PathResource ( java.lang.String ) ; assertThat ( org.springframework.core.io.PathResource . isReadable ( ) , equalTo ( false ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { PathResource org.springframework.core.io.PathResource = new PathResource ( java.lang.String ) ; assertThat ( org.springframework.core.io.PathResource . isReadable ( ) , equalTo ( false ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { PathResource org.springframework.core.io.PathResource = new PathResource ( java.lang.String ) ; byte [] byte[] = FileCopyUtils . copyToByteArray ( org.springframework.core.io.PathResource . getInputStream ( ) ) ; assertThat ( byte[] . int , greaterThan ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { PathResource org.springframework.core.io.PathResource = new PathResource ( java.lang.String ) ; org.springframework.core.io.ExpectedException . expect ( java.io.FileNotFoundException .class ) ; org.springframework.core.io.PathResource . getInputStream ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { PathResource org.springframework.core.io.PathResource = new PathResource ( java.lang.String ) ; org.springframework.core.io.ExpectedException . expect ( java.io.FileNotFoundException .class ) ; org.springframework.core.io.PathResource . getInputStream ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { PathResource org.springframework.core.io.PathResource = new PathResource ( java.lang.String ) ; assertThat ( org.springframework.core.io.PathResource . getURL ( ) . toString ( ) , Matchers . endsWith ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { PathResource org.springframework.core.io.PathResource = new PathResource ( java.lang.String ) ; assertThat ( org.springframework.core.io.PathResource . getURI ( ) . toString ( ) , Matchers . endsWith ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { PathResource org.springframework.core.io.PathResource = new PathResource ( java.lang.String ) ; java.io.File java.io.File = new java.io.File ( java.lang.String ) ; assertThat ( org.springframework.core.io.PathResource . getFile ( ) . getAbsoluteFile ( ) , equalTo ( java.io.File . java.io.File ( ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.nio.file.Path java.nio.file.Path = mock ( java.nio.file.Path .class ) ; given ( java.nio.file.Path . java.nio.file.Path ( ) ) . willReturn ( java.nio.file.Path ) ; given ( java.nio.file.Path . java.io.File ( ) ) . willThrow ( new java.lang.UnsupportedOperationException ( ) ) ; PathResource org.springframework.core.io.PathResource = new PathResource ( java.nio.file.Path ) ; org.springframework.core.io.ExpectedException . expect ( java.io.FileNotFoundException .class ) ; org.springframework.core.io.PathResource . getFile ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { PathResource org.springframework.core.io.PathResource = new PathResource ( java.lang.String ) ; java.io.File java.io.File = new java.io.File ( java.lang.String ) ; assertThat ( org.springframework.core.io.PathResource . contentLength ( ) , equalTo ( java.io.File . long ( ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { PathResource org.springframework.core.io.PathResource = new PathResource ( java.lang.String ) ; java.io.File java.io.File = new java.io.File ( java.lang.String ) ; assertThat ( org.springframework.core.io.PathResource . contentLength ( ) , equalTo ( java.io.File . long ( ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { PathResource org.springframework.core.io.PathResource = new PathResource ( java.lang.String ) ; java.io.File java.io.File = new java.io.File ( java.lang.String ) ; assertThat ( org.springframework.core.io.PathResource . lastModified ( ) / NUMBER , equalTo ( java.io.File . long ( ) / NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Resource org.springframework.core.io.Resource = new PathResource ( java.lang.String ) . createRelative ( STRING ) ; assertThat ( org.springframework.core.io.Resource , equalTo ( ( Resource ) new PathResource ( java.lang.String ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Resource org.springframework.core.io.Resource = new PathResource ( java.lang.String ) . createRelative ( STRING ) ; assertThat ( org.springframework.core.io.Resource , equalTo ( ( Resource ) new PathResource ( java.lang.String ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Resource org.springframework.core.io.Resource = new PathResource ( java.lang.String ) ; assertThat ( org.springframework.core.io.Resource . getFilename ( ) , equalTo ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Resource org.springframework.core.io.Resource = new PathResource ( java.lang.String ) ; assertThat ( org.springframework.core.io.Resource . getDescription ( ) , containsString ( STRING ) ) ; assertThat ( org.springframework.core.io.Resource . getDescription ( ) , containsString ( java.lang.String ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { PathResource org.springframework.core.io.PathResource = new PathResource ( java.lang.String ) ; assertThat ( org.springframework.core.io.PathResource . isWritable ( ) , equalTo ( true ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { PathResource org.springframework.core.io.PathResource = new PathResource ( java.lang.String ) ; assertThat ( org.springframework.core.io.PathResource . isWritable ( ) , equalTo ( false ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { PathResource org.springframework.core.io.PathResource = new PathResource ( org.springframework.core.io.TemporaryFolder . newFile ( STRING ) . toPath ( ) ) ; FileCopyUtils . copy ( STRING . byte[] ( ) , org.springframework.core.io.PathResource . getOutputStream ( ) ) ; assertThat ( org.springframework.core.io.PathResource . contentLength ( ) , equalTo ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.io.File java.io.File = org.springframework.core.io.TemporaryFolder . newFile ( STRING ) ; java.io.File . boolean ( ) ; PathResource org.springframework.core.io.PathResource = new PathResource ( java.io.File . java.nio.file.Path ( ) ) ; FileCopyUtils . copy ( STRING . byte[] ( ) , org.springframework.core.io.PathResource . getOutputStream ( ) ) ; assertThat ( org.springframework.core.io.PathResource . contentLength ( ) , equalTo ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { PathResource org.springframework.core.io.PathResource = new PathResource ( java.lang.String ) ; org.springframework.core.io.ExpectedException . expect ( java.io.FileNotFoundException .class ) ; org.springframework.core.io.PathResource . getOutputStream ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { PathResource org.springframework.core.io.PathResource = new PathResource ( java.lang.String ) ; java.nio.channels.ReadableByteChannel java.nio.channels.ReadableByteChannel = null ; try { java.nio.channels.ReadableByteChannel = org.springframework.core.io.PathResource . readableChannel ( ) ; java.nio.ByteBuffer java.nio.ByteBuffer = java.nio.ByteBuffer . java.nio.ByteBuffer ( ( int ) org.springframework.core.io.PathResource . contentLength ( ) ) ; java.nio.channels.ReadableByteChannel . int ( java.nio.ByteBuffer ) ; java.nio.ByteBuffer . java.nio.Buffer ( ) ; assertThat ( java.nio.ByteBuffer . int ( ) , greaterThan ( NUMBER ) ) ; } finally { if ( java.nio.channels.ReadableByteChannel != null ) { java.nio.channels.ReadableByteChannel . void ( ) ; } } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { PathResource org.springframework.core.io.PathResource = new PathResource ( java.lang.String ) ; try { org.springframework.core.io.PathResource . readableChannel ( ) ; } catch ( java.nio.file.AccessDeniedException java.nio.file.AccessDeniedException ) { } }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { PathResource org.springframework.core.io.PathResource = new PathResource ( java.lang.String ) ; org.springframework.core.io.ExpectedException . expect ( java.nio.file.NoSuchFileException .class ) ; org.springframework.core.io.PathResource . readableChannel ( ) ; }  <METHOD_END>