<METHOD_START> public void ( ) { this . org.springframework.beans.propertyeditors.ResourceEditor = new ResourceEditor ( ) ; }  <METHOD_END>
<METHOD_START> public void ( ResourceEditor org.springframework.beans.propertyeditors.ResourceEditor ) { Assert . notNull ( org.springframework.beans.propertyeditors.ResourceEditor , STRING ) ; this . org.springframework.beans.propertyeditors.ResourceEditor = org.springframework.beans.propertyeditors.ResourceEditor ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.String java.lang.String ) throws java.lang.IllegalArgumentException { boolean boolean = ! java.lang.String . boolean ( ResourceLoader . CLASSPATH_URL_PREFIX ) ; if ( boolean && ! java.lang.String . boolean ( STRING ) ) { try { java.net.URI java.net.URI = new java.net.URI ( java.lang.String ) ; if ( java.net.URI . java.lang.String ( ) != null ) { boolean = false ; void ( java.nio.file.Paths . java.nio.file.Path ( java.net.URI ) . java.nio.file.Path ( ) ) ; return; } } catch ( java.net.URISyntaxException java.net.URISyntaxException ) { } catch ( java.nio.file.FileSystemNotFoundException java.nio.file.FileSystemNotFoundException ) { } } this . org.springframework.beans.propertyeditors.ResourceEditor . setAsText ( java.lang.String ) ; Resource org.springframework.beans.propertyeditors.Resource = ( Resource ) this . org.springframework.beans.propertyeditors.ResourceEditor . getValue ( ) ; if ( org.springframework.beans.propertyeditors.Resource == null ) { void ( null ) ; } else if ( ! org.springframework.beans.propertyeditors.Resource . exists ( ) && boolean ) { void ( java.nio.file.Paths . java.nio.file.Path ( java.lang.String ) . java.nio.file.Path ( ) ) ; } else { try { void ( org.springframework.beans.propertyeditors.Resource . getFile ( ) . toPath ( ) ) ; } catch ( java.io.IOException java.io.IOException ) { throw new java.lang.IllegalArgumentException ( STRING + org.springframework.beans.propertyeditors.Resource , java.io.IOException ) ; } } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { java.nio.file.Path java.nio.file.Path = ( java.nio.file.Path ) java.lang.Object ( ) ; return ( java.nio.file.Path != null ? java.nio.file.Path . java.lang.String ( ) : STRING ) ; }  <METHOD_END>
