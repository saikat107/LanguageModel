<METHOD_START> @ Test public void void ( ) java.lang.Exception { int int = SocketUtils . findAvailableTcpPort ( ) ; java.io.File java.io.File = new java.io.File ( STRING ) ; Invocation org.springframework.boot.cli.Invocation = this . org.springframework.boot.cli.CommandLineInvoker . invoke ( STRING , java.io.File . java.lang.String ( ) , STRING ) ; org.springframework.boot.cli.Invocation . await ( ) ; assertThat ( java.io.File . boolean ( ) ) . isTrue ( ) ; java.lang.Process java.lang.Process = new JavaExecutable ( ) . processBuilder ( STRING , java.io.File . java.lang.String ( ) , STRING + int ) . start ( ) ; org.springframework.boot.cli.Invocation = new Invocation ( java.lang.Process ) ; org.springframework.boot.cli.Invocation . await ( ) ; assertThat ( org.springframework.boot.cli.Invocation . getOutput ( ) ) . contains ( STRING ) ; assertThat ( org.springframework.boot.cli.Invocation . getOutput ( ) ) . contains ( STRING ) ; assertThat ( org.springframework.boot.cli.Invocation . getOutput ( ) ) . contains ( STRING ) ; assertThat ( org.springframework.boot.cli.Invocation . getOutput ( ) ) . contains ( STRING ) ; java.lang.Process . void ( ) ; }  <METHOD_END>
