<METHOD_START> @ Before public void void ( ) { this . org.springframework.boot.cli.compiler.dependencies.DependencyManagement = mock ( DependencyManagement .class ) ; given ( this . org.springframework.boot.cli.compiler.dependencies.DependencyManagement . find ( STRING ) ) . willReturn ( new Dependency ( STRING , STRING , STRING ) ) ; given ( this . org.springframework.boot.cli.compiler.dependencies.DependencyManagement . getSpringBootVersion ( ) ) . willReturn ( STRING ) ; this . org.springframework.boot.cli.compiler.dependencies.DependencyManagementArtifactCoordinatesResolver = new DependencyManagementArtifactCoordinatesResolver ( this . org.springframework.boot.cli.compiler.dependencies.DependencyManagement ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { assertThat ( this . org.springframework.boot.cli.compiler.dependencies.DependencyManagementArtifactCoordinatesResolver . getGroupId ( STRING ) ) . isEqualTo ( STRING ) ; verify ( this . org.springframework.boot.cli.compiler.dependencies.DependencyManagement , never ( ) ) . find ( anyString ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { assertThat ( this . org.springframework.boot.cli.compiler.dependencies.DependencyManagementArtifactCoordinatesResolver . getGroupId ( STRING ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { assertThat ( this . org.springframework.boot.cli.compiler.dependencies.DependencyManagementArtifactCoordinatesResolver . getGroupId ( STRING ) ) . isNull ( ) ; }  <METHOD_END>
