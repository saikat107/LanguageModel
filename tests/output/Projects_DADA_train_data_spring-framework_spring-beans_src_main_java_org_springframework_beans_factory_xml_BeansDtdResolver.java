<METHOD_START> @ java.lang.Override public org.xml.sax.InputSource org.xml.sax.InputSource ( java.lang.String java.lang.String , java.lang.String java.lang.String ) throws java.io.IOException { if ( org.springframework.beans.factory.xml.Log . isTraceEnabled ( ) ) { org.springframework.beans.factory.xml.Log . trace ( STRING + java.lang.String + STRING + java.lang.String + STRING ) ; } if ( java.lang.String != null && java.lang.String . boolean ( java.lang.String ) ) { int int = java.lang.String . int ( STRING ) ; int int = java.lang.String . int ( java.lang.String , int ) ; if ( int != - NUMBER ) { java.lang.String java.lang.String = java.lang.String + java.lang.String ; if ( org.springframework.beans.factory.xml.Log . isTraceEnabled ( ) ) { org.springframework.beans.factory.xml.Log . trace ( STRING + java.lang.String + STRING ) ; } try { Resource org.springframework.beans.factory.xml.Resource = new ClassPathResource ( java.lang.String , java.lang.Class<? extends org.springframework.beans.factory.xml.BeansDtdResolver> ( ) ) ; org.xml.sax.InputSource org.xml.sax.InputSource = new org.xml.sax.InputSource ( org.springframework.beans.factory.xml.Resource . getInputStream ( ) ) ; org.xml.sax.InputSource . void ( java.lang.String ) ; org.xml.sax.InputSource . void ( java.lang.String ) ; if ( org.springframework.beans.factory.xml.Log . isDebugEnabled ( ) ) { org.springframework.beans.factory.xml.Log . debug ( STRING + java.lang.String + STRING + java.lang.String ) ; } return org.xml.sax.InputSource ; } catch ( java.io.IOException java.io.IOException ) { if ( org.springframework.beans.factory.xml.Log . isDebugEnabled ( ) ) { org.springframework.beans.factory.xml.Log . debug ( STRING + java.lang.String + STRING , java.io.IOException ) ; } } } } return null ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return STRING ; }  <METHOD_END>
