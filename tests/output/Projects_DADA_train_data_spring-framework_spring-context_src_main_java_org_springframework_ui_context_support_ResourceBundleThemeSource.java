<METHOD_START> @ java.lang.Override public void void ( ThemeSource org.springframework.ui.context.support.ThemeSource ) { this . org.springframework.ui.context.support.ThemeSource = org.springframework.ui.context.support.ThemeSource ; synchronized ( this . java.util.Map<java.lang.String,org.springframework.ui.context.support.Theme> ) { for ( Theme org.springframework.ui.context.support.Theme : this . java.util.Map<java.lang.String,org.springframework.ui.context.support.Theme> . values ( ) ) { void ( org.springframework.ui.context.support.Theme ) ; } } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.ui.context.support.ThemeSource org.springframework.ui.context.support.ThemeSource ( ) { return this . org.springframework.ui.context.support.ThemeSource ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = ( java.lang.String != null ? java.lang.String : STRING ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . java.lang.Boolean = boolean ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.ClassLoader java.lang.ClassLoader ) { this . java.lang.ClassLoader = java.lang.ClassLoader ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.ui.context.support.Theme org.springframework.ui.context.support.Theme ( java.lang.String java.lang.String ) { if ( java.lang.String == null ) { return null ; } Theme org.springframework.ui.context.support.Theme = this . java.util.Map<java.lang.String,org.springframework.ui.context.support.Theme> . get ( java.lang.String ) ; if ( org.springframework.ui.context.support.Theme == null ) { synchronized ( this . java.util.Map<java.lang.String,org.springframework.ui.context.support.Theme> ) { org.springframework.ui.context.support.Theme = this . java.util.Map<java.lang.String,org.springframework.ui.context.support.Theme> . get ( java.lang.String ) ; if ( org.springframework.ui.context.support.Theme == null ) { java.lang.String java.lang.String = this . java.lang.String + java.lang.String ; MessageSource org.springframework.ui.context.support.MessageSource = org.springframework.ui.context.support.MessageSource ( java.lang.String ) ; org.springframework.ui.context.support.Theme = new SimpleTheme ( java.lang.String , org.springframework.ui.context.support.MessageSource ) ; void ( org.springframework.ui.context.support.Theme ) ; this . java.util.Map<java.lang.String,org.springframework.ui.context.support.Theme> . put ( java.lang.String , org.springframework.ui.context.support.Theme ) ; if ( org.springframework.ui.context.support.Log . isDebugEnabled ( ) ) { org.springframework.ui.context.support.Log . debug ( STRING + java.lang.String + STRING + java.lang.String + STRING ) ; } } } } return org.springframework.ui.context.support.Theme ; }  <METHOD_END>
<METHOD_START> protected org.springframework.ui.context.support.MessageSource org.springframework.ui.context.support.MessageSource ( java.lang.String java.lang.String ) { ResourceBundleMessageSource org.springframework.ui.context.support.ResourceBundleMessageSource = new ResourceBundleMessageSource ( ) ; org.springframework.ui.context.support.ResourceBundleMessageSource . setBasename ( java.lang.String ) ; if ( this . java.lang.String != null ) { org.springframework.ui.context.support.ResourceBundleMessageSource . setDefaultEncoding ( this . java.lang.String ) ; } if ( this . java.lang.Boolean != null ) { org.springframework.ui.context.support.ResourceBundleMessageSource . setFallbackToSystemLocale ( this . java.lang.Boolean ) ; } if ( this . java.lang.ClassLoader != null ) { org.springframework.ui.context.support.ResourceBundleMessageSource . setBeanClassLoader ( this . java.lang.ClassLoader ) ; } return org.springframework.ui.context.support.ResourceBundleMessageSource ; }  <METHOD_END>
<METHOD_START> protected void void ( Theme org.springframework.ui.context.support.Theme ) { if ( org.springframework.ui.context.support.Theme . getMessageSource ( ) instanceof HierarchicalMessageSource ) { HierarchicalMessageSource org.springframework.ui.context.support.HierarchicalMessageSource = ( HierarchicalMessageSource ) org.springframework.ui.context.support.Theme . getMessageSource ( ) ; if ( org.springframework.ui.context.support.ThemeSource ( ) != null && org.springframework.ui.context.support.HierarchicalMessageSource . getParentMessageSource ( ) == null ) { Theme org.springframework.ui.context.support.Theme = org.springframework.ui.context.support.ThemeSource ( ) . getTheme ( org.springframework.ui.context.support.Theme . getName ( ) ) ; if ( org.springframework.ui.context.support.Theme != null ) { org.springframework.ui.context.support.HierarchicalMessageSource . setParentMessageSource ( org.springframework.ui.context.support.Theme . getMessageSource ( ) ) ; } } } }  <METHOD_END>
