<METHOD_START> public static java.lang.String java.lang.String ( java.lang.String java.lang.String )			throws java.io.IOException , org.springframework.boot.groovy.CompilationFailedException , java.lang.ClassNotFoundException { return java.lang.String ( java.lang.String , java.util.Collections .< java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ( ) ) ; }  <METHOD_END>
<METHOD_START> public static java.lang.String java.lang.String ( java.lang.String java.lang.String , java.util.Map<java.lang.String,?> < java.lang.String , ? > java.util.Map<java.lang.String,?> )			throws java.io.IOException , org.springframework.boot.groovy.CompilationFailedException , java.lang.ClassNotFoundException { return java.lang.String ( new GStringTemplateEngine ( ) , java.lang.String , java.util.Map<java.lang.String,> ) ; }  <METHOD_END>
<METHOD_START> public static java.lang.String java.lang.String ( TemplateEngine org.springframework.boot.groovy.TemplateEngine , java.lang.String java.lang.String , java.util.Map<java.lang.String,?> < java.lang.String , ? > java.util.Map<java.lang.String,?> ) throws java.io.IOException , org.springframework.boot.groovy.CompilationFailedException , java.lang.ClassNotFoundException { Writable org.springframework.boot.groovy.Writable = org.springframework.boot.groovy.Template ( org.springframework.boot.groovy.TemplateEngine , java.lang.String ) . make ( java.util.Map<java.lang.String,> ) ; java.io.StringWriter java.io.StringWriter = new java.io.StringWriter ( ) ; org.springframework.boot.groovy.Writable . writeTo ( java.io.StringWriter ) ; return java.io.StringWriter . java.lang.String ( ) ; }  <METHOD_END>
<METHOD_START> private static org.springframework.boot.groovy.Template org.springframework.boot.groovy.Template ( TemplateEngine org.springframework.boot.groovy.TemplateEngine , java.lang.String java.lang.String )			throws org.springframework.boot.groovy.CompilationFailedException , java.lang.ClassNotFoundException , java.io.IOException { java.io.File java.io.File = new java.io.File ( STRING , java.lang.String ) ; if ( java.io.File . boolean ( ) ) { return org.springframework.boot.groovy.TemplateEngine . createTemplate ( java.io.File ) ; } java.lang.ClassLoader java.lang.ClassLoader = org.springframework.boot.groovy.GroovyTemplate .class . java.lang.ClassLoader ( ) ; java.net.URL java.net.URL = java.lang.ClassLoader . java.net.URL ( STRING + java.lang.String ) ; if ( java.net.URL != null ) { return org.springframework.boot.groovy.TemplateEngine . createTemplate ( java.net.URL ) ; } return org.springframework.boot.groovy.TemplateEngine . createTemplate ( java.lang.String ) ; }  <METHOD_END>
