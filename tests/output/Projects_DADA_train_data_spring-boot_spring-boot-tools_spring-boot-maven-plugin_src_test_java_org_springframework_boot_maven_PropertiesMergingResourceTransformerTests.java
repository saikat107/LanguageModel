<METHOD_START> @ Test public void void ( ) java.lang.Exception { assertThat ( this . org.springframework.boot.maven.PropertiesMergingResourceTransformer . hasTransformedResource ( ) ) . isFalse ( ) ; this . org.springframework.boot.maven.PropertiesMergingResourceTransformer . processResource ( STRING , new java.io.ByteArrayInputStream ( STRING . byte[] ( ) ) , null ) ; assertThat ( this . org.springframework.boot.maven.PropertiesMergingResourceTransformer . hasTransformedResource ( ) ) . isTrue ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.maven.PropertiesMergingResourceTransformer . processResource ( STRING , new java.io.ByteArrayInputStream ( STRING . byte[] ( ) ) , null ) ; this . org.springframework.boot.maven.PropertiesMergingResourceTransformer . processResource ( STRING , new java.io.ByteArrayInputStream ( STRING . byte[] ( ) ) , null ) ; assertThat ( this . org.springframework.boot.maven.PropertiesMergingResourceTransformer . getData ( ) . getProperty ( STRING ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.maven.PropertiesMergingResourceTransformer . setResource ( STRING ) ; this . org.springframework.boot.maven.PropertiesMergingResourceTransformer . processResource ( STRING , new java.io.ByteArrayInputStream ( STRING . byte[] ( ) ) , null ) ; java.io.ByteArrayOutputStream java.io.ByteArrayOutputStream = new java.io.ByteArrayOutputStream ( ) ; java.util.jar.JarOutputStream java.util.jar.JarOutputStream = new java.util.jar.JarOutputStream ( java.io.ByteArrayOutputStream ) ; this . org.springframework.boot.maven.PropertiesMergingResourceTransformer . modifyOutputStream ( java.util.jar.JarOutputStream ) ; java.util.jar.JarOutputStream . void ( ) ; java.util.jar.JarOutputStream . void ( ) ; assertThat ( java.io.ByteArrayOutputStream . byte[] ( ) ) . isNotNull ( ) ; assertThat ( java.io.ByteArrayOutputStream . byte[] ( ) . int > NUMBER ) . isTrue ( ) ; }  <METHOD_END>
