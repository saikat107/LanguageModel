<METHOD_START> public void ( ) {	}  <METHOD_END>
<METHOD_START> public void ( java.lang.String java.lang.String ) { super( java.lang.String ); }  <METHOD_END>
<METHOD_START> public void ( java.lang.String java.lang.String , MessageSource org.springframework.web.servlet.view.MessageSource ) { this( java.lang.String ); this . org.springframework.web.servlet.view.MessageSource = org.springframework.web.servlet.view.MessageSource ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( ServletContext org.springframework.web.servlet.view.ServletContext ) { if ( this . org.springframework.web.servlet.view.MessageSource != null ) { this . org.springframework.web.servlet.view.MessageSource = JstlUtils . getJstlAwareMessageSource ( org.springframework.web.servlet.view.ServletContext , this . org.springframework.web.servlet.view.MessageSource ) ; } super. initServletContext ( org.springframework.web.servlet.view.ServletContext ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( HttpServletRequest org.springframework.web.servlet.view.HttpServletRequest ) throws java.lang.Exception { if ( this . org.springframework.web.servlet.view.MessageSource != null ) { JstlUtils . exposeLocalizationContext ( org.springframework.web.servlet.view.HttpServletRequest , this . org.springframework.web.servlet.view.MessageSource ) ; } else { JstlUtils . exposeLocalizationContext ( new RequestContext ( org.springframework.web.servlet.view.HttpServletRequest , getServletContext ( ) ) ) ; } }  <METHOD_END>