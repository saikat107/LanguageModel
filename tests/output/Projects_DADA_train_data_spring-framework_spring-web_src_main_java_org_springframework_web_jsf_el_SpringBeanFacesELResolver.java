<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( ELContext org.springframework.web.jsf.el.ELContext , java.lang.Object java.lang.Object , java.lang.Object java.lang.Object ) throws org.springframework.web.jsf.el.ELException { if ( java.lang.Object == null ) { java.lang.String java.lang.String = java.lang.Object . java.lang.String ( ) ; WebApplicationContext org.springframework.web.jsf.el.WebApplicationContext = org.springframework.web.jsf.el.WebApplicationContext ( org.springframework.web.jsf.el.ELContext ) ; if ( org.springframework.web.jsf.el.WebApplicationContext . containsBean ( java.lang.String ) ) { org.springframework.web.jsf.el.ELContext . setPropertyResolved ( true ) ; return org.springframework.web.jsf.el.WebApplicationContext . getBean ( java.lang.String ) ; } } return null ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Class<?> < ? > java.lang.Class<?> ( ELContext org.springframework.web.jsf.el.ELContext , java.lang.Object java.lang.Object , java.lang.Object java.lang.Object ) throws org.springframework.web.jsf.el.ELException { if ( java.lang.Object == null ) { java.lang.String java.lang.String = java.lang.Object . java.lang.String ( ) ; WebApplicationContext org.springframework.web.jsf.el.WebApplicationContext = org.springframework.web.jsf.el.WebApplicationContext ( org.springframework.web.jsf.el.ELContext ) ; if ( org.springframework.web.jsf.el.WebApplicationContext . containsBean ( java.lang.String ) ) { org.springframework.web.jsf.el.ELContext . setPropertyResolved ( true ) ; return org.springframework.web.jsf.el.WebApplicationContext . getType ( java.lang.String ) ; } } return null ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ELContext org.springframework.web.jsf.el.ELContext , java.lang.Object java.lang.Object , java.lang.Object java.lang.Object , java.lang.Object java.lang.Object ) throws org.springframework.web.jsf.el.ELException { if ( java.lang.Object == null ) { java.lang.String java.lang.String = java.lang.Object . java.lang.String ( ) ; WebApplicationContext org.springframework.web.jsf.el.WebApplicationContext = org.springframework.web.jsf.el.WebApplicationContext ( org.springframework.web.jsf.el.ELContext ) ; if ( org.springframework.web.jsf.el.WebApplicationContext . containsBean ( java.lang.String ) ) { if ( java.lang.Object == org.springframework.web.jsf.el.WebApplicationContext . getBean ( java.lang.String ) ) { org.springframework.web.jsf.el.ELContext . setPropertyResolved ( true ) ; } else { throw new PropertyNotWritableException ( STRING + java.lang.String + STRING ) ; } } } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ELContext org.springframework.web.jsf.el.ELContext , java.lang.Object java.lang.Object , java.lang.Object java.lang.Object ) throws org.springframework.web.jsf.el.ELException { if ( java.lang.Object == null ) { java.lang.String java.lang.String = java.lang.Object . java.lang.String ( ) ; WebApplicationContext org.springframework.web.jsf.el.WebApplicationContext = org.springframework.web.jsf.el.WebApplicationContext ( org.springframework.web.jsf.el.ELContext ) ; if ( org.springframework.web.jsf.el.WebApplicationContext . containsBean ( java.lang.String ) ) { return true ; } } return false ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Iterator<java.beans.FeatureDescriptor> < java.beans.FeatureDescriptor > java.util.Iterator<java.beans.FeatureDescriptor> ( ELContext org.springframework.web.jsf.el.ELContext , java.lang.Object java.lang.Object ) { return null ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Class<?> < ? > java.lang.Class<?> ( ELContext org.springframework.web.jsf.el.ELContext , java.lang.Object java.lang.Object ) { return java.lang.Object .class ; }  <METHOD_END>
<METHOD_START> protected org.springframework.web.jsf.el.WebApplicationContext org.springframework.web.jsf.el.WebApplicationContext ( ELContext org.springframework.web.jsf.el.ELContext ) { FacesContext org.springframework.web.jsf.el.FacesContext = FacesContext . getCurrentInstance ( ) ; return FacesContextUtils . getRequiredWebApplicationContext ( org.springframework.web.jsf.el.FacesContext ) ; }  <METHOD_END>