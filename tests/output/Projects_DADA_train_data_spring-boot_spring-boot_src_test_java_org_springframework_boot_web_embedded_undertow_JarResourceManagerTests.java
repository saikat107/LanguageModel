<METHOD_START> @ Before public void void ( ) java.io.IOException { java.io.File java.io.File = this . org.springframework.boot.web.embedded.undertow.TemporaryFolder . newFile ( ) ; java.util.jar.JarOutputStream java.util.jar.JarOutputStream = new java.util.jar.JarOutputStream ( new java.io.FileOutputStream ( java.io.File ) ) ; java.util.jar.JarOutputStream . void ( new java.util.zip.ZipEntry ( STRING ) ) ; java.util.jar.JarOutputStream . void ( STRING . byte[] ( ) ) ; java.util.jar.JarOutputStream . void ( ) ; this . org.springframework.boot.web.embedded.undertow.ResourceManager = new JarResourceManager ( java.io.File ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.io.IOException { Resource org.springframework.boot.web.embedded.undertow.Resource = this . org.springframework.boot.web.embedded.undertow.ResourceManager . getResource ( STRING ) ; assertThat ( org.springframework.boot.web.embedded.undertow.Resource ) . isNotNull ( ) ; assertThat ( org.springframework.boot.web.embedded.undertow.Resource . isDirectory ( ) ) . isTrue ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.io.IOException { Resource org.springframework.boot.web.embedded.undertow.Resource = this . org.springframework.boot.web.embedded.undertow.ResourceManager . getResource ( STRING ) ; assertThat ( org.springframework.boot.web.embedded.undertow.Resource ) . isNotNull ( ) ; assertThat ( org.springframework.boot.web.embedded.undertow.Resource . isDirectory ( ) ) . isTrue ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.io.IOException { Resource org.springframework.boot.web.embedded.undertow.Resource = this . org.springframework.boot.web.embedded.undertow.ResourceManager . getResource ( STRING ) ; assertThat ( org.springframework.boot.web.embedded.undertow.Resource ) . isNotNull ( ) ; assertThat ( org.springframework.boot.web.embedded.undertow.Resource . isDirectory ( ) ) . isFalse ( ) ; assertThat ( org.springframework.boot.web.embedded.undertow.Resource . getContentLength ( ) ) . isEqualTo ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.io.IOException { Resource org.springframework.boot.web.embedded.undertow.Resource = this . org.springframework.boot.web.embedded.undertow.ResourceManager . getResource ( STRING ) ; assertThat ( org.springframework.boot.web.embedded.undertow.Resource ) . isNotNull ( ) ; assertThat ( org.springframework.boot.web.embedded.undertow.Resource . isDirectory ( ) ) . isFalse ( ) ; assertThat ( org.springframework.boot.web.embedded.undertow.Resource . getContentLength ( ) ) . isEqualTo ( NUMBER ) ; }  <METHOD_END>
