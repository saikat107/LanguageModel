<METHOD_START> @ Test public void void ( ) { assertThat ( this . org.springframework.boot.cli.compiler.dependencies.DependencyManagement . getSpringBootVersion ( ) ) . isNotNull ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Dependency org.springframework.boot.cli.compiler.dependencies.Dependency = this . org.springframework.boot.cli.compiler.dependencies.DependencyManagement . find ( STRING ) ; assertThat ( org.springframework.boot.cli.compiler.dependencies.Dependency ) . isNotNull ( ) ; assertThat ( org.springframework.boot.cli.compiler.dependencies.Dependency . getGroupId ( ) ) . isEqualTo ( STRING ) ; assertThat ( org.springframework.boot.cli.compiler.dependencies.Dependency . getArtifactId ( ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( this . org.springframework.boot.cli.compiler.dependencies.DependencyManagement . getDependencies ( ) ) . isNotEqualTo ( empty ( ) ) ; }  <METHOD_END>
