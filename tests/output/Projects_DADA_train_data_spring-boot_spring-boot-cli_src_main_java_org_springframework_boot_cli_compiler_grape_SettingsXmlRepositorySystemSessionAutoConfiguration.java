<METHOD_START> @ java.lang.Override public void void ( DefaultRepositorySystemSession org.springframework.boot.cli.compiler.grape.DefaultRepositorySystemSession , RepositorySystem org.springframework.boot.cli.compiler.grape.RepositorySystem ) { MavenSettings org.springframework.boot.cli.compiler.grape.MavenSettings = org.springframework.boot.cli.compiler.grape.MavenSettings ( org.springframework.boot.cli.compiler.grape.DefaultRepositorySystemSession ) ; java.lang.String java.lang.String = org.springframework.boot.cli.compiler.grape.MavenSettings . getLocalRepository ( ) ; if ( java.lang.String != null ) { org.springframework.boot.cli.compiler.grape.DefaultRepositorySystemSession . setLocalRepositoryManager ( org.springframework.boot.cli.compiler.grape.RepositorySystem . newLocalRepositoryManager ( org.springframework.boot.cli.compiler.grape.DefaultRepositorySystemSession , new LocalRepository ( java.lang.String ) ) ) ; } }  <METHOD_END>
<METHOD_START> private org.springframework.boot.cli.compiler.grape.MavenSettings org.springframework.boot.cli.compiler.grape.MavenSettings ( DefaultRepositorySystemSession org.springframework.boot.cli.compiler.grape.DefaultRepositorySystemSession ) { MavenSettings org.springframework.boot.cli.compiler.grape.MavenSettings = new MavenSettingsReader ( ) . readSettings ( ) ; org.springframework.boot.cli.compiler.grape.DefaultRepositorySystemSession . setOffline ( org.springframework.boot.cli.compiler.grape.MavenSettings . getOffline ( ) ) ; org.springframework.boot.cli.compiler.grape.DefaultRepositorySystemSession . setMirrorSelector ( org.springframework.boot.cli.compiler.grape.MavenSettings . getMirrorSelector ( ) ) ; org.springframework.boot.cli.compiler.grape.DefaultRepositorySystemSession . setAuthenticationSelector ( org.springframework.boot.cli.compiler.grape.MavenSettings . getAuthenticationSelector ( ) ) ; org.springframework.boot.cli.compiler.grape.DefaultRepositorySystemSession . setProxySelector ( org.springframework.boot.cli.compiler.grape.MavenSettings . getProxySelector ( ) ) ; return org.springframework.boot.cli.compiler.grape.MavenSettings ; }  <METHOD_END>
