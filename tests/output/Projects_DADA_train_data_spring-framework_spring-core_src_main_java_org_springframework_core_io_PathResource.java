<METHOD_START> public void ( java.nio.file.Path java.nio.file.Path ) { Assert . notNull ( java.nio.file.Path , STRING ) ; this . java.nio.file.Path = java.nio.file.Path . java.nio.file.Path ( ) ; }  <METHOD_END>
<METHOD_START> public void ( java.lang.String java.lang.String ) { Assert . notNull ( java.lang.String , STRING ) ; this . java.nio.file.Path = java.nio.file.Paths . java.nio.file.Path ( java.lang.String ) . java.nio.file.Path ( ) ; }  <METHOD_END>
<METHOD_START> public void ( java.net.URI java.net.URI ) { Assert . notNull ( java.net.URI , STRING ) ; this . java.nio.file.Path = java.nio.file.Paths . java.nio.file.Path ( java.net.URI ) . java.nio.file.Path ( ) ; }  <METHOD_END>
<METHOD_START> public final java.lang.String java.lang.String ( ) { return this . java.nio.file.Path . java.lang.String ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return java.nio.file.Files . boolean ( this . java.nio.file.Path ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return ( java.nio.file.Files . boolean ( this . java.nio.file.Path ) && ! java.nio.file.Files . boolean ( this . java.nio.file.Path ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.io.InputStream java.io.InputStream ( ) java.io.IOException { if ( ! boolean ( ) ) { throw new java.io.FileNotFoundException ( java.lang.String ( ) + STRING ) ; } if ( java.nio.file.Files . boolean ( this . java.nio.file.Path ) ) { throw new java.io.FileNotFoundException ( java.lang.String ( ) + STRING ) ; } return java.nio.file.Files . java.io.InputStream ( this . java.nio.file.Path ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return ( java.nio.file.Files . boolean ( this . java.nio.file.Path ) && ! java.nio.file.Files . boolean ( this . java.nio.file.Path ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.io.OutputStream java.io.OutputStream ( ) java.io.IOException { if ( java.nio.file.Files . boolean ( this . java.nio.file.Path ) ) { throw new java.io.FileNotFoundException ( java.lang.String ( ) + STRING ) ; } return java.nio.file.Files . java.io.OutputStream ( this . java.nio.file.Path ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.net.URL java.net.URL ( ) java.io.IOException { return this . java.nio.file.Path . java.net.URI ( ) . java.net.URL ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.net.URI java.net.URI ( ) java.io.IOException { return this . java.nio.file.Path . java.net.URI ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return true ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.io.File java.io.File ( ) java.io.IOException { try { return this . java.nio.file.Path . java.io.File ( ) ; } catch ( java.lang.UnsupportedOperationException java.lang.UnsupportedOperationException ) { throw new java.io.FileNotFoundException ( this . java.nio.file.Path + STRING + STRING ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.nio.channels.ReadableByteChannel java.nio.channels.ReadableByteChannel ( ) java.io.IOException { return java.nio.file.Files . java.nio.channels.SeekableByteChannel ( this . java.nio.file.Path , java.nio.file.StandardOpenOption . java.nio.file.StandardOpenOption ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public long long ( ) java.io.IOException { return java.nio.file.Files . long ( this . java.nio.file.Path ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public long long ( ) java.io.IOException { return java.nio.file.Files . java.nio.file.attribute.FileTime ( java.nio.file.Path ) . long ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.core.io.Resource org.springframework.core.io.Resource ( java.lang.String java.lang.String ) throws java.io.IOException { return new org.springframework.core.io.PathResource ( this . java.nio.file.Path . java.nio.file.Path ( java.lang.String ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return this . java.nio.file.Path . java.nio.file.Path ( ) . java.lang.String ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return STRING + this . java.nio.file.Path . java.nio.file.Path ( ) + STRING ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( java.lang.Object java.lang.Object ) { return ( this == java.lang.Object || ( java.lang.Object instanceof org.springframework.core.io.PathResource && this . java.nio.file.Path . boolean ( ( ( org.springframework.core.io.PathResource ) java.lang.Object ) . java.nio.file.Path ) ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public int int ( ) { return this . java.nio.file.Path . int ( ) ; }  <METHOD_END>
