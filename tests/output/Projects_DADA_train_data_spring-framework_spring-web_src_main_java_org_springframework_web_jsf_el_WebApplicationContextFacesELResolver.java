<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( ELContext org.springframework.web.jsf.el.ELContext , java.lang.Object java.lang.Object , java.lang.Object java.lang.Object ) throws org.springframework.web.jsf.el.ELException { if ( java.lang.Object != null ) { if ( java.lang.Object instanceof WebApplicationContext ) { WebApplicationContext org.springframework.web.jsf.el.WebApplicationContext = ( WebApplicationContext ) java.lang.Object ; java.lang.String java.lang.String = java.lang.Object . java.lang.String ( ) ; if ( org.springframework.web.jsf.el.Log . isTraceEnabled ( ) ) { org.springframework.web.jsf.el.Log . trace ( STRING + java.lang.String + STRING ) ; } if ( org.springframework.web.jsf.el.WebApplicationContext . containsBean ( java.lang.String ) ) { if ( org.springframework.web.jsf.el.Log . isDebugEnabled ( ) ) { org.springframework.web.jsf.el.Log . debug ( STRING + java.lang.String + STRING ) ; } org.springframework.web.jsf.el.ELContext . setPropertyResolved ( true ) ; try { return org.springframework.web.jsf.el.WebApplicationContext . getBean ( java.lang.String ) ; } catch ( BeansException org.springframework.web.jsf.el.BeansException ) { throw new ELException ( org.springframework.web.jsf.el.BeansException ) ; } } else { return null ; } } } else { if ( java.lang.String . boolean ( java.lang.Object ) ) { org.springframework.web.jsf.el.ELContext . setPropertyResolved ( true ) ; return org.springframework.web.jsf.el.WebApplicationContext ( org.springframework.web.jsf.el.ELContext ) ; } } return null ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Class<?> < ? > java.lang.Class<?> ( ELContext org.springframework.web.jsf.el.ELContext , java.lang.Object java.lang.Object , java.lang.Object java.lang.Object ) throws org.springframework.web.jsf.el.ELException { if ( java.lang.Object != null ) { if ( java.lang.Object instanceof WebApplicationContext ) { WebApplicationContext org.springframework.web.jsf.el.WebApplicationContext = ( WebApplicationContext ) java.lang.Object ; java.lang.String java.lang.String = java.lang.Object . java.lang.String ( ) ; if ( org.springframework.web.jsf.el.Log . isDebugEnabled ( ) ) { org.springframework.web.jsf.el.Log . debug ( STRING + java.lang.String + STRING ) ; } if ( org.springframework.web.jsf.el.WebApplicationContext . containsBean ( java.lang.String ) ) { if ( org.springframework.web.jsf.el.Log . isDebugEnabled ( ) ) { org.springframework.web.jsf.el.Log . debug ( STRING + java.lang.String + STRING ) ; } org.springframework.web.jsf.el.ELContext . setPropertyResolved ( true ) ; try { return org.springframework.web.jsf.el.WebApplicationContext . getType ( java.lang.String ) ; } catch ( BeansException org.springframework.web.jsf.el.BeansException ) { throw new ELException ( org.springframework.web.jsf.el.BeansException ) ; } } else { return null ; } } } else { if ( java.lang.String . boolean ( java.lang.Object ) ) { org.springframework.web.jsf.el.ELContext . setPropertyResolved ( true ) ; return WebApplicationContext .class ; } } return null ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ELContext org.springframework.web.jsf.el.ELContext , java.lang.Object java.lang.Object , java.lang.Object java.lang.Object , java.lang.Object java.lang.Object ) throws org.springframework.web.jsf.el.ELException {	}  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ELContext org.springframework.web.jsf.el.ELContext , java.lang.Object java.lang.Object , java.lang.Object java.lang.Object ) throws org.springframework.web.jsf.el.ELException { if ( java.lang.Object instanceof WebApplicationContext ) { org.springframework.web.jsf.el.ELContext . setPropertyResolved ( true ) ; return false ; } return false ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Iterator<java.beans.FeatureDescriptor> < java.beans.FeatureDescriptor > java.util.Iterator<java.beans.FeatureDescriptor> ( ELContext org.springframework.web.jsf.el.ELContext , java.lang.Object java.lang.Object ) { return null ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Class<?> < ? > java.lang.Class<?> ( ELContext org.springframework.web.jsf.el.ELContext , java.lang.Object java.lang.Object ) { return java.lang.Object .class ; }  <METHOD_END>
<METHOD_START> protected org.springframework.web.jsf.el.WebApplicationContext org.springframework.web.jsf.el.WebApplicationContext ( ELContext org.springframework.web.jsf.el.ELContext ) { FacesContext org.springframework.web.jsf.el.FacesContext = FacesContext . getCurrentInstance ( ) ; return FacesContextUtils . getRequiredWebApplicationContext ( org.springframework.web.jsf.el.FacesContext ) ; }  <METHOD_END>
