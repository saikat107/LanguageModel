<METHOD_START> public void ( ServletContext org.springframework.web.context.support.ServletContext ) { Assert . notNull ( org.springframework.web.context.support.ServletContext , STRING ) ; this . org.springframework.web.context.support.ServletContext = org.springframework.web.context.support.ServletContext ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.util.Set<org.springframework.web.context.support.ConfigurableApplicationContext> < ConfigurableApplicationContext > java.util.Set<org.springframework.web.context.support.ConfigurableApplicationContext> ( ) { java.util.Set<org.springframework.web.context.support.ConfigurableApplicationContext> < ConfigurableApplicationContext > java.util.Set<org.springframework.web.context.support.ConfigurableApplicationContext> = new java.util.LinkedHashSet<org.springframework.web.context.support.ConfigurableApplicationContext> <> ( ) ; java.util.Enumeration<java.lang.String> < java.lang.String > java.util.Enumeration<java.lang.String> = this . org.springframework.web.context.support.ServletContext . getAttributeNames ( ) ; while ( java.util.Enumeration<java.lang.String> . boolean ( ) ) { java.lang.String java.lang.String = java.util.Enumeration<java.lang.String> . java.lang.String ( ) ; java.lang.Object java.lang.Object = this . org.springframework.web.context.support.ServletContext . getAttribute ( java.lang.String ) ; if ( java.lang.Object instanceof ConfigurableApplicationContext ) { java.util.Set<org.springframework.web.context.support.ConfigurableApplicationContext> . add ( ( ConfigurableApplicationContext ) java.lang.Object ) ; } } return java.util.Set<org.springframework.web.context.support.ConfigurableApplicationContext> ; }  <METHOD_END>
