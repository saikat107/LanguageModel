<METHOD_START> @ java.lang.Override public void void ( DependencyCustomizer org.springframework.boot.cli.compiler.autoconfigure.DependencyCustomizer ) { org.springframework.boot.cli.compiler.autoconfigure.DependencyCustomizer . ifAnyMissingClasses ( STRING ) . add ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ImportCustomizer org.springframework.boot.cli.compiler.autoconfigure.ImportCustomizer ) { org.springframework.boot.cli.compiler.autoconfigure.ImportCustomizer . addImports ( STRING , STRING , STRING , STRING , STRING , STRING , STRING , STRING , STRING , STRING , STRING , STRING , STRING , STRING , STRING , STRING , STRING , STRING , STRING , STRING , STRING , STRING , STRING , STRING , STRING , STRING , STRING , STRING ) ; org.springframework.boot.cli.compiler.autoconfigure.ImportCustomizer . addStarImports ( STRING , STRING ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( GroovyClassLoader org.springframework.boot.cli.compiler.autoconfigure.GroovyClassLoader , GroovyCompilerConfiguration org.springframework.boot.cli.compiler.autoconfigure.GroovyCompilerConfiguration , GeneratorContext org.springframework.boot.cli.compiler.autoconfigure.GeneratorContext , SourceUnit org.springframework.boot.cli.compiler.autoconfigure.SourceUnit , ClassNode org.springframework.boot.cli.compiler.autoconfigure.ClassNode ) throws org.springframework.boot.cli.compiler.autoconfigure.CompilationFailedException { void ( org.springframework.boot.cli.compiler.autoconfigure.SourceUnit , org.springframework.boot.cli.compiler.autoconfigure.ClassNode ) ; }  <METHOD_END>
<METHOD_START> private void void ( SourceUnit org.springframework.boot.cli.compiler.autoconfigure.SourceUnit , ClassNode org.springframework.boot.cli.compiler.autoconfigure.ClassNode ) { if ( ! boolean ( org.springframework.boot.cli.compiler.autoconfigure.ClassNode ) ) { AnnotationNode org.springframework.boot.cli.compiler.autoconfigure.AnnotationNode = new AnnotationNode ( ClassHelper . make ( STRING ) ) ; org.springframework.boot.cli.compiler.autoconfigure.ClassNode . addAnnotation ( org.springframework.boot.cli.compiler.autoconfigure.AnnotationNode ) ; } }  <METHOD_END>
<METHOD_START> private boolean boolean ( ClassNode org.springframework.boot.cli.compiler.autoconfigure.ClassNode ) { for ( AnnotationNode org.springframework.boot.cli.compiler.autoconfigure.AnnotationNode : org.springframework.boot.cli.compiler.autoconfigure.ClassNode . getAnnotations ( ) ) { java.lang.String java.lang.String = org.springframework.boot.cli.compiler.autoconfigure.AnnotationNode . getClassNode ( ) . getNameWithoutPackage ( ) ; if ( STRING . boolean ( java.lang.String ) || STRING . boolean ( java.lang.String ) ) { return true ; } } return false ; }  <METHOD_END>
