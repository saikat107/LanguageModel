<METHOD_START> @ java.lang.Override public void void ( DefaultRepositorySystemSession org.springframework.boot.cli.compiler.grape.DefaultRepositorySystemSession , RepositorySystem org.springframework.boot.cli.compiler.grape.RepositorySystem ) { if ( org.springframework.boot.cli.compiler.grape.DefaultRepositorySystemSession . getLocalRepositoryManager ( ) == null ) { LocalRepository org.springframework.boot.cli.compiler.grape.LocalRepository = new LocalRepository ( java.io.File ( ) ) ; LocalRepositoryManager org.springframework.boot.cli.compiler.grape.LocalRepositoryManager = org.springframework.boot.cli.compiler.grape.RepositorySystem . newLocalRepositoryManager ( org.springframework.boot.cli.compiler.grape.DefaultRepositorySystemSession , org.springframework.boot.cli.compiler.grape.LocalRepository ) ; org.springframework.boot.cli.compiler.grape.DefaultRepositorySystemSession . setLocalRepositoryManager ( org.springframework.boot.cli.compiler.grape.LocalRepositoryManager ) ; } ProxySelector org.springframework.boot.cli.compiler.grape.ProxySelector = org.springframework.boot.cli.compiler.grape.DefaultRepositorySystemSession . getProxySelector ( ) ; if ( org.springframework.boot.cli.compiler.grape.ProxySelector == null || ! ( org.springframework.boot.cli.compiler.grape.ProxySelector instanceof CompositeProxySelector ) ) { JreProxySelector org.springframework.boot.cli.compiler.grape.JreProxySelector = new JreProxySelector ( ) ; ProxySelector org.springframework.boot.cli.compiler.grape.ProxySelector = org.springframework.boot.cli.compiler.grape.ProxySelector == null ? org.springframework.boot.cli.compiler.grape.JreProxySelector : new CompositeProxySelector ( java.util.Arrays . java.util.List ( org.springframework.boot.cli.compiler.grape.ProxySelector , org.springframework.boot.cli.compiler.grape.JreProxySelector ) ) ; org.springframework.boot.cli.compiler.grape.DefaultRepositorySystemSession . setProxySelector ( org.springframework.boot.cli.compiler.grape.ProxySelector ) ; } }  <METHOD_END>
<METHOD_START> private java.io.File java.io.File ( ) { return new java.io.File ( java.io.File ( ) , STRING ) ; }  <METHOD_END>
<METHOD_START> private java.io.File java.io.File ( ) { java.lang.String java.lang.String = java.lang.System . java.lang.String ( STRING ) ; if ( StringUtils . hasLength ( java.lang.String ) ) { return new java.io.File ( java.lang.String ) ; } return new java.io.File ( java.lang.System . java.lang.String ( STRING ) , STRING ) ; }  <METHOD_END>
