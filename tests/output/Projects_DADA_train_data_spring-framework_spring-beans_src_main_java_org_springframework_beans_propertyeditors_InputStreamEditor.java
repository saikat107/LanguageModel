<METHOD_START> public void ( ) { this . org.springframework.beans.propertyeditors.ResourceEditor = new ResourceEditor ( ) ; }  <METHOD_END>
<METHOD_START> public void ( ResourceEditor org.springframework.beans.propertyeditors.ResourceEditor ) { Assert . notNull ( org.springframework.beans.propertyeditors.ResourceEditor , STRING ) ; this . org.springframework.beans.propertyeditors.ResourceEditor = org.springframework.beans.propertyeditors.ResourceEditor ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.String java.lang.String ) throws java.lang.IllegalArgumentException { this . org.springframework.beans.propertyeditors.ResourceEditor . setAsText ( java.lang.String ) ; Resource org.springframework.beans.propertyeditors.Resource = ( Resource ) this . org.springframework.beans.propertyeditors.ResourceEditor . getValue ( ) ; try { void ( org.springframework.beans.propertyeditors.Resource != null ? org.springframework.beans.propertyeditors.Resource . getInputStream ( ) : null ) ; } catch ( java.io.IOException java.io.IOException ) { throw new java.lang.IllegalArgumentException ( STRING + org.springframework.beans.propertyeditors.Resource , java.io.IOException ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return null ; }  <METHOD_END>