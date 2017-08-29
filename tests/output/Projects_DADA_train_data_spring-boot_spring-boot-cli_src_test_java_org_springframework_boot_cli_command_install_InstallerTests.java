<METHOD_START> @ Before public void void ( ) java.io.IOException { java.lang.System . java.lang.String ( STRING , STRING ) ; FileSystemUtils . deleteRecursively ( new java.io.File ( STRING ) ) ; this . org.springframework.boot.cli.command.install.Installer = new Installer ( this . org.springframework.boot.cli.command.install.DependencyResolver ) ; }  <METHOD_END>
<METHOD_START> @ After public void void ( ) { java.lang.System . java.lang.String ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.io.File java.io.File = java.io.File ( STRING ) ; given ( this . org.springframework.boot.cli.command.install.DependencyResolver . resolve ( java.util.Arrays . java.util.List<java.lang.String> ( STRING ) ) ) . willReturn ( java.util.Arrays . java.util.List<java.io.File> ( java.io.File ) ) ; this . org.springframework.boot.cli.command.install.Installer . install ( java.util.Arrays . java.util.List<java.lang.String> ( STRING ) ) ; assertThat ( java.util.Set<java.lang.String> ( ) ) . containsOnly ( STRING , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.io.File java.io.File = java.io.File ( STRING ) ; given ( this . org.springframework.boot.cli.command.install.DependencyResolver . resolve ( java.util.Arrays . java.util.List<java.lang.String> ( STRING ) ) ) . willReturn ( java.util.Arrays . java.util.List<java.io.File> ( java.io.File ) ) ; this . org.springframework.boot.cli.command.install.Installer . install ( java.util.Arrays . java.util.List<java.lang.String> ( STRING ) ) ; this . org.springframework.boot.cli.command.install.Installer . uninstall ( java.util.Arrays . java.util.List<java.lang.String> ( STRING ) ) ; assertThat ( java.util.Set<java.lang.String> ( ) ) . contains ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.io.File java.io.File = java.io.File ( STRING ) ; java.io.File java.io.File = java.io.File ( STRING ) ; java.io.File java.io.File = java.io.File ( STRING ) ; given ( this . org.springframework.boot.cli.command.install.DependencyResolver . resolve ( java.util.Arrays . java.util.List<java.lang.String> ( STRING ) ) ) . willReturn ( java.util.Arrays . java.util.List<java.io.File> ( java.io.File , java.io.File ) ) ; given ( this . org.springframework.boot.cli.command.install.DependencyResolver . resolve ( java.util.Arrays . java.util.List<java.lang.String> ( STRING ) ) ) . willReturn ( java.util.Arrays . java.util.List<java.io.File> ( java.io.File , java.io.File ) ) ; this . org.springframework.boot.cli.command.install.Installer . install ( java.util.Arrays . java.util.List<java.lang.String> ( STRING ) ) ; assertThat ( java.util.Set<java.lang.String> ( ) ) . containsOnly ( STRING , STRING , STRING ) ; this . org.springframework.boot.cli.command.install.Installer . install ( java.util.Arrays . java.util.List<java.lang.String> ( STRING ) ) ; assertThat ( java.util.Set<java.lang.String> ( ) ) . containsOnly ( STRING , STRING , STRING , STRING ) ; this . org.springframework.boot.cli.command.install.Installer . uninstall ( java.util.Arrays . java.util.List<java.lang.String> ( STRING ) ) ; assertThat ( java.util.Set<java.lang.String> ( ) ) . containsOnly ( STRING , STRING , STRING ) ; this . org.springframework.boot.cli.command.install.Installer . uninstall ( java.util.Arrays . java.util.List<java.lang.String> ( STRING ) ) ; assertThat ( java.util.Set<java.lang.String> ( ) ) . containsOnly ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.io.File java.io.File = java.io.File ( STRING ) ; java.io.File java.io.File = java.io.File ( STRING ) ; java.io.File java.io.File = java.io.File ( STRING ) ; given ( this . org.springframework.boot.cli.command.install.DependencyResolver . resolve ( java.util.Arrays . java.util.List<java.lang.String> ( STRING ) ) ) . willReturn ( java.util.Arrays . java.util.List<java.io.File> ( java.io.File , java.io.File ) ) ; given ( this . org.springframework.boot.cli.command.install.DependencyResolver . resolve ( java.util.Arrays . java.util.List<java.lang.String> ( STRING ) ) ) . willReturn ( java.util.Arrays . java.util.List<java.io.File> ( java.io.File , java.io.File ) ) ; this . org.springframework.boot.cli.command.install.Installer . install ( java.util.Arrays . java.util.List<java.lang.String> ( STRING ) ) ; this . org.springframework.boot.cli.command.install.Installer . install ( java.util.Arrays . java.util.List<java.lang.String> ( STRING ) ) ; assertThat ( java.util.Set<java.lang.String> ( ) ) . containsOnly ( STRING , STRING , STRING , STRING ) ; this . org.springframework.boot.cli.command.install.Installer . uninstallAll ( ) ; assertThat ( java.util.Set<java.lang.String> ( ) ) . containsOnly ( STRING ) ; }  <METHOD_END>
<METHOD_START> private java.util.Set<java.lang.String> < java.lang.String > java.util.Set<java.lang.String> ( ) { java.util.Set<java.lang.String> < java.lang.String > java.util.Set<java.lang.String> = new java.util.HashSet<java.lang.String> <> ( ) ; for ( java.io.File java.io.File : new java.io.File ( STRING ) . java.io.File[] ( ) ) { java.util.Set<java.lang.String> . boolean ( java.io.File . java.lang.String ( ) ) ; } return java.util.Set<java.lang.String> ; }  <METHOD_END>
<METHOD_START> private java.io.File java.io.File ( java.lang.String java.lang.String ) throws java.io.IOException { java.io.File java.io.File = this . org.springframework.boot.cli.command.install.TemporaryFolder . newFile ( java.lang.String ) ; java.io.File . void ( ) ; return java.io.File ; }  <METHOD_END>
