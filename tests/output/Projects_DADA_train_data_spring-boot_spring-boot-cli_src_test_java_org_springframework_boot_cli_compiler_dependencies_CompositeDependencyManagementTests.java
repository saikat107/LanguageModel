<METHOD_START> @ Before public void void ( ) { MockitoAnnotations . initMocks ( this ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { given ( this . org.springframework.boot.cli.compiler.dependencies.DependencyManagement . getSpringBootVersion ( ) ) . willReturn ( null ) ; given ( this . org.springframework.boot.cli.compiler.dependencies.DependencyManagement . getSpringBootVersion ( ) ) . willReturn ( null ) ; assertThat ( new CompositeDependencyManagement ( this . org.springframework.boot.cli.compiler.dependencies.DependencyManagement , this . org.springframework.boot.cli.compiler.dependencies.DependencyManagement ) . getSpringBootVersion ( ) ) . isNull ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { given ( this . org.springframework.boot.cli.compiler.dependencies.DependencyManagement . getSpringBootVersion ( ) ) . willReturn ( STRING ) ; given ( this . org.springframework.boot.cli.compiler.dependencies.DependencyManagement . getSpringBootVersion ( ) ) . willReturn ( STRING ) ; assertThat ( new CompositeDependencyManagement ( this . org.springframework.boot.cli.compiler.dependencies.DependencyManagement , this . org.springframework.boot.cli.compiler.dependencies.DependencyManagement ) . getSpringBootVersion ( ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { given ( this . org.springframework.boot.cli.compiler.dependencies.DependencyManagement . find ( STRING ) ) . willReturn ( null ) ; given ( this . org.springframework.boot.cli.compiler.dependencies.DependencyManagement . find ( STRING ) ) . willReturn ( null ) ; assertThat ( new CompositeDependencyManagement ( this . org.springframework.boot.cli.compiler.dependencies.DependencyManagement , this . org.springframework.boot.cli.compiler.dependencies.DependencyManagement ) . find ( STRING ) ) . isNull ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { given ( this . org.springframework.boot.cli.compiler.dependencies.DependencyManagement . find ( STRING ) ) . willReturn ( new Dependency ( STRING , STRING , STRING ) ) ; given ( this . org.springframework.boot.cli.compiler.dependencies.DependencyManagement . find ( STRING ) ) . willReturn ( new Dependency ( STRING , STRING , STRING ) ) ; assertThat ( new CompositeDependencyManagement ( this . org.springframework.boot.cli.compiler.dependencies.DependencyManagement , this . org.springframework.boot.cli.compiler.dependencies.DependencyManagement ) . find ( STRING ) ) . isEqualTo ( new Dependency ( STRING , STRING , STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { given ( this . org.springframework.boot.cli.compiler.dependencies.DependencyManagement . getDependencies ( ) ) . willReturn ( java.util.Arrays . java.util.List ( new Dependency ( STRING , STRING , STRING ) ) ) ; given ( this . org.springframework.boot.cli.compiler.dependencies.DependencyManagement . getDependencies ( ) ) . willReturn ( java.util.Arrays . java.util.List ( new Dependency ( STRING , STRING , STRING ) ) ) ; assertThat ( new CompositeDependencyManagement ( this . org.springframework.boot.cli.compiler.dependencies.DependencyManagement , this . org.springframework.boot.cli.compiler.dependencies.DependencyManagement ) . getDependencies ( ) ) . containsOnly ( new Dependency ( STRING , STRING , STRING ) , new Dependency ( STRING , STRING , STRING ) ) ; }  <METHOD_END>