<METHOD_START> public void ( ) { setViewClass ( java.lang.Class<?> ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Class<?> < ? > java.lang.Class<?> ( ) { return XsltView .class ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( javax.xml.transform.URIResolver javax.xml.transform.URIResolver ) { this . javax.xml.transform.URIResolver = javax.xml.transform.URIResolver ; }  <METHOD_END>
<METHOD_START> public void void ( javax.xml.transform.ErrorListener javax.xml.transform.ErrorListener ) { this . javax.xml.transform.ErrorListener = javax.xml.transform.ErrorListener ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> public void void ( java.util.Properties java.util.Properties ) { this . java.util.Properties = java.util.Properties ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.web.servlet.view.xslt.AbstractUrlBasedView org.springframework.web.servlet.view.xslt.AbstractUrlBasedView ( java.lang.String java.lang.String ) throws java.lang.Exception { XsltView org.springframework.web.servlet.view.xslt.XsltView = ( XsltView ) super. buildView ( java.lang.String ) ; org.springframework.web.servlet.view.xslt.XsltView . setSourceKey ( this . java.lang.String ) ; if ( this . javax.xml.transform.URIResolver != null ) { org.springframework.web.servlet.view.xslt.XsltView . setUriResolver ( this . javax.xml.transform.URIResolver ) ; } if ( this . javax.xml.transform.ErrorListener != null ) { org.springframework.web.servlet.view.xslt.XsltView . setErrorListener ( this . javax.xml.transform.ErrorListener ) ; } org.springframework.web.servlet.view.xslt.XsltView . setIndent ( this . boolean ) ; org.springframework.web.servlet.view.xslt.XsltView . setOutputProperties ( this . java.util.Properties ) ; org.springframework.web.servlet.view.xslt.XsltView . setCacheTemplates ( this . boolean ) ; return org.springframework.web.servlet.view.xslt.XsltView ; }  <METHOD_END>
