<METHOD_START> @ java.lang.Override public boolean boolean ( ClassNode org.springframework.boot.cli.compiler.autoconfigure.ClassNode ) { return AstUtils . hasAtLeastOneAnnotation ( org.springframework.boot.cli.compiler.autoconfigure.ClassNode , STRING , STRING , STRING ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( DependencyCustomizer org.springframework.boot.cli.compiler.autoconfigure.DependencyCustomizer ) { org.springframework.boot.cli.compiler.autoconfigure.DependencyCustomizer . ifAnyMissingClasses ( STRING ) . add ( STRING , STRING ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ImportCustomizer org.springframework.boot.cli.compiler.autoconfigure.ImportCustomizer ) { org.springframework.boot.cli.compiler.autoconfigure.ImportCustomizer . addStarImports ( STRING ) ; }  <METHOD_END>
