<METHOD_START> public static org.xml.sax.InputSource org.xml.sax.InputSource ( Resource org.springframework.oxm.support.Resource ) throws java.io.IOException { org.xml.sax.InputSource org.xml.sax.InputSource = new org.xml.sax.InputSource ( org.springframework.oxm.support.Resource . getInputStream ( ) ) ; org.xml.sax.InputSource . void ( java.lang.String ( org.springframework.oxm.support.Resource ) ) ; return org.xml.sax.InputSource ; }  <METHOD_END>
<METHOD_START> private static java.lang.String java.lang.String ( Resource org.springframework.oxm.support.Resource ) { try { return org.springframework.oxm.support.Resource . getURI ( ) . toString ( ) ; } catch ( java.io.IOException java.io.IOException ) { return null ; } }  <METHOD_END>