<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> public java.lang.String java.lang.String ( ) { return this . java.lang.String ; }  <METHOD_END>
<METHOD_START> public void void ( MarkupTemplateEngine org.springframework.web.servlet.view.groovy.MarkupTemplateEngine ) { this . org.springframework.web.servlet.view.groovy.MarkupTemplateEngine = org.springframework.web.servlet.view.groovy.MarkupTemplateEngine ; }  <METHOD_END>
<METHOD_START> public org.springframework.web.servlet.view.groovy.MarkupTemplateEngine org.springframework.web.servlet.view.groovy.MarkupTemplateEngine ( ) { return org.springframework.web.servlet.view.groovy.MarkupTemplateEngine ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ApplicationContext org.springframework.web.servlet.view.groovy.ApplicationContext ) { this . org.springframework.web.servlet.view.groovy.ApplicationContext = org.springframework.web.servlet.view.groovy.ApplicationContext ; }  <METHOD_END>
<METHOD_START> protected org.springframework.web.servlet.view.groovy.ApplicationContext org.springframework.web.servlet.view.groovy.ApplicationContext ( ) { return this . org.springframework.web.servlet.view.groovy.ApplicationContext ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.util.Locale java.util.Locale ) { super. setLocale ( java.util.Locale ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) java.lang.Exception { if ( this . org.springframework.web.servlet.view.groovy.MarkupTemplateEngine == null ) { this . org.springframework.web.servlet.view.groovy.MarkupTemplateEngine = org.springframework.web.servlet.view.groovy.MarkupTemplateEngine ( ) ; } }  <METHOD_END>
<METHOD_START> protected org.springframework.web.servlet.view.groovy.MarkupTemplateEngine org.springframework.web.servlet.view.groovy.MarkupTemplateEngine ( ) java.io.IOException { if ( this . org.springframework.web.servlet.view.groovy.MarkupTemplateEngine == null ) { java.lang.ClassLoader java.lang.ClassLoader = java.lang.ClassLoader ( ) ; this . org.springframework.web.servlet.view.groovy.MarkupTemplateEngine = new MarkupTemplateEngine ( java.lang.ClassLoader , this , new org.springframework.web.servlet.view.groovy.GroovyMarkupConfigurer.LocaleTemplateResolver ( ) ) ; } return this . org.springframework.web.servlet.view.groovy.MarkupTemplateEngine ; }  <METHOD_END>
<METHOD_START> protected java.lang.ClassLoader java.lang.ClassLoader ( ) java.io.IOException { java.lang.String [] java.lang.String[] = StringUtils . commaDelimitedListToStringArray ( java.lang.String ( ) ) ; java.util.List<java.net.URL> < java.net.URL > java.util.List<java.net.URL> = new java.util.ArrayList<java.net.URL> <> ( ) ; for ( java.lang.String java.lang.String : java.lang.String[] ) { Resource [] org.springframework.web.servlet.view.groovy.Resource[] = org.springframework.web.servlet.view.groovy.ApplicationContext ( ) . getResources ( java.lang.String ) ; if ( resources . length > NUMBER ) { for ( Resource org.springframework.web.servlet.view.groovy.Resource : org.springframework.web.servlet.view.groovy.Resource[] ) { if ( org.springframework.web.servlet.view.groovy.Resource . exists ( ) ) { java.util.List<java.net.URL> . boolean ( org.springframework.web.servlet.view.groovy.Resource . getURL ( ) ) ; } } } } java.lang.ClassLoader java.lang.ClassLoader = org.springframework.web.servlet.view.groovy.ApplicationContext ( ) . getClassLoader ( ) ; return ( java.util.List<java.net.URL> . int ( ) > NUMBER ? new java.net.URLClassLoader ( java.util.List<java.net.URL> . java.net.URL[] ( new java.net.URL [ java.util.List<java.net.URL> . int ( ) ] ) , java.lang.ClassLoader ) : java.lang.ClassLoader ) ; }  <METHOD_END>
<METHOD_START> protected java.net.URL java.net.URL ( java.lang.ClassLoader java.lang.ClassLoader , java.lang.String java.lang.String ) throws java.io.IOException { MarkupTemplateEngine . MarkupTemplateEngine MarkupTemplateEngine.TemplateResource = MarkupTemplateEngine . TemplateResource . parse ( java.lang.String ) ; java.util.Locale java.util.Locale = LocaleContextHolder . getLocale ( ) ; java.net.URL java.net.URL = java.lang.ClassLoader . java.net.URL ( MarkupTemplateEngine.TemplateResource . withLocale ( java.util.Locale . java.lang.String ( ) . java.lang.String ( STRING , STRING ) ) . toString ( ) ) ; if ( java.net.URL == null ) { java.net.URL = java.lang.ClassLoader . java.net.URL ( MarkupTemplateEngine.TemplateResource . withLocale ( java.util.Locale . java.lang.String ( ) ) . toString ( ) ) ; } if ( java.net.URL == null ) { java.net.URL = java.lang.ClassLoader . java.net.URL ( MarkupTemplateEngine.TemplateResource . withLocale ( null ) . toString ( ) ) ; } if ( java.net.URL == null ) { throw new java.io.IOException ( STRING + java.lang.String ) ; } return java.net.URL ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.ClassLoader java.lang.ClassLoader , TemplateConfiguration org.springframework.web.servlet.view.groovy.TemplateConfiguration ) { this . java.lang.ClassLoader = java.lang.ClassLoader ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.net.URL java.net.URL ( java.lang.String java.lang.String ) throws java.io.IOException { return org.springframework.web.servlet.view.groovy.GroovyMarkupConfigurer .this . java.net.URL ( this . java.lang.ClassLoader , java.lang.String ) ; }  <METHOD_END>